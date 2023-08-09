package ss06_inheritance.practice;

public class Shape {
    String color = "green";
    boolean filled = true;
    Shape() {
        this.color = "green";
        this.filled = true;
    }
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
      return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape with color of " + this.getColor() + " and " + (this.isFilled()? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println("Shape1 " + shape1);
        Shape shape2 = new Shape("yellow", false);
        System.out.println("Shape2 " + shape2);
    }
}
