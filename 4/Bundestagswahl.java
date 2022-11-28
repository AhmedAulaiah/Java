package U4;

import java.awt.Color;

public class Bundestagswahl {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Console Background Color
        Console.setBackground(Color.white);
        Console.clear();

        // Coordinates and Color für Bundestag
        Console.setBackground(Color.black);
        Console.setForeground(Color.white);
        Console.gotoXY(0, 1);
        Console.writeln("Bundestagswahl  -  Welche Partei möchten Sie wählen");

        // Color für Partei name
        Console.setBackground(Color.white);
        Console.setBackground(Color.black);

        Console.gotoXY(0, 4);
        Console.writeln("Partei A");

        Console.gotoXY(0, 6);
        Console.writeln("Partei B");

        Console.gotoXY(0, 8);
        Console.writeln("Partei C");

        Console.gotoXY(0, 10);
        Console.writeln("Partei D");

        Console.gotoXY(0, 12);
        Console.writeln("Partei E");

        String colorWahl = "+";

        int zufallZahl_Partei_A = 0;
        int zufallZahl_Partei_B = 0;
        int zufallZahl_Partei_C = 0;
        int zufallZahl_Partei_D = 0;
        int zufallZahl_Partei_E = 0;

        while (zufallZahl_Partei_A + zufallZahl_Partei_B + zufallZahl_Partei_C + zufallZahl_Partei_D + zufallZahl_Partei_E != 100) {
            zufallZahl_Partei_A = (int) (Math.random() * 50);
            zufallZahl_Partei_B = (int) (Math.random() * 50);
            zufallZahl_Partei_C = (int) (Math.random() * 50);
            zufallZahl_Partei_D = (int) (Math.random() * 50);
            zufallZahl_Partei_E = (int) (Math.random() * 50);

        }
            String stimme = "";


            for (int i = 0; i <= 50; i++) {
                Console.displayOff();
                if (i <= zufallZahl_Partei_A) {
                    stimme = Integer.toString(i);
                    Console.gotoXY(10 + i, 4);
                    Console.setBackground(Color.red);
                    ;
                    Console.setForeground(Color.red);
                    Console.write(colorWahl);

                    Console.gotoXY(70, 4);
                    Console.setBackground(Color.white);
                    Console.setForeground(Color.black);
                    Console.write(stimme);

                }

                if (i <= zufallZahl_Partei_B) {
                    stimme = Integer.toString(i);

                    Console.gotoXY(10 + i, 6);
                    Console.setBackground(Color.black);
                    ;
                    Console.setForeground(Color.black);
                    Console.write(colorWahl);

                    Console.gotoXY(70, 6);
                    Console.setBackground(Color.white);
                    Console.setForeground(Color.black);
                    Console.write(stimme);

                }
                if (i <= zufallZahl_Partei_C) {
                    stimme = Integer.toString(i);

                    Console.gotoXY(10 + i, 8);
                    Console.setBackground(Color.green);
                    ;
                    Console.setForeground(Color.green);
                    Console.write(colorWahl);

                    Console.gotoXY(70, 8);
                    Console.setBackground(Color.white);
                    Console.setForeground(Color.black);
                    Console.write(stimme);

                }

                if (i <= zufallZahl_Partei_D) {
                    stimme = Integer.toString(i);

                    Console.gotoXY(10 + i, 10);
                    Console.setBackground(Color.pink);
                    ;
                    Console.setForeground(Color.pink);
                    Console.write(colorWahl);

                    Console.gotoXY(70, 10);
                    Console.setBackground(Color.white);
                    Console.setForeground(Color.black);
                    Console.write(stimme);

                }

                if (i <= zufallZahl_Partei_E) {
                    stimme = Integer.toString(i);

                    Console.gotoXY(10 + i, 12);
                    Console.setBackground(Color.yellow);
                    ;
                    Console.setForeground(Color.yellow);
                    Console.write(colorWahl);

                    Console.gotoXY(70, 12);
                    Console.setBackground(Color.white);
                    Console.setForeground(Color.black);
                    Console.write(stimme);
                }

                Console.gotoXY(10, 24);
                Console.wait(60);
                Console.displayOn();
            }
            //break;
            //}
            Console.gotoXY(10, 16);
            Console.setBackground(Color.black);
            Console.setForeground(Color.white);

