package com.aca.homework.week4.task2.assertionutils;

public class AssertionUtils {

    public static boolean assertEquals(final int val1, final int val2) {
        if (val1 != val2) {
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean assertEquals(final double val1, final double val2) {
        if (val1 != val2) {
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean assertEquals(final String val1, final String val2) {
        if (val1 == null || !val1.equals(val2)) {
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean assertEquals(final boolean val1, final boolean val2) {
        if (val1 != val2) {
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean assertNotNull(final Object obj) {
        if (obj == null) {
            throw new RuntimeException();
        }
        return true;
    }
}
