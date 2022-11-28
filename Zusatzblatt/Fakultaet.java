package Zusatzblatt;

import java.util.Scanner;

public class Fakultaet {

	public static void main(String[] args) {
		// Benutzer Eingabe anfordern.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Geben Sie das  Zahl ein:");
		int number = input.nextInt();
		
		input.close();
		
		System.out.println(" Method mittels ursprunglicher Schleife");
		System.out.println(" Das Fukalitaet von " + number +" ist: " + fukalitaet(number));
		
		System.out.println(" Method mittels alternativer Schleife");
		System.out.println(" Das Fukalitaet von " + number +" ist: " + fukalitaet2(number));
	}
	
	/**
	 * Berechnet das Produkt zwei Zahlen mittels Additionsoperationen und einer Schleife.
	 * @param num1
	 * @param num2
	 * @return zahl Das produkt zweier zahlen
	 */
	private static long multipliziere( long num1, long num2) {
		long zahl = 0;
		// for schleife
		for(int i=0; i<num2; i++){
            zahl = zahl + num1;
    }
		return zahl;

	}
	
	/**
	 * Berechnet das Produkt zwei Zahlen mittels Additionsoperationen und einer Schleife.
	 * @param num1
	 * @param num2
	 * @return zahl Das produkt zweier zahlen
	 */
	private static long multipliziere2( long num1, long num2) {
		long zahl = 0;
		long temp = 0;
		while (temp < num2) {
			zahl = zahl + num1;
			temp++;
		}
		return zahl;

	}
	
	/**
	 *  for schleife
	 * @param num
	 * @return
	 */
	private static long fukalitaet( int num) {
		long result = 1;
		for(int i = 1; i<=num; i++) {
			result = multipliziere(result, i);
		}
		return result;
	}
	
	/**
	 * do-while schleife
	 * 
	 * @param zahl
	 * @return
	 */
	private static long fukalitaet2( int zahl) {
		long result = 1;
		do {
			result = multipliziere2(result, zahl);
			zahl = zahl - 1;
		} while (zahl > 0);
		return result;
	}
}
