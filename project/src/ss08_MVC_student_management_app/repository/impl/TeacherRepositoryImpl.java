package ss08_MVC_student_management_app.repository.impl;

import ss08_MVC_student_management_app.model.Teacher;
import ss08_MVC_student_management_app.repository.IPersonRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements IPersonRepositoryImpl {
    private final List<Teacher> teacherList = new ArrayList<>();
    {
        teacherList.add(new Teacher("001", "Hai", "19/10/1995", true, "Tutor"));
        teacherList.add(new Teacher("002", "Son", "19/05/1996", true, "Coach"));
        teacherList.add(new Teacher("003", "Cong", "19/05/1994", true, "Tutor"));
        teacherList.add(new Teacher("004", "Trung", "19/05/1900", true, "Coach"));
    }
    @Override
    public void add(Object object) {
        teacherList.add((Teacher) object);

    }

    @Override
    public void remove(String id) {
        for(Teacher t: teacherList) {
            if(t.getId().equals(id)) {
                teacherList.remove(t);
            }
        }

    }
    @Override
    public boolean isExist(Object teacher) {
        Teacher tc = (Teacher) teacher;
        String id = tc.getId();
        for(Teacher t: teacherList){
            if(t.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List display() {
        return teacherList;
    }


}
