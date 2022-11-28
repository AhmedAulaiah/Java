
import java.util.Scanner;

public class Array {


    public static int longestNumber(int[] array) {
        int longest = Integer.MIN_VALUE;
        for (int i= 0; i<array.length; i++)
        {
            if (array[i]>longest)longest=array[i];
        }
        return longest;
        }

    public static int shortestNumber(int[] array) {
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i< array.length; i++)
        {
            if(array[i]<shortest)shortest=array[i];
        }
        return shortest;
    }



    public static void main(String[] args) {

        Scanner firstInput = new Scanner(System.in);
        Scanner secondInput = new Scanner(System.in);
        System.out.println("Geben Sie bitte die Anzahl die Zahlen ein:  ");
        int zahlen = firstInput.nextInt();

        int[] theArray = new int[zahlen];
        int de = 0;
        while (de < zahlen) {
            System.out.println("Zahl " + de + ":");
            theArray[de] = Integer.parseInt(secondInput.nextLine());
            de++;
        }
        int shortest = shortestNumber(theArray);
        int longest = longestNumber(theArray);
        System.out.println("Der längste Zahl ist " + longest + "\nDer kürzeste ist " + shortest);
        firstInput.close();
        secondInput.close();
    }
}