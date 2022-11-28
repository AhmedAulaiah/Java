package U10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //erstellt Liste um diese spaeter fuer den Kassenbon zu benutzen
        List<Eintrag> kassenBon = new ArrayList<>();

        //erstellt neuen Kassenzettel
        Kassenzettel zettelDrucken = new Kassenzettel(kassenBon);
        System.out.println("The Best Kiost");

        String name = "";
        while (true) { //        //solange kein x eingegeben wird, laeuft die Schleife
            Scanner produktName = new Scanner(System.in);
            System.out.println("Bitte geben Sie den Namen des Produktes ein! ");
            name = produktName.nextLine();

            if (name.equals("x") || name.equals("X")) {
                System.out.println(zettelDrucken);
            }
            System.out.println("Bitte geben Sie die Menge an! ");
            String anzahl = "";
            anzahl = produktName.nextLine();
            if (anzahl.equals("x") || anzahl.equals("X")) {
                System.out.println(zettelDrucken);
            }
            System.out.println("Bitte geben Sie den Preis eines der Artikel an! ");
            String preis = "";
            preis = produktName.nextLine();
            if (preis.equals("x") || preis.equals("X")) {
                System.out.println(zettelDrucken);
            }
            //fuegt alle Eintraege dem Bon hinzu
            kassenBon.add(new Eintrag(name, Integer.parseInt(anzahl), Double.parseDouble(preis)));


            System.out.println(zettelDrucken);  //gibt den Kassenzettel mithilfe der in den Klassen implementierten toString Methoden aus



        }

    }
}
