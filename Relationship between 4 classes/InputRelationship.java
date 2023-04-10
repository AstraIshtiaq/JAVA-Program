import java.util.Scanner;

public class InputRelationship {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter person name:");
            String name = scanner.nextLine();
            System.out.println("Enter person date of birth:");
            String dob = scanner.nextLine();
            System.out.println("Enter person address:");
            String address = scanner.nextLine();
            InputPerson person = new InputPerson(name, dob, address);
            System.out.println();

            System.out.println("Enter student name:");
            name = scanner.nextLine();
            System.out.println("Enter student ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter student school:");
            String school = scanner.nextLine();
            InputStudent student = new InputStudent(name, dob, address, id, school);
            System.out.println();

            System.out.println("Enter doctor name:");
            name = scanner.nextLine();
            System.out.println("Enter doctor date of birth:");
            dob = scanner.nextLine();
            System.out.println("Enter doctor address:");
            address = scanner.nextLine();
            System.out.println("Enter doctor degree:");
            String degree = scanner.nextLine();
            System.out.println("Enter doctor consultation fee:");
            double consultationFee = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter doctor school:");
            school = scanner.nextLine();
            InputDoctor doctor = new InputDoctor(name, dob, address, degree, consultationFee, school);
            System.out.println();

            System.out.println("Enter engineer name:");
            name = scanner.nextLine();
            System.out.println("Enter engineer date of birth:");
            dob = scanner.nextLine();
            System.out.println("Enter engineer address:");
            address = scanner.nextLine();
            System.out.println("Enter engineer degree:");
            degree = scanner.nextLine();
            System.out.println("Enter engineer experience in years:");
            int experience = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter engineer school:");
            school = scanner.nextLine();
            InputEngineer engineer = new InputEngineer(name, dob, address, degree, experience, school);
            System.out.println();

            System.out.println("**Person Details**");
            System.out.println("Name: " + person.getName());
            System.out.println("Date of birth: " + person.getDob());
            System.out.println("Address: " + person.getAddress());
            System.out.println();

            System.out.println("**Student Details**");
            System.out.println("Name: " + student.getName());
            System.out.println("Date of birth: " + student.getDob());
            System.out.println("Address: " + student.getAddress());
            System.out.println("ID: " + student.getId());
            System.out.println("School: " + student.getSchool());
            System.out.println();

            System.out.println("**Doctor Details**");
            System.out.println("Name: " + doctor.getName());
            System.out.println("Date of birth: " + doctor.getDob());
            System.out.println("Address: " + doctor.getAddress());
            System.out.println("Degree: " + doctor.getDegree());
            System.out.println("Consultation fee: " + doctor.getConsultationFee());
            System.out.println("School: " + doctor.getSchool());
            System.out.println();

            System.out.println("**Engineer Details**");
            System.out.println("Name: " + engineer.getName());
            System.out.println("Date of birth: " + engineer.getDob());
            System.out.println("Address: " + engineer.getAddress());
            System.out.println("Degree: " + engineer.getDegree());
            System.out.println("Experience: " + engineer.getExperience() + " years");
            System.out.println("School: " + engineer.getSchool());
        }
    }
}
