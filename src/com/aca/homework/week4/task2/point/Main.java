package com.aca.homework.week4.task2.point;

import com.aca.homework.week4.task2.point.enums.Colour;
import com.aca.homework.week4.task2.point.impl.ColouredTriangle;
import com.aca.homework.week4.task2.point.impl.ImmutablePoint;
import com.aca.homework.week4.task2.point.impl.Triangle;
import com.aca.homework.week4.task3.printer.Printer;

public class Main {
    public static void main(String[] args) {


        ImmutablePoint immutablePoint1 = ImmutablePoint.getInstance(1, 2);
        ImmutablePoint immutablePoint2 = ImmutablePoint.getInstance(3, 4);
        ImmutablePoint immutablePoint3 = ImmutablePoint.getInstance(5, 6);

        System.out.println(immutablePoint1.equals(immutablePoint2));

        Triangle triangle1 = Triangle.getInstance(immutablePoint1, immutablePoint2, immutablePoint3);
        Triangle triangle2 = new Triangle(triangle1);

        System.out.println(triangle1.equals(triangle2));

        ColouredTriangle colouredTriangle1 = new ColouredTriangle(triangle1, Colour.GREEN);
        ColouredTriangle colouredTriangle2 = new ColouredTriangle(triangle1, Colour.GREEN);

        System.out.println(colouredTriangle1.equals(colouredTriangle2));

        Triangle triangle3 = Triangle.getInstance(
                ImmutablePoint.getInstance(1, 2),
                ImmutablePoint.getInstance(3, 4),
                ImmutablePoint.getInstance(5, 6)
        );

        System.out.println(colouredTriangle1.equals(triangle3));

        Printer.print(immutablePoint1);
        Printer.print(triangle1);
        Printer.print(colouredTriangle1);
    }
}
