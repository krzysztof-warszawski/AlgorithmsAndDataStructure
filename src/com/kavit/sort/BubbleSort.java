package com.kavit.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {2, -4, 32, 55, -14, 12, 7, 31};
        System.out.println(Arrays.toString(array));
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
