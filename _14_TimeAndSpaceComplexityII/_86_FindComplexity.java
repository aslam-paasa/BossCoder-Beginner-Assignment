package _14_TimeAndSpaceComplexityII;

import java.util.Scanner;

public class _86_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => i = 100, 98, 96, ...., 1
         * => TC: O(n/2) => O(n)
         */

        for (int i = n; i > 0; i-=2) {
            System.out.println(i + " ");
        }
    }
}
