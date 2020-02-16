package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        return 0.5*height*base;
    }
}
