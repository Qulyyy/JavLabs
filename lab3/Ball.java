package lab3;

public class Ball {
    private double x;
    private double y;

    public Ball (double inpX, double inpY) {
        x = inpX;
        y = inpY;
    }

    public Ball () {
        x = 0.0;
        y = 0.0;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    public String toString() {
        return "Ball @ (" + this.x + ", " + this.y + ").";
    }
}