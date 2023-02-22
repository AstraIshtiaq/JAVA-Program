import javax.swing.JOptionPane;

public class ConditionalExample {
    public static void main(String[] args) {
        int age = JOptionPane.showConfirmDialog(null, "Are you 18 years old?");

        if (age == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Yes, you can vote.");
        }
        else if (age == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Sorry, you can't vote.");
        }
    }
}
