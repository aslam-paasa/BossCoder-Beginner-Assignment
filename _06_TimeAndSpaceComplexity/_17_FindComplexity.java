package _06_TimeAndSpaceComplexity;

import java.util.Scanner;

public class _17_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => TC: O(log n with base 5)
         */

        for (int i = 1; i < n; i*=5) {
            System.out.println(i + " ");
        }
    }
}
