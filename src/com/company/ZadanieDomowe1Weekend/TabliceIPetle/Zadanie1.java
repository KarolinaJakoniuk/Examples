package com.company.ZadanieDomowe1Weekend.TabliceIPetle;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Zadanie1 {
    private static Scanner scanner = new Scanner(System.in);
    private static final int MIN = 1;
    private static final int MAX = 49;

    public static void main(String[] args) {

        //Enter your 6 numbers
        int[] yourNumbers = new int[6];

        System.out.println("Enter your numbers: ");
        for (int i = 0; i < yourNumbers.length; i++) {
            int number = scanner.nextInt();
            boolean checkedNumber = false;

            for (int j : yourNumbers) {
                if (j == number) {
                    checkedNumber = true;
                    break;
                }
            }

            if (!checkedNumber) {
                yourNumbers[i] = number;
            } else {
                System.out.println("Number already exists, enter again:  ");
                i--;
            }
        }

        //Show your numbers
        System.out.println("Your numbers: ");
        for (int i : yourNumbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        //System generate 6 numbers from 1 to 49
        System.out.println("Win numbers: ");
        int[] winNumbers = new int[6];

        for (int i = 0; i < winNumbers.length; i++) {
            winNumbers[i] = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        }

        //Show generated numbers
        for (int i : winNumbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Show result
        int hit = 0;
        for (int i : winNumbers) {
            for (int j : yourNumbers) {
                if (i == j) {
                    hit++;
                }
            }
        }
        System.out.println("You score " + hit + " numbers");


    }
}
