import "./home.css";
import {useNavigate} from "react-router-dom";

function HomePage() {
    const navigate = useNavigate();

    return (
        <main className="home-page">
            <div className="content-area">
                <div className="home-title">
                    Welcome to <span className="highlight-text">Isotope</span>
                </div>

                <div>
                    <button className="btn btn--green" onClick={() => navigate("/game")}>
                        Start Game
                    </button>
                </div>
            </div>
        </main>
    );
}

export default HomePage;