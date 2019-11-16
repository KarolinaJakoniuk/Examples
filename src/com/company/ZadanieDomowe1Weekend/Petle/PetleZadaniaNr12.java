package com.company.ZadanieDomowe1Weekend.Petle;

public class PetleZadaniaNr12 {
    public static void main(String[] args) {
        int N = 3;
        boolean pierwsza = true;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                pierwsza = false;
                if (pierwsza) ;
                System.out.println("Nie jest licza pierwszą");
            } else {
                System.out.println("Jest liczba pierwsza");
            }
        }
    }
}
