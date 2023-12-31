package ss06_inheritance.exercise;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;
    public Point() {

    }
    public Point(float x, float y) {
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
        return "array xy: " + Arrays.toString(getXY());
    }

}
