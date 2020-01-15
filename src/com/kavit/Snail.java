package com.kavit;

import java.util.Arrays;

public class Snail {
    public static void main(String[] args) {

        snail(24);
    }

    public static void snail(int b) {
        int row = b-1;
        int column = b-1;
        int n = b-1;
        String[][] array = new String[b][b];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = " ";
            }
        }
        for (int i = 0; i <= column; i++) {
            array[0][i] = "0";
        }
        int r = 1;
        int e = 0;
        while (n > 0) {
            for (int i = e + 1; i <= n+e; i++) {
                array[i][column] = "0";
            }
            if (n > 1) {
                for (int i = column; i >= e; i--) {
                    array[row][i] = "0";
                }
            }
            n -= 2;
            if (n > 0) {
                for (int i = row-1; i >= row - n; i--) {
                    array[i][e] = "0";
                }
                if (n > 1) {
                    for (int i = r; i < column-1; i++) {
                        array[row-n][i] = "0";
                    }
                }
                n -= 2;
                e += 2;
                r += 2;
            }
            column -= 2;
            row -= 2;
        }
        for (int i = 0; i < b; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
