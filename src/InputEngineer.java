class InputEngineer extends Person {
    private String degree;
    private int experience;
    private String school;

    public InputEngineer(String name, String dob, String address, String degree, int experience, String school) {
        super(name, dob, address);
        this.degree = degree;
        this.experience = experience;
        this.school = school;
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
}
