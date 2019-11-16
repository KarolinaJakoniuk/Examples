package com.company.ZadanieDomowe1Weekend.TabliceIPetle;

public class Zadanie6 {
    private static String reverseString(String string) {
        StringBuilder reverse = new StringBuilder();
        for (int i = string.length() -1; i >= 0; i--) {
            reverse.append(string.charAt(i));
        }
        return reverse.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("ide spac"));
    }
}
