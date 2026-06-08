# isotope

Starter full-stack project with:
- Spring Boot backend in `/backend`
- TypeScript frontend in `/frontend`

## Backend

```bash
cd /tmp/workspace/GabrielYassine/isotope/backend
mvn spring-boot:run
```

Available endpoints:
- `GET http://localhost:8080/api/health`
- WebSocket: `ws://localhost:8080/ws/messages`

## Frontend

```bash
cd /tmp/workspace/GabrielYassine/isotope/frontend
npm install
npm run build
npm run start
```

Open `http://localhost:5173` in the browser.
