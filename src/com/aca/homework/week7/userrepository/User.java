package com.aca.homework.week7.userrepository;

public class User {
    private final String username;
    private final int age;

    public User(final String username, final int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return this.username;
    }

    public int getAge() {
        return this.age;
    }
}
