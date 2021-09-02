package com.aca.homework.week5.customcollections.linkedlist;

public class Main {
    public static void main(String[] args) {
        CustomDoublyLinkedList<Integer> list = new CustomDoublyLinkedList<>();

        list.add(1);
        list.add(10);
        list.add(100);

        list.addAtBeginning(0);
        System.out.println(list);

        list.add(1,5);
        System.out.println(list);

        System.out.println(list.indexOf(1));

        System.out.println(list.size());

        list.remove(5);

        System.out.println(list);
        System.out.println(list.size());


    }
}
