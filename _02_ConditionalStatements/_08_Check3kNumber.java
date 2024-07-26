package _02_ConditionalStatements;
import java.util.Scanner;

public class _08_Check3kNumber {
    public static void main(String[] args) {
        
/* There are some numbers which are called '3K' numbers 
   and there are some numbers which are called '3K+1' numbers,
   and there are some numbers which are called '3K+3' numbers, etc
  
For example, 
    (a) 18 = 3*6, 12 = 3*4 => 3K
    (b) 19 = 3*6+1, 7 = 3*2+1 => 3K+1
    (c) 20 = 3*6+2, 14 = 3*4+2 => 3K+2
    
*/
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        
        // Code here
        if(marks % 3 == 0) {
            System.out.println("3K");
        } else {
            if(marks % 3 == 1) {
                System.out.println("3K+1");
            } else {
                System.out.println("3K+2");
            }
        }
    }
}
