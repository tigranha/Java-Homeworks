package com.aca.homework.week4.task2.assertionutils;

public class AssertionUtils {
    public static boolean assertEquals(int val1, int val2){
        if (val1 != val2){
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean assertEquals(double val1, double val2){
        if (val1 != val2){
            throw  new RuntimeException();
        }
        return true;
    }

    public static boolean assertEquals(String val1, String val2){
        if (val1== null || !val1.equals(val2)){
            throw  new RuntimeException();
        }
        return  true;
    }

    public static boolean assertEquals(boolean val1, boolean val2){
        if (val1 != val2){
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean assertNotNull(Object obj){
        if (obj == null){
            throw new RuntimeException();
        }
        return true;
    }
}
