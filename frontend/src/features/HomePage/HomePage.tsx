import "./home.css";

function HomePage() {
    return (
        <main className="home-page">
            <div className="content-area">
                <div className="home-title">
                    Welcome to <span className="highlight-text">Isotope</span>
                </div>

                <div>
                    <button className="btn btn--green">
                        Start Game
                    </button>
                </div>
            </div>
        </main>
    );
}

export default HomePage;