package U6;

import java.util.*;

/**
 * @author: Carlo Bueckert, PSCB
 * @date: 23.11.2020
 *
 *        Eine Klasse, die das bekannte Spiel Minesweeper implementiert.
 */
class Minesweeper {

	// Ein zweidiemensionales Array von boolschen Werten. Der Wert True an einer
	// Koordinate gibt an, dass an dieser Position eine Miene ist.
	boolean[][] mines;

	// Speichert den Output des Spielfeldes (die Anzahl der benachtbarten Minen).
	int[][] adjacentMines;

	// Speichter für alle Zellen ob diese angezeigt werden (True) oder nicht.
	boolean[][] revealed;

	// Hoehe des Spielfeldes
	int playgroundHight;

	// Breite des Spielfeldes
	int playgroundWidth;

	// Wahrscheinlichkeit dass ein Feld eine Mine wird
	int minePercent;

	private static Scanner scanner;

	/**
	 * Die Hauptmethode, die beim Programstart ausgeführt wird und das Spiel
	 * startet.
	 * 
	 * @param args Eingaben an das Program, die an dieser Stelle nicht
	 *             berücksichtigt werden.
	 */
	public static void main(String[] args) {
		//Console.displayOff();
		scanner = new Scanner(System.in);

		// erstellen uns ein Spiel von Meinzweipah
		Minesweeper minesweeper = new Minesweeper();

		// waehlen die Schwierigkeit
		minesweeper.chooseDifficulty();

		// initialisieren das Feld mit Mines
		minesweeper.createPlayground();

		// zeigen unser leeres Feld
		minesweeper.showField();

		boolean hitMine = false;

		// solange, wie wir keine Mine treffen spielen wir
		while (!hitMine && !minesweeper.hasWon()) {
			hitMine = minesweeper.playTurn();
			// zeigen nach jedem Zug das Spielfeld
			minesweeper.showField();
		}
		if (hitMine) {
			System.out.println("Schade, du hast eine Mine getroffen!");
		} else {
			System.out.println("Gratuliere du hast gewonnen.");
		}
		scanner.close();
	}

	/**
	 * Der User soll hier die Moeglichkeit haben sich fuer eine von drei
	 * Schwierigkeitsstufen zu entscheiden, diese Auswahl beeinflusst jeweils, wie
	 * gros das Spielfeld ist (spielfeld_breite (x), spielfeld_hoehe (y)) und wie
	 * viele Mines auftreten (mine_percent).
	 *
	 * Die Schwierigkeiten lauten:
	 * 
	 * Anfaenger: Spielfeld von 9 mal 9 (64) Feldern wobei jedes Feld zu 12 Prozent
	 * eine Mine ist.
	 * 
	 * Fortgeschrittene: Spielfeld von 16 mal 16 (256) Feldern wobei jedes Feld zu
	 * 16 Prozent eine Mine ist.
	 * 
	 * Profis: Spielfeld von 30 mal 16 (480) Feldern wobei jedes Feld zu 21 Prozent
	 * eine Mine ist.
	 */
	public void chooseDifficulty() {
		Console.gotoXY(0,0);
		//Console.writeln("Waehlen Sie eine Schwierigkeit: (1) Anfaenger ; (2) Fortgeschritten ; (3) Profi ; ");
		System.out.print("Waehlen Sie eine Schwierigkeit: (1) Anfaenger ; (2) Fortgeschritten ; (3) Profi ; ");
		int userInput = scanner.nextInt();
		switch (userInput) {
		case 1:
			playgroundHight = 9;
			playgroundWidth = 9;
			minePercent = 12;
			break;
		case 2:
			playgroundHight = 9;
			playgroundWidth = 9;
			minePercent = 16;
			break;
		case 3:
			playgroundHight = 30;
			playgroundWidth = 16;
			minePercent = 21;
			break;
		default:
			System.out.println("die Eingabe ist ungültig");
			break;
		}
	}

