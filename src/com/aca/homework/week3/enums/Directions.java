package com.aca.homework.week3.enums;

public enum Directions {
    EAST ("East"),
    WEST ("West"),
    NORTH ("North"),
    SOUTH ("South");

    private final String value;
    private static final Directions[] VALUES = Directions.values();

    Directions(String value) {
        this.value = value;
    }

    public String getDirection(){
        return this.value;
    }

    public static void printAllDirections(){
        for (Directions direction : VALUES){
            System.out.println(direction.value);
        }
    }

}
