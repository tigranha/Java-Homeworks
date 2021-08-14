package com.aca.homework.week4.task2.point;

import static com.aca.homework.week4.task2.assertionutils.AssertionUtils.assertNotNull;

public class Triangle {
    private final ImmutablePoint firstPoint;
    private final ImmutablePoint secondPoint;
    private final ImmutablePoint thirdPoint;

    private Triangle(final ImmutablePoint firstPoint,
                     final ImmutablePoint secondPoint,
                     final ImmutablePoint thirdPoint) {

        assertNotNull(firstPoint);
        assertNotNull(secondPoint);
        assertNotNull(thirdPoint);

        this.firstPoint = new ImmutablePoint(firstPoint);
        this.secondPoint = new ImmutablePoint(secondPoint);
        this.thirdPoint = new ImmutablePoint(thirdPoint);
    }

    public Triangle(final Triangle triangle) {
        this.firstPoint = new ImmutablePoint(triangle.getFirstPoint());
        this.secondPoint = new ImmutablePoint(triangle.getSecondPoint());
        this.thirdPoint = new ImmutablePoint(triangle.getThirdPoint());

    }

//    public static Triangle getInstance(final ImmutablePoint firstPoint,
//                                final ImmutablePoint secondPoint,
//                                final ImmutablePoint thirdPoint) {
//
//        return new Triangle(firstPoint, secondPoint, thirdPoint);
//    }

    public ImmutablePoint getFirstPoint() {
        return new ImmutablePoint(this.firstPoint);
    }

    public ImmutablePoint getSecondPoint() {
        return new ImmutablePoint(this.secondPoint);
    }

    public ImmutablePoint getThirdPoint() {
        return new ImmutablePoint(this.thirdPoint);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Triangle)) {
            return false;
        }
        final Triangle other = (Triangle) obj;
        return this.getFirstPoint().equals(other.getFirstPoint()) &&
                this.getSecondPoint().equals(other.getSecondPoint()) &&
                this.getThirdPoint().equals(other.getThirdPoint());
    }

    @Override
    public String toString() {
        return "Triangle with points: \n\t" +
                "\tfirst point: \n\t\t\t" + this.getFirstPoint().toString().toLowerCase() +
                "\n\t\tsecond point: \n\t\t\t" + this.getSecondPoint().toString().toLowerCase() +
                "\n\t\tthird point: \n\t\t\t" + this.getThirdPoint().toString().toLowerCase();
    }
}
