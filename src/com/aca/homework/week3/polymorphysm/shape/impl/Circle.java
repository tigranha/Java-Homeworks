package com.aca.homework.week3.polymorphysm.shape.impl;

import com.aca.homework.week3.polymorphysm.shape.Shape;

public class Circle implements Shape {

    private final String name = "Circle";
    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
