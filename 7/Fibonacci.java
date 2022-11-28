package U7;

import java.util.Scanner;

/**
 * @author aulaiah
 */
public class Fibonacci {
    /**
     *
     * @param index
     * @return Fibonacci Zahlen using Rekursiv
     */
    public static long fibonacciRekursiv(int index) {
        if (index == 0) {
            return 0;
        }
        if (index <= 2) {
            return 1;
        }
        long fiboTerm = fibonacciRekursiv(index - 1) + fibonacciRekursiv(index - 2);
        return fiboTerm;
    }

    /**
     *
     * @param index
     * @return fibonacci Zahlen using Iterative
     */
    public static long fibonacciIterativ(int index) {
        long prev = 0;
        long pres = 1;
        long fiboTerm = 0;
        if (index < 2) return index;
        for (int i = 1; i < index; i++) {
            fiboTerm = pres + prev;
            prev = pres;
            pres = fiboTerm;
        }
        return fiboTerm;
    }

    /**
     *
     * @param index
     * @return Fibonacci Zahlen using the normal Rule
     */
    public static long fibonacciFormel(int index) {
        if (index == 0) {
            return 0;
        }
        if (index <= 2) {
            return 1;
        }
        int i = index;
        long fibo = (long) index;
        fibo = (long) ((1 / Math.sqrt(5)) * ((Math.pow(((1 + Math.sqrt(5)) / 2), i) - Math.pow(((1 - Math.sqrt(5)) / 2), i))));
        return fibo;
    }

    /**
     *
     * @param args
     * Main Methode
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Index aus naturlichen Zahlen ein");
        int ind = scanner.nextInt();

        System.out.println("" + "Fibonacci Zahlen mit der Rekursive Methode sind: ");
        while (ind <= 50) {
            long nextInd = Fibonacci.fibonacciRekursiv(ind);
            ind++;
            System.out.println(nextInd);
        }
        System.out.flush();


        System.out.println("" + "Fibonacci Zahlen mit der Iterative Methode sind: ");
        while (ind < 50) {
            long nextInd = Fibonacci.fibonacciIterativ(ind);
            ind++;
            System.out.println(nextInd);
        }
        System.out.flush();

        System.out.println("" + "Fibonacci Zahlen mit der Fibonacci Formel Methode sind: ");
        while (ind < 50) {
            long nextInd = Fibonacci.fibonacciFormel(ind);
            ind++;
            System.out.println(nextInd);
        }
        System.out.flush();

    }
}
// 1.5)
// Der Programm laeuft am schnellesten bei Ausfuehrung mit der Iterative Methode weil der Aufwand mathematisch gerechnet wird
// Der Programm laeuft am schnell bei Ausfuehrung mit der Iterative Methode
// Der Programm laeuft am langsamsten bei Ausfuehrung mit der Rekursive Methode

// 1.6)
// Vor-  und Nachteile der Drei Implementierungen:
// Rekursiv Methode:
// endlose Rekursion endet nicht und kann in der Programmierung fatal sein, wie eine unerwuenschte endlose Schleife oder nichtterminierendes Programm.
// Bei Rekursion werde die Inkarnationen im Rechner gespeichert, das kann je nach Aufgabenstellung erwuenscht oder fatal sein.
// Wenn eine Inkarnation solche Attributevariablen veraendert, dann sind diese Aenderung ueber ihr Ende hinaus wirksam.
// Da darunterliegende Inkarnation arbeitet deshalb mit den modifizierten Werten weiter.

// Fibonacci Formel Methode:
// es ist hier bei diesen Fall Hardcoding

// Iterativ Methode:
// die Programmvariable liefern eine vollstaendige Beschreibung des Zustandes. Wenn die Berechnung in der Mitte gestoppt ist,
// um fortzufahren, wird den Computer nur mit allen Variable versorgt.