package ss08_MVC_student_management_app.repository;

import ss08_MVC_student_management_app.model.Student;
import ss08_MVC_student_management_app.repository.impl.IPersonRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IPersonRepositoryImpl {
    List<Student> studentList = new ArrayList<>();
    {
        studentList.add(new Student("001", "Ly", "03/02/1989", false, "C0623G1", 9));
        studentList.add(new Student("002", "Lan", "04/02/2000", false, "C0523G1", 10));
        studentList.add(new Student("003", "Linh", "05/02/2021", false, "C0423G1", 8));
        studentList.add(new Student("004", "Le", "03/06/1990", false, "C0623G5", 9));
        studentList.add(new Student("005", "Thy", "08/12/1999", false, "C0623G1", 8));
        studentList.add(new Student("006", "My", "24/11/2016", false, "C0623G3", 10));
    }

    @Override
    public void add(Student student) {
        studentList.add((student);
    }


    @Override
    public void remove(int id) {
        studentList.remove(id);

    }

    @Override
    public void display(Object object) {

    }
}
