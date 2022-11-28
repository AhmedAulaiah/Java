/**
 * 
 */
package U10;

/**
 * @author aulaiah
 *
 */

//ein Programm der der Preis enthaelt, was eine Zeitung darstellen soll
public class Zeitung extends KioskInhalt implements Kaufbar{

	/**
	 * Kosten (in Cents ) einer Zeitung
	 */
	private double preis = 0.50;

	public Zeitung() {
		super("Zeitung");
	}

	@Override
	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	@Override
	public String toString() {
		return getName()+" ,  " + preis + ", Preis: " + getPreis() + "]";
	}

}
