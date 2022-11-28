package U10;

import java.util.List;

public class Kiosk {      //ein Programm was in einem Kiosk enthaelt. Es bekommt einen Namen und eine Inventar list




	/**
	 * name
	 */
	private String name;
	
	/**
	 * Konstruktor Ziel,see Aufgabe 1.2
	 * einen Arraylist erstllen.
	 */
	private List<KioskInhalt> kioskInhaltList;
	
	/**
	 * Konstruktor zum erstellen neue Kiosk objekte.
	 * @param name
	 */
	public Kiosk(String name, List<KioskInhalt> inhalts) {
		this.name = name;
		this.kioskInhaltList = inhalts;
	}

	public List<KioskInhalt> getKioskInhaltList() {
		return kioskInhaltList;
	}

	public void setKioskInhaltList(List<KioskInhalt> kioskInhaltList) {
		this.kioskInhaltList = kioskInhaltList;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter fuer filed name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Feugt Eintraege in der KisokInhalt List hinzu.
	 * @param item
	 */
	public void addItem(KioskInhalt item) {
		kioskInhaltList.add(item);
	}
	@Override
	public String toString() {
		StringBuilder item = new StringBuilder(name + ":\n");
		for (KioskInhalt Items : kioskInhaltList) {
			item.append("\n").append(Items.getName());

			if (Items instanceof Elektronisch) {
				item.append(", Stromverbrauch: ").append(((Elektronisch) Items).getStromVerbrauch());
			} else if (Items instanceof Kaufbar) {
				item.append(", Preis : ").append(((Kaufbar) Items).getPreis());
			} else {
				item.append(", Preis : ").append(((Kaufbar) Items).getPreis()).append(", Stromverbrauch: ").append(((Elektronisch) Items).getStromVerbrauch());
			}
		}
		item.append("\n");
		return item.toString();
	}

}
