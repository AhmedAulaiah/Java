package oldu11;

import java.util.List;

public class Assertion {
    public static void main(String[] args) {
/*
      -> Anwendungsfälle in denen man in der Entwicklung mit Java Assertions nutzt.
        -ermöglicht das Testen der Korrektheit aller im Programm getroffenen Annahmen
        -Assertion ist eine Aussage in Java. Es kann verwendet werden, um Ihre Annahmen
         über das Programm zu testen. Während der Ausführung der Behauptung wird angenommen,
         ob sie wahr ist. Wenn dies fehlschlägt, gibt JVM einen Fehler namens AssertionError aus.

      -> zwei Anwendungsfälle in denen man statt Assertions lieber Exceptions nutzen sollte.
         Asserions werden für interne Logikfehler verwendet, während Exceptions für externe Dinge verwendet
         werden, um Datentypen abzufangen. Exceptions finden sich beispielsweise bei Benutzereingabeabfragen
         oder bei einem Programm, der viele Datentypen umwandeln muss. Assertions dienen also eher dazu, die
         eigene Logik zu überprüfen, um die interne Robustheit des Programms zu erhöhen. Inzwischen Exception
         gut für äußere Robustheit.


 */
        assert  args[1].equals("Montag")     ||
                args[1].equals("Dienstag")   ||
                args[1].equals("Mittwoch")   ||
                args[1].equals("Donnerstag") ||
                args[1].equals("Freitag")    ||
                args[1].equals("Samstag")    ||
                args[1].equals("Sonntag"):args[1] + " Der Tag existiert nicht!";

        List<String> weekList = WeekdayService.getWeekStrings(args[0]);                 //String der stellt eine Sprache dar
        List<String> listInGerman = WeekdayService.getWeekStrings("Deutsch");  //String der stellt einen deutschen Wochentag dar
        int weekDay = listInGerman.indexOf(args[1]);

        System.out.printf("Der  " + args[1] + " heißt auf " + args[0] +" "+ weekList.get(weekDay));
        }
}
