package U2;

import java.awt.*;

public class Textmodus {

    public static void main(String[] args) {
 //Console.showGrid(true);
// TODO Auto-generated method stub
        Console.setForeground(Color.YELLOW);
        Console.writeln("   			       	,  &    ,			 ");
        Console.writeln("			      :&&&  &&  &&&&:		 ");
        Console.writeln(" 			       	%&:&%:&%			 ");
        Console.writeln(" 			      %%:%:% 		   	   	");
        Console.writeln(" 			        %%%%					 ");
        Console.writeln(" 				        ;%%;					 ");
        Console.writeln(" 			    	     ::					 ");
        Console.setForeground(Color.BLUE);
        Console.write( " 	   			     	 ::					 ");
        Console.setForeground(Color.RED);
        Console.writeln(" 		  ;& &; ; 				");
        Console.setForeground(Color.BLUE);
        Console.write( " 		     	  	  ::					");
        Console.setForeground(Color.RED);
        Console.writeln(" 		:&&& && & 				");
        Console.setForeground(Color.BLUE);
        Console.write(" 	       	  ::					");
        Console.setForeground(Color.RED);
        Console.writeln("   :&& &&& 					");
        Console.setForeground(Color.BLUE);
        Console.write("   		       ::						");
        Console.setForeground(Color.RED);
        Console.writeln(" 	%;&;& 							");
        Console.setForeground(Color.BLUE);
        Console.write("          :: ");
        Console.setForeground(Color.RED);
        Console.writeln(";%%;								 ");
        Console.setForeground(Color.GREEN);
        Console.writeln("          ::         ; ");
        Console.writeln("    ;     ::        ;;; ");
        Console.writeln("   ;;     ::      ;;;;; ");
        Console.writeln("  ;;;;    ::     ;;;; ");
        Console.writeln("  ;;;;;   ::   ;;; ");
        Console.writeln("    ;;;;; ::  ; ");
        Console.writeln("     ;;;; ::    ");
        Console.writeln("        ;;:: ");
        Console.writeln("         ;:: ");
        Console.writeln("          :: ");
        Console.writeln(" -----------::-------- Aulaiah --- ");
        Console.writeln("");

        show1(Color.CYAN, Color.BLUE, 30, 25);
        show2(Color.WHITE, Color.GREEN, 70, 25);
        show3(Color.RED, Color.YELLOW, 50, 25);
    }
    public static void show1(Color color1, Color color2, int row, int column){
        for (int i = 0 ; i<20 ; i++) {
            Console.gotoXY(row, column - i);
            Console.setForeground(color1);
            Console.write("0");
        }
        for (int i = 0; i<7 ; i++){
            Console.setForeground(color2);
            Console.gotoXY(row+i, column-i-2);
            Console.write("0");

        }

        for (int i = 0; i<5 ; i++){
            Console.gotoXY(row - i, column -i-5);
            Console.setForeground(color1);
            Console.write("0");

        }

        for (int i = 0; i<9 ; i++){
            Console.gotoXY(row - i, column -i-9);
            Console.setForeground(color2);
            Console.write("0");

        }

        for (int i = 0; i<6 ; i++){
            Console.gotoXY(row + i, column -i-11);
            Console.setForeground(color1);
            Console.write("0");

        }

        for (int i = 0; i<3 ; i++) {
            Console.gotoXY(row - i, column - i - 15);
            Console.setForeground(color2);
            Console.write("0");
        }
        }

    public static void show2(Color color1, Color color2, int row, int column){
        for (int i = 0 ; i<20 ; i++) {
            Console.gotoXY(row, column - i);
            Console.setForeground(color1);
            Console.write("0");
        }
        for (int i = 0; i<7 ; i++){
            Console.setForeground(color2);
            Console.gotoXY(row+i, column-i-2);
            Console.write("0");

        }

        for (int i = 0; i<5 ; i++){
            Console.gotoXY(row - i, column -i-5);
            Console.setForeground(Color.PINK);
            Console.write("0");

        }

        for (int i = 0; i<9 ; i++){
            Console.gotoXY(row - i, column -i-9);
            Console.setForeground(Color.YELLOW);
            Console.write("0");

        }

        for (int i = 0; i<6 ; i++){
            Console.gotoXY(row + i, column -i-11);
            Console.setForeground(Color.ORANGE);
            Console.write("0");

        }

        for (int i = 0; i<3 ; i++) {
            Console.gotoXY(row - i, column - i - 15);
            Console.setForeground(Color.BLUE);
            Console.write("0");
        }


    }
    public static void show3(Color color1, Color color2, int row, int column){
        for (int i = 0 ; i<20 ; i++) {
            Console.gotoXY(row, column - i);
            Console.setForeground(color1);
            Console.write("0");
        }
        for (int i = 0; i<7 ; i++){
            Console.setForeground(color2);
            Console.gotoXY(row+i, column-i-2);
            Console.write("0");

        }

        for (int i = 0; i<5 ; i++){
            Console.gotoXY(row - i, column -i-5);
            Console.setForeground(color1);
            Console.write("0");

        }

        for (int i = 0; i<9 ; i++){
            Console.gotoXY(row - i, column -i-9);
            Console.setForeground(color2);
            Console.write("0");

        }

        for (int i = 0; i<6 ; i++){
            Console.gotoXY(row + i, column -i-11);
            Console.setForeground(color1);
            Console.write("0");

        }

        for (int i = 0; i<3 ; i++) {
            Console.gotoXY(row - i, column - i - 15);
            Console.setForeground(color2);
            Console.write("0");
        }

    }



}


