package ss05_access_modifier_static.practice;

public class TestCars {
    public static void main(String[] args) {
        Cars cars1 = new Cars("Toyota", 111);
        System.out.println(Cars.countNumberOfCar);
        Cars cars2 = new Cars("Toyota", 112);
        System.out.println(Cars.countNumberOfCar);
        Cars cars3 = new Cars("Toyota", 113);
        System.out.println(Cars.countNumberOfCar);
    }
}
