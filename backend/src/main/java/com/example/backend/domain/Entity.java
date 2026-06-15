package com.example.backend.domain;

public abstract class Entity {
    private Point2D origin;
    private double health;
    private double speed;
    private double angle;

    public Entity(Point2D origin) {
        this.origin = origin;
        this.health = 100;
        this.speed = 5;
        this.angle = 30;
    }

    public void updatePos(Point2D position) {
        this.origin = position;
    }

    public void updatePos(double xCord, double yCord) {
        this.origin = new Point2D(xCord, yCord);
    }

    public void takeDamage(double dmg) {
        health -= dmg;
    }

    public void move() {
        double angleRad = angle * Math.PI * 2 / 360;

        double velocityX = Math.cos(angleRad) * speed;
        double velocityY = Math.sin(angleRad) * speed;

        origin.updatePos(velocityX, velocityY);
    }

    @Override
    public String toString() {
        return "Player Position: " + origin +
                "\n Player Health: " + health +
                "\n Player Speed: " + speed +
                "\n Player Angle: " + angle + "\n";
    }
}
