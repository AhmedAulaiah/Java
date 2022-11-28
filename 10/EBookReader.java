package U10;

/**
 * @author aulaiah
 *
 */
public class EBookReader extends KioskInhalt implements Kaufbar, Elektronisch {
	//Ein Programm, welches ein EBookReader darstellen soll. Erhaelt einen Namen, einen Preis und einen Stromverbrauch
	//attribut der Klasse um die getter und setter des interface zu nutzen

	private double preis;

	/**
	 * Stromverbrauch (Kilowattstunden) einer E-book reader.
	 */
	private double stromverbrauch = 0.25;


	public EBookReader() {
		super("EBookReader");
	}
	/**
	 * Kosten (in Euros) einer EBookReader
	 */
	private double eBookKosten = 55.0;

	@Override
	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		  preis= this.preis;
	}

	/**
	 * @return the stromverbrauch
	 */

	public double getStromVerbrauch() {
		return stromverbrauch;
	}



}
