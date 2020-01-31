package com.kavit.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] intArray = {2, -4, 32, 55, -14, 12, 7, 31};
        System.out.println(Arrays.toString(intArray));

        for (int i = intArray.length - 1; i > 0; i--) {
            int index = 0;
            for (int j = 1; j <= i; j++) {
                if (intArray[j] > intArray[index]) {
                    index = j;
                }
            }
            System.out.println(index);
            int temp = intArray[i];
            intArray[i] = intArray[index];
            intArray[index] = temp;
        }

        System.out.println(Arrays.toString(intArray));
    }
}