package com.aca.homework.week3.staticfields;

public class Laptop {

    static int publicCounter = 0;
    static int protectedCounter = 0;

    public Laptop() {
        publicCounter++;
    }

    protected Laptop(boolean isConstructorPublic) {
        if (!isConstructorPublic) {
            protectedCounter++;
        } else {
            new Laptop();
        }
    }

    public static void setPublicCounter(int publicCounter) {
        Laptop.publicCounter = publicCounter;
    }

    public static void setProtectedCounter(int protectedCounter) {
        Laptop.protectedCounter = protectedCounter;
    }
}
