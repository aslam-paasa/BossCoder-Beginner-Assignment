package _13_TimeAndSpaceComplexityII;

import java.util.Scanner;

public class _83_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => i = 0 -> 2 -> 4 -> 6 -> 8
         * => TC: O(n/2) => O(n)
         */

        for (int i = 0; i < n; i+=2) {
            System.out.println(i + " ");
        }
    }
}
