package _03_Loops;

import java.util.Scanner;

public class _42_OddNumberSum {
    // Arithmetic Progression => 1 + 3 + 5 + 7 + 9 + (2n - 1)
    // Formula: 
    // Sn = n/2(a + l)
    //    = n/2(1 + 2n-1)
    //    = n/2 * 2n
    //    = n^2

    // n => 2 => 1 + 3 = 4
    // n => 5 => 1 + 3 + 5 + 7 + 9 = 25
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int ans  = 0;
        for(int i = 1; i < 2*n; i+=2) {
            ans += i;
        } 
        System.out.println(ans);
    }
}
