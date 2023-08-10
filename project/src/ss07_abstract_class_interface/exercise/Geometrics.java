package ss07_abstract_class_interface.exercise;

import java.util.Arrays;

public class Geometrics {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(7, "blue", true);
        shapes[1] = new Rectangle(4, 6, "white", false);
        shapes[2] = new Square(8, "orange", true);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if(shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }

        double percent = Math.random() * 100;
        System.out.println("After resize:");
        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println(shape);
        }
    }
}
