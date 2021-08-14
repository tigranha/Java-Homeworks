package com.aca.homework.week4.task3.processor.impl;

import com.aca.homework.week4.task3.processor.Processor;

public class ArmProcessor implements Processor {

    @Override
    public String calculateBinary(final long decimal) {
        final long start = System.currentTimeMillis();

        while (System.currentTimeMillis() - start <= 1000) {

        }
        return Long.toBinaryString(decimal);
    }

}
