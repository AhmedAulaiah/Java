import java.awt.Color;



public class Feuer {

	public static final int R = 0;
	public static final int G = 1;
	public static final int B = 2;

	public static final int WIDTH = 200;
	public static final int HEIGHT = 150;

	public static void main(String[] args) {

		ImageFrame frame = new ImageFrame("Feuer");

		Color[][] colors = new Color[WIDTH][HEIGHT];

		// alle Pixel auf Schwarz setzen
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < HEIGHT; j++) {
				colors[i][j] = Color.BLACK;
			}
		}


		while (true) {

			// -------------------------------------------------------------------------------
			// BEGINN IHRES QUELLCODES




			// 1. BEISPIEL

			// Zufällige Koordinaten ermitteln
			int x1 = (int)(Math.random() * 100);
			int y1 = (int)(Math.random() * 100);

			// den Pixel an den Koordinate wei� einf�rben
			colors[x1][y1] = Color.WHITE;





			/*
			// 2. BEISPIEL

			// Zuf�llige Koordinaten ermitteln
			int x2 = (int)(Math.random() * 100);
			int y2 = (int)(Math.random() * 100);

			// per Zufall Farbanteile ermitteln
			int red   = (int)(Math.random() * 255);
			int green = (int)(Math.random() * 255);
			int blue  = (int)(Math.random() * 255);

			// neuen Farbwert erzeugen
			Color newColor = new Color(red, green, blue);

			// Farbwert an den Koordinaten (verschoben um (50,20)) setzen
			colors[50 + x2][20 + y2] = newColor;
			*/

			/*
			// 3. BEISPIEL
			// Zuf�llige Koordinaten über dem ganzen Raum ermitteln
			int x3 = (int) (Math.random() * WIDTH);
			int y3 = (int) (Math.random() * HEIGHT);

			// per Zufall Farbanteile ermitteln
			int red = (int) (Math.random() * 255);
			int green = (int) (Math.random() * 255);
			int blue = (int) (Math.random() * 255);

			// neuen Farbwert erzeugen
			Color newColor = new Color(red, green, blue);

			// Farbwert an den Koordinaten (verschoben um (50,20)) setzen
			colors[x3][y3] = newColor;
			 */

			/*
			// Zuf�llige Koordinaten über dem ganzen Raum ermitteln
			int x3 = (int)(Math.random() * WIDTH);
			int y3 = (int)(Math.random() * HEIGHT);

			// per Zufall Farbanteile ermitteln
			int red   = (int)(Math.random() * 255);
			int green = (int)(Math.random() * 255);
			int blue  = (int)(Math.random() * 255);

			// neuen Farbwert erzeugen
			Color newColor = new Color(red, green, blue);

			// Farbwert an den Koordinaten (verschoben um (50,20)) setzen
			colors[x3][y3] = newColor;
			*/


			// ENDE IHRES QUELLCODES
			// -------------------------------------------------------------------------------


			int y = 1, x = 0;
			for (int i = 0; i  < 8; i++) {
				x = (int) (Math.random() * WIDTH);
				colors[x][y] = Color.YELLOW;
			}

			for (int i = 0; i  < 16; i++) {
				x = (int) (Math.random() * WIDTH);
				colors[x][y] = Color.RED;
			}

			for (int i = 0; i  < 8; i++) {
				x = (int) (Math.random() * WIDTH);
				colors[x][y] = Color.BLACK;
			}

			for (y = 1; y <= 1; y++) {
				for (x = 1; x < WIDTH - 1; x++) {


					Color a= colors[x][y];
					Color l=colors[x - 1][y];
					Color r=colors[x + 1][y];

					int aRed  = a.getRed();
					int lRed  = l.getRed();
					int rRed  = r.getRed();


					int aGreen  = a.getGreen();
					int lGreen  = l.getGreen();
					int rGreen  = r.getGreen();


					int aBlue  = a.getBlue();
					int lBlue  = l.getBlue();
					int rBlue  = r.getBlue();


					int newRed = (aRed + lRed + rRed + aRed ) / 4;
					int newGreen = (aGreen + lGreen + rGreen + aGreen ) / 4;
					int newBlue= (aBlue  + lBlue  + rBlue  + aBlue  ) / 4;

					Color newColor = new Color(newRed, newGreen, newBlue);

					colors[x][2] = newColor ;


				}
			}

			for (y = 2; y <= HEIGHT - 1 ; y++) {
				for (x = 1; x < WIDTH - 1; x++) {


					Color a= colors[x][y];
					Color l=colors[x -1][y];
					Color r=colors[x + 1][y];
					Color d=colors [x][y -1];

					int aRed  = a.getRed();
					int lRed  = l.getRed();
					int rRed  = r.getRed();
					int dRed  = d.getRed();

					int aGreen  = a.getGreen();
					int lGreen  = l.getGreen();
					int rGreen  = r.getGreen();
					int dGreen  = d.getGreen();

					int aBlue  = a.getBlue();
					int lBlue  = l.getBlue();
					int rBlue  = r.getBlue();
					int dBlue  = d.getBlue();

					int newRed = (aRed + rRed + lRed + dRed * 3) / 6;
					int newGreen = (aGreen + rGreen + lGreen + dGreen * 3) / 6;
					int newBlue= (aBlue  + rBlue  + lBlue  + dBlue  * 3) / 6;

					Color newColor = new Color(newRed, newGreen, newBlue);

					colors[x][y] = newColor;


				}

			}




			ImageFrame.drawArray(colors);


			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
