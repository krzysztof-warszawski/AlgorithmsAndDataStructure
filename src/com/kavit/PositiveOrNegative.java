package com.kavit;

public class PositiveOrNegative {

    public static void main(String[] args) {

        int[][] intTab = {
                {-1, 2, 0, 3},
                {-4, -5, 8},
                {9, 0, 3, 2}
        };

        takeTheElement(intTab, 0, 0);
    }

    public static String takeTheElement(int[][] tab, int x, int y) {
        if (y == tab[x].length) {
            if (x == tab.length-1) {
                return "Finished";
            } else return posNeg(tab, x+1, 0);
        } else return posNeg(tab, x, y);
    }

    public static String posNeg(int[][] tab, int x, int y) {
        if (tab[x][y] > 0) {
            System.out.println("Positive");
        } else if (tab[x][y] < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        return takeTheElement(tab, x, y+1);
    }

}
