package com.company.ZadanieDomowe1Weekend.Petle;

import java.util.Scanner;

public class PetleZadanieNr2 {
    public static void main(String[] args) {
        int wybor;
        System.out.println("Program pobiera liczbe powtorzen od uzytkownika i wypisuje 'Hello World!' adekwatna ilosc razy");
        System.out.println("Wybierz metode: \n1 - Petla for\n2 - Petla while");

        Scanner wyborScanner = new Scanner(System.in);
        wybor = wyborScanner.nextInt();
        switch (wybor){
            case 1:
                System.out.println("Wybrałeś pętle for");
                System.out.println("Podaj liczbę powtórzeń: ");
                Scanner iloscWypisan= new Scanner (System.in);
                int liczba;
                liczba = iloscWypisan.nextInt();
                System.out.println("teraz wypisze Hello World! " + liczba + " razy");
                for (int i=1;i<=liczba; i++){
                System.out.println(i+".Hello World");
                }
                break;
            case 2:
                System.out.println("Wybrałeś pętle while");
                System.out.println("Podaj liczbę powtórzeń: ");
                Scanner iloscWypisan1= new Scanner (System.in);
                int liczba1 = iloscWypisan1.nextInt();
                System.out.println("Teraz wypiszę Hello World " + liczba1 + " razy");
                int i=1;
                while(i<=liczba1){
                    System.out.println(i+".Hello World");
                    ++i;
                }
                break;

        }


    }
}
