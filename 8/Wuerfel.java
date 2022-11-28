package U8;

public class Wuerfel {
    public static void main (String [] args){
        LineFrame frame = new LineFrame("Wuerfel");
        Turtle turtle = new Turtle(frame);
        turtle.penDown();
        for (int i = 0; i < 4; i++) {
            turtle.forward(0.1, frame);
            turtle.turn(90);
        }
        turtle.turn(30);
        turtle.forward(0.1, frame);
        turtle.turn(-30);
        turtle.forward(0.1, frame);
        turtle.turn(210);
        turtle.forward(0.1, frame);
        turtle.turn(-180);
        turtle.forward(0.1, frame);
        turtle.turn(-30);
        turtle.turn(90);
        turtle.forward(0.1, frame);
        turtle.turn(120);
        turtle.forward(0.1, frame);
        turtle.turn(180);
        turtle.forward(0.1, frame);
        turtle.turn(-210);
        turtle.forward(0.1, frame);
        turtle.turn(30);
        turtle.forward(0.1, frame);
        turtle.turn(180);
        turtle.forward(0.1, frame);
        turtle.turn(240);
        turtle.forward(0.1, frame);
    }
}
