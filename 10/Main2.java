package U10;

import java.util.ArrayList;
import java.util.List;

public class Main2 {


    public static void main (String [] args){
            KioskInhalt kasse = new Kasse("new Kasse");
            KioskInhalt zeitung = new Zeitung();
            KioskInhalt ebook = new EBookReader();


            List<KioskInhalt> newlist = new ArrayList<>();
            newlist.add(ebook);
            newlist.add(kasse);
            newlist.add(zeitung);

            Kiosk theKiosk = new Kiosk("The best Kiosk", newlist);
            System.out.println(theKiosk);
    }





}
