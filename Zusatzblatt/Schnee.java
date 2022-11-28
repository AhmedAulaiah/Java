package Zusatzblatt;

import java.awt.Color;

public class Schnee {

	private static final int DEFAULT_COLS = 80;
	private static final int DEFAULT_ROWS = 25;

	private static int cols = DEFAULT_COLS;
	private static int rows = DEFAULT_ROWS;

	private static int snowflake;

	private static char[][] field = new char[cols][rows];
	private static boolean schneeLimits = true; // hoechste Zeile, in der Aliens vorkommen

	public static void main(String[] args) {
		// prepare Programm
		start();
	}

	/**
	 * Setzt Voreinstellungen fuer das Spiel und die initiale Setzung der
	 * Objekte im Feld.
	 */
	private static void start() {
		for (int i = 0; i< cols; i++) {
			field[i][rows - 1] = '-';
		}

		while (schneeLimits) {
			Console.displayOff();
			fillSnow();		  // Schneien
			fillSnowflakes(); // Schneeflocken erstellen

			Console.displayOn();
		}
	}



	private static void fillSnow() {
		for (int y = rows -2; y >= 0; y--) {
			for (int x = 0; x < cols; x++) {
				Console.gotoXY(x, y);
				if (field[x][y] == '*' && field[x][y+1] == '\0') {
					Console.setBackground(Color.BLACK);

					Console.gotoXY(x, y + 1);
					Console.setForeground(Color.WHITE);
					Console.write("*");

					Console.gotoXY(x, y);
					Console.setForeground(Color.BLACK);
					Console.write(" ");

					field[x][y] = '\0';
					field[x][y+1] = '*';

				}

				if (field[x][y+1] == '-' && field[x][y] == '*') {
					Console.setBackground(Color.WHITE);
					Console.gotoXY(x, y);
					Console.write(" ");
					field[x][y] = '-';
				}
				if (field[x][0] == '-' ) {
					Console.gotoXY(30, 24);
					Console.setBackground(Color.BLACK);
					Console.setForeground(Color.WHITE);
					Console.writeln(" Obergrenze errreicht.");
					Console.gotoXY(34, 24);
					Console.write(" Program ended. ");
					schneeLimits = false;
				}

			}
		}

		Console.wait(20);
	}

	private static void fillSnowflakes() {
		snowflake = (int) (Math.random() * cols);
		Console.setForeground(Color.WHITE);

		field[snowflake][0] = '*';
		Console.gotoXY(snowflake, 0);
		Console.write("*");

	}
}
