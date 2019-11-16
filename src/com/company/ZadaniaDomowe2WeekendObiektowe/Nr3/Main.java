package com.company.ZadaniaDomowe2WeekendObiektowe.Nr3;

public class Main {
    public static void main(String[] args) {

        RachunekBankowy klientNr1 = new RachunekBankowy(56595988795L, 1250, "Igor", "Jakoniuk");
        RachunekBankowy klientNr2 = new RachunekBankowy(56595985555L, 1500, "Amelia", "Jakoniuk");

        klientNr1.wykonajPrzelewPrzychodzący(1000);
        klientNr2.wykonajPrzelewWychodzący(500);

    }

}
