import java.util.Scanner;
public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature value:");
        double value = scanner.nextDouble();
        System.out.println("Enter the unit (F for Fahrenheit or C for Celsius):");
        String unit = scanner.next();
        if (unit.equalsIgnoreCase("F")) {
            double celsius = (value - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit = %.2f Celsius", value, celsius);
        } else if (unit.equalsIgnoreCase("C")) {
            double fahrenheit = value * 9 / 5 + 32;
            System.out.printf("%.2f Celsius = %.2f Fahrenheit", value, fahrenheit);
        } else {
            System.out.println("Invalid unit. Please enter F or C.");
        }
        scanner.close();
    }
}
