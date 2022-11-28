package U8;

public class TurtelState {

    // to get the Turtle State and it's directions
    private double xKoordinate;
    private double yKoordinate;
    private double angle;
    private boolean isDown;

    public TurtelState(boolean isDown, double xKoordinate, double yKoordinate, double angle) {
        this.isDown = isDown;
        this.xKoordinate = xKoordinate;
        this.yKoordinate = yKoordinate;
        this.angle = angle;
    }


    public TurtelState() {
        xKoordinate = 0;
        yKoordinate = 0;
        angle = 0;
        isDown = false;
    }

    public double getxKoordinate() {
        return xKoordinate;
    }  //get x Direction

    public void setxKoordinate(double xKoordinate) {
        this.xKoordinate = xKoordinate;
    }       //set x Direction

    public double getyKoordinate() {
        return yKoordinate;
    }   //get y Direction

    public void setyKoordinate(double yKoordinate) {
        this.yKoordinate = yKoordinate;
    }       //set y Direction

    public double getAngle() {
        return angle;
    }       // get angel

    public void setAngle(double angle) {
        this.angle = angle;
    }               //set angel

    public boolean getDown() {
        return isDown;
    }           //returns whether pen is down

    public void setDown(boolean down) {
        this.isDown = down;
    }                  // put pen down
}
