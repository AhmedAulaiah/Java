package U3;

import java.util.Scanner;

public class Hexadezimal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.print("Geben Sie eine ganze Zahl ein: ");
        Scanner input = new Scanner(System.in);
        int zahlInput = input.nextInt();
        hexadezimal(zahlInput);

    }

        public static void hexadezimal(int zahl){

            if (zahl > 15) hexadezimal(zahl/16);

            int Rest=zahl%16;

            switch(Rest){
                case 0:System.out.print("0");
                    break;
                case 1:System.out.print("1");
                    break;
                case 2:System.out.print("2");
                    break;
                case 3:System.out.print("3");
                    break;
                case 4:System.out.print("4");
                    break;
                case 5:System.out.print("5");
                    break;
                case 6:System.out.print("6");
                    break;
                case 7:System.out.print("7");
                    break;
                case 8:System.out.print("8");
                    break;
                case 9:System.out.print("9");
                    break;
                case 10:System.out.print("A");
                    break;
                case 11:System.out.print("B");
                    break;
                case 12:System.out.print("C");
                    break;
                case 13:System.out.print("D");
                    break;
                case 14:System.out.print("E");
                    break;
                case 15:System.out.print("F");
            }

    }}

