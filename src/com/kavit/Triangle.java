package com.kavit;

public class Triangle {

    public static void main(String[] args) {

        triangle(14);
    }

    public static void triangle(int n) {
        int rowCount = 1;

        while (rowCount <= n) {
            int printNumber = 0;
            int columnCount = 2 * rowCount - 2;
            int middlePoint = columnCount/2;
            for (int j = n - rowCount - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int i = columnCount; i > -1; i--) {
                if (i%2 != 0 && i == middlePoint) {
                    System.out.print(" " + printNumber);
                    i--;
                } else if ((i%2 != 0)) {
                    System.out.print(" ");
                } else if ((i >= middlePoint)) {
                    System.out.print(printNumber + 1);
                    printNumber++;
                } else {
                    System.out.print(printNumber - 1);
                    printNumber--;
                }
            }
            rowCount++;
            System.out.println();
        }
    }
}
