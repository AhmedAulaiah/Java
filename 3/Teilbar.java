package U3;

import java.util.Scanner;

public class Teilbar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double ersteZahl;
        double zweiteZahl;
        double dritteZahl;

        Scanner input = new Scanner(System.in);

        System.out.println("Was ist die erste Zahl?");
        ersteZahl = input.nextInt();

        System.out.println("Was ist die zweite Zahl?");
        zweiteZahl = input.nextInt();

        System.out.println("Was ist die dritte Zahl?");
        dritteZahl = input.nextInt();

        if (ersteZahl % dritteZahl == 0 && ersteZahl % zweiteZahl == 0) {
            System.out.println(ersteZahl + " ist durch " + zweiteZahl + " und " + dritteZahl + " teilbar");
        } else if (ersteZahl % zweiteZahl == 0) {
            System.out.println(ersteZahl + " ist durch " + zweiteZahl + " teilbar");

        } else if (ersteZahl % dritteZahl == 0) {
            System.out.println(ersteZahl + " ist durch " + dritteZahl + " teilbar");
        }
        else if (ersteZahl % dritteZahl != 0 && ersteZahl % zweiteZahl != 0 ){
            System.out.println(ersteZahl + " ist weder durch " + zweiteZahl + " und noch " + dritteZahl + " teilbar");
        }


    }
}
