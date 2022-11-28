import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        //Einlesen der Laenge eines Array von den Nutzer
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie die Laenge des Arrays: ");
        int lengthOfArrays = input.nextInt();
        input.close();


        int[] numberOfArrays = newArray(lengthOfArrays);
        System.out.println("Eingegeben Array ist: ");
        SelectionSort.showArray(numberOfArrays);


        // das mixArray() Methode
        System.out.println("Array gemischt: ");
        SelectionSort.mixArray(numberOfArrays);
        SelectionSort.showArray(numberOfArrays);

        // selectionSort() Methode
        System.out.println("Array sortiert: ");
        SelectionSort.selectionSort(numberOfArrays);
        SelectionSort.showArray(numberOfArrays);

    }


    private static int[] newArray(int n) {
        int[] arrayGeordnet = new int[n];
        for (int i = 0; i < n; i++) {
            arrayGeordnet[i] = i + 1;
        }
        return arrayGeordnet;
    }


    private static void mixArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int arrayA = (int) (Math.random() * (array.length));
            int arrayB = (int) (Math.random() * (array.length));
            int mixed = array[arrayA];
            array[arrayA] = array[arrayB];
            array[arrayB] = mixed;
        }
    }

    private static void showArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(" ]");
        System.out.println("\n");
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minValue = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minValue = j;
                }
            }

            int l1 = array[i];
            array[i] = min;
            array[minValue] = l1;
        }
    }
}
