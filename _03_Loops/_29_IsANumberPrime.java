package _03_Loops;

import java.util.Scanner;

public class _29_IsANumberPrime {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Approaches to determine whether a number is prime:

        // Approach 1: Worst Approach
        // Check divisibility with all numbers from 1 to n-1
        // Prime numbers have exactly two factors, 1 and itself
        // Time complexity: O(n)
        
        // Approach 2: Better Approach
        // Check divisibility with numbers from 2 to n/2
        // If no divisor found, the number is prime
        // Time complexity: O(n/2) -> O(n)
        
        // Approach 3: Best Approach
        // Check divisibility with numbers from 2 to sqrt(n)
        // If no divisor found, the number is prime
        // Time complexity: O(sqrt(n))

        // Note: It's sufficient to check up to the square root of n, as beyond that, factors repeat
        
        boolean isPrime = true; // Assume the number is prime initially
        
        // Check divisibility with numbers from 2 to sqrt(n)
        for (int div = 2; div * div <= n; div++) {
            // Check if n is divisible by div
            int remainder = n % div;
            if (remainder == 0) {
                // If divisible, mark the number as non-prime and exit the loop
                isPrime = false;
                break;
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
