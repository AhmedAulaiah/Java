import java.util.Scanner;

public class Sieb {
    public static void main(String args[]) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein");
        int zahlen = eingabe.nextInt();
        boolean[] booleans = new boolean[zahlen];

        for (int i = 0; i < booleans.length; i++) {
            booleans[i] = true;
        }
        for (int i = 2; i < Math.sqrt(zahlen); i++) {
            if (booleans[i] == true) {
                for (int j = (i * i); j < zahlen; j = j + i) {
                    booleans[j] = false;
                }
            }
        }
        System.out.println("Die Primzahlen unter " + zahlen + " sind ");
        for (int i = 2; i < booleans.length; i++) {
            if (booleans[i] == true) {
                System.out.println(i);
            }
        }
    }
}