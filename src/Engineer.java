public class Engineer extends Person {
    private String degree;
    private int experience;
    private String school;

    public Engineer(String name, String dob, String address, String degree, int experience) {
        super(name, dob, address);
        this.degree = degree;
        this.experience = experience;
    }

    public String getDegree() {
        return degree;
    }

    public int getExperience() {
        return experience;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}