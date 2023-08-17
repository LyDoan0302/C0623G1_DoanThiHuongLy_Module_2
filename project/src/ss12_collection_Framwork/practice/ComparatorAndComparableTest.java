package ss12_collection_Framwork.practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ComparatorAndComparableTest {
    public static void main(String[] args) {

        Student student1 = new Student("Ly", 20, "DN");
        Student student2 = new Student("Lan", 21, "DN");
        Student student3 = new Student("Le", 19, "DN");
        Student student4 = new Student("Linh", 16, "DN");
        Student student5 = new Student("Loan", 28, "DN");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        Collections.sort(studentList);
        for(Student student: studentList) {
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList,ageComparator);
        System.out.println("compare by age:");
        for(Student student: studentList) {
            System.out.println(student.toString());
        }
    }
}
