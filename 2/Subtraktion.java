import java.util.Scanner;

public class Subtraktion {

    public static void main (String[] args){
        int a = (int) (Math.random()*50) + 50;
        int b = (int) (Math.random()*50);
        System.out.println(a);
        System.out.println(b);
        System.out.println("Was ist die Subtraktion von <<Wert von a>> und <<Wert von b>> ?");
        double subraktionAMinusB = a-b;
        Scanner input =new Scanner(System.in);
        int answer = input.nextInt();
        System.out.println(answer==subraktionAMinusB);
    }

}
