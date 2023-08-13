package ss08_MVC_student_management_app.model;

public class Person {
    protected String id;
    protected String name;
    protected String dateOfBirth;
    protected boolean gender;
    public Person() {

    }
    public Person (String id, String name, String dateOfBirth, boolean gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String isGender() {
        if(this.gender) {
            return "male";
        } else {
            return "female";
        }
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
