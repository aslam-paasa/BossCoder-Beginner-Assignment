package _07_Recursion_Basic;

import java.util.Scanner;

public class _07_Factorial {
    /**
     * 1. Expectation: f(5) = 5 * 4 * 3 * 2 * 1
     * 2. Faith      : f(4) = 4 * 3 * 2 * 1
     * 3. EwF        : f(5) = 5 * f(4)
     * */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int fn = factorial(n);
        System.out.println(fn);
    }

    /**
     * 1. Expectation: f(5) = 5.4.3.2.1
     * 2. Faith      : f(4) = 4.3.2.1
     * 3. EwF        : f(5) = 5.f(4)
     */
    public static int factorial(int n) {

        /**
         * Base Case:
        */
        if(n == 0) {
            return 1;
        }

        /**
         * Recursive Relation:
        */
        int fnm1 = factorial(n-1); // n-1.n-2.n-3...3.2.1
        int fn = n * fnm1; // n.n-1.n-2.n-3...3.2.1

        return fn;
    }
}
