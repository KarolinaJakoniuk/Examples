package com.company.ZadanieDomowe1Weekend.Petle;

import java.util.Scanner;

public class PetleZadanieNr6 {
    public static void main(String[] args) {
        System.out.println("Petle-zadanie 6");

        System.out.println("Podaj liczbą");
        Scanner odczyt = new Scanner(System.in);
        int liczba;
        liczba = odczyt.nextInt();
        int a = 1;

        while (a <= liczba) {
            System.out.println(a);
            a *= 2;
        }
    }
}
