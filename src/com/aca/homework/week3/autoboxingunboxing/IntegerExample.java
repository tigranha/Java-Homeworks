package com.aca.homework.week3.autoboxingunboxing;

import java.util.Random;

public class IntegerExample {

    final Integer randomNegativeInteger;

    public IntegerExample() {
        final Random random = new Random();
        this.randomNegativeInteger = Integer.MIN_VALUE + random.nextInt(Integer.MAX_VALUE);
    }

    public int convertNegIntegerToPosInt() {
        return -(this.randomNegativeInteger);
    }
}
