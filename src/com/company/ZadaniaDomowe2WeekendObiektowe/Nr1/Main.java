package com.company.ZadaniaDomowe2WeekendObiektowe.Nr1;

public class Main {
    public static void main(String[] args) {

        SalaLekcyjna nr1 = new SalaLekcyjna("Coral", 256);
        SalaLekcyjna nr2 = new SalaLekcyjna("Emerald", 258);
        SalaLekcyjna nr3 = new SalaLekcyjna("Diamond", 250);

        nr1.wypiszDaneSali();
        nr2.wypiszDaneSali();
        nr3.wypiszDaneSali();
    }
}
