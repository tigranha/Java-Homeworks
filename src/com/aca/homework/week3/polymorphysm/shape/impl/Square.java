package com.aca.homework.week3.polymorphysm.shape.impl;

import com.aca.homework.week3.polymorphysm.shape.Shape;

public class Square implements Shape {

    private final String name = "Square";
    private final double side;

    public Square(final double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
