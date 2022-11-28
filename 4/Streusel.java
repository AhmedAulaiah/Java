public class Streusel {

    public static void main(String[] args)  {
        int streuselAnzahl = 3000000; 	      // streuselAnzahl = Anzahl von Streusel im Quadrat
        int streuselImKreis = 0;			  // streuselImKreis = Anzahl von Streusel im Kreis
        double randX;
        double randY;

        System.out.println(" Näherung für Pi:");
        for (int i = 1; i <= streuselAnzahl; i++)   {
            randX = Math.random();
            randY = Math.random();
            if (Math.hypot(randX,randY) <= 1)
                streuselImKreis = streuselImKreis + 1;
        }
        double pi = 4 * ( double ) streuselImKreis / streuselAnzahl;
        System.out.printf(" %d Streusel, davon %d Streusel im Blech, wobei Pi etwa %s %n", streuselAnzahl , streuselImKreis , pi);
    }
}