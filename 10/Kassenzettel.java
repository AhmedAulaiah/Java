package U10;

import java.util.List;

public class Kassenzettel {

    private List<Eintrag> kassenbon;

    private double summe;

    public Kassenzettel(List<Eintrag> kassenBon) {
        this.kassenbon = kassenBon;
        this.summe = 0;
    }

    public List<Eintrag> getKassenbon() {
        return kassenbon;
    }

    public void setKassenbon(List<Eintrag> kassenbon) {
        this.kassenbon = kassenbon;
    }

    public double getSumme() {
        for (Eintrag eintrag : kassenbon) {
            this.summe += eintrag.getPreis() * eintrag.getAnzahl();
        }
        return summe;
    }

    public void setSumme(double summe) {
        this.summe = summe;
    }

    //gibt die Liste von Eintraegen aus, gefolgt vom der Gesamtsumme des Kassenbons.
    @Override
    public String toString() {
        return kassenbon.toString() + "\n" + "Gesamtpreis: " + "\t" + getSumme() + " euro";
    }
}

