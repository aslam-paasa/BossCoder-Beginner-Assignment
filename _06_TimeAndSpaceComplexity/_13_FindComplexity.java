package _06_TimeAndSpaceComplexity;

import java.util.Scanner;

public class _13_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => i = 0 -> 5 -> 10 -> 15 -> 20 -> 25 
         * => TC: O(n/5) => O(n)
         */

        for (int i = 0; i < n; i+=5) {
            System.out.println(i + " ");
        }
    }
}
