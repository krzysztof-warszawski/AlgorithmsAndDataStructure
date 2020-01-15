package com.kavit;

public class BinaryDivision {
    public static void divide(String binOne, String binTwo) {
        StringBuilder binResultSub = new StringBuilder();
        int start = binTwo.length();
        binOne += 0;
        int end = binOne.length();
        String one = binOne.substring(0, start);
        for (int i = start; i < end; i++) {
            if (binToDecOnDigits(one) >= binToDecOnDigits(binTwo)) {
                binResultSub.append("1");
                one = subtraction(one, binTwo);
            } else {
                binResultSub.append("0");
            }
            one = one.concat(binOne.substring(i , i + 1));
        }
        System.out.println("Result of division: " + binResultSub.toString());
    }

    public static int binToDecOnDigits(String bin) {
        int i = 0;
        int dec = 0;
        int binCopy = Integer.parseInt(bin);
        int leftover;
        while (binCopy != 0) {
            leftover = binCopy%10;
            dec += leftover * Math.pow(2, i);
            binCopy /= 10;
            i++;
        }
        return dec;
    }

    public static String subtraction(String binOne, String binTwo) {
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
        System.out.println("Result of subtraction: " + bin);
        return bin;
    }
}