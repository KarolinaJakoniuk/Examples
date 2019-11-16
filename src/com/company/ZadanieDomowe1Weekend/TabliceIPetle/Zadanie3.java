package com.company.ZadanieDomowe1Weekend.TabliceIPetle;

public class Zadanie3 {
    public static int[] findAllLessThanAndDividedBy(int range, int div) {
        StringBuilder temp = new StringBuilder();
        for (int i = 1; i < range; i++) {
            if (i % div == 0) {
                temp.append(i).append(" ");
            }
        }

        String[] tab = temp.toString().split(" ");

        int[] ints = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            ints[i] = Integer.parseInt(tab[i]);
        }
        return ints;

    }

    public static void printTable(int[] tab) {
        for (int value : tab) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        int[] tab = findAllLessThanAndDividedBy(10, 2);
        printTable(tab);

    }
}
