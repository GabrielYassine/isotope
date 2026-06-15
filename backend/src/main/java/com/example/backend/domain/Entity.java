package com.example.backend.domain;

public abstract class Entity {
    private Point2D origin;
    private double health;
    private double speed;


    private void updatePos(Point2D position) {
        this.origin = position;
    }

    private void updatePos(double xCord, double yCord) {
        this.origin = new Point2D(xCord, yCord);
    }

    private void takeDamage(double dmg) {
        health -= dmg;
    }
}
