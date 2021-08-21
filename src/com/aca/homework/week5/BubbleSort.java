package com.aca.homework.week5;

public class BubbleSort {

    void bubbleSort(int[] unsortedArray) {
        int n = unsortedArray.length;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < (n - i - 1); j++)

                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
        }
    }
}
