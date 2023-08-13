package ss08_MVC_student_management_app.model;

public class Student extends Person{
    private String className;
    private int point;

    public Student (String id, String name, String dateOfBirth, boolean gender, String classname, int point) {
        super(id, name, dateOfBirth, gender);
        this.className = classname;
        this.point = point;

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        className = className;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
