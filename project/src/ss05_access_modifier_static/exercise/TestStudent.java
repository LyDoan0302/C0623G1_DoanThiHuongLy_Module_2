package ss05_access_modifier_static.exercise;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Mary");
        student1.setClasses("C03");
        System.out.println(student1.getName() + ", " + student1.getClasses());

        Student student2 = new Student();
        student2.setName("Jack");
        student2.setClasses("C04");
        System.out.println(student2.getName() + ", " + student2.getClasses());
    }
}
