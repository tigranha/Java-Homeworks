package com.aca.homework.week5;

public class BubbleSortImpl {

    void bubbleSort(final int[] unsortedArray) {
        if (unsortedArray == null) {
            throw new RuntimeException("passed array cant be null");
        }
        if (unsortedArray.length < 2) {
            return;
        }
        final int length = unsortedArray.length;
        for (int i = 0; i < length - 1; i++) {

            for (int j = 0; j < (length - i - 1); j++) {

                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }
    }
}
