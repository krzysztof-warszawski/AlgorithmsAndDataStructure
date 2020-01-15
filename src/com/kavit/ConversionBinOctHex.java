package com.kavit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConversionBinOctHex {

    public static String binToOct(String bin) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("000", "0");
        stringMap.put("001", "1");
        stringMap.put("010", "2");
        stringMap.put("011", "3");
        stringMap.put("100", "4");
        stringMap.put("101", "5");
        stringMap.put("110", "6");
        stringMap.put("111", "7");

        Set<String> binaryKeys = stringMap.keySet();

        while (bin.length() % 3 != 0) {
            bin = 0 + bin;
        }
        bin += 0;

        for (int i = 0; i + 3 < bin.length(); i += 3) {
            stringBuilder.append(bin, i, i + 3).append(" ");
        }
        String octNumber = stringBuilder.toString();

        for (String binKey : binaryKeys) {
            octNumber = octNumber.replace(binKey, stringMap.get(binKey));
        }
        octNumber = octNumber.replaceAll(" ", "");
        System.out.println(octNumber);
        return octNumber;
    }

    public static String octToBin(String oct) {
        StringBuilder stringBuilder = new StringBuilder();

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("0", "000");
        stringMap.put("1", "001");
        stringMap.put("2", "010");
        stringMap.put("3", "011");
        stringMap.put("4", "100");
        stringMap.put("5", "101");
        stringMap.put("6", "110");
        stringMap.put("7", "111");

        Set<String> binaryKeys = stringMap.keySet();

        for (int i = 0; i < oct.length(); i++) {
            stringBuilder.append(oct.charAt(i)).append(" ");
        }
        String binNumber = stringBuilder.toString();

        for (String binKey : binaryKeys) {
            binNumber = binNumber.replace(binKey, stringMap.get(binKey));
        }
        System.out.println(binNumber);
        return binNumber;
    }

    public static String binToHex(String bin) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("0000", "0");
        stringMap.put("0001", "1");
        stringMap.put("0010", "2");
        stringMap.put("0011", "3");
        stringMap.put("0100", "4");
        stringMap.put("0101", "5");
        stringMap.put("0110", "6");
        stringMap.put("0111", "7");
        stringMap.put("1000", "8");
        stringMap.put("1001", "9");
        stringMap.put("1010", "A");
        stringMap.put("1011", "B");
        stringMap.put("1100", "C");
        stringMap.put("1101", "D");
        stringMap.put("1110", "E");
        stringMap.put("1111", "F");

        Set<String> binaryKeys = stringMap.keySet();

        while (bin.length() % 4 != 0) {
            bin = 0 + bin;
        }
        bin += 0;

        for (int i = 0; i + 4 < bin.length(); i += 4) {
            stringBuilder.append(bin, i, i + 4).append(" ");
        }
        String hexNumber = stringBuilder.toString();

        for (String binKey : binaryKeys) {
            hexNumber = hexNumber.replace(binKey, stringMap.get(binKey));
        }
        hexNumber = hexNumber.replaceAll(" ", "");
        System.out.println(hexNumber);
        return hexNumber;
    }

    public static String hexToBin(String hex) {
        hex = hex.replaceAll("0", "0000 ");
        hex = hex.replaceAll("1", "0001 ");
        hex = hex.replaceAll("2", "0010 ");
        hex = hex.replaceAll("3", "0011 ");
        hex = hex.replaceAll("4", "0100 ");
        hex = hex.replaceAll("5", "0101 ");
        hex = hex.replaceAll("6", "0110 ");
        hex = hex.replaceAll("7", "0111 ");
        hex = hex.replaceAll("8", "1000 ");
        hex = hex.replaceAll("9", "1001 ");
        hex = hex.replaceAll("A", "1010 ");
        hex = hex.replaceAll("B", "1011 ");
        hex = hex.replaceAll("C", "1100 ");
        hex = hex.replaceAll("D", "1101 ");
        hex = hex.replaceAll("E", "1110 ");
        hex = hex.replaceAll("F", "1111 ");
        System.out.println(hex);
        return hex;
    }
}