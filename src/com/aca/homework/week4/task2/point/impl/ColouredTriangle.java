package com.aca.homework.week4.task2.point.impl;

import com.aca.homework.week4.task2.point.enums.Colour;

public class ColouredTriangle extends Triangle {
    private final Colour color;

    public ColouredTriangle(final Triangle triangle,final Colour color) {
        super(triangle);
        this.color = color;
    }

    public Colour getColor() {
        return this.color;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Triangle)){
            return false;
        }
        if (obj.getClass().equals(Triangle.class)){
            final Triangle otherTriangle = (Triangle) obj;
            return otherTriangle.equals(this);
        }
        final ColouredTriangle other = (ColouredTriangle) obj;

        return this.getColor().equals(other.getColor()) &&
                this.getFirstPoint().equals(other.getFirstPoint()) &&
                this.getSecondPoint().equals(other.getSecondPoint()) &&
                this.getThirdPoint().equals(other.getThirdPoint());
    }

    @Override
    public String toString() {
        return "Coloured triangle with: \n\tcolour: \n\t\t" +
                this.getColor().toString().toLowerCase() +
                "\n\t" + super.toString().toLowerCase();
    }
}
