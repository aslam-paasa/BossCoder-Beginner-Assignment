package _15_Sorting;

import java.util.Scanner;

public class _07_Calculate_Polynomial {
    public static void main(String[] args) {
        /**
         * Polynomial function: O(n)
         * => 1.x^n + 2.x^(n-1) + 3.x^(n-2) + ... + n.x^1
         * 
         * Q. Calculate polynomail jisme hum (x, n) pass krnge? 
         *    But TC should be O(n)?
         * => For example, agar hum pass krte (10, 3) to humaara polynomail
         *    hota:
         *    => 1.10^3 + 2.10^2 + 3.10^1
         *    => 1000 + 200 + 30
         *    => 1230
         * 
         * Input: x = 10, n = 3
         * Output: 1230 
         * */ 
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        int coefficient = n;
        int powerOfX = x;
        int ans = 0;

        while(coefficient >= 1) {
            int term = coefficient * powerOfX;
            ans += term;
            coefficient--;
            powerOfX = powerOfX * x;
        }

        System.out.println(ans);
    }
}
