package com.kavit;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        int count = array.length;

        for (int i = 0; i < count; i++) {
            int min = i;
            for (int j = i + 1; j < count; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (Arrays.asList(array).indexOf(min) != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}