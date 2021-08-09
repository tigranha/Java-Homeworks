package com.aca.homework.week3.polymorphysm.stuff;

import com.aca.homework.week3.polymorphysm.stuff.impl.Driver;
import com.aca.homework.week3.polymorphysm.stuff.impl.Teacher;

public class Main {
    public static void main(String[] args) {
        Stuff teacher = new Teacher();
        Stuff driver = new Driver();

        driver.work();
        teacher.work();
    }
}
