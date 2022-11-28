import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Das Spiel Game of Life
 *
 * @author Sven Loeffler
 * @version 1.0
 * @date 16.11.2017
 */
public class GameOfLife {

    private static final int FREQUENCY = 15;
    private final static double SPEED = 0.25;

    /**
     * Die auszuführende Methode, wenn das Programm gestartet wird.
     *
     * @param args Die Programmargumente.
     */
    public static void main(String[] args) {

        JFrame frame = setFrame();
        boolean[][] cells = generateCells();

        // Schleife die das Spielfeld permanent neu zeichnet.
        while (true) {
            cells = conwaysRules(cells);
            frame.add(BorderLayout.CENTER, new MapView(cells));
            frame.setVisible(true);

            try {
                Thread.sleep((int) (SPEED * 1000));
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

    }

    /**
     * Erzeugt ein neues Frame (Fenster) und stellt es richtig ein.
     *
     * @return Das erzeugte Frame.
     */
    public static JFrame setFrame() {
        JFrame frame = new JFrame();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = new Dimension((int) (screenSize.width), (int) (screenSize.height));
        int frameWidth = MapView.getCELLSIZE() * 102 + 16;
        int frameHeight = MapView.getCELLSIZE() * 102 + 38;
        frame.setBounds((int) (0.5 * (frameSize.width - frameWidth)), (int) (0.5 * (frameSize.height - frameHeight)),
                frameWidth, frameHeight);

        frame.setTitle("Game of Life");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        return frame;
    }

    /**
     * Gibt ein zweidimensionales (x- und y-Koordinate) boolean-Array mit
     * zufäligem Inhalt aus, dabei entspricht true einer lebenden und false eine
     * tote Zelle.
     *
     * @return Zweidimensionales Array mit lebenden und toten Zellen.
     */
    public static boolean[][] generateCells() {
        boolean[][] cells = new boolean[102][102];

        for (int y = 1; y <= 100; y++) {
            for (int x = 1; x <= 100; x++) {
                int random = (int) (Math.random() * 10);
                if (random < (FREQUENCY / 10)) {
                    cells[x][y] = true;
                } else {
                    cells[x][y] = false;
                }
            }
        }

        for (int i = 0; i <= 101; i++) {
            cells[i][0] = false;
            cells[i][101] = false;
            cells[0][i] = false;
            cells[101][i] = false;
        }

        return cells;

    }

    /**
     * Liest ein zweidimensionales Array von Zellen ein, auf dem die von Conway
     * formulierten Regeln angewandt werden. Die aus den Regeln entstandenen
     * toten und lebenden Zellen werden in einem neuen Array gespeichert und
     * ausgegeben.
     *
     * @param cells Das Array der Zellen, das ausgelesen wird.
     * @return Neues zweidimensionales Array mit lebenden und toten Zellen.
     */

    public static boolean[][] conwaysRules(boolean[][] cells) {

        // ----------------------------------------------
        // BEGINN IHRES QUELLCODES

        /*
         * Conways Regeln:
         *
         * Jede Zelle hat 8 Nachbarn, um das Feld zu begrenzen, bleiben die
         * äußeren Zellen stets auf false. Für alle weiteren Zellen gilt:
         *
         * 1. Eine tote Zelle mit genau drei lebenden Nachbarn wird neu geboren
         *
         * 2. Eine lebende Zelle mit einem oder keinem lebenden Nachbarn stirbt
         *
         * 3. Eine lebende Zelle mit zwei oder drei lebenden Nachbarn bleibt am
         * Leben
         *
         * 4. Eine lebende Zelle mit mehr als drei lebenden Nachbarn stirbt.
         *
         * mehr zum Spiel auf:
         * https://de.wikipedia.org/wiki/Conways_Spiel_des_Lebens
         */


        boolean[][] rules = new boolean[102][102];

        for (int x = 1; x < 100 + 1; x++) {
            for (int y = 1; y < 100 +1; y++) {
                int lebendeNachbarn = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (cells[x + i][y + j] == true) {
                            lebendeNachbarn++;
                        }
                    }
                }
                // Implementing the Rules of Life
                // Cell reduction from neighbors
                if (cells[x][y] == true) {
                    lebendeNachbarn--;
                }
                // Eine lebende Zelle mit einem oder keinem lebenden Nachbarn stirbt.
                if ((cells[x][y] == true) && (lebendeNachbarn < 2)) {
                    rules[x][y] = false;
                }
                // Eine tote Zelle mit genau drei lebenden Nachbarn wird neu geboren
                else if ((cells[x][y] == false) && (lebendeNachbarn == 3)) {
                    rules[x][y] = true;
                }
                // Eine lebende Zelle mit mehr als drei lebenden Nachbarn stirbt.
                else if ((cells[x][y] == true) && (lebendeNachbarn > 3)) {
                    rules[x][y] = false;
                }
                // Eine lebende Zelle mit zwei oder drei lebenden Nachbarn bleibt am Leben
                else {
                    rules[x][y] = cells[x][y];
                }
            }
        }

        return rules; }
/*
        int count = 0;
        boolean[][] rules = new boolean[102][102];
        for (int x = 1; x < cells.length - 1; x++) {
            for (int y = 1; y < cells.length - 1; y++) {
                if (cells[x + 1][y]) {
                    count++;
                }
                if (cells[x][y + 1]) {
                    count++;
                }
                if (cells[x - 1][y]) {
                    count++;
                }
                if (cells[x][y - 1]) {
                    count++;
                }
                if (cells[x + 1][y - 1]) {
                    count++;
                }
                if (cells[x + 1][y + 1]) {
                    count++;
                }
                if (cells[x - 1][y - 1]) {
                    count++;
                }
                if (cells[x - 1][y + 1]) {
                    count++;
                }
                if (count == 3) {
                    cells[x][y] = true;
                }
                if (count >= 1) {
                    cells[x][y] = false;
                }
                if (count <= 3 && count >= 2) {
                    cells[x][y] = true;
                }
                if (count > 4) {
                    cells[x][y] = false;
                }

            }
        }

        return null;
    }

 */

}
