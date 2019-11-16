package com.company.ZadanieDomowe1Weekend.Petle;

import java.util.Scanner;

public class PetleZadanieNr10 {
    public static void main(String[] args) {
        System.out.println("Choinka");

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int heigh;
        heigh = odczyt.nextInt();


        for (int i = 0; i < heigh; i++) {
            for (int a = 0; a < heigh - i; a++) {
                System.out.print(" ");
            }
            for (int a = 0; a <= i * 2; a++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}

