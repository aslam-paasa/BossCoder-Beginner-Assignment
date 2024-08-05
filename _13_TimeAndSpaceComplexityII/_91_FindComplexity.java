package _13_TimeAndSpaceComplexityII;

import java.util.Scanner;

public class _91_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => TC: O(log n)
         */

        for (int i = n; i > 0; i=i/2) {
            System.out.println(i + " ");
        }
    }
}
