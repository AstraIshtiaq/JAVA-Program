public class Student extends Person {
    private int id;
    private String school;

    public Student(String name, String dob, int id, String address) {
        super(name, dob, address);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
