package com.aca.homework.week4.task3.processor;

import com.aca.homework.week4.task3.processor.impl.ArmProcessor;
import com.aca.homework.week4.task3.processor.impl.X8664IntelProcessor;
import com.aca.homework.week4.task3.processor.impl.X86IntelProcessor;

public class Main {
    public static void main(String[] args) {
        System.out.println(new ArmProcessor().calculateBinary( 25_884_721));
        System.out.println(new X86IntelProcessor().calculateBinary( 25_884_721));
        System.out.println(new X8664IntelProcessor().calculateBinary( 25_884_721));
    }
}
