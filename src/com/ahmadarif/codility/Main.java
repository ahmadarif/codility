package com.ahmadarif.codility;

public class Main {

    public static String intToBinaryString(int value) {
        StringBuilder result = new StringBuilder();
        boolean isNegative = false;

        if (value == 0) return "0";
        if (value < 0) {
            value *= -1;
            isNegative = true;
        }

        while (value > 0) {
            result.insert(0, (value % 2 == 0 ? "0" : "1"));
            value /= 2;
        }
        if (isNegative) result.insert(0, "-");

        return result.toString();
    }

    public static void main(String[] args) throws Exception {

    }
}
