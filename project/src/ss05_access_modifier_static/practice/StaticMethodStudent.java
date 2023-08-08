package ss05_access_modifier_static.practice;

public class StaticMethodStudent {
    private int rollNumber;
    private String name;
    private static String college = "DHKTL";

    StaticMethodStudent(int r, String name) {
        this.rollNumber = r;
        this.name = name;
    }

    static void change() {
        college = "CodeGym";
    }

    void display() {
        System.out.println("student: " + rollNumber + " ,name: " + name + " , college: " + college);
    }

    public static void main(String[] args) {
        StaticMethodStudent staticMethodStudent = new StaticMethodStudent(3, "John");
        staticMethodStudent.display();
    }
}
