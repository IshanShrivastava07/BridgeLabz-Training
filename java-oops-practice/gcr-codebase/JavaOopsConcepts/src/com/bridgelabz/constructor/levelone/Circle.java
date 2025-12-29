package com.bridgelabz.constructor.levelone;
// Circle class using constructor chaining
public class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Radius: " + c.radius);
    }
}
