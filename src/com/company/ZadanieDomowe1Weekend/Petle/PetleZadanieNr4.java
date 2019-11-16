package com.company.ZadanieDomowe1Weekend.Petle;

import java.util.Scanner;

public class PetleZadanieNr4 {
    public static void main(String[] args) {
        int poczatekZakresu;
        int koniecZakresu;
        int dzielnik;
        System.out.println("Podaj pierwszą liczbe: ");
        Scanner scanner = new Scanner(System.in);
        poczatekZakresu = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        koniecZakresu = scanner.nextInt();
        System.out.println("Podaj liczbe przez ktora chcesz dzelic");
        dzielnik = scanner.nextInt();

        if (poczatekZakresu < koniecZakresu) {
            for (int i = poczatekZakresu; i < koniecZakresu; i++) {
                if (i % dzielnik == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Koniec programu -kryteria poczatkowe nie sa spełnione!");
        }
    }
}