            if (zufallZahl_Partei_A > zufallZahl_Partei_B && zufallZahl_Partei_A > zufallZahl_Partei_C && zufallZahl_Partei_A > zufallZahl_Partei_D
                    && zufallZahl_Partei_A > zufallZahl_Partei_E) {
                Console.writeln("Die Mehrheit ist für Partei A");
                if (zufallZahl_Partei_A == zufallZahl_Partei_B) {
                    Console.writeln("Die Mehrheit ist für Partei A und B");
                } else if (zufallZahl_Partei_A == zufallZahl_Partei_C) {
                    Console.writeln("Die Mehrheit ist für Partei A und C");
                } else if (zufallZahl_Partei_A == zufallZahl_Partei_D) {
                    Console.writeln("Die Mehrheit ist für Partei A und D");
                } else if (zufallZahl_Partei_A == zufallZahl_Partei_E) {
                    Console.writeln("Die Mehrheit ist für Partei A und E");
                }
            } else if (zufallZahl_Partei_B > zufallZahl_Partei_A && zufallZahl_Partei_B > zufallZahl_Partei_C
                    && zufallZahl_Partei_B > zufallZahl_Partei_D && zufallZahl_Partei_B > zufallZahl_Partei_E) {
                Console.writeln("Die Mehrheit ist für Partei B");
                if (zufallZahl_Partei_B == zufallZahl_Partei_A) {
                    Console.writeln("Die Mehrheit ist für Partei A und B");
                } else if (zufallZahl_Partei_B == zufallZahl_Partei_C) {
                    Console.writeln("Die Mehrheit ist für Partei B und C");
                } else if (zufallZahl_Partei_B == zufallZahl_Partei_D) {
                    Console.writeln("Die Mehrheit ist für Partei B und D");
                } else if (zufallZahl_Partei_B == zufallZahl_Partei_E) {
                    Console.writeln("Die Mehrheit ist für Partei B und E");
                }
            } else if (zufallZahl_Partei_C > zufallZahl_Partei_A && zufallZahl_Partei_C > zufallZahl_Partei_B
                    && zufallZahl_Partei_C > zufallZahl_Partei_D && zufallZahl_Partei_C > zufallZahl_Partei_E) {
                Console.writeln("Die Mehrheit ist für Partei C");
                if (zufallZahl_Partei_C == zufallZahl_Partei_A) {
                    Console.writeln("Die Mehrheit ist für Partei A und C");
                } else if (zufallZahl_Partei_C == zufallZahl_Partei_B) {
                    Console.writeln("Die Mehrheit ist für Partei B und C");
                } else if (zufallZahl_Partei_C == zufallZahl_Partei_D) {
                    Console.writeln("Die Mehrheit ist für Partei C und D");
                } else if (zufallZahl_Partei_C == zufallZahl_Partei_E) {
                    Console.writeln("Die Mehrheit ist für Partei C und E");
                }
            } else if (zufallZahl_Partei_D > zufallZahl_Partei_A && zufallZahl_Partei_D > zufallZahl_Partei_B
                    && zufallZahl_Partei_D > zufallZahl_Partei_C && zufallZahl_Partei_D > zufallZahl_Partei_E) {
                Console.writeln("Die Mehrheit ist für Partei D");
                if (zufallZahl_Partei_D == zufallZahl_Partei_A) {
                    Console.writeln("Die Mehrheit ist für Partei A und D");
                } else if (zufallZahl_Partei_D == zufallZahl_Partei_B) {
                    Console.writeln("Die Mehrheit ist für Partei D und B");
                } else if (zufallZahl_Partei_D == zufallZahl_Partei_C) {
                    Console.writeln("Die Mehrheit ist für Partei C und D");
                } else if (zufallZahl_Partei_D == zufallZahl_Partei_E) {
                    Console.writeln("Die Mehrheit ist für Partei D und E");
                }
            } else if (zufallZahl_Partei_E > zufallZahl_Partei_A && zufallZahl_Partei_E > zufallZahl_Partei_B
                    && zufallZahl_Partei_E > zufallZahl_Partei_C && zufallZahl_Partei_E > zufallZahl_Partei_D) {
                Console.writeln("Die Mehrheit ist für Partei E");
                if (zufallZahl_Partei_E == zufallZahl_Partei_A) {
                    Console.writeln("Die Mehrheit ist für Partei A und E");
                } else if (zufallZahl_Partei_E == zufallZahl_Partei_B) {
                    Console.writeln("Die Mehrheit ist für Partei E und B");
                } else if (zufallZahl_Partei_E == zufallZahl_Partei_C) {
                    Console.writeln("Die Mehrheit ist für Partei E und C");
                } else if (zufallZahl_Partei_E == zufallZahl_Partei_D) {
                    Console.writeln("Die Mehrheit ist für Partei E und D");
                    //}
                }
            }
        }
    }