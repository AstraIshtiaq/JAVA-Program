public class Doctor extends Person {
    private String degree;
    private double consultationFee;
    private String school;

    public Doctor(String name, String dob, String address, String degree, double consultationFee) {
        super(name, dob, address);
        this.degree = degree;
        this.consultationFee = consultationFee;
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

    public void setSchool(String school) {
        this.school = school;
    }
}
