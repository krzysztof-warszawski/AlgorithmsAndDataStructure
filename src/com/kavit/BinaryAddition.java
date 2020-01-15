package com.kavit;

public class BinaryAddition {
    public static void add(String binOne, String binTwo) {
        StringBuilder binChar = new StringBuilder();
        while (binOne.length() != binTwo.length()) {
            if (binOne.length() > binTwo.length()) {
                binTwo = 0 + binTwo;
            } else
                binOne = 0 + binOne;
        }
        int count = binOne.length() - 1;
        char remainderOne;
        char remainderTwo;
        char modulo = '0';
        for (int i = count; i > -1; i--){
            remainderOne = binOne.charAt(i);
            remainderTwo = binTwo.charAt(i);
            if (remainderOne == '0' && remainderTwo == '0') {
                if (modulo == '0') {
                    binChar.append('0');
                } else
                    binChar.append('1');
                modulo = '0';
            } else if (remainderOne == '0' && remainderTwo == '1'){
                if (modulo == '1') {
                    binChar.append('0');
                } else
                    binChar.append('1');
            } else if (remainderOne == '1' && remainderTwo == '0'){
                if (modulo == '1') {
                    binChar.append('0');
                } else
                    binChar.append('1');
            } else if (remainderOne == '1' && remainderTwo == '1'){
                if (modulo == '0') {
                    binChar.append('0');
                    modulo = '1';
                } else
                    binChar.append('1');
            }
        }
        if (modulo == '1') {
            binChar.append('1');
        }
        String bin = binChar.reverse().toString();
        System.out.println(bin);
    }
}
