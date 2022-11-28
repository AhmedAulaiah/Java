package oldu11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeekdayService {
	private static String[][] weekdayStore = {
			{"Deutsch",  "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"},
			{"Englisch", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"},
			{"Spanisch", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"},
			{"Utopiasprache",  "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Samstag2", "Sonntag"},
	};

	public static List<String> getWeekStrings(String language){
		List<String> languageDays = new ArrayList<>();

		for(String[] weekOfTheDay : weekdayStore){ 			 //sucht aus dem Weekdaystore das Array heraus, dass der übergebenen Sprache entspricht, und gibt alle im Array folgenden Elemente raus.

			if (weekOfTheDay[0].equals(language)) {
				languageDays.addAll(Arrays.asList(weekOfTheDay).subList(1, weekOfTheDay.length));
			}
		}
				assert (languageDays.size() == 7): "Woche hat laenger als 7 Tagen";

		return languageDays;
	}
}

