package com.company.ZadanieDomowe1Weekend.TabliceIPetle;

public class Zadanie5 {
    private static int sumNumbers(int number) {
        String stringNumber = Integer.toString(number);

        int result = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            result += Integer.parseInt(Character.toString(stringNumber.charAt(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 52;
        System.out.println("Sum = " + sumNumbers(num));

    }
}
