package com.aca.homework.week4.task1;

import com.aca.homework.week4.task1.user.User;
import com.aca.homework.week4.task1.user.UserGroup;
import com.aca.homework.week4.task3.printer.Printer;

public class Main {
        public static void main(String[] args) {
                User user1 = new User("Vaxinak", "Smith","VS","v_smith@gmail.com");
                User user2 = new User("Varditer", "Smith","VS","v_smith@gmail.com");

                Printer.print(user1);

                UserGroup userGroup = new UserGroup();
                userGroup.addUser(user1);
                userGroup.addUser(user2);

                Printer.print(userGroup);

        }
}
