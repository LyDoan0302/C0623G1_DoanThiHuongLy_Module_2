package ss06_inheritance.exercise;

public class Circle {
    private double radius;
    private String color;
    public Circle() {

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
    public double getPerimeter() {
        return this.radius * Math.PI;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + this.getRadius() + ", color " + this.getColor() +
                ", Perimeter: " + this.getPerimeter() + ", Area: " + this.getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(6,"black");
        System.out.println(circle);
        System.out.println(circle1);
    }
}
