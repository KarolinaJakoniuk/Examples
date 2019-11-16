package com.company.ZadanieDomowe1Weekend.Petle;

import java.util.Scanner;

public class PetleZadanieNr5 {
    public static void main(String[] args) {


        int A;
        int B;
        int suma;
        System.out.println("Podaj pierwsza liczbe: ");
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        B = scanner.nextInt();
        suma = 0;

        if (A < B) {
            while (A <= B) {
                suma = suma + A;
                A++;
            }
            System.out.println(suma);
            System.out.println(" ");
            for (int i = A; i < B; i++) {
                suma = suma + A;
                A++;
            }
            System.out.println(suma);

        } else {
            System.out.println("Podane liczby nie spelniaja kryterium A<B");
        }
    }
}
