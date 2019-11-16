package com.company.ZadanieDomowe1Weekend.Petle;

public class ZadaniaPodstawyKolejka {
    public static void main(String[] args) {
        int weight = 50;
        int height = 170;
        int age = 81;
        if (weight < 150 && height > 150 && 10 < age && age < 80) {
            System.out.println("Możesz wejsć na kolejkę");
        } else if (weight > 150) {
            System.out.println("Nie możesz wejść na kolejkę bo jesteś za ciężki");
        } else if (height < 150) {
            System.out.println("Nie możesz wejść na kolejkę bo jesteś za niski");
        } else {
            System.out.println("Nie możesz wejsc na kolejkę bo nie spełniasz kryteriów wzrostu");
        }
    }
}











