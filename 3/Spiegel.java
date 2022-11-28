package U3;

import java.awt.*;

public class Spiegel {
    public static void main(String[] args) {
        //rechteSeite();
        //linkeSeite();
        beideSeite();
    }

    public static void beideSeite () {
        Console.setForeground(Color.YELLOW);
        String firstText = "R";
        Console.setForeground(Color.YELLOW);
        String secondText = "L";

       // int lengthFirstText = firstText.length();
       // int lengthSecondText = secondText.length();


        int screenLengthRight = 40;
        int rightAndLeftRight = 1;
        int screenLengthLeft = 80;
        int rightAndLeftLeft = 78;
        int widthRight = 1;
        int widthLeft = 1;



        while (true) {
            Console.clear();
            if (rightAndLeftRight < 1 || rightAndLeftRight > screenLengthRight-1) {
                widthRight *= -1;

            }
            rightAndLeftRight += widthRight;
            Console.gotoXY(rightAndLeftRight, 12);
            Console.writeln(firstText);
            Console.wait(60);


            if (rightAndLeftLeft < 41 || (rightAndLeftLeft > screenLengthLeft-1)) {
                widthLeft *= -1;

            }
            rightAndLeftLeft = rightAndLeftLeft - widthLeft;
            Console.gotoXY(rightAndLeftLeft, 12);
            Console.writeln(secondText);
            Console.wait(30);
        }
    }
/*
    public static void rechteSeite (){
        Console.setForeground(Color.YELLOW);
        String firstText = "R";

        int lengthFirstText = firstText.length();

        int screenLength = 40;
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
        }
    }

    public static void linkeSeite (){
            Console.setForeground(Color.YELLOW);
            String secondText = "L";

            int lengthSecondText = secondText.length();

            int screenLength = 80;
            int rightAndLeft = 40;
            int width = 1;

            Color f[] = new Color[3];
            f[0] = Color.blue;
            f[1] = Color.green;
            f[2] = Color.red;

            int colorChange = 0;

            while (true) {
                Console.clear();
                if (rightAndLeft < 1 || rightAndLeft > screenLength - lengthSecondText - 1 ) {
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
                rightAndLeft += width ;
                Console.gotoXY(rightAndLeft, 15);
                Console.writeln(secondText);
                Console.wait(30);

            }
        }

 */
    }

