package com.aca.homework.week1;

public class Person {

    private long birthMillis = -1;
    private String name;

    public long getAge() {
        if (this.birthMillis == -1) {
            System.err.println("Birthday is not set yet");
            return -1;
        } else {
            return millisToYear(System.currentTimeMillis() - this.birthMillis + getDefaultYearInMillis());
        }
    }

    public long getBirthMillis() {
        if (this.birthMillis == -1) {
            System.err.println("Birthday is not set yet");
            return -1;
        } else {
            return this.birthMillis;
        }
    }

    public void setBirthMillis(long birthMillis) {
        if (birthMillis < 0) {
            System.err.println("Can't have negative age");
        } else if (birthMillis < getDefaultYearInMillis()) {
            System.err.println("Can't go lower than 1970");
        } else if (birthMillis > System.currentTimeMillis()) {
            System.err.println("Not born yet?");
        } else {
            this.birthMillis = birthMillis;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private long millisToYear(long millis) {
        return millis / (1000L * 60 * 60 * 24 * 365);
    }

    private long getDefaultYearInMillis() {
        return  1970 * (1000L * 60 * 60 * 24 * 365);
    }
}