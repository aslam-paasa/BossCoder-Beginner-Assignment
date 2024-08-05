package _13_TimeAndSpaceComplexityII;

import java.util.Scanner;

public class _82_FindComplexity {
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
