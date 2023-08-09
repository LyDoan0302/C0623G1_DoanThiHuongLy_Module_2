package ss05_access_modifier_static.exercise;

public class Circle {
    private double radius = 1.0d;
    private String color = "red";

    Circle() {

    }
    Circle(double radius) {

    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(this.getRadius(), 2) * Math.PI;
    }
}
