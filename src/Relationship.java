public class Relationship {
    public static void main(String[] args) {
        Person person = new Person("Robin", "2000-01-01", "Dhaka");

        Student student = new Student("Ishtiaq", "2003-05-05", 221311086, "Rajshahi");
        student.setSchool("Varendra University");

        Doctor doctor = new Doctor("Solaiman", "1995-12-31", "Dhaka", "Dr", 200.0);
        doctor.setSchool(" Dhaka Medical College");

        Engineer engineer = new Engineer("Safwan", "1990-03-15", "Bangladesh", "BSC", 10);
        engineer.setSchool("ABC Engineering School");

        System.out.println("**Person Details**");
        System.out.println("Name: " + person.getName());
        System.out.println("DOB: " + person.getDob());
        System.out.println("Address: " + person.getAddress());

        System.out.println("\n**Student Details**");
        System.out.println("Name: " + student.getName());
        System.out.println("DOB: " + student.getDob());
        System.out.println("Address: " + student.getAddress());
        System.out.println("ID: " + student.getId());
        System.out.println("School: " + student.getSchool());

        System.out.println("\n**Doctor Details**");
        System.out.println("Name: " + doctor.getName());
        System.out.println("DOB: " + doctor.getDob());
        System.out.println("Address: " + doctor.getAddress());
        System.out.println("Degree: " + doctor.getDegree());
        System.out.println("Consultation Fee: " + doctor.getConsultationFee());
        System.out.println("School: " + doctor.getSchool());

        System.out.println("\n**Engineer Details**");
        System.out.println("Name: " + engineer.getName());
        System.out.println("DOB: " + engineer.getDob());
        System.out.println("Address: " + engineer.getAddress());
        System.out.println("Degree: " + engineer.getDegree());
        System.out.println("Experience: " + engineer.getExperience());
        System.out.println("School: " + engineer.getSchool());
    }
}