package com.emiyaconsulting.constructor_chaining;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle() {
        this(0, 0); // Calls the 2nd constructor
    }

    public Rectangle(int width, int height) {
        this(0, 0, width, height); // Calls the 3rd constructor
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
