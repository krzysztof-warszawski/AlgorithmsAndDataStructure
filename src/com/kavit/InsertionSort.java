package com.kavit;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array){

        for (int i = 1; i < array.length; i++) {
            int insert = array[i];
            while ((i > 0) && (array[i - 1] > insert)) {
                array[i] = array[i - 1];
                i = i - 1;
            }
            array[i] = insert;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}