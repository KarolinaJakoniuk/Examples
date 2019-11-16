package com.company.ZadanieDomowe1Weekend.Petle;


import java.util.Random;

public class ZadanieDomoweTxt {
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int liczba = r.nextInt(1000);
            tab[i] = liczba;

        }
        for( int i=0; i<100; i++){
            if(tab[i]%2==0);
            System.out.println(tab[i]);
        } System.out.println("KONIEC");
    }
}

