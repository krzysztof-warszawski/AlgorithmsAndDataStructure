package com.kavit.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {

        int[] intArray = {2, -4, 32, 55, -14, 12, 7, 31};

        for (int gap = intArray.length/2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j;
                for (j = i; ((j >= gap) && (intArray[j - gap] > newElement)); j -= gap) {
                    intArray[j] = intArray[j - gap];
                }
                intArray[j] = newElement;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}