	/**
	 * Initialisiert die Arrays und setzt die zufällig erzeugten Minen. Berechnet
	 * allerdings nicht die Anzahl der Nachbarmienen, dass wird in einer separaten
	 * Methode immer erst dann gemacht, wenn es benötigt wird.
	 */
	public void createPlayground() {
		// TODO Fügen Sie bitte hier Ihren Code ein.
		mines = new boolean[playgroundHight][playgroundWidth];
		adjacentMines = new int[playgroundHight][playgroundWidth];
		revealed = new boolean[playgroundHight][playgroundWidth];



		for (int i = 0; i < playgroundHight; i++) { // This section then assigns each space of number based on the surrounding mines.
			for (int j = 0; j < playgroundWidth; j++) {
				if(Math.random() * 100 < minePercent) {
					mines[i][j] = true;
				} else {
					mines[i][j] = false;
				}

			}
		}
	}

	/**
	 * Spielt einen Zug von Meinzwiepah, dafür wird eine x- und eine y-Koordinate
	 * vom Nutzer eingelesen und zunächst kontrolliert, ob diese gültig ist (also
	 * innerhalb des Spielfeldes liegt). Ist die Eingabe ungültig (zu kleine oder zu
	 * große Werte), so wird der User erneut nach einer Eingabe gefragt und das
	 * Spiel wird normal fortgesetzt.
	 *
	 * Bei gültiger Eingabe wird überprüft und zurückgegeben, ob an dieser Stelle
	 * eine Miene ist oder nicht. Dafür wird die revealField Methode verwendet.
	 *
	 * @return hitMine: Liefert, ob beim gewaehlten Feld eine Mine getroffen wurde
	 *         oder nicht.
	 */
	public boolean playTurn() {
		// TODO Fügen Sie bitte hier Ihren Code ein. Beachten Sie, dass Sie
		// gegebenenfalls die Rückgabe ebenfalls anpassen müssen.

		int inputXkoordinate = 0;
		int inputYkoordinate = 0;

		System.out.println("Geben Sie die X-Koordinate");
		inputXkoordinate = scanner.nextInt() - 1;

		while (inputXkoordinate > playgroundWidth - 1  || inputXkoordinate < 0) {
			System.out.println("gegebene inputs sind falsch, bitte versuchen Sie nochmal");
			System.out.println("Geben Sie die X-Koordinate");
			inputXkoordinate = scanner.nextInt() - 1;
			//scanner.close();
		}

		System.out.println("Geben Sie die Y-Koordinate");
		inputYkoordinate = scanner.nextInt() - 1;

		while (inputYkoordinate > playgroundHight - 1  || inputYkoordinate < 0) {
			System.out.println("gegebene inputs sind falsch, bitte versuchen Sie nochmal");
			System.out.println("Geben Sie die Y-Koordinate");
			inputYkoordinate = scanner.nextInt() - 1;
			//scanner.close();
		}

		revealField(inputXkoordinate, inputYkoordinate);


		return mines[inputXkoordinate][inputYkoordinate];
	}

	/**
	 * Deckt das Feld an Position hight width auf.
	 *
	 * Ist an dieser Stelle eine Mine so soll keine Berechnung der Nachbarn
	 * stattfinden und der Wert True zurückgegeben werden.
	 *
	 * Ist an dieser Stelle keine Miene, so muss die Zelle muss als sichtbar
	 * (revealed) gekennzeichnet werden und es muss die entsprechende Zahl an
	 * Nachbar-Mines berechnet und angezeigt werden. Zur Berechnung der Anzahl der
	 * Nachbarmienen wird die calculateNumberOfAdjacentMines Methode verwendet.
	 *
	 * @param hight: Hoehe des ausgewaehlten Feldes.
	 * @param width: Breite des ausgewaehlten Feldes.
	 * @return liefert, ob beim gewaehlten Feld eine Mine getroffen wurde
	 */
	public boolean revealField(int hight, int width) {
		// TODO Fügen Sie bitte hier Ihren Code ein. Beachten Sie, dass Sie
		// gegebenenfalls die Rückgabe ebenfalls anpassen müssen.
		if(mines[hight][width]){
			revealed[hight][width] = true;
			return true;
		}
		revealed[hight][width] = true;
		adjacentMines[hight][width] = calculateNumberOfAdjacentMines(hight,  width);
		return false;
	}

