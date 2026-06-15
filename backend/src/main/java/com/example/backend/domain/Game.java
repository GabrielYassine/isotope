package com.example.backend.domain;

import com.example.backend.util.Time;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Entity> entities = new ArrayList<>();
    Player p1;

    public Game() {
        initializeGame();
        loop();
    }

    public void initializeGame() {
        Point2D playerOrigin = new Point2D();
        p1 = new Player(playerOrigin);
    }

    public Player getPlayer() {
        return p1;
    }

    public void loop() {
        float initialTime = Time.getTime();
        float endTime;
        float deltaTime = -1.0f;
        int frames = 0;
        int updates = 0;

        while (!shouldEnd()) {
            if (deltaTime >= 0) {
                updates++;
            }
            frames++;

            endTime = Time.getTime();
            deltaTime = endTime - initialTime;
            initialTime = endTime;
        }

        endGame();
    }

    private boolean shouldEnd() {
        return true;
    }

    private void endGame() {
    }

}
