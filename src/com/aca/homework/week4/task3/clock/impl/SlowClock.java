package com.aca.homework.week4.task3.clock.impl;

import com.aca.homework.week4.task3.clock.Clock;

public class SlowClock implements Clock {

    private int seconds;

    @Override
    public void start() {
        long currentMillis = System.currentTimeMillis();

        while (true) {
            if (System.currentTimeMillis() - currentMillis >= 2000) {
                seconds++;
                currentMillis = System.currentTimeMillis();
            }
        }
    }
}
