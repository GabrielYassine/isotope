package com.example.backend.domain;

public class Player extends Entity {
    private Point2D origin;

    public Player(Point2D position) {
        this.origin = position;
    }
}