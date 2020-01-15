package com.kavit;

public class BinarySubtraction {

    public static void subtract(String binOne, String binTwo) {
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
        boolean borrow = false;
        for (int i = count; i > -1; i--){
            remainderOne = binOne.charAt(i);
            remainderTwo = binTwo.charAt(i);
            if (remainderOne == '0' && remainderTwo == '0') {
                if (borrow) {
                    binChar.append('1');
                } else {
                    binChar.append('0');
                }
            } else if (remainderOne == '0' && remainderTwo == '1'){
                if (borrow) {
                    binChar.append('0');
                } else {
                    borrow = true;
                    binChar.append('1');
                }
            } else if (remainderOne == '1' && remainderTwo == '0'){
                if (borrow) {
                    binChar.append('0');
                    borrow = false;
                } else
                    binChar.append('1');
            } else if (remainderOne == '1' && remainderTwo == '1'){
                if (borrow) {
                    binChar.append('1');
                } else
                    binChar.append('0');
            }
        }
        String bin = binChar.reverse().toString();
        System.out.println(bin);
    }
}
