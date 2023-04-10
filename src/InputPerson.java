public class InputPerson {
    private String name;
    private String dob;
    private String address;

    public InputPerson(String name, String dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }
}
