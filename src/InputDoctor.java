class InputDoctor extends Person {
    private String degree;
    private double consultationFee;
    private String school;

    public InputDoctor(String name, String dob, String address, String degree, double consultationFee, String school) {
        super(name, dob, address);
        this.degree = degree;
        this.consultationFee = consultationFee;
        this.school = school;
    }

    public String getDegree() {
        return degree;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public String getSchool() {
        return school;
    }
}
