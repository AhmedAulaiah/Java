package U3;

import java.util.Scanner;

public class Raute {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ungerade Zahl ein");
        int zahl = input.nextInt();
        if (zahl % 2 == 0) {
            System.out.println("Die Raute kann nur für ungerade Eingaben gezeichnet werden");
        }
        if (zahl % 2 != 0) {
            for (int i = 0; i < zahl; i++) {
                for (int j = 0; j < zahl; j++) {
                    if (Math.abs(i - zahl / 2) + Math.abs(j - zahl / 2) > zahl / 2) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }


        }

    }
}