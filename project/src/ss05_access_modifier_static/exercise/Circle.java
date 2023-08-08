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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.getRadius(), 2) * Math.PI;
    }
}
