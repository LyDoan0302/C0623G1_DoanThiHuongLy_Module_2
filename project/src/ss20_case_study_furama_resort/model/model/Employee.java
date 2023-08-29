package ss20_case_study_furama_resort.model.model;

public class Employee extends Person{
    private String academicLevel;
    private String position;
    private double salary;
    public Employee() {}
    public Employee(String id, String name, String birth, String gender, String privateId, String phoneNumber,
                    String email, String academicLevel, String position, double salary) {
        super(id, name, birth, gender, privateId, phoneNumber, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:" +
                super.toString() +
                "academicLevel: '" + academicLevel + '\'' +
                ", position: '" + position + '\'' +
                ", salary: " + salary
                ;
    }
}
