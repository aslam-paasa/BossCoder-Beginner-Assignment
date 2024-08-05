package _12_TimeAndSpaceComplexityII;

import java.util.Scanner;

public class _95_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => TC: O(n+m)
         */

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }
}
