package _04_Function;

/**
 * https://leetcode.com/problems/powx-n/description/
*/

import java.util.Scanner;

public class _52_Pow {

    public static int pow(int x, int n) { // 6^4
        int ans = x; // ans=0
        for(int i = 2; i<=n; i++) { // i=4
            ans *= x;               // ans = 6*6*6*6
        }
        return ans;
    }
    public static void main(String[] args) {
        /**
         * Q. Take 2 numbers from the user, x & n. Find x^n (calculate this
         *    without using the inbuilt function).
         * => Input: x=4, N=2
         * => Output: 16
         * => Explanation: 4^2 = 16*/
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = scn.nextInt();
        System.out.println("Enter your power: ");
        int n = scn.nextInt();

        System.out.println("Calculated power is: " + pow(x, n));
    }
}
