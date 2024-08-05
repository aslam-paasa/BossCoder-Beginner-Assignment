package Dynamic_Programming;

import java.util.Scanner;

public class _02_Fibonacci_Analysis {
    public static void main(String[] args) {
        /**
         * Q. Fibonacci:
         * => Fibonacci Sequence m first 2 numbers given hote hai: 0(idx-0) & 1(idx-1).
         * => fib(2) = fib(0) + fib(1)
         *    fib(n) = fib(n-2) fib(n-1)
         *      idx-2    idx-0    idx-1
         * => fib(n) = fib(n-1) + fib(n-2)
         * */ 

        /**
         * Q. Fibonacci Sequence:
         * => 0 1 1 2 3 5 8 13 21 34
         *    0 1 2 3 4 5 6  7  8  9
         * => Fib(9) = 34
         * 
         * Approach-1: Using Simple Recursion
         * => Recursion:
         *    (a) High Level Thinking:
         *        (i) Expectation
         *        (ii) faith
         *        (iii) Expectation meets faith
         *    (b) Low Level Thinking:
         *        (i) Dry Run & Find the base case
         * 
         * => High Level Thinking: if(n = 9)
         *    (a) Expectation: We expect that fibonacci() function will
         *        give us the value of fibonacci(n).
         *    (b) Faith: Hum faith rkhte hai ki agar fibonacci() function
         *        humein fib return kar skta hai to fibonacci() function
         *        humein fib(n-1) aur fib(n-2) jarur return karega.
         *        => fib(7) = 13
         *        => fib(21)
         *    (c) Expectation meets faith:
         *        So, now if we have fib(n-1) & fib(n-2), we can simply
         *        get fib(n) by adding fib(n-1) & fib(n-2).
         *        => fib(n) = fib(n-1) + fib(n-2)
         *           fib(9) = 13 + 21
         *                  = 34
         * 
         * => Low Level Thinking:
         *    The base case for fibonacci sequence is already given:
         *    => if(n == 0)  or (n == 1)
         *    => fib(n) = n
         * 
         *  
        */

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fib = fib(n);
        System.out.println(fib);
    }

    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fibm1 = fib(n-1);
        int fibm2 = fib(n-2);
        int fibn = fib(n-1) + fib(n-2);
        return fibn;
    }

    /**
     * TC: 2^n (exponential)
     * => But the problem here is, we are making repeated recursive calls
     *    for same input. 
    */
}
