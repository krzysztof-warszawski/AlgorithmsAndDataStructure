package com.kavit.sort;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] array, int lowIndex, int highIndex) {
        int pivot = array[highIndex];
        int i = (lowIndex-1);
        for (int j=lowIndex; j<highIndex; j++) {

            if (array[j] < pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[highIndex];
        array[highIndex] = temp;

        return i+1;
    }

    public static int[] quickSort(int[] array, int low, int high)
    {
        if (low < high) {

            int par = partition(array, low, high);

            quickSort(array, low, par-1);
            quickSort(array, par+1, high);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