	/**
	 * Berechnet die Anzahl der benachbarten Mienen um die Koordinaten hight witdh.
	 *
	 * @param hight:  hoehe des ausgewaehlten Feldes
	 * @param width: breite des ausgewaehlten Feldes
	 * 
	 * @return Die Anzahl der benachbarten Mienen.
	 */
	public int calculateNumberOfAdjacentMines(int hight, int width) {
		// TODO Fügen Sie bitte hier Ihren Code ein. Beachten Sie, dass Sie
		// gegebenenfalls die Rückgabe ebenfalls anpassen müssen.
		int result = 0;

		// punkt oben links
		if(hight - 1 >= 0 && hight - 1 < playgroundHight &&
				width - 1 >= 0 && width - 1 < playgroundWidth)	{
			if(mines[hight - 1][width - 1]){
				result++;
			}
		}

		// punkt oben
		if(hight - 1 >= 0 && hight - 1 < playgroundHight &&
				width  >= 0 && width  < playgroundWidth)	{
			if(mines[hight - 1][width]){
				result++;
			}
		}

		// punkt oben rechts
		if(hight - 1 >= 0 && hight - 1 < playgroundHight &&
				width + 1 >= 0 && width + 1 < playgroundWidth)	{
			if(mines[hight - 1][width + 1]){
				result++;
			}
		}

		// punkt links
		if(hight  >= 0 && hight  < playgroundHight &&
				width - 1 >= 0 && width - 1 < playgroundWidth)	{
			if(mines[hight ][width - 1]){
				result++;
			}
		}

		// punkt rechts
		if(hight  >= 0 && hight  < playgroundHight &&
				width + 1 >= 0 && width + 1 < playgroundWidth)	{
			if(mines[hight ][width + 1]){
				result++;
			}
		}

		// punkt unten links
		if(hight + 1 >= 0 && hight + 1 < playgroundHight &&
				width - 1 >= 0 && width - 1 < playgroundWidth)	{
			if(mines[hight + 1][width - 1]){
				result++;
			}
		}

		// punkt unten
		if(hight + 1 >= 0 && hight + 1 < playgroundHight &&
				width  >= 0 && width  < playgroundWidth)	{
			if(mines[hight + 1][width ]){
				result++;
			}
		}

		// punkt unten rechts
		if(hight + 1 >= 0 && hight + 1 < playgroundHight &&
				width + 1 >= 0 && width + 1 < playgroundWidth)	{
			if(mines[hight + 1][width + 1]){
				result++;
			}
		}

		return result;
	}

	/**
	 * Gibt in der System-Konsole eine Repräsentation des Spielfeldes aus. Alle nicht
	 * sichtbaren Felder sollen dabei durch "_" dargestellt werden.
	 *
	 * Eine getroffene Mine wird mit "X" dargestellt. Ansonsten wird die Anzahl der
	 * benachtbarten Mines angezeigt.
	 */
	public void showField() {
		// TODO Fügen Sie bitte hier Ihren Code ein.
		for (int i = 0 ; i <playgroundHight; i++){
			for (int j=0 ; j<playgroundWidth; j++){
				if (!revealed[i][j]){
					System.out.print("_");
				}
				else
				{
					if(mines[i][j]){
						System.out.print("X");
					} else {
						System.out.print(adjacentMines[i][j]);
					}
				}

			}
			System.out.println("");
		}
	}

	/**
	 * Überprüft ob alle Felder aufgedeckt wurden.
	 * 
	 * @return True falls alle Felder aufgedeckt wurden, ansonsten False.
	 */
	public boolean hasWon() {
		// TODO Fügen Sie bitte hier Ihren Code ein. Beachten Sie, dass Sie
		// gegebenenfalls die Rückgabe ebenfalls anpassen müssen.
		boolean result = true;
		for (int i = 0; i < playgroundHight; i++) { // This section then assigns each space of number based on the surrounding mines.
			for (int j = 0; j < playgroundWidth; j++) {
				if(!mines[i][j]) {
					if(!revealed[i][j]){
						result = false;
					}
				}

			}
		}
		return result;
	}
	
}