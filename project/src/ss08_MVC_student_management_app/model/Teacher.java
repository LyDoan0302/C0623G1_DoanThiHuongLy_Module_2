package ss08_MVC_student_management_app.model;

public class Teacher extends Person {
    private String professional;
    public Teacher() {

    }
    public Teacher (String id, String name, String dateOfBirth, boolean gender, String professional) {
        super(id, name, dateOfBirth, gender);
        this.professional = professional;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", professional='" + this.getProfessional() +
                '}';
    }
}
