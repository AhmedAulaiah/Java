package thegui.u11;

import java.io.*;
import java.util.Scanner;

public class IOString {

	/**
	 * Schreibt String in einer Datei
	 */
	static void schreibeInDatei(String textInDatei, String dateiName) {
		String fileSystem = System.getProperty("user.dir") + File.separator + dateiName + ".txt";

		try (FileWriter file = new FileWriter(fileSystem)){
			BufferedWriter buff = new BufferedWriter(file);
			buff.write(textInDatei);
			buff.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}

	}

	/**
	 * Liest Character in einer TextDatei
	 * @throws IOException
	 * @return
	 */

	static String leseAusDatei(String dateiName) throws IOException{
		String fileSystem = System.getProperty("user.dir") + File.separator + dateiName + ".txt";
		// erstellt Instance von das Textdatein.
		FileReader file = new FileReader(fileSystem);
		// Liest Character in der Textdateien.
		int character = file.read();
		while (character != -1){
			System.out.print((char)character);
			character = file.read();
		}
		file.close();

		return fileSystem;
	}


}
