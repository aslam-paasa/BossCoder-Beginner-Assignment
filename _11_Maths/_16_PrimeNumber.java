package _11_Maths;

import java.util.Scanner;

public class _16_PrimeNumber {
    public static void main(String[] args) {
        /**
         * 4. Trial Division with Square Root Optimization:
         * => This logic is called the "Trial Division" method for checking primality. 
         *    It's a simple and straightforward approach that works by dividing the 
         *    input number by all integers from 2 to the square root of the number, 
         *    and checking if the remainder is 0. If it is, then the number is not prime. 
         *    If no divisors are found, then the number is prime.
         * => This method is not the most efficient way to check for primality, especially 
         *    for large numbers, but it's easy to understand and implement. More efficient
         *    methods like the Sieve of Eratosthenes or the Miller-Rabin primality test 
         *    are often used in practice.
         * 
         * Logic:
         * => Input: n (the number to check for primality)
         *
         *    1. Set div = 2
         *    2. While div * div <= n:
         *       a. If n % div == 0:
         *          Return False (n is not prime)
         *       b. div = div + 1
         *    3. Return True (n is prime)
         * 
         * TC:
         *    (a) Outer Loop: t-times, where t is test cases.
         *    (b) Inner Loop: div*div <= x, which is square of root x.
         *    (c) Since, inner loop nested inside outer loop, the TC:
         *       => O(t) + O(root x) => O(t * root x)
         *       => O(n root n)
         * 
         * Advantage:
         * => Very simple to implement
         * => For numbers up to 10^6, trial division is usually faster.
         * 
         * Disadvantage:
         * => Can be slow for large numbers
         * => Needs to check all the way up to the number itself
         */

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); // no of times we want to check 

        for (int i = 1; i <= t; i++) {
            int x = scn.nextInt();

            boolean isPrime = true;
            int div = 2;
            while (div * div <= x) {
                int r = x % div;

                if (r == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }
            if (isPrime) {
                System.out.println(x + " is a prime number");
            } else {
                System.out.println(x + " is not a prime number");
            }
        }
    }
}
