package com.kavit.sort;

import java.util.Arrays;

public class InsertionSortRecursive {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(intArray,intArray.length);

        for (int value : intArray) {
            System.out.println(value);
        }

//        for (int i = 1; i < intArray.length; i++) {
//            int newElement = intArray[i];
//            int j;
//            for (j = i; ((j > 0) && (intArray[j - 1] > newElement)); j--) {
//                intArray[j] = intArray[j - 1];
//            }
//            intArray[j] = newElement;
//        }
//
//        System.out.println(Arrays.toString(intArray));
    }

    public static void insertionSort(int[] input, int numItems) {
        if (numItems < 2) {
            return;
        }

        insertionSort(input,numItems-1);

        int newElement = input[numItems-1];
        int j;
        for (j = numItems-1; ((j > 0) && (input[j - 1] > newElement)); j--) {
            input[j] = input[j - 1];
        }
        input[j] = newElement;
    }
}