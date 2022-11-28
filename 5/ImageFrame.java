import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageFrame {

	private static final int FRAME_DEFAULT_WIDTH = 800;
	private static final int FRAME_DEFAULT_HEIGHT = 600;

	private static int bufferedimage_width;
	private static int bufferedimage_height;

	private static JPanel drawPanel;
	private static BufferedImage img;
	private static Graphics img_graphics;

	private static int size = 200;

	/**
	 * Erzeugt ein GUI-Fenster zur Darstellung und Manipulation einer Bitmap in
	 * einer vorgegebenen Standardgroesse. Die angelegte Bitmap besteht nur aus
	 * weissen Pixeln.
	 * 
	 * @param title
	 *            Titel des GUI-Fensters
	 */
	public ImageFrame(String title) {
		this(title, FRAME_DEFAULT_WIDTH, FRAME_DEFAULT_HEIGHT);
	}

	/**
	 * Erzeugt ein GUI-Fenster in waehlbarer Groesse zur Darstellung und
	 * Manipulation einer Bitmap. Die angelegte Bitmap besteht nur aus weissen
	 * Pixeln. Die Groesse der Bitmap ergibt sich automatisch aus der Groesse
	 * des GUI-Fensters
	 * 
	 * @param title
	 *            Titel des GUI-Fensters
	 * @param frame_width
	 *            Breite des GUI-Fensters
	 * @param frame_height
	 *            Hoehe des GUI-Fensters
	 */
	public ImageFrame(String title, int frame_width, int frame_height) {
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(frame_width, frame_height);

		drawPanel = new JPanel(false) {
			private static final long serialVersionUID = 1L;

			public void paint(Graphics g) {
				super.paint(g);
				if (img != null) {
					g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
				}
			}
		};
		frame.add(drawPanel);

		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);

		frame.setVisible(true);

		bufferedimage_width = drawPanel.getWidth();
		bufferedimage_height = drawPanel.getHeight();

		img = new BufferedImage(bufferedimage_width, bufferedimage_height, BufferedImage.TYPE_INT_RGB);
		img_graphics = img.getGraphics();

		img_graphics.setColor(Color.WHITE);
		img_graphics.fillRect(0, 0, bufferedimage_width, bufferedimage_height);

		frame.repaint();
	}

	/**
	 * Liefert die Breite der Bitmap zurueck.
	 * 
	 * @return Breite der Bitmap
	 */
	public int getWidth() {
		return bufferedimage_width;
	}

	/**
	 * Liefert die Hoehe der Bitmap zurueck.
	 * 
	 * @return Hoehe der Bitmap
	 */
	public int getHeight() {
		return bufferedimage_height;
	}

	/**
	 * bekommt ein 2 dimensionales Array mit Farbwerten und zeichnet dieses
	 * entsprechend auf das Panel
	 * 
	 * @param colors
	 *            das 2 dimensionale Array von Farbwerten
	 */
	public static void drawArray(Color[][] colors) {
		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < colors[0].length; j++) {
				img_graphics.setColor(colors[i][j]);

				int x = ImageFrame.bufferedimage_width * i / size;
				int y = ImageFrame.bufferedimage_height - ImageFrame.bufferedimage_width * j / size;

				int width = ImageFrame.bufferedimage_width * (i + 1) / size - x;
				int height = ImageFrame.bufferedimage_height - ImageFrame.bufferedimage_width * (j - 1) / size - y;

				img_graphics.fillRect(x, y, width, height);
			}

		}
		drawPanel.repaint();
	}
}
