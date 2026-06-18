import "./game.css"

function GamePage() {
    return (
        <main className={"game-page"}>
            <div className={"game-content-area"}>
                <canvas id="canvas" width="750" height="750">Hello</canvas>
            </div>
        </main>
    );
}

export default GamePage;