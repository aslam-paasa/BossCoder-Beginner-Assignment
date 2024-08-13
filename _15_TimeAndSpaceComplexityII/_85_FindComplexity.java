package _15_TimeAndSpaceComplexityII;

import java.util.Scanner;

public class _85_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => TC: O(n)
         */

        for (int i = n; i > 0; i--) {
            System.out.println(i + " ");
        }
    }
}
