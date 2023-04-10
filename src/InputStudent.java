class InputStudent extends Person {
    private int id;
    private String school;

    public InputStudent(String name, String dob, String address, int id, String school) {
        super(name, dob, address);
        this.id = id;
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public String getSchool() {
        return school;
    }
}
