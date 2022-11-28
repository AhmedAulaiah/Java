package U3;
import java.util.Scanner;
public class NachrichtErweiterung {


    public static void main(String[] args) {
        // TODO Auto-generated method stub


        System.out.println("Anbieter 1: 12ct Grundgebuehr, 6ct/Nachricht");
        System.out.println("Anbieter 2: 0ct Grundgebuehr, 9ct/Nachricht");
        System.out.println("Anbieter 3: 55ct Grundgebuehr, 0ct/Nachricht");
        System.out.println("4: Komfortfunktion");



        String nachricht = "";
        int anbieterWahl = 1;
        double k = 0;
        double minimum;

        Scanner input = new Scanner(System.in);
        System.out.println("Wählen Sie einen Anbieter, geben Sie 1, 2, 3 oder 4 ein. ");
        anbieterWahl = input.nextInt();

        System.out.println("Nachricht schreiben: ");
        nachricht = input.next();
        nachricht = input.nextLine();

        // Teilnachrichten rechnen
        int nachrichtLength;
        int anzahlNachricht;

        nachrichtLength = nachricht.length();
        anzahlNachricht = nachrichtLength/15;

        // Anbieter 1
        int grundgebuehr1 = 12; int preisAnbieter1 = 6;

        // Anbieter 2
        int grundgebuehr2 = 0; int preisAnbieter2 = 9;

        // Anbieter 3
        int grundgebuehr3 = 55; int preisAnbieter3 = 0;

        if ( anbieterWahl == 1) {
            k = grundgebuehr1 + preisAnbieter1;
            if (nachrichtLength <= 15) {
                System.out.println(" 1 Nachricht wird versendet. \n" + "der Preis f�r die versendete Nachricht ist; "+ k + "ct");
            }
            else if (nachrichtLength > 15) {
                System.out.println("" + (anzahlNachricht) + " Nachrichten wurden versendet. \n" + "der Preis fuer die versendete Nachrichten ist; " + k *anzahlNachricht + " ct" );
            }
        } else if ( anbieterWahl == 2) {
            k = grundgebuehr2 + preisAnbieter2;
            if (nachrichtLength <= 15) {
                System.out.println(" 1 Nachricht wird versendet. \n" + "der Preis f�r die versendete Nachricht ist; "+ k + "ct");
            }
            else if (nachrichtLength > 15) {
                System.out.println("" + anzahlNachricht + " Nachrichten wurden versendet. \n" + "der Preis f�r die versendete Nachrichten ist; " + k *anzahlNachricht + " ct" );
            }
        } else if ( anbieterWahl == 3) {
            k = grundgebuehr3 + preisAnbieter3;
            if (nachrichtLength <= 15) {
                System.out.println(" 1 Nachricht wird versendet. \n" + "der Preis fuer die versendete Nachricht ist; "+ k + "ct");
            }
            else if (nachrichtLength > 15) {
                System.out.println("" + anzahlNachricht + " Nachrichten wurden versendet. \n" + "der Preis fuer die versendete Nachrichten ist; " + k *anzahlNachricht + " ct" );
            }
        }




        else if (anbieterWahl == 4) {
            if (grundgebuehr1 + preisAnbieter1 < Math.min(grundgebuehr2 + preisAnbieter2, grundgebuehr3 + preisAnbieter3)) {
                minimum = grundgebuehr1 + preisAnbieter1;
            } else if (grundgebuehr2 + preisAnbieter2 < Math.min(grundgebuehr1 + preisAnbieter1, grundgebuehr3 + preisAnbieter3)) {
                minimum = grundgebuehr2 + preisAnbieter2;

            }

            else {
                minimum = grundgebuehr3 + preisAnbieter3;
            }

            if (nachrichtLength <= 15) {
                System.out.println(" 1 Nachricht wird versendet. \n" + "der Preis f�r die versendete Nachricht ist; "+ minimum + "ct");
            }
            else if (nachrichtLength > 15) {
                System.out.println("" + anzahlNachricht + " Nachrichten wurden versendet. \n" + "der Preis f�r die versendete Nachrichten ist; " + minimum *anzahlNachricht + " ct" );
            }

        }





    }

}

