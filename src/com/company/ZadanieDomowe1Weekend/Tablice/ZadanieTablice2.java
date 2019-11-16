package com.company.ZadanieDomowe1Weekend.Tablice;

import java.util.Arrays;
import java.util.Random;

public class ZadanieTablice2 {
    public static void main(String[] args) {
        System.out.println("Wylosowane liczby: ");

        int[] tab = new int[20];
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int liczba = r.nextInt(11);
            tab[i]=liczba;
            System.out.print(tab[i]+" ");}

        // Sprawdzanie powtorzen

// Sprawdzanie powtórzeń
        Arrays.sort(tab);

        for (int i = 1; i <= 10; i++ ){
            int suma = 0;
            for (int j = 0; j < tab.length; j++){
                if (i == tab[j]) suma++;
            }
            System.out.println( i + "  -  " + suma);
        }
    }
        }



