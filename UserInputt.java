import java.util.Scanner;
public class UserInputt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        double floatingNum;
        String sentence;

        System.out.println("Enter an Integer: ");
        num = input.nextInt();

        System.out.println("Enter a Float: ");
        floatingNum = input.nextDouble();

        input.nextLine();
        System.out.println("Enter a Line: ");
        sentence = input.nextLine();

        System.out.println(num);
        System.out.println(floatingNum);
        System.out.println(sentence);
    }
}
