package com.company.ZadaniaDomowe2WeekendObiektowe.Nr3;


public class RachunekBankowy {
    public long numerKonta;
    public double iloscSrodkowNaKoncie;
    public String imie;
    public String nazwisko;


    public RachunekBankowy(long numerKonta, double iloscSrodkowNaKoncie, String imie, String nazwisko) {
        this.numerKonta = numerKonta;
        this.iloscSrodkowNaKoncie = iloscSrodkowNaKoncie;
        this.imie = imie;
        this.nazwisko = nazwisko;
        System.out.println(" ");
    }
    public void  wykonajPrzelewPrzychodzący(double kwota){
        iloscSrodkowNaKoncie=iloscSrodkowNaKoncie+kwota;
        System.out.println("Stan konta po wplaceniu "+ kwota+ " = " +iloscSrodkowNaKoncie);
        System.out.println(" ");
    }
    public void wykonajPrzelewWychodzący(double kwota){
        iloscSrodkowNaKoncie=iloscSrodkowNaKoncie-kwota;
        System.out.println("Stan konta po przelaniu kwoty "+ kwota+ " = " +iloscSrodkowNaKoncie);
    }
}
