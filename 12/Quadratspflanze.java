package NewU8;

import U12.LineFrame;
import U12.Turtle;

import java.util.Scanner;

/**
 * @author Ahmed Aulaia
 * @version 2.0
 * @date 06.02.2022
 */
public class Quadratspflanze {
    /*
    Welche Beobachtung kann man für die Entwicklung des Umfangs und der Flaeche für grosse n machen?
    -> Flaescheninhalt geht gegen 2, Umfang geht gegen unendlich
     */
    //Programm, welches eine Schneeflocke auf verschiedenen Iterationsstufen zeichnet
    //
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iterationsstufe:");
        int userInput = scan.nextInt();

        // Wert m.
        Scanner scnner = new Scanner(System.in);
        System.out.println("Geben Sie m in ganze Zahl ein : ");
        double inputM = scnner.nextDouble();
        scan.close();
        LineFrame frame = new LineFrame("Turtle");
        Turtle schildkroete = new Turtle(frame);
        schildkroete.penDown();


        quadratPflanze(0.1, userInput, 1, schildkroete, frame);
        double flascheninhalten = flaecheninhalt(inputM,userInput);
        double umfang = umfangStart(inputM,userInput);
        System.out.println(flaecheninhaltStart(inputM, userInput));
        System.out.println(umfang);
    }
    /**
     * zeichnet Qudaratpflanze rekursiv
     * @param len
     * @param iterMax
     * @param iterval
     * @param shield
     * @param l
     */
    public static void quadratPflanze(double len, int iterMax, int iterval, Turtle shield, LineFrame l) {

        if(iterMax >= iterval) {
            for(int i = 0;i < 3; i++){
                shield.forward(len, l);
                shield.turn(-90);
                shield.forward((2*len)/3.0, l);
                shield.turn(-180);
                quadratPflanze(len/3.0, iterMax,iterval + 1, shield, l);
            }
            shield.forward(len, l);
            shield.turn(-90);
            if(iterval != 1) {
                shield.forward(2*len, l);
                shield.turn(-180);
            }
        } else {
            for(int j = 0; j < 4;j++) {
                shield.forward(len, l);
                shield.turn(-90);
            }
            shield.forward(2*len, l);
            shield.turn(-180);
        }
    }
    /**
     * anfang der flaecheninhaltmethode, die n + 1 aufruft weil es anders nicht geht
     * @param m
     * @param n
     * @return
     */
    public static double flaecheninhaltStart(double m, int n) {
        return flaecheninhaltL(m, n+1, m);
    }
    /**
     * macht nichts
     * @param m
     * @param n
     * @return
     */
    public static double flaecheninhalt(double m, int n) {

        if(n == 1) {
            return m;
        }else{
            double ergebnis = 0;
            for(int i = 1;i < n;i++) {
                ergebnis += rechne(m, i);
            }
            return ergebnis;
        }
    }
    /**
     * methode, die den Flaecheninhalt per Rekursion berechnet
     * @param m
     * @param n
     * @param ergebnis
     * @return
     */
    public static double flaecheninhaltL(double m, int n, double ergebnis) { //
        if (n == 1) {
            return ergebnis;
        } else {
            ergebnis += Math.pow(m / 3.0, n - 1);
            return flaecheninhaltL(m, --n, ergebnis);
        }
    }
    /**
     * mach nichts
     * @param m
     * @param n
     * @return
     */
    public static double rechne(double m, int n) {
        return Math.pow(m / 3.0, n-1);
    }
    /**
     * Start der Umfangsmethode, die die Anfagswerte initialisiert
     * @param m
     * @param n
     * @return
     */
    public static double umfangStart(double m, int n) {
        m *= 4;
        double ergebnis = m + m/2.0;
        return umfangRekursiv(m, n, ergebnis);
    }
    /**
     * berechnet den Umfangs mit der Formel m + (m/2) hoch n
     * @param m
     * @param n
     * @param ergebnis
     * @return
     */
    public static double umfangRekursiv(double m, int n, double ergebnis) {
        if (n == 1) {
            return ergebnis;
        } else {
            ergebnis += m / 2.0;
            return umfangRekursiv(m, --n, ergebnis);
        }
    }
}

