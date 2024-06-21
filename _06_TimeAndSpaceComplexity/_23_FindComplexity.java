package _06_TimeAndSpaceComplexity;

import java.util.Scanner;

public class _23_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => TC: O(m * log n)
         */

        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j*=2) {
                System.out.println(i+j);
            }
        }
    }
}
