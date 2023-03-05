public class Pattern7  {
    public static void main(String[] args) {
       int rows = 5;
       for (int i = 1; i <= rows; ++i) {
          int num = 1;
          for (int j = 1; j <= rows-i; ++j) {
             System.out.print("   ");
          }
          for (int j = 1; j <= i; ++j) {
             System.out.print(num + "  ");
             ++num;
          }
          num -= 2;
          for (int j = 1; j <= i-1; ++j) {
             System.out.print(num + "  ");
             --num;
          }
          System.out.println();
       }
    }
 }
 
    

