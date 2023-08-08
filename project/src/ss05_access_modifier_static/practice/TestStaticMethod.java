package ss05_access_modifier_static.practice;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethodStudent.change();
        StaticMethodStudent staticMethodStudent1 = new StaticMethodStudent(111, "Marry");
        StaticMethodStudent staticMethodStudent2 = new StaticMethodStudent(112, "Jane");
        StaticMethodStudent staticMethodStudent3 = new StaticMethodStudent(113, "Jack");
        staticMethodStudent1.display();
        staticMethodStudent2.display();
        staticMethodStudent3.display();
    }
}
