

import java.util.Scanner;

public class Pruefziffer {

    /**
     * @author aulaiah
     * @return Pruefziffer
     * @param args
     */
    public static int quersumme(String serialNumber) {
        int dieQuerSumme = 0;
        for (int i = 0; i < serialNumber.length(); i++) {
            dieQuerSumme += Integer.parseInt(serialNumber.substring(i, i + 1));
        }
        return dieQuerSumme;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Seriennummer ein: ");
        String serialNumber = input.next();

//Ländercode filtern
        char countryCode = serialNumber.substring(0, 1).charAt(0);

//Ländercode in Zahl umwandeln! Funktioniert mit -64 nur bei Großbuchstaben!
        int alphabetConverted = (int) countryCode - 64;

//Neue Seriennummer bilden ohne Länderbuchstabe und Prüfziffer
        String newSerialNumber = Integer.toString(alphabetConverted) + serialNumber.substring(1, serialNumber.length() - 1);

//Quersumme bilden bisauf Prüfziffer
        int qSumme = quersumme(newSerialNumber);

//Berechnung des Rests
        int rest = qSumme % 9;
        int newRest = 8 - rest;

        System.out.println(newRest);

    }
}