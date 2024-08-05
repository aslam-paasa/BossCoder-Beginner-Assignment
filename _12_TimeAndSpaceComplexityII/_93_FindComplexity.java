package _12_TimeAndSpaceComplexityII;

import java.util.Scanner;

public class _93_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => TC: O(m*n)
         */

        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println(i+j);
            }
        }
    }   
}
