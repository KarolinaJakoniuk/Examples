package com.company.ZadaniaDomowe2WeekendObiektowe.Nr1;

public class SalaLekcyjna {
    public String nazwa;
    public int numerSali;

    public SalaLekcyjna(String nazwa, int numerSali) {
        this.nazwa = nazwa;
        this.numerSali = numerSali;
        System.out.println(" ");
    }


    public void wypiszDaneSali() {
        System.out.println("Nazwa sali: " + nazwa + " o numerze: " + numerSali);
    }

}
