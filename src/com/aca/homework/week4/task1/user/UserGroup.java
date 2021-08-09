package com.aca.homework.week4.task1.user;

public class UserGroup extends User implements Cloneable {
    private final User[] usersArray = new User[10];
    private int index;

    public UserGroup(User user) {
        super(user);
    }

    public void addUser(final User user) {
        if (index == 10) {
            throw new RuntimeException("Reached the limit");
        }
        usersArray[index] = user;
        index++;
    }


    protected User[] clone() throws CloneNotSupportedException {
        final User[] cloneArr = new User[this.usersArray.length];
        for (int i = 0; i < cloneArr.length; i++){
            cloneArr[i] =  super.copy(cloneArr[i]);
        }

            return cloneArr;
    }
}
