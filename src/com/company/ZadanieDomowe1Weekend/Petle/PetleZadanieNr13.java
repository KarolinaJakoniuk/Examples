package com.company.ZadanieDomowe1Weekend.Petle;

import java.util.Scanner;

public class PetleZadanieNr13 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe:");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int N =liczba+1;

        int[][] tabliczbaMnozenia= new int [N][N];
        for(int i=0; i<tabliczbaMnozenia.length; i++){
            for (int j=0; j<tabliczbaMnozenia[i].length;j++){
                tabliczbaMnozenia[i][j]= i*j;
            }
        }
        for(int i=0; i<tabliczbaMnozenia.length; i++){
            for (int j=0; j<tabliczbaMnozenia[i].length;j++){
                System.out.print(tabliczbaMnozenia[i][j]+" ");
            }
            System.out.println();
        }

    }
}
