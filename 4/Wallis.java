public class Wallis {

    public static double piBerechnen(int n) {
        double d = 1;
        int z = 2, ne = 1;
        for (int i = 1; i < n; i += 2, z += 2) {
            d *= (double) z / ne * ((double) z / (ne += 2));
        }
        return d*2;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 3000000; i++) {
            if ( i % 300000 == 0){
            System.out.println(Wallis.piBerechnen(i));
        }}
        System.out.println(Math.PI);

    }
}