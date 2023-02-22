import java.util.Scanner;
public class FindName {
    public static void main(String[] args) {
        String[] names = { "Tokey", "Zahid", "Ashik", "Soton" };
        int[] ids = { 1001, 1004, 1010, 1015 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID: ");
        int id = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("ID not found");
        } else {
            String name = names[index];
            System.out.printf("Name: %s%n", name);
        }
        scanner.close();
    }
}
