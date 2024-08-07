package _14_TimeAndSpaceComplexityII;

import java.util.Scanner;

public class _97_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => i = 1 -> 1+2 -> 1+2+3 -> 1+2+3+4 -> ..... -> 1+2+3+4+....+k
         * 
         * Q. What will be the value of 'i' when the iteration no is 'k'?
         * => We will stop when: 
         * => k(k+1)/2 > N
         * => k^2 + k > 2N
         * => k^2 > N
         * => k > root N
         * 
         * => TC: O(root N)
         */

        int s = 1;
        int i = 1;

        while (s <= n) {
            i = i + 1; // 4
            s = s + i; // 1+2+3+4
            System.out.println(s);
        }
    }
}
