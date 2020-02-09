package com.kavit;

public class Main {

    public static void main(String[] args) {

        System.out.println(exponentiation(4,3));
        System.out.println(decimalToBinary(1542, new StringBuilder()));

    }

    public static int exponentiation(int number, int power) {
        if (power == 0)
            return 1;
        else
            return number * exponentiation(number, power - 1);
    }

    public static StringBuilder decimalToBinary (int dec, StringBuilder stringBuilder) {
        stringBuilder.append(dec%2);
        if(dec < 2) return stringBuilder.reverse();
        else return decimalToBinary(dec/2, stringBuilder);
    }
}
