package ss19_string_regex.exercise.bai_1_validate_class_name;

public class ClassNameTest {
    private static ClassName className;
    public static final String[] className1 = new String[]{"C0223G", "A0323K"};
    public static final String[] className2 = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for(String name: className1) {
            boolean isValid = className.validate(name);
            System.out.println("name: " + name + " is valid: " + isValid);
        }
        for(String name: className2) {
            boolean isValid = className.validate(name);
            System.out.println("name: " + name + " is valid: " + isValid);
        }
    }

}
