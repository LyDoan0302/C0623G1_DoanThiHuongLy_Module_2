package ss06_inheritance.practice;

public class Square extends Rectangle {
    Square() {

    }
    Square(double side) {
        super(side, side);
    }
    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side " + this.getSide() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        Square square1 = new Square(5);
        Square square2 = new Square(5, "pink", false);
        square.setWidth(10);
        System.out.println(square);
        System.out.println(square1);
        System.out.println(square2);
    }
}
