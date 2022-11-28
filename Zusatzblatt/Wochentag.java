package Zusatzblatt;

import java.util.Scanner;

public class Wochentag {

	/**
	 * main methode
	 * @param arg
	 */	
	public static void main(String arg[]) 
	{ 
		//int day = wochentag(03, 01, 2020);
		System.out.println();
		System.out.println("Kleine Berechnung");
		Scanner input = new Scanner(System.in);


		System.out.println("Geben Sie den Tag bitte ein.");
		int day = input.nextInt();

		System.out.println("Geben Sie der Monat bitte ein.");
		int month = input.nextInt();

		System.out.println("Geben Sie das Jahr bitte ein");
		int year = input.nextInt();

		int weekOfTheDay = Wochentag.wochentag(day, month, year);
		Wochentag.stringDay(weekOfTheDay);
		input.close(); // Closes Scanner

	} 

	/**
	 * Convertiert das eingegeben Datum (Tag, Monat, Jahr) zu einzelne Wochentag
	 * @param tag
	 * @param monat
	 * @param year
	 * @return wochentag
	 */
	public static int wochentag(int tag, int monat, int year) {


		int array[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		year -= (monat < 3) ? 1 : 0;
		return ( year + year/4 - year/100 + year/400 + array[monat-1] + tag) % 7;
	}

	/**
	 * Ausdruckt ein Wochentag als String in Console.
	 * @param weekOfTheDay
	 */
	public static void stringDay(int weekOfTheDay) {
		switch(weekOfTheDay) {
		case 1: 
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
			break;
		case 3: 
			System.out.println("Mittwoch");
			break;
		case 4: 
			System.out.println("Donnerstag");
			break;
		case 5: 
			System.out.println("Freitag");
			break;
		case 6: 
			System.out.println("Samstag");
			break;
		case 7: 
			System.out.println("Sonntag");
		default:
			System.out.println("Invalid Date arising from parameter " + weekOfTheDay);
			break;
		}

	}
} 

