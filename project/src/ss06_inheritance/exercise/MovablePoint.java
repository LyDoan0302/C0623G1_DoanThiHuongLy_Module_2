package ss06_inheritance.exercise;

import java.util.Arrays;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint() {

    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }
    public float[] getSpeed() {
        float[] xySpeed = {this.getXSpeed(), this.getYSpeed()};
        return xySpeed;
    }

    @Override
    public String toString() {
        return "x,y: " + super.getX() + ", " + super.getY() +
                ", array xy: " + Arrays.toString(this.getSpeed());
    }
    public MovablePoint move() {
        super.setX(super.getX() + this.getXSpeed());
        super.setY(super.getY() + this.getYSpeed());
        return this;
    }
}
