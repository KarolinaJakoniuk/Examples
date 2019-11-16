package com.company.ZadanieDomowe1Weekend.Tablice;

import java.util.Arrays;
import java.util.Random;

public class ZadanieTablice1 {
    public static void main(String[] args) {
        // a.
        int[] tab= new int[10];
        Random r= new Random();
        for (int i=0; i<10;i++){
        int liczba = r.nextInt(21);
        tab[i] = liczba;
        System.out.println(tab[i]);
        }
        //b.
        int max = tab[0];
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            } else if (tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.println("Największy elemęt tablicy: " + max);
        System.out.println("Największy elemęt tablicy: " + min);

        //d.
        double średnia, suma = 0;
        int długość = tab.length;
        for (int i = 0; i < tab.length; i++) {
            suma = suma + tab[i];
        }
        średnia = suma / długość;
        System.out.println("średnia elemetów tablicy wynosi:" + średnia);

        //e.
        int wieksze = tab[0];
        int mniejsze = tab[0];
        System.out.println("Liczby wieksze niz srenia: ");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > średnia) {
                System.out.println(tab[i]);
            }
        }
        System.out.println("Liczby mniejsze niz srenia: ");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < średnia) {
                System.out.println(tab[i]);
            }

        }
        //f.
        System.out.println("Liczby w odwrotnej kolejnosci");
        int odwrotnie[] = new int[tab.length];
        for (int i = tab.length-1; i > 0;){
            for (int j = 0; j < tab.length;j++){
                odwrotnie[j] = tab[i];
                i--;
            }
            System.out.println(Arrays.toString(odwrotnie));
        }
        System.out.println("Mediana");


    }

}




