package _08_Recursion_Basic;

import java.util.Scanner;

public class _05_PrintIncreasing {
    /**
     * 1. Expectation: 
     *    => printIncreasing(5) = 1, 2, 3, 4, 5
     * 2. Faith:
     *    => printIncreasing(4)
     * 3. Expectation weds Faith:
     *    => printIncreasing(5) = printIncreasing(4).5
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    /**
     * 1. Expectation: pi(5) = 1, 2, 3, 4, 5, ..., n-2, n-1, n
     * 2. Faith: pi(4) = 1, 2, 3, 4, ..., n-2, n-1, n
     * 3. EwF = pi(5) = pi(n-1).5
    */
    public static void printIncreasing(int n) {
        /**
         * Base Case: Do Dry Run
        */
        if(n == 0) {
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
