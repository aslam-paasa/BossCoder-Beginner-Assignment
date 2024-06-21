package _06_TimeAndSpaceComplexity;

import java.util.Scanner;

public class _11_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => TC: O(n^2)
         */

        for (int i = 0; i < n*n; i++) {
            System.out.println(i + " ");
        }
    }
}
