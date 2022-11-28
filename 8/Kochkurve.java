package U8;

import java.util.Scanner;

public class Kochkurve {
    static Turtle turtle;

    /**
     * Nutzer soll mittels Eingabe die Iterationsstufe der Kochschen Schneeflocke festlegen
     *
     * @param args
     */
    public static void main(String[] args) {

        LineFrame frame = new LineFrame("Kochkurve");
        turtle = new Turtle(frame, 0.7, 0.15, Math.PI);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Bitte geben Sie die gewuenschte Iterationsstufe ein: ");
        int iStep = userInput.nextInt();

        turtle.penDown();

        /*
         * Abfrage der Iterationsstufe
         * bei 0 gibts einfaches Dreieck
         */
        if (iStep < 0) {
            System.out.println("Geben sie eine guetlige Iterationsstufe ein!");
        } else if (iStep == 0) {
            drawDreieck();
        } else {
            drawFlocke(iStep, 0.7);
        }

        userInput.close();
    }

    /**
     * Zeichenmethode fuer die Kochsche Schnellflocke
     *
     * @param piStep
     * @param pSideLength = 0.7
     */
    public static void drawFlocke(int piStep, double pSideLength) {

        turtle.penDown();
        turtle.turn(Math.PI * 3 / 2);

        for (int i = 0; i < 3; i++) {

            drawIteration(piStep, pSideLength);
            turtle.turn(Math.PI * 4 / 3);
        }
    }

    /**
     * Kalkuliert Seitenlaenge und zeichnet Kochsche Schneeflocke rekursiv
     *
     * @param iStep
     * @param length
     */
    public static void drawIteration(int iStep, double length) {

        if (iStep > 0) {

            drawIteration(iStep - 1, length / 3);

            turtle.turn(Math.PI / 3);

            drawIteration(iStep - 1, length / 3);

            turtle.turn(Math.PI * 4 / 3);

            drawIteration(iStep - 1, length / 3);

            turtle.turn(Math.PI / 3);

            drawIteration(iStep - 1, length / 3);

        } else {

            turtle.forward(length);
        }

    }

    /**
     * Zeichnet einfaches Dreieck
     */
    public static void drawDreieck() {

        turtle.penDown();
        turtle.turn(Math.PI * 3 / 2);

        for (int i = 0; i < 3; i++) {
            turtle.forward(0.7);
            turtle.turn(Math.PI * 4 / 3);
        }
    }
}

