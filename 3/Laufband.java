package U3;

import java.awt.Color;

public class Laufband {

    public static void main(String[] args) {
        Console.setForeground(Color.YELLOW);
        String firstText = " !!! PROGRAMMIEREN MACHT SCHOEN !!!";
        String secondText = " !!! CORONA NERVT !!!";

        int lengthFirstText = firstText.length();

        int screenLength = 80;
        int rightAndLeft = 1;
        int width = 1;


        Color f[] = new Color[3];
        f[0] = Color.blue;
        f[1] = Color.green;
        f[2] = Color.red;

        int colorChange = 0;

        while (true) {
            Console.clear();
            if (rightAndLeft < 1 || rightAndLeft > screenLength - lengthFirstText - 2) {
                width *= -1;
                colorChange++;
                if (colorChange > 2) {
                    colorChange = 1;
                    Console.setForeground(f[colorChange]);
                } else if (colorChange > 1) {
                    colorChange = 2;
                    Console.setForeground(f[colorChange]);
                }
            }
            rightAndLeft += width;
            Console.gotoXY(rightAndLeft, 12);
            Console.writeln(firstText);
            Console.wait(30);
            Console.gotoXY(rightAndLeft + 5, 13);
            Console.writeln(secondText);

        }
    }
}
