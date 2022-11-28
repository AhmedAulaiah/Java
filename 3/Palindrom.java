import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        String charFirst = new String();
        String isPalindrom;

        System.out.println("Schreiben Sie ein Text um zu schauen ob es ein Palindrom ist :");
        Scanner input = new Scanner(System.in);
        isPalindrom = input.next();

        isPalindrom = isPalindrom.toLowerCase();
        for (int i = isPalindrom.length() - 1; i >= 0; i--)
            charFirst = (charFirst + isPalindrom.charAt(i));

        if (isPalindrom.equals(charFirst)) {
            System.out.println("" + isPalindrom + " is a Palindrom ");
        } else
            System.out.println("" + isPalindrom + " is not a Palindrom");

    }
}