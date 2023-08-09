package ss06_inheritance.exercise;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;
    public Point2D() {

    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }
    public float[] getXY() {
        float[] xy = {this.getX(), this.getY()};
        return xy;
    }

    @Override
    public String toString() {
        return "x,y: " + this.getX() + ", " + this.getY() + ", array2D " +Arrays.toString(this.getXY());
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point2D point2D1 = new Point2D(3,4);

        System.out.println(point2D);
        System.out.println(point2D1);
    }
}
