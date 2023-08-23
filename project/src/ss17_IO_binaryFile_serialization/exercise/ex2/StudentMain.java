package ss17_IO_binaryFile_serialization.exercise.ex2;

import ss17_IO_binaryFile_serialization.exercise.ex2.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Linh", "Ham Nghi"));
        studentList.add(new Student(2, "Li", "Tan Da"));
        studentList.add(new Student(3, "Lin", "Hung Vuong"));
        studentList.add(new Student(4, "Ly", "Le Duan"));
        studentList.add(new Student(5, "Lan", "Ly Thai To"));
        writeDataToFile("student1.txt", studentList);
        System.out.println("copy is completed");
    }
    public static void writeDataToFile(String path, List<Student> studentList) {
        File file;
        try {
            file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
            fos.close();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
