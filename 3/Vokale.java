import java.util.Scanner;

public class Vokale {

    public static void main(String[] args) {

        String eingabe;
        int vokale = 0;
        int konsonante = 0;
        int uebrigen = 0;

        System.out.println("Bitte geben Sie ein Wort um die Anzahl der Vokale, Konsonante und Übrigens zu ermitteln :");
        Scanner input = new Scanner(System.in);
        eingabe = input.nextLine();

        eingabe = eingabe.toLowerCase();

        for (int i = 0; i < eingabe.length(); i++) { //Vokale berechnen
            if (eingabe.charAt(i) == 'a' || eingabe.charAt(i) == 'e' || eingabe.charAt(i) == 'i'
                    || eingabe.charAt(i) == 'o' || eingabe.charAt(i) == 'u') {
                ++vokale;
            } else if ((eingabe.charAt(i) >= 'a' && eingabe.charAt(i) <= 'z')) { // Konsonante berechnen
                konsonante++;
            } else if (!(Character.isLetter(eingabe.charAt(i)))) // Uebrigens berechnen
                uebrigen++;

        }
        System.out.println("" + eingabe + " hat : " + vokale + " Vokale " + ", " + konsonante
                + " Konsonante " + " und " + uebrigen + " Übrigen Zeichen");
    }

}

