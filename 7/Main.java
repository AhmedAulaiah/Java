package U7;

public class Main {
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
        System.out.println(bruch1.kuerzeste());
    }
}
