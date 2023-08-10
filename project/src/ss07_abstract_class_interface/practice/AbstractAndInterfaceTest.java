package ss07_abstract_class_interface.practice;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal chicken = new Chicken();
        System.out.println(chicken.makeSound());
        System.out.println(chicken.howToEat());
        Tiger tiger = new Tiger();
        System.out.println(tiger.makeSound());
        Fruit apple = new Apple();
        System.out.println(apple.howToEat());
        Orange orange = new Orange();
        System.out.println(orange.howToEat());
    }
}
