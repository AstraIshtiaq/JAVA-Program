public class Pattern4  {
    public static void main(String[] args) {
       int rows = 5;
       for (int i = 1; i <= rows; ++i) {
          for (int j = 1; j <= i; ++j) {
             System.out.print((char)(j+64) + " ");
          }
          System.out.println();
       }
    }
 }
output:
A 
A B
A B C
A B C D 
A B C D E
 
    

