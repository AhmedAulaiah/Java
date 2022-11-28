package U3;

import java.util.Scanner;

public class Nachricht {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Nachricht schreiben: ");
        Scanner input = new Scanner(System.in);
        String nachricht = input.nextLine();

        int lengthNachricht;

        lengthNachricht = nachricht.length();

        int rest = lengthNachricht / 15;
        if (lengthNachricht <= 15) {
            System.out.println(" 1 Nachricht wurde versendet. ");
        } else if (lengthNachricht > 15){
            System.out.println( rest + " Nachrichten wurden versendet.");
        }


    }

}