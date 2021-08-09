package com.aca.homework.week3.enums;

public enum Months {

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

    private static final Months[] VALUES = Months.values();
    private final String value;

    Months(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static String getMonth(final int index) {
        if (index > 12){
            return "No such month";
        }
        return VALUES[index - 1].getValue();
    }
}
