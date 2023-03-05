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
Output:
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 
    

