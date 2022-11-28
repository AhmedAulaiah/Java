
public class Debug {

    public static void main(String [] args) {

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) { // Hier steht ein Fehler wo die Schleife nicht zum Ende kommen würde, weil j bei 0 stehen bleibt und somit nie über 49 geht wenn es kein j++ steht
                if (Math.abs(i - 25) + Math.abs(j - 25) > 25) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("+");
                }
            }
            System.out.println ();
        }
    }
}