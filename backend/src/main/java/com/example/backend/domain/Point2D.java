package com.example.backend.domain;

public class Point2D {
    private double posX;
    private double posY;

    public Point2D() {
        this.posX = 0;
        this.posY = 0;
    }

    public Point2D(double xCord, double yCord) {
        this.posX = xCord;
        this.posY = yCord;
    }

    public void updatePos(double deltaX, double deltaY) {
        posX += deltaX;
        posY += deltaY;
    }

    public String toString() {
        return "(" + posX + ", " + posY + ")";
    }
}
