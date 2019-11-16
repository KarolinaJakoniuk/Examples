package com.company.ZadaniaDomowe2WeekendObiektowe.Nr3;

public class Bank {
    public String nazwaBanku;
    public long kontaBankowe[];

    public Bank(String nazwaBanku, long kontaBankowe[]) {
        this.nazwaBanku = nazwaBanku;
        this.kontaBankowe= kontaBankowe;
    }
    public void wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu){
        System.out.println("Z konta o numerze "+numerKontaZ+ " wykonaj przelew na konto "+numerKontaNa+ " w kwocie "+kwotaPrzelewu);
    }
}
