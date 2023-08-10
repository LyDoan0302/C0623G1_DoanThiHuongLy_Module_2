package ss06_inheritance.practice;

public class Circle extends Shape{
    private double radius;
    public Circle() {
        this.radius = 1.0d;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return this.radius * Math.PI;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + this.radius + ", which is a subclass of "  + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(4.5);
        Circle circle2 = new Circle(5.5, "yellow", true);
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
