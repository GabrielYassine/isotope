package com.example.backend.domain;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Entity> entities = new ArrayList<>();
    Player p1;

    int maxFPS = 60; // Should be configurable

    public Game() {
        System.out.println("Game has been created");
        initializeGame();
        System.out.println("Game has been initialized");
        loop();
        System.out.println("Loop has been exited");
        endGame();
        System.out.print("Game has ended");
    }

    public void initializeGame() {
        Point2D playerOrigin = new Point2D();
        p1 = new Player(playerOrigin);
    }

    public Player getPlayer() {
        return p1;
    }

    public void loop() {
        double timePerFrame = 1_000_000_000.0 / maxFPS;

        long previousTime = System.nanoTime();
        double delta = 0;

        while (!shouldEnd()) {
            long currentTime = System.nanoTime();

            delta += (currentTime - previousTime) / timePerFrame;
            previousTime = currentTime;

            if (delta >= 1) {
                tick();
                render();
                delta--;
            }
        }
    }

    private void tick() {
//        p1.move();
//        System.out.println(p1);
    }

    private void render() {
    }

    private boolean shouldEnd() {
        return false;
    }

    private void endGame() {
    }
}
