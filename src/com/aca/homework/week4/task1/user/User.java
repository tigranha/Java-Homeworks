package com.aca.homework.week4.task1.user;

public class User {
    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String email;

    public User(final String firstName, final String lastName, final String userName, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    public User(final User user) {
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.userName = user.userName;
        this.email = user.email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getEmail() {
        return this.email;
    }

    public User copy(User user) {
        return new User(user);
    }

    @Override
    public String toString() {
        return "User: \n\t" +
                "firstName: " + this.getFirstName() +
                "\n\tlastName: " + this.getLastName() +
                "\n\tuserName: " + this.getUserName() +
                "\n\temail: " + this.getEmail();
    }
}
