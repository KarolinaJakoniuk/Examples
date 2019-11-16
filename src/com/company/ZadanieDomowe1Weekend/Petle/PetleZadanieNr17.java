package com.company.ZadanieDomowe1Weekend.Petle;

import java.util.Scanner;

public class PetleZadanieNr17 {
    public static void main(String[] args) {
        //a.
        for (int i = -200; i > -1000; i--) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");
        int j = -200;
        while (j > -1000) {
            System.out.println(j);
            j--;
        }
        System.out.println(" ");
        //b.
        int i;
        int l = 0;
        for (i = 1000; i < 100000; i++) {
            System.out.print(i + " ");
            l++;
            if (l == 1000) {
                System.out.println(" ");
                l = 0;
            }
        }
        System.out.println(" ");
        int[][] tabliczkaMonizenia = new int[5][10];
        for (int k = 0; k < tabliczkaMonizenia.length; k++) {
            for (int m = 0; m < tabliczkaMonizenia[k].length; m++) {
                tabliczkaMonizenia[k][m] = k * m;
            }
        }
        for (int k = 0; k < tabliczkaMonizenia.length; k++) {
            for (int m = 0; m < tabliczkaMonizenia[k].length; m++) {
                System.out.print(tabliczkaMonizenia[k][m] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Podaj pierwsza liczbe:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int b = scanner.nextInt();

        int[][] tabliczbaAB = new int[a][b];
        for (int n = 0; n < tabliczbaAB.length; n++) {
            for (int p = 0; p < tabliczbaAB[n].length; p++) {
                tabliczbaAB[n][p] = n * p;
            }
        }
        for (int n = 0; n < tabliczbaAB.length; n++) {
            for (int p = 0; p < tabliczbaAB[n].length; p++) {
                System.out.print(tabliczbaAB[n][p] + " ");
            }
            System.out.println(" ");
        }
    }
}


