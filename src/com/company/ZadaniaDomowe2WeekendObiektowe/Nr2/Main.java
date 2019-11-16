package com.company.ZadaniaDomowe2WeekendObiektowe.Nr2;

public class Main {
    public static void main(String[] args) {

       Samochód nr1= new Samochód("Opel", 150);
       nr1.wypiszInformacjeOSamochodzie();
       nr1.przyspieszO5kmh();
       nr1.zwolnijO5kmh();
    }
}
