package com.aca.homework.week4.task2.point;

import com.aca.homework.week4.task2.point.enums.Colour;

public class ColouredTriangle extends Triangle{
    private final Colour color;

    public ColouredTriangle(Triangle triangle, Colour color) {
        super(triangle);
        this.color = color;
    }

//    @Override
//    public String toString() {
//        return "";
//    }

//
//    @Override
//    public boolean equals(Object obj) {
//        if(!(obj instanceof ColouredTriangle))
//    }
}
