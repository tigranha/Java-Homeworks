package com.aca.homework.week3.enums;

public enum Direction {
    EAST ("East"),
    WEST ("West"),
    NORTH ("North"),
    SOUTH ("South");

    private final String value;
    private static final Direction[] VALUES = Direction.values();

    Direction(String value) {
        this.value = value;
    }

    public String getDirection(){
        return this.value;
    }

    public static void printAllDirections(){
        for (Direction direction : VALUES){
            System.out.println(direction.value);
        }
    }

}
