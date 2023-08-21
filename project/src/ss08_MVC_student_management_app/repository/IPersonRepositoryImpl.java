package ss08_MVC_student_management_app.repository.impl;

import ss08_MVC_student_management_app.model.Student;

public interface IPersonRepositoryImpl<T> {
    void add(T object);
    void remove(int id);
    void display(T object);
}
