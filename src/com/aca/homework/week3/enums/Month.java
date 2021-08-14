package com.aca.homework.week3.enums;

public enum Month {

    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private static final Month[] VALUES = Month.values();
    private final String value;

    Month(final String value) {
        this.value = value;
    }

    public static String getMonth(final int index) {
        if (index > 12 || index < 0) {
            return "No such month";
        }
        return VALUES[index - 1].getValue();
    }

    public String getValue() {
        return this.value;
    }
}
