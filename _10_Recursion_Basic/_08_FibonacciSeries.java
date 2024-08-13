package _10_Recursion_Basic;

import java.util.Scanner;

public class _08_FibonacciSeries {

    public static int fib(int n) {
        // base case
        if (n == 1) {
            // first term
            return 0;
        }

        if (n == 2) {
            // second term
            return 1;
        }

        // Recursive Relation: f(n-1) + f(n-2)
        int ans = fib(n - 1) + fib(n - 2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(fib(n));

    }
}
