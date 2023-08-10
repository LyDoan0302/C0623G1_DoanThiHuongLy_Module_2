package ss07_abstract_class_interface.exercise;

public class Square extends Rectangle implements Colorable, Resizeable {

    public Square() {

    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void howToColor() {
        System.out.println("color all four sides");
    }

    @Override
    public String toString() {
        return "A Square with area: "
                + super.getArea();
    }
    @Override
    public void resize(double percent) {
        this.setSide(getSide() * (1 + percent / 100) );
    }
}
