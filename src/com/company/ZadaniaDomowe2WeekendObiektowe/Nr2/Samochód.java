package com.company.ZadaniaDomowe2WeekendObiektowe.Nr2;

public class Samochód {
    public String nazwa;
    public int predkosc;



    public Samochód(String nazwa, int predkosc) {
        this.nazwa = nazwa;
        this.predkosc = predkosc;

        System.out.println(" ");
    }

    public void wypiszInformacjeOSamochodzie() {
        System.out.println("Samochód marki " + nazwa + " jedzie z prędkością " + predkosc);
    }

    public void przyspieszO5kmh() {
        int predkosc1 =0;
        predkosc1 = predkosc + 5;
        System.out.println("Predkosc auta po przyspieszeniu to " + predkosc1);
    }

    public void zwolnijO5kmh() {
        int predkosc1 = 0;
        predkosc1 = predkosc - 5;
        System.out.println("Predkosc auta po zwolnieniu to " + predkosc1);
    }
}

