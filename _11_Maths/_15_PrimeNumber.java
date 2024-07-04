package _11_Maths;

import java.util.Scanner;

public class _15_PrimeNumber {
    public static void main(String[] args) {
        /**
         * 3. Trial Division without Optimization:
         * => Outer Loop (t-times), where t is the no of test cases.
         * => Inner Loop (n/2), which is half of the input number n.
         * => Since the inner loop is nested inside the outer loop, the TC:
         *    (a) O(t)
         *    (b) O(n/2) 
         * => TC: O(t * n/2) = O(t * n) => O(n^2)
         * 
         * Note: Good for handling multiple test cases. 
         */
        
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 1; i <= t; i++) {
            int x = scn.nextInt();

            boolean isPrime = isPrime(x);

            if (isPrime) {
                System.out.println(x + " is a prime number");
            } else {
                System.out.println(x + " is not a prime number");
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}