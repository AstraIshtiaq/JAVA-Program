public class Pattern10  {
    public static void main(String[] args) {
       int rows = 4;
       for (int i = 1; i <= rows; ++i) {
          for (int j = 1; j <= rows-i+1; ++j) {
             System.out.print("*");
          }
          for (int j = 1; j <= 2*i-3; ++j) {
             System.out.print(" ");
          }
          for (int j = 1; j <= rows-i+1; ++j) {
             System.out.print("*");
          }
          System.out.println();
       }
    }
 }
output:
* * * * * * *
* * *   * * *
* *       * *
*           *
 
    

