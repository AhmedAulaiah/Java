package U2;

import java.util.Scanner;

public class Zinssatz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Startkapital in Euros() : ");
        double startKapital = input.nextDouble(); // Startkapital in Euros
        System.out.println("Das Endkapital in Euros() : ");
        double kapital = input.nextInt();  // Das Endkapital
        System.out.println("Dauer der Anlage in Jahren : ");
        double n = input.nextInt(); // Dauer der Anlage in Jahren

        double p= 100*(Math.pow((kapital/startKapital), 1/n)-1);
        double endKapitalRound =(double) Math.round(p*100)/100;


        System.out.println("Zinssatz in % nach " + n + " Jahre(n) ist : " + endKapitalRound + "%");
    }
}