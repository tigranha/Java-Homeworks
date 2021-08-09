package com.aca.homework.week4.task2.point;

import com.aca.classwork.week3.Point;

import static com.aca.homework.week4.task2.assertionutils.AssertionUtils.assertNotNull;

//this class is not declared final since it would clash
// with other requirement (Task2 part4)
public class Triangle {
    private final Point firstPoint;
    private final Point secondPoint;
    private final Point thirdPoint;

    private Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        assertNotNull(firstPoint);
        assertNotNull(secondPoint);
        assertNotNull(thirdPoint);

        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }
    public Triangle(Triangle triangle){
        this.firstPoint = triangle.firstPoint;
        this.secondPoint = triangle.secondPoint;
        this.thirdPoint = triangle.thirdPoint;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Triangle)){
            return false;
        }
        Triangle other = (Triangle) obj;
        return this.firstPoint.equals(other.firstPoint) &&
                this.secondPoint.equals(other.secondPoint) &&
                this.thirdPoint.equals(other.thirdPoint);
    }

    @Override
    public String toString() {
        return "Triangle with points :\n" +
                "\tfirst point = " + this.firstPoint +
                "\n\tsecond point = " + this.secondPoint +
                "\n\tthird point = " + this.thirdPoint;
    }
}
