package com.aca.homework.week3.polymorphysm.stuff.impl;

import com.aca.homework.week3.polymorphysm.stuff.Stuff;

public class Driver implements Stuff {
    @Override
    public void work() {
        System.out.println("Driving");
    }
}
