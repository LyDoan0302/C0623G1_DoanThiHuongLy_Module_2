package ss08_MVC_student_management_app.repository.impl;

import ss08_MVC_student_management_app.model.Student;
import ss08_MVC_student_management_app.repository.IPersonRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IPersonRepositoryImpl {
    private final List<Student> studentList = new ArrayList<>();
    {
        studentList.add(new Student("001", "Ly", "03/02/1989", false, "C0623G1", 9));
        studentList.add(new Student("002", "Lan", "04/02/2000", false, "C0523G1", 10));
        studentList.add(new Student("003", "Linh", "05/02/2021", false, "C0423G1", 8));
        studentList.add(new Student("004", "Le", "03/06/1990", false, "C0623G5", 9));
        studentList.add(new Student("005", "Thy", "08/12/1999", false, "C0623G1", 8));
        studentList.add(new Student("006", "My", "24/11/2016", false, "C0623G3", 10));
    }


    @Override
    public void add(Object object) {
        studentList.add((Student) object);
    }

    @Override
    public void remove(String id) {
        for(Student stu : studentList) {
            if(stu.getId().equals(id)) {
                studentList.remove(stu);
            }
        }

    }


    public boolean isExist(Object student) {
        Student std = (Student) student;
        String id = std.getId();
        for(Student stu: studentList){
            if(stu.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Student> display() {
        return this.studentList;
    }
}
