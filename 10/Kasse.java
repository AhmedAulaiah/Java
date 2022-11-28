/**
 * 
 */
package U10;

/**
 * @author aulaiah
 *
 */
public class Kasse extends KioskInhalt implements Elektronisch{
	//Soll eine Kasse darstellen. Erhalten einen Namen und einen Stromverbrauch
	/**
	 * Stromverbrauch (in Kilowattstunden) einer Kasse
	 */
	private double stromverbrauch = 0.5;
	
	public Kasse(String name) {
		super(name);
	}

	/**
	 * Getter-Methode fuer den Stromverbrauch mit dem erwaehnten Preis.
	 * @return the stromverbrauch
	 */
	public double getStromVerbrauch() {
		return stromverbrauch;
	}

	
}
