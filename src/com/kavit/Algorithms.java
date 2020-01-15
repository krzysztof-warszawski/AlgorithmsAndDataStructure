package com.kavit;

public class Algorithms {

    public static void main(String[] args) {

        int result = nBasedNumber(5,2,3);
        System.out.println("5th number of 2 + 3 at each step: " + result);

        long factorial = factorial(5);
        System.out.println("5 factorial: " + factorial);

        int fib = fibonacciNumber(10);
        System.out.println("Fibonacci number: " + fib);

        int[] array = {6, 4, 3, 4, 2, 1, 4, 2, 8, 1, 0};
        challenge(array);

    }

    public static int nBasedNumber(int n, int base, int add) {
        if (n == 1) return base;
        return nBasedNumber(n-1, base + add, add);
    }

    public static long factorial(long n) {
        if (n == 0) return 1;
        else return n * factorial(n-1);
    }

    public static int fibonacciNumber(int n) {
        if (n == 1 || n == 2) return 1;
        else return fibonacciNumber(n-1) + fibonacciNumber(n - 2);
    }

    public static void challenge(int[] tab){
        int count = 0;
        for (int i = 1; i < tab.length-1; i++) {
            if ((tab[i-1] < tab[i]) && (tab[i+1] < tab[i])){
                count++;
            }
        }
        System.out.println("Ilosc naciec: " + count);
    }

}

/*    CHALLENGE

        Przez instytut medyczny zostales poproszony, o przygotowanie programu, ktory dla odczytanych probek (gestosci wystapienia skupisk choroby), znajdzie epicentra 'Stwardnienia bocznego',
        a nastepnie okresli idealne miejsca naciec chirurgicznych.
        Przez epicentruum rozumie sie probke, ktorego dwie sasiadujace z nia probki maja nizsze wskazanie gestosci wystapienia. Za epicentrum nie moze byc uznana pierwsza, ani ostatnia probka.
        W zaleznosci od stanu zdrowia pacjenta mozna dokonac okreslonej ilosci naciec chirurgicznych' oraz zaklada sie, ze kazde kolejne naciecie nie moze byc zrobione blizej niz poprzednie.
        Odpowiedzia do zadania jest ilosc naciec chirurgicznych, ktÛre moga zostac wykonane.

        Przyklad 1:
        Ilosc mozliwych naciec: 3
        Zestaw probek: 4 2 3 1 9 6 5 2 1

        Odpowiedz: 2

        Przyklad 2:
        Ilosc mozliwych naciec: 4
        Zestaw probek: 9 2 3 3 2 1 7 2 1 1 6 1 6 0 2 4 5 2

        Odpowiedz: 3

        Przyklad 3:
        Ilosc mozliwych naciec: 3
        Zestaw probek: 6 4 3 4 2 1 4 2 8 1 0

        Odpowiedz: 2

        Przyklad 4:
        Ilosc mozliwych naciec: 2
        Zestaw probek: 6 4 3 4 2 1 4 2 8 1 0

        Odpowiedz: 2
        */
