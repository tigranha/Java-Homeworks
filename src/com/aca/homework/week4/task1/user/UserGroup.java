package com.aca.homework.week4.task1.user;

public class UserGroup {
    private static final int ARRAY_SIZE = 10;
    private final User[] usersArray = new User[ARRAY_SIZE];
    private int index;


    public void addUser(final User user) {
        if (index == 10) {
            throw new RuntimeException("Reached the limit of array in" + UserGroup.class.getCanonicalName());
        }
        usersArray[index] = user;
        index++;
    }

    public UserGroup clone() {
        UserGroup userGroup = new UserGroup();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (this.usersArray[i] == null){
                break;
            }
            userGroup.usersArray[i] = new User(this.usersArray[i]);
        }
        return userGroup;
    }

    public void printAllUsers(){
        for (int i = 0; i < ARRAY_SIZE ; i++) {
            if(this.usersArray[i] == null){
                break;
            }
            System.out.println("#" + (i+1) + " " + usersArray[i].toString());
        }
    }

    @Override
    public String toString() {
        this.printAllUsers();
        return "";
    }
}
