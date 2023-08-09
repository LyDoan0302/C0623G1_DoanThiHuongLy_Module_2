package ss06_inheritance.practice;

public class Rectangle extends Shape{
    private double width = 1.0d;
    private double length = 1.0d;
    Rectangle(){

    }
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width " + this.width + " and length " + this.length + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(5, 8);
        Rectangle rectangle2 = new Rectangle(6, 10, "red", false);
        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
