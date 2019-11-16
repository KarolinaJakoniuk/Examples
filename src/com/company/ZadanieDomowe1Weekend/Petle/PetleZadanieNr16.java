package com.company.ZadanieDomowe1Weekend.Petle;

import java.util.Scanner;

public class PetleZadanieNr16 {
    public static void main(String[] args) {
        int suma = 0;
        int a= 0;
        System.out.println("Podaj zadnie");
        Scanner scanner = new Scanner(System.in);
        String zdaniePodane = scanner.nextLine();
        System.out.println("Cyfry użyte w zdaniu to: ");
        for( int i=0; i<zdaniePodane.length(); i++){
            if(Character.isDigit(zdaniePodane.charAt(i))){
                System.out.print(zdaniePodane.charAt(i)+" ");
                a = Character.getNumericValue(zdaniePodane.charAt(i));
                suma += a;
            }
        }
        System.out.println(" ");
        System.out.println("Suma: "+ suma);
    }
}
