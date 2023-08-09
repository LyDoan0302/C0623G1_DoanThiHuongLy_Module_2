package ss06_inheritance.exercise;

public class Cylinder extends Circle{
    private double height;
    public Cylinder() {

    }
    public Cylinder(double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getCapacity() {
        return super.getRadius() * super.getRadius() * this.getHeight() * Math.PI;
    }

    @Override
    public String toString() {
        return "A cylinder with height " + this.getHeight() + ", which is a subclass of " + super.toString() +
                ", Capacity: " + this.getCapacity();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Cylinder cylinder1 = new Cylinder(6, "white", 10);
        System.out.println(cylinder);
        System.out.println(cylinder1);
    }
}
