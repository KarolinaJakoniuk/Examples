package com.company.ZadanieDomowe1Weekend.Petle;

import java.util.Scanner;

public class ZadaniaPodstawyWypisywanieScanner {

    public static void main(String[] args) {
        /*Scanner scan= new Scanner (System.in);*/

        /*System.out.println("Wpisz swoje imie:");
        String imie = scan.nextLine();
        System.out.println("Wpisz swoje nazwisko:");
        String nazwisko = scan.nextLine();
        System.out.println("Witaj "+imie+" "+ nazwisko);*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String imie = scan.nextLine();

        if ("Ania".equals(imie)) {
            System.out.println("Czesc Szefowa!");
        } else {
            System.out.println("Witaj " + imie);
        }

    }
}








