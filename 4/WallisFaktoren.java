package U4;

import java.util.Scanner;

public class WallisFaktoren {

    public static void main(String[] args) {

        double faktor = 2.0;

        double i = 1;

        double zaehler = 2, nenner = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie die Genauigkeit die berechnet werden soll: Waehle 1 fuer 0.3, 2 fuer 0.03, 3 fuer 0.003, 4 fuer 0.0003, oder 5 fuer 0.00003");
        int dieGenauigkeit = input.nextInt();

        if (dieGenauigkeit == 1) {
            double e1 = 0.3;
            while ((2 * faktor) < Math.PI - e1 || (2 * faktor) > Math.PI + e1) {
                if (zaehler < nenner) {
                    zaehler = zaehler + 2.0;
                } else {
                    nenner = nenner + 2.0;
                }
                double tempo = zaehler / nenner;
                faktor = faktor * tempo;
                i++;
            }
            System.out.println("es braucht " + i + " Schritten um die Genauigkeit von " + e1 + " zu erreichen");
        } else if (dieGenauigkeit == 2) {
            double e2 = 0.03;
            while ((2 * faktor) < Math.PI - e2 || (2 * faktor) > Math.PI + e2) {
                if (zaehler < nenner) {
                    zaehler = zaehler + 2.0;
                } else {
                    nenner = nenner + 2.0;
                }
                double tempo = zaehler / nenner;
                faktor = faktor * tempo;
                i++;
            }
            System.out.println("es braucht " + i + " Schritten um die Genauigkeit von " + e2 + " zu erreichen");
        } else if (dieGenauigkeit == 3) {
            double e3 = 0.003;
            while ((2 * faktor) < Math.PI - e3 || (2 * faktor) > Math.PI + e3) {
                if (zaehler < nenner) {
                    zaehler = zaehler + 2.0;
                } else {
                    nenner = nenner + 2.0;
                }
                double tempo = zaehler / nenner;
                faktor = faktor * tempo;
                i++;
            }
            System.out.println("es braucht " + i + " Schritten um die Genauigkeit von " + e3 + " zu erreichen");
        } else if (dieGenauigkeit == 4) {
            double e4 = 0.0003;
            while ((2 * faktor) < Math.PI - e4 || (2 * faktor) > Math.PI + e4) {
                if (zaehler < nenner) {
                    zaehler = zaehler + 2.0;
                } else {
                    nenner = nenner + 2.0;
                }
                double tempo = zaehler / nenner;
                faktor = faktor * tempo;
                i++;
            }
            System.out.println("es braucht " + i + " Schritten um die Genauigkeit von " + e4 + " zu erreichen");
        } else if (dieGenauigkeit == 5) {
            double e5 = 0.00003;
            while ((2 * faktor) < Math.PI - e5 || (2 * faktor) > Math.PI + e5) {
                if (zaehler < nenner) {
                    zaehler = zaehler + 2.0;
                } else {
                    nenner = nenner + 2.0;
                }
                double tempo = zaehler / nenner;
                faktor = faktor * tempo;
                i++;
            }
            System.out.println("es braucht " + i + " Schritten um die Genauigkeit von " + e5 + " zu erreichen");
        }

    }
}
