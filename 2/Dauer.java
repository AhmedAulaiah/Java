import java.util.Scanner;

public class Dauer {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Startkapital in Euros() : ");
        double startKapital = input.nextDouble(); // Startkapital in Euros
        System.out.println("Zinssatz in % : ");
        double zinssatz = input.nextDouble();   // Zinssatz in % einlesen
        System.out.println("Das Endkapital in Euros() : ");
        double endKapital = input.nextDouble();  // Das Endkapital
        double dauer = (Math.log(startKapital/endKapital)/Math.log((1+(zinssatz/100))));
        int ergebnis = (int)((dauer * -1)+1);//berechnen von Zinssatz
        System.out.println("dauer = "+ ergebnis);


    }
}
