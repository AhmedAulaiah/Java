package U8;

import java.util.Scanner;

/**
 * @author aulaiah
 */
public class Binomial {
    /**

     * @param args
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = 0;
        int k = 0;

        System.out.println("Geben Sie eine natürliche Zahl fuer n ein: ");
        n = userInput.nextInt();
        System.out.println("Geben Sie eine natürliche Zahl fuer k ein: ");
        k = userInput.nextInt();
        System.out.println("\n");


        // Laufzeiterfassung in Nanosekunden
        // long start = System.nanoTime();

        System.out.println("Binomial Koeffizient mittels Fakultaet: ");
        System.out.println(binomialFakultat(n, k));
        System.out.println("\n");
        // 78.702 Laufzeit

        System.out.println("Binomial Produkt Quotient: ");
        System.out.println(binomialProduktQuotient(n, k));
        System.out.println("\n");
        // 135.306 Laufzeit

        System.out.println("Binomial Alternierend: ");
        System.out.println(binomialAlternierend(n, k));
        System.out.println("\n");
        // 134.258 Laufzeit

        System.out.println("Binomial Rekursiv: ");
        long start = System.nanoTime();
        System.out.println(binomialRekursiv(n, k));
        System.out.println("\n");
        // 13.400 Laufzeit

        /**
         * Laufzeiterfassung Auswertung
         *
         * long finish = System.nanoTime();
         * long timeElapsed = finish - start;
         * System.out.println(timeElapsed);
         * System.out.println("\n");
         * System.out.flush();
         */

        userInput.close();

    }

    /**
     * Methode zur Berechnung des Binomial Koeffizienten ueber die Fakultaet
     *
     * @param n
     * @param k
     * @return
     */

    public static long binomialFakultat(int n, int k) {

        int nFak = fak(n);
        int kFak = fak(k);
        int nSubK = n - k;
        int nKFak = fak(nSubK);

        // Berechnungsformel
        long result = nFak / (kFak * nKFak);

        return result;
    }

    /**
     * Fakultaetsmethode fuer die binomial Fakultaet.
     * Als Hilfsmethode nutzt diese die multpliziere Methode um die Multiplikation
     * durchzufuehren.
     *
     * @param c
     * @return multipliziere
     */

    private static int fak(int c) {
        // Abbruchbedingung
        if (c == 0) {

            return 1;
            // default Bedingung
        } else {
            return multipliziere(c, fak(c - 1));
        }
    }

    /**
     * Hilfsmethode fuer die fak Methode.
     *
     * @param multiplikant
     * @param multiplikator
     * @return multiplikant * multiplikator
     */
    public static int multipliziere(int multiplikant, int multiplikator) {

        return multiplikant * multiplikator;
    }

    /**
     * Methode zur Berechnung des Binomialkoeffizienten ueber den binomialen
     * Produktquotient.
     *
     * @param n
     * @param k
     * @return result
     */
    public static long binomialProduktQuotient(int n, int k) {

        long result;
        int cacheN = 1;
        int cacheK = 1;

        // Fak - Berechnung von n
        for (int i = 0; i < k; i++) {

            // Abfang Index 0
            if (i == 0) {

                cacheN = cacheN * n;
            } else {

                cacheN = cacheN * (n - i);
            }

        }
        // Fak - Berechnung von k
        for (int j = 1; j <= k; j++) {

            cacheK = cacheK * j;
        }

        // Berechnungsformel
        result = cacheN / cacheK;

        return result;
    }

    /**
     * Berechnungsmethode zum Binominalkoeffizienten alternierend
     * <p>
     * Gleitkommazahlen werden nicht benoetigt. Methode kann auch als Rueckgabetyp
     * int besitzen. Habe mir also Gedanken gemacht.
     *
     * @param n
     * @param k
     * @return result
     */
    public static long binomialAlternierend(int n, int k) {

        long result;
        long cacheN = 1;

        // Berechnungsformel
        for (int i = 0; i < k; i++) {

            cacheN = cacheN * (n - i) / (i + 1);
        }
        result = cacheN;

        return result;
    }

    /**
     * rekursive Methode zur Berechnung des Binomialkoeffizienten
     * <p>
     * Methoden funktionieren aber nicht nach Aufgabenparametern.
     *
     * @param n
     * @param k
     * @return binomialRekursiv
     */

    public static long binomialRekursiv(long n, long k) {

        if (k == 0) {

            return 1;
        }
        if (n == 0) {

            return 0;
        }

        return (n * binomialRekursiv(n - 1, k - 1) / k);
    }
}

