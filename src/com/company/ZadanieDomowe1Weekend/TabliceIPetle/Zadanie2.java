package com.company.ZadanieDomowe1Weekend.TabliceIPetle;

import java.util.Arrays;

public class Zadanie2 {
    private static int findMax(int[] tab) {
        int max = Integer.MIN_VALUE;

        for (int i : tab) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int findMin(int[] tab) {
        int min = Integer.MAX_VALUE;
        for (int i : tab) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int sumTab(int[] tab) {
        int result = 0;
        for (int i : tab) {
            result += i;
        }

        return result;
    }

    private static double avgTab(int[] tab) {
        return (double) sumTab(tab) / tab.length;
    }

    private static double median(int[] tab) {
        Arrays.sort(tab);
        int length = tab.length;

        if (length % 2 == 0) {
            return ((tab[(length-1) / 2]) + (tab[(length-1) / 2 + 1])) / 2d;
        } else {
            return (tab[(length-1)/2]);
        }
    }

    public static void main(String[] args) {
        int[] tab = {100, 80, 70, 99, 150};

        System.out.println("Max = " + findMax(tab));
        System.out.println("Min = " + findMin(tab));
        System.out.println("Sum = " + sumTab(tab));
        System.out.println("Avg = " + avgTab(tab));
        System.out.println("Median = " + median(tab));
    }
}
