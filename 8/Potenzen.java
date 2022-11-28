package U8;

/**
 * @author aulaiah
 */
public class Potenzen {

    //zweidimensional um dort die Werte zu speichern
    private static int[][] arrays;


    public static double potenz(int num, int exp) {
        if (exp==1) {
            return num;
        } else if (exp<0){
            return 1 / potenz(num, -exp);
        } else if(exp == 0){
            return 1;
        }
        //wenn ein Wert bereits einmal berechnet wurde, wird er in dem Array gespeichert und wird fuer zukuenftige Rechnungen verwendet
        else {
            int countDown = (int) (((((double) exp / 2) * 100) / 100));
            int countUp = (int) Math.round((((((double) exp / 2)) * 100) + 1) / 100);
            if ((arrays[num][countDown] != 0) && (arrays[num][countUp] != 0)) {
                return arrays[num][countDown] * arrays[num][countUp];
            } else if (arrays[num][countDown] != 0) {
                return arrays[num][countDown] * potenz(num, countUp);
            } else if (arrays[num][countUp] != 0) {
                return arrays[num][countDown] * potenz(num, countUp);
            } else {
                arrays[num][countDown] = (int) potenz(num, countDown);
                arrays[num][countUp] = (int) potenz(num, countDown);
                return potenz(num, countDown) * potenz(num, countUp);
        }
    }}

    /*
    public static int binSearchRec(int[] arr, int x, int y, int z)
    {
        int m = (x+y)/2;

        if (x > y )
            return -100;

        if (arr[m] == z)
            return m;

        if (arr[m] < z)
            return binSearchRec(arr,m+1,y,z);
        else
            return binSearchRec(arr,x,m-1,z);

    }

     */

    public static void main (String[] args){
        //System.out.println(binSearchRec());
        System.out.println(potenz(3,2));
    }

}
