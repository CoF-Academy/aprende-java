package com.cofacademy.example;

public class Circle extends Figure {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.1416 * radius * radius;
    }
}
