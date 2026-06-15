package com.example.backend.domain;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Entity> entities = new ArrayList<>();
    Player p1;

    public Game() {
    }

    public void initializeGame() {
        Point2D playerOrigin = new Point2D();
        p1 = new Player(playerOrigin);
    }

    public Player getPlayer() {
        return p1;
    }
}
