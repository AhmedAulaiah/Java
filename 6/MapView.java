
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MapView extends JPanel {

	/**
	 * Automatisch generierte id
	 */
	private static final long serialVersionUID = -7281079663252257308L;
	private final boolean[][] cells;
	private final static int CELLSIZE = 8;
	private final Color BACKGROUND = Color.BLACK;
	private final Color CELLCOLOR = Color.WHITE;

	public MapView(boolean[][] cells) {
		this.cells = cells;
	}

	/**
	 * Malt das Array aus Zellen.
	 */
	public void paint(Graphics g) {
		g.setColor(BACKGROUND);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(CELLCOLOR);
		for (int y = 0; y <= 101; y++) {
			for (int x = 0; x <= 101; x++) {
				if (cells[x][y]) {
					g.fillRect(x * CELLSIZE, y * CELLSIZE, CELLSIZE, CELLSIZE);
				}
			}
		}
	}

	public static int getCELLSIZE() {
		return CELLSIZE;
	}

}
