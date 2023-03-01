import javax.swing.JOptionPane;

public class Various2 {
    public static void main(String[] args) {
        String[] names = { "Tokey", "Zahid", "Ashik", "Soton" };
        int[] ids = { 1001, 1004, 1010, 1015 };
        int id=Integer.parseInt(JOptionPane.showInputDialog("Enter ID:"));
        for(int i=0;i<4;i++)
        {
            if(id==ids[i])
            {
                System.out.println("Name of "+id+" is: "+names[i]);
            }
        }
    }
}
