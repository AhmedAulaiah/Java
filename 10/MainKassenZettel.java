package U10;

import java.util.Scanner;

public class MainKassenZettel {


    public static void main (String [] args){
        Kassenzettel kassenzettel = new Kassenzettel();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Was ist die Name von der Produkt?");
        String nameOfTheProduct = scanner.next();
        kassenzettel.setName(nameOfTheProduct);

        System.out.println("Anzahl von der gekaufte Produkt?");
        int numberOfTheProduct = scanner.nextInt();
        kassenzettel.setAnzahl(numberOfTheProduct);

        System.out.println("Preis von der gekaufte Produkt?");
        int preisOfTheProduct = scanner.nextInt();
        kassenzettel.setPreis(preisOfTheProduct);

        System.out.println(kassenzettel.toString());
    }

}
