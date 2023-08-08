package ss05_access_modifier_static.exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1= new Circle();
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(4.5);
        circle2.setRadius(4.5);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());

    }
}
