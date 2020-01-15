package com.kavit;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
    public static void main(String[] args) {

        permutation("ABC");
    }

    public static void permutation(String s) {
        Set<String> variations = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = s.toCharArray();
        char temp;
        for (int l = 0; l < s.length(); l++) {
            for (int j = 0; j < s.length()-1; j++) {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                for (int i = 0; i < s.length(); i++) {
                    for (int k = i; k < s.length()-1; k++) {
                        temp = array[k];
                        array[k] = array[k+1];
                        array[k+1] = temp;
                        String tempStr = stringBuilder.append(array).toString();
                        variations.add(tempStr);
                        stringBuilder = new StringBuilder();
                    }
                }
            }
        }
        for (String v : variations) {
            System.out.println(v);
        }
    }
}
