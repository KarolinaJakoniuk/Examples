package com.company.ZadanieDomowe1Weekend.Petle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;

public class PetleZadanieNr9 {
    public static void main(String[] args) throws IOException {

        System.out.println("Gra za dużo za mało");
        String line;
        boolean bool = true;
        Random ran = new Random(new Date().getTime());
        int liczba = ran.nextInt() % 100;
        liczba = liczba < 0 ? -liczba : liczba;
        while (bool) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Podaj liczbę:");

            line = br.readLine();
            int liczba2 = Integer.parseInt(line);
            if (liczba2 == liczba) {
                System.out.println("Gratulacje!");
                bool = false;
            } else if (liczba2 > liczba) {
                System.out.println("ZPodałeś za dużą wartość");
            } else {
                System.out.println("Podałeś za małą wartość");
            }

        }

    }
}
