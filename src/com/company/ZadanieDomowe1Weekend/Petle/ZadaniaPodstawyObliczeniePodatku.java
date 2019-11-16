package com.company.ZadanieDomowe1Weekend.Petle;

public class ZadaniaPodstawyObliczeniePodatku {
    public static void main(String[] args) {
        double grossIncome = 60000;

        if (grossIncome <= 85528) {
            double netIncome = (grossIncome * 0.18 - 556.02);
            System.out.println("Podatek do zapłaty: " + netIncome + "PLN");
        }
        if (grossIncome > 85528) {
            double surplus = grossIncome - 85528;
            double netIncome = (surplus * 0.32 + 14839.02);
            System.out.println("Podatek do zapłaty: " + netIncome + "PLN");
        }

    }
}
