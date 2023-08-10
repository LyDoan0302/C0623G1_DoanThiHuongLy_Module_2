package ss07_abstract_class_interface.practice;

public abstract class Animal implements Edible{
    public abstract String makeSound();

    @Override
    public String howToEat() {
        return null;
    }

}
