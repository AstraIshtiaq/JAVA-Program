import java.util.Scanner;
import java.lang.Math;
public class Calculator {
    public static double add(double x, double y) {
        return x + y;
    }
    public static double sub(double x, double y) {
        return x - y;
    }
    public static double mul(double x, double y) {
        return x * y;
    }
    public static double div(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Invalid division by zero");
        }
        return x / y;
    }
    public static double sin(double a) {
        return Math.sin(a);
    }
    public static double cos(double a) {
        return Math.cos(a);
    }
    public static double tan(double a) {
        return Math.tan(a);
    }
    public static double pow(double a, int b) {
        double result = 1.0;
        for (int i = 0; i < Math.abs(b); i++) {
            result *= a;
        }
        if (b < 0) {
            result = 1.0 / result;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        
        System.out.println("a + b = " + Calculator.add(a, b));
        System.out.println("a - b = " + Calculator.sub(a, b));
        System.out.println("a * b = " + Calculator.mul(a, b));
        System.out.println("a / b = " + Calculator.div(a, b));
        
        double angle = Math.PI / 4;
        
        System.out.println("sin(" + angle + ") = " + Calculator.sin(angle));
        System.out.println("cos(" + angle + ") = " + Calculator.cos(angle));
        System.out.println("tan(" + angle + ") = " + Calculator.tan(angle));
        
        System.out.print("Enter a number for power: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter an integer for exponent: ");
        int y = scanner.nextInt();
        
        System.out.println(x + " raised to the power of " + y + " is " + Calculator.pow(x, y));
        scanner.close();
    }
}
