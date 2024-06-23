package _04_Function;

import java.util.Scanner;

public class _53_PrintFibonacciNumbersTillN {
    public static void main(String[] args) {
        
        // The Fibonacci sequence starts with 0 (1st Fibonacci number) and 1 (2nd Fibonacci number).
        // Each subsequent number is the sum of the previous two.
        // Example: 0, 1, 1, 2, 3, 5, 8, ...
        // 0 + 1 = 1 -> 3rd Fibonacci number
        // 1 + 1 = 2 -> 4th Fibonacci number
        // 1 + 2 = 3 -> 5th Fibonacci number
        // 2 + 3 = 5 -> 6th Fibonacci number
        // and so on...
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers to print:");
        int num = scn.nextInt();  // Input: number of Fibonacci numbers to print

        int firstElem = 0;  // 1st Fibonacci number
        int secondElem = 1; // 2nd Fibonacci number

        // Loop to print 'num' Fibonacci numbers
        for (int i = 0; i < num; i++) {
            System.out.println(firstElem); // Print the current Fibonacci number

            int nextElem = firstElem + secondElem;  // Calculate the next Fibonacci number

            // Update the previous two Fibonacci numbers for the next iteration
            firstElem = secondElem;
            secondElem = nextElem;  
        }
    }
}
