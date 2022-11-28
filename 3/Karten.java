package U3;

import java.util.Random;

public class Karten {

    public static void main(String[] args) {

        int zufallsFarbe = (int) (Math.random() * 4 + 1);

        switch (zufallsFarbe) {
            case 1:
                System.out.print("Karo");
                break;
            case 2:
                System.out.print("Herz");
                break;
            case 3:
                System.out.print("Pik");
                break;
            case 4:
                System.out.print("Kreuz");
                break;
        }
        int zufallsWert = (int) (Math.random() * 8 + 1);

        switch (zufallsWert) {
            case 1:
                System.out.println(" 7");
                break;
            case 2:
                System.out.println(" 8");
                break;
            case 3:
                System.out.println(" 9");
                break;
            case 4:
                System.out.println(" 10");
                break;
            case 5:
                System.out.println(" B");
                break;
            case 6:
                System.out.println(" D");
                break;
            case 7:
                System.out.println(" K");
                break;
            case 8:
                System.out.println(" A");
                break;
        }


    }

}
