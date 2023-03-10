package org.example.util;

public class StringUtil {
    public static String repeat(String str, int times) {
        if (times < 0) {
            throw new IllegalArgumentException("Negative times not allowed");
        }

        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result.toString();
    }
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
