package _14_TimeAndSpaceComplexityII;

import java.util.Scanner;

public class _79_SpaceComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * 1. Time is counting nummber of iterations
         * 2. Space is counting number of elements
         */

        int[] arr = new int[n]; // [_, _, _, ...] => O(n)
        int[] array = new int[n*n]; // [_, _, _, ...] => O(n^2)

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
