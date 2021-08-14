package com.aca.homework.week4.task3.printer;

public class Printer {
    private static final String LINE = "************************************";

    public static void print(final Object obj){
        System.out.println(LINE);
        System.out.println(obj.toString());
        System.out.println(LINE);
    }
}
