package _06_TimeAndSpaceComplexity;

import java.util.Scanner;

public class _19_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => i = 0 -> 0 -> 0 -> 0 ....
         * => TC: Undefined because of infinite loop
         */

        for (int i = 0; i < n; i*=8) {
            System.out.println(i + " ");
        }
    }
}
