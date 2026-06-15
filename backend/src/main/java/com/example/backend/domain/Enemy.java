package com.example.backend.domain;

public class Enemy {
    private Point2D origin;

    public Enemy(Point2D position) {
        this.origin = position;
    }

    private void updatePos(Point2D position) {
        this.origin = position;
    }

    private void updatePos(double xCord, double yCord) {
        this.origin = new Point2D(xCord, yCord);
    }
}
