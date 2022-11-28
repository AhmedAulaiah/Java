package U10;

public class Eintrag {
    //Attribute
    private String name;
    private int anzahl;
    private double preis;

    //Constructor
    public Eintrag(String name, int anzahl, double preis) {
        this.name = name;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    /**
     * Methode, die jeden Eintrag der spaeteren Liste in einer Art "Spalte" darstellen soll.
     * Dazu wird immer am Anfang und am Ende eine Neue Line eingefuegt und dazwischen der Name des
     * Produktes, den Preis und unter dem Namen die Anzahl.
     */
    @Override
    public String toString() {
        return "\n" + this.name + "\t " + this.preis + " euro" + "\n" + "x" + this.anzahl + "\n";
    }
}


