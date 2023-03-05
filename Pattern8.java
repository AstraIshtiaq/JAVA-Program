public class Pattern8  {
    public static void main(String[] args) {
       int rows = 6;
       char alphabet = 'A';
       for (int i = 1; i <= rows; ++i) {
          for (int j = 1; j <= i-1; ++j) {
             System.out.print(" ");
          }
          for (int j = 1; j <= rows-i+1; ++j) {
             System.out.print(alphabet + " ");
             ++alphabet;
          }
          alphabet = 'A';
          System.out.println();
       }
    }
 }
Output:
A B C D E F 
 A B C D E 
  A B C D
   A B C 
    A B 
     A
 
 
 
    

