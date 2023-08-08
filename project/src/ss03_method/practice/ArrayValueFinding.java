package ss03_method.practice;
import java.util.Scanner;
public class ArrayValueFinding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] students = {"Anh", "My", "Nhat", "Viet Nam"};
        System.out.println("Input the student's name to find: ");
        String studentName = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if(studentName.equals(students[i])) {
                System.out.println("The position of " + studentName + " in the list is: " + (i + 1));
                isExist = true;
            }
        }
        if(!isExist) {
            System.out.println("The position of student named " + studentName + " is not found.");
        }
    }
}
