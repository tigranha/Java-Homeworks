package com.aca.homework.week3.autoboxingunboxing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IntegerExample instance = new IntegerExample();
        System.err.println(instance.convertNegIntegerToPosInt());

        /*
        Autoboxing/Unboxing #2
         */
        List<Double> list = new ArrayList<>();
        double pi = 3.14;
        list.add(pi);

        double anotherPi = list.get(0);

        System.err.println(anotherPi);
    }
}
