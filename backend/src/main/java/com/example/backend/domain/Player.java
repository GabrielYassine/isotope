package com.example.backend.domain;

public class Player {
    private Point2D origin;

    public Player(Point2D position) {
        this.origin = position;
    }

    private void updatePos(Point2D position) {
        this.origin = position;
    }

    private void updatePos(double xCord, double yCord) {
        this.origin = new Point2D(xCord, yCord);
    }
}