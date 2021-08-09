package com.aca.homework.week3.polymorphysm.shape.impl;

import com.aca.homework.week3.polymorphysm.shape.Shape;

public class RightTriangle implements Shape {

    private final String name = "Right triangle";
    private final double baseLength;
    private final double height;

    public RightTriangle(final double baseLength, final double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return baseLength * height / 2;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
