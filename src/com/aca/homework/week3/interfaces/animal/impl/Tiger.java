package com.aca.homework.week3.interfaces.animal.impl;

import com.aca.homework.week3.interfaces.animal.LandAnimal;

public class Tiger implements LandAnimal {

    @Override
    public void isBreathing() {
        System.out.println("Tiger is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("Tiger is running");
    }
}
