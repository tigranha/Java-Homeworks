package com.aca.homework.week4.task1.user;

public class User {
    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String email;

    public User(User user) {
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.userName = user.userName;
        this.email = user.email;

    }

    public User copy(User user){
        return new User(user);
    }
}
