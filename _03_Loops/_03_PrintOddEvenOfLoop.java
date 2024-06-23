package _03_Loops;

import java.util.Scanner;

public class _03_PrintOddEvenOfLoop {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int p = 1;
        while(p <= num) {
            int rem = p % 2;

            if(rem == 0) {
                System.out.println(p + " is even");
            } else {
                System.out.println(p + " is odd");
            }
            p++;
        }
    }
}
