package com.aca.homework.week3.interfaces.animal.impl;

import com.aca.homework.week3.interfaces.animal.WaterAnimal;

public class Shark implements WaterAnimal {
    @Override
    public void isBreathing() {
        System.out.println("Shark is breathing");
    }

    @Override
    public void isSwimming() {
        System.out.println("Shark is swimming");
    }
}
