package ss04_class_object_constructor.practice;

import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle { width " + width + " height " + height + " }";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width: ");
        double width = scanner.nextDouble();
        System.out.println("Input height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle: \n " + rectangle.display());
        System.out.println("Your rectangle perimeter : \n " + rectangle.getPerimeter());
        System.out.println("Your rectangle area : \n " + rectangle.getArea());
    }
}

