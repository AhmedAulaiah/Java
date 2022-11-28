package U7;

/**
 * @author aulaiah
 */
public class Bruch {

    /**
     *
     * @return zaehler
     */
    public long getZaehler() {
        return zaehler;
    }

    /**
     *
     * @param zaehler
     */
    public void setZaehler(long zaehler) {
        this.zaehler = zaehler;
    }

    /**
     *
     * @return get Nenner
     */
    public long getNenner() {
        return nenner;
    }

    /**
     *
     * @param nenner
     */
    public void setNenner(long nenner) {
        this.nenner = nenner;
    }

    private long zaehler;
    private long nenner;

    public Bruch (long num){

        this.nenner = 1;
        this.zaehler = num;
    }

    /**
     *
     * @param zaehler
     * @param nenner
     */
    public Bruch (long zaehler, long nenner){
        this.zaehler = zaehler;
        if (nenner ==0){
        nenner = 1;}
        else{
            this.nenner = nenner;
        }
    }

    /**
     *
     * @return toString
     */
    @Override
    public String toString(){
        String bruch;
        bruch = this.zaehler + "/" +this.nenner;
        return bruch;
    }

    /**
     *
     * @param bruch
     * @return addition
     */
    public Bruch addition(Bruch bruch){
        long newZaehler = (this.nenner * bruch.zaehler) + (bruch.nenner * this.zaehler);
        long newNenner = bruch.nenner * this.nenner;
        return new Bruch(newZaehler, newNenner);
    }

    /**
     *
     * @param bruch
     * @return subtraktion
     */
    public Bruch subtraktion(Bruch bruch){
        long newZaehler = ((bruch.nenner * this.zaehler) - (this.nenner * bruch.zaehler));
        long newNenner = bruch.nenner * this.nenner;
        return new Bruch(newZaehler,newNenner);
    }

    /**
     *
     * @param bruch
     * @return multiplikation
     */
    public Bruch multiplikation (Bruch bruch){
        long newZaehler = bruch.zaehler * this.zaehler;
        long newNenner = bruch.nenner * this.nenner;
        return new Bruch(newZaehler,newNenner);
    }

    /**
     *
     * @param bruch
     * @return division
     */
    public Bruch division (Bruch bruch){
        long newZaehler = bruch.nenner * this.zaehler;
        long newNenner = bruch.zaehler * this.nenner;
        return new Bruch(newZaehler,newNenner);
    }

    /**
     *
     * @return dezimal Wert
     */
    double dezimalWert() {
        double zaehler = this.zaehler;
        double nenner = this.nenner;
        double dezimalWert = zaehler/nenner;
        return dezimalWert;
    }

    /**
     *
     * @param bruch
     * @return reziprok
     */
    public Bruch reziprok (Bruch bruch){
        long newZaehler = bruch.nenner;
        long newNenner = bruch.zaehler;
        return new Bruch (newZaehler,newNenner);
    }

    /**
     *
     * @param num1
     * @param num2
     * @return grosseste Gemeinsam Teiler
     */
    private static long groessesteGemeinsamTeiler (long num1, long num2){
        long rest;
        while (num2 != 0){
            rest = num1 % num2;
            num1 = num2;
            num2 = rest;
        }
        return num1;
    }


    public Bruch kuerzeste (){
        long groessessteTeiler = groessesteGemeinsamTeiler(nenner,zaehler);
        this.zaehler = zaehler / groessessteTeiler;
        this.nenner = nenner / groessessteTeiler;
        return new Bruch(zaehler,nenner);
    }

    /**
     *
     * @param args
     * Main method
     */
    public static void main (String [] args){
        Bruch bruch1 = new Bruch(1,5);
        Bruch bruch2 =new Bruch(3);
        Bruch bruch3 =new Bruch(5,2);
        Bruch addition1und2 = bruch1.addition(bruch2);
        Bruch result1 = addition1und2.subtraktion(bruch3);
        System.out.println("result1 = " +result1);
        Bruch mal1und2 = bruch1.multiplikation(bruch2);
        Bruch result2 = mal1und2.division(bruch3);
        System.out.println("result2 = " +result2);
    }
}
