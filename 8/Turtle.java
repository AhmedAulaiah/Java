package U8;

public class Turtle {

    private TurtelState state;
    private LineFrame frame;

    /**
     * Konstruktor der nur das LineFrame übergeben bekommt und den anderen
     * Konstruktor mit default-Werten aufruft.
     *
     * @param lineFrame Das Visualisierungsfenster, auf dem gezeichnet wird.
     */
    public Turtle(LineFrame lineFrame) {
        this
                (lineFrame, 0.5, 0.5, Math.PI / 2);
    }

    /**
     * Konstruktor, der Werte übergeben bekommt und diese den internen Feldern
     * zuweist.
     *
     * @param lineFrame Das Visualisierungsfenster, auf dem gezeichnet wird.
     * @param initX     x-Position der Turtle
     * @param initY     y-Position der Turtle
     * @param initAngle Ausrichtung (Winkel) der Turtle
     */
    public Turtle(LineFrame lineFrame, double initX, double initY, double initAngle) {
        //frame = lineFrame;
        //state = new TurtelState();
        this.state = new TurtelState(false, initX, initX, initAngle);


    }

    /**
     * Setzt den Stift auf dem Blatt ab.
     */
    public void penDown() {
        state.setDown(true);

    }

    /**
     * Hebt den Stift vom Blatt weg.
     */
    public void penUp() {
        state.setDown(false);
    }

    /**
     * Bewegt die Schildkröte um stepSize in die blickrichtung der Schildkröte.
     * StepSize hat dabei einen Wert zwischen 0 und 1, wobei 1 gleich einer
     * Bildschrimlänge entspricht.
     *
     * @param stepSize
     */
    public void forward(double stepSize, LineFrame frame) {
        double xMag;
        double yMag;
        double newX;
        double newY;

        xMag = state.getxKoordinate();
        yMag = state.getyKoordinate();
        newX = xMag + stepSize * Math.cos(Math.toRadians(state.getAngle()));
        newY = yMag + stepSize * Math.sin(Math.toRadians(state.getAngle()));

        if (state.getDown()) {
            frame.drawLine(xMag, yMag, newX, newY);
        }
        state.setxKoordinate(newX);
        state.setyKoordinate(newY);
    }

    /**
     * Dreht sich um den angegebenen Wert.
     *
     * @param angle Der Wert um den sich die Turtle dreht.
     */
    public void turn(double angle) {
        state.setAngle(state.getAngle() + angle);
    }
}
