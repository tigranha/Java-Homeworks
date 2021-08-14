package com.aca.homework.week4.task3.clock;

import com.aca.homework.week4.task3.clock.impl.FastClock;
import com.aca.homework.week4.task3.clock.impl.SlowClock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            sc.nextLine();
        }
        startClock(sc.nextInt());
    }

    public static void startClock(int n) {

        switch (n) {
            case 1:
                new FastClock().start();
                break;
            case 2:
                new SlowClock().start();
                break;
            default:
                throw new RuntimeException("Provided argument does not start the method of " +
                        FastClock.class.getCanonicalName() + "or" +
                        SlowClock.class.getCanonicalName() + "classes");
        }
    }
}
