package com.aca.homework.week3.polymorphysm.shape.impl;

import com.aca.homework.week3.polymorphysm.shape.Shape;

public class Rectangle implements Shape {

    private final String name = "Rectangle";
    private final double length;
    private final double width;

    public Rectangle(final double length, final double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
