import java.util.Scanner;

public class Namen {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String firstName;
        String secondName;

        Scanner input = new Scanner(System.in);

        System.out.println("Was ist die erste Name?");
        firstName = input.next();


        System.out.println("Was ist die zweite Name?");
        secondName = input.next();

        int c = firstName.length();
        int d = secondName.length();

        boolean e = (c == d);

        if (e)
            System.out.println(firstName + " hat gleich viele Buchstaben wie " + secondName);

        if (c > d)
            System.out.println(firstName + " hat mehr Buchstaben als " + secondName);

        if (d > c)
            System.out.println(secondName + " hat mehr Buchstaben als " + firstName);

    }


}