package _04_Function;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/fibonacci-number/description/
*/

public class _53_FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Base Case
        if(n == 0) {
            System.out.println(0); // 1st element
        }
        if(n == 1) {
            System.out.println(1); // 2nd element
        }

        // Initialize the first two Fibonacci numbers
        int prevElem = 1;
        int prevToPrevElem = 0;
        int currElem = 0;

        // Compute the nth Fibonacci number
        for (int i = 2; i <= n; i++) {
            currElem = prevElem + prevToPrevElem;
            System.out.println(currElem);
            prevToPrevElem = prevElem;
            prevElem = currElem;
        }
    }
}
