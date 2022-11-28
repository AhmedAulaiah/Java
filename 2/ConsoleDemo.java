package aufgabe4;
import java.awt.Color;

public class ConsoleDemo {
	public static void main(String[] args) {
			
		Console.write("Console.write() schreibt Text an die aktuelle Cursor-Position. ");
		Console.writeln("Console.writeln() fügt zusätzlich einen Zeilenumbruch an.");
		Console.writeln();
		
		Console.setForeground(Color.BLUE);
		Console.write("Die Textfarbe ");		
		Console.setForeground(Color.CYAN);
		Console.write("kann mit ");		
		Console.setForeground(Color.GREEN);
		Console.write("Color.setForeground() ");		
		Console.setForeground(Color.YELLOW);
		Console.write("verändert werden.");
		
		Console.setBackground(Color.RED);
		Console.write("  Die Hintergrund-Farbe mit Color.setBackground().");		
		
		Console.setBackground(Color.BLACK);
		Console.setForeground(Color.WHITE);		
				
		
		// ------------------------------------------------------------------------------- 
		// Cursorposition verändern
		// ------------------------------------------------------------------------------- 
		
		Console.writeln();
		Console.writeln();
		Console.write("Console.gotoXY() ändert die Cursorposition von hier ...");
		
		Console.gotoXY(15, 10);
		Console.write("nach hier...");
		
		Console.gotoXY(30, 14);
		Console.write("oder hierher...");
		
		Console.gotoXY(5, 20);
		Console.write("oder auch hierher...");
		
	}
}
