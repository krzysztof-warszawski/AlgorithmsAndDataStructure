package com.kavit;

public class BinaryMultiplication {

    public static String multiply(String binOne, String binTwo) {
        int count;
        StringBuilder binChar;
        String numOne= "";
        String numTwo;
        String shorter = "";
        String longer = "";
        if (binOne.length() > binTwo.length()) {
            count = binTwo.length();
            shorter += binTwo;
            longer += binOne;
        } else {
            count = binOne.length();
            shorter += binOne;
            longer += binTwo;
        }
        for (int i = count-1; i > -1; i--) {
            binChar = new StringBuilder();
            if (shorter.charAt(i) == '1') {
                binChar.append(longer);
            } else {
                for (int j = longer.length(); j > 0; j--){
                    binChar.append('0');
                }
            }
            numTwo = binChar.toString();
            numOne = addAll(numOne, numTwo);
        }
        return numOne;
    }

    public static String addAll(String binOne, String binTwo) {
        StringBuilder binChar = new StringBuilder();
        while (binOne.length() != binTwo.length()) {
            if (binOne.length() > binTwo.length()) {
                binTwo += 0 ;
            } else {
                binOne = 0 + binOne;
            }
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
        } else {
            binChar.append('0');
        }
        String bin = binChar.reverse().toString();
        return bin;
    }
}