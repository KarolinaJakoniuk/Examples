package com.company.ZadanieDomowe1Weekend.Petle;

public class PetleZadanieNr11 {
    public static void main(String[] args) {
        int liczba = 30;


        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {
                System.out.println(i);
            }
        }
    }
}



