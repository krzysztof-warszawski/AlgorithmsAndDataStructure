package com.kavit.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

    int[] intArray = {2, -4, 32, 55, -14, 12, 7, 31};
        System.out.println(Arrays.toString(intArray));

        for (int i = 1; i < intArray.length; i++) {
            int newElement = intArray[i];
            int j;
            for (j = i; ((j > 0) && (intArray[j - 1] > newElement)); j--) {
                intArray[j] = intArray[j - 1];
            }
            intArray[j] = newElement;
        }

        System.out.println(Arrays.toString(intArray));
    }
}