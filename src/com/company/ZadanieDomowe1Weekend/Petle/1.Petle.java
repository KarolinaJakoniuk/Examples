package com.company.ZadanieDomowe1Weekend.Petle;


class Petle {
    public static void main(String[] args) {
        //a.
        System.out.println("Wypisywanie od 1 -100");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println(" ");
        //b.
        System.out.println("liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją");
        for (int i = 1000; i <= 1020; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");
        //c.
        System.out.println("liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach");
        int i = -30;
        while (i <= 1000) {
            if (++i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(" ");
        //d.
        System.out.println("liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach");
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
        System.out.println(" ");
        //e.
        System.out.println("lliczby podzielne przez 3 oraz 5 z zakresu 30 - 300 w nowych liniach");
        for (int j = 30; j <= 300; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.println(j);
            }
        }
        System.out.println(" ");

        //f.
        System.out.println("liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikam");
        for (int j = -300; j <= 300; j++) {
            if (j % 2 != 0) {
                System.out.print(j + ";");
            }
        }
        System.out.println(" ");

        //g.
        System.out.println("liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami");
        for (int j = -100; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.print(j + ";");
            }
        }
        System.out.println(" ");

        //h.
        System.out.println("litery od 'a' do 'z'");
        for (char a = 'a'; a <= 'z'; a++) {
            System.out.print(a);
        }
        System.out.println(" ");

        //i.
        System.out.println("litery od 'A' do 'Z'");
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a);
        }
        System.out.println(" ");

        //j.
        System.out.println("litery od 'A' do 'Z'- co druga");
        //k.
        for (int k = 1; k <= 100; k++) {
            System.out.println(k + "." + "Hello World");
        }
        int j = 0;
        while (j <= 99) {
            System.out.println(++j + "." + "Hello World");
        }
    }
}


