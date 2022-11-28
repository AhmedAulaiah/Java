package U5;

/**
 *
 * @author Ahmed Aulaiah

 * @return Spiel Wuerfel
 */

public class Wuerfel {
    public static void main(String[] args) {

        int numberOfWuerfel = 1000000;
        int[] throwWuerfel = new int[6];
        while(throwWuerfel[0]<numberOfWuerfel &&throwWuerfel[1]<numberOfWuerfel &&throwWuerfel[2]<numberOfWuerfel &&
                throwWuerfel[3]<numberOfWuerfel &&throwWuerfel[4]<numberOfWuerfel &&throwWuerfel[5]<numberOfWuerfel){
            int zahl = (int)((Math.random() * 6) + 1);
            switch (zahl){
                case 1:
                    throwWuerfel[0]++;
                case 2:
                    throwWuerfel[1]++;
                case 3:
                    throwWuerfel[2]++;
                case 4:
                    throwWuerfel[3]++;
                case 5:
                    throwWuerfel[4]++;
                case 6:
                    throwWuerfel[5]++;
            }
        }
                     // random() generiert eine Zahl a sodass 0 <= a < 1 wahr ist, und *10 konvert Zahl zu Basis 10
            // 1 um das Index(Anzahl_Der_Elemente) von 9 auf 10 zu erhoehen

        System.out.println("\t" +"Zahl    Erscheinungsanzahl \n");
        for (int i = 0; i < throwWuerfel.length; i++) {
            System.out.println("\t" +(i+1) + "\t   " + throwWuerfel[i]);
        }
    }
}

