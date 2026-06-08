@echo off
setlocal

cd /d "%~dp0"

echo Checking Maven...
where mvn >nul 2>nul
if errorlevel 1 (
    echo Maven is not installed or not added to PATH.
    pause
    exit /b 1
)

echo Checking npm...
where npm >nul 2>nul
if errorlevel 1 (
    echo Node.js/npm is not installed or not added to PATH.
    pause
    exit /b 1
)

echo Starting backend...
start "backend" cmd /k "cd /d %~dp0backend && mvn spring-boot:run"

echo Waiting for backend on port 8080...
powershell -Command "while(-not (Test-NetConnection -ComputerName 'localhost' -Port 8080 -InformationLevel Quiet)){Write-Host '.' -NoNewline; Start-Sleep -Seconds 1}; Write-Host ' Backend ready.'"

echo Installing frontend dependencies...
cd /d "%~dp0frontend"
call npm install

echo Building TypeScript frontend...
call npm run build

echo Starting frontend...
set VITE_BACKEND_ORIGIN=http://localhost:8080
start "frontend" cmd /k "cd /d %~dp0frontend && npm start"

echo.
echo Backend:  http://localhost:8080
echo Frontend: http://localhost:5173
echo.

endlocal