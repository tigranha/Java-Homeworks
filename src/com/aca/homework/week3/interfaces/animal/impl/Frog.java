package com.aca.homework.week3.interfaces.animal.impl;

import com.aca.homework.week3.interfaces.animal.Animal;
import com.aca.homework.week3.interfaces.animal.LandAnimal;
import com.aca.homework.week3.interfaces.animal.WaterAnimal;

public class Frog implements Animal, LandAnimal, WaterAnimal {
    @Override
    public void isBreathing() {
        System.out.println("Frog is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("Frog is running");
    }

    @Override
    public void isSwimming() {
        System.out.println("Frog is swimming");
    }
}
