package U7;

import java.util.Scanner;

/**
 * @author aulaiah
 */

public class Palindrom {
    /**
     *
     * @param ind
     * @return true if Word is Palindrom
     */
    public static boolean istPalindrom(String ind) {
        if (ind.length() == 0 || ind.length() == 1)
            return true;

        if (ind.charAt(0) == ind.charAt(ind.length() - 1))
            return istPalindrom(ind.substring(1, ind.length() - 1));
        return false;
    }

    /**
     *
     * @param args
     * Main methode
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein String ein : ");
        String gegeben = scanner.nextLine();

        if (istPalindrom(gegeben)) {
            System.out.println(gegeben + " is Palindrom");
        } else {
            System.out.println(gegeben + " ist kein Palindrom");
        }
    }
}