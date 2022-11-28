package U2;

import java.util.Scanner;

public class Zinseszins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Startkapital in Euros() : ");
        double startKapital = input.nextDouble();  // Startkapital in Euros einlesen
        System.out.println("Zinssatz in % : ");
        double zinssatz = input.nextDouble();   // Zinssatz in % einlesen
        System.out.println("Dauer der Anlage in Jahren : ");
        double dauer = input.nextDouble();  // Dauer der Anlage in Jahren einlesen
        double endKapital;
        endKapital =(startKapital *Math.pow((zinssatz/100)+1, dauer));
        double endKapitalRound =(double) Math.round(endKapital*100)/100;  // Berechnen von dem kapital nach n Jahren
        System.out.println("Das Kapital nach " + dauer + " Jahre(n)" + " ist " + endKapitalRound);
    }
}