package com.aca.homework.week5.customcollections.arraylist;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                }
                if (o1 < o2) {
                    return -1;
                }
                return 0;
            }
        };

        list.add(200);
        list.add(400);

        list.addAtBeginning(100);

        System.out.println(list);

        list.addAtIndex(2, 300);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.remove((Integer) 300);
        System.out.println(list);

        System.out.println(list.findIndexByValue(200));

        list.add(800);
        list.add(400);
        list.add(700);
        list.add(500);
        list.add(600);
        list.add(300);
        list.add(900);

        System.out.println(list);

        System.out.println(list.compareBubbleAndQuickSortTimes(list, comp));

    }
}
