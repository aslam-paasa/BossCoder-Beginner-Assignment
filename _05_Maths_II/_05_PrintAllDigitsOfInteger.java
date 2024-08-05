package _05_Maths_II;

import java.util.Scanner;

public class _05_PrintAllDigitsOfInteger {
    public static void main(String[] args) {
        
        /**
         * Question: Find and print the digits of a number, one-by-one.
         * 
         * Explanation:
         * Given a number, we need to print each digit of the number on a new line.
         * Example: For the input number 87654
         * Output:
         * 8
         * 7
         * 6
         * 5
         * 4
         * 
         * To achieve this, we can use division by 10 to isolate each digit, but we 
         * need a different approach to print the digits in the correct order.
         * 
         * Observation:
         * When we divide a number by powers of 10, we can separate it into quotient and remainder.
         * Example:
         * 1000 | 2347 -> Quotient: 2, Remainder: 347
         *  100 |  347 -> Quotient: 3, Remainder: 47
         *   10 |   47 -> Quotient: 4, Remainder: 7
         *    1 |    7 -> Quotient: 7, Remainder: 0
         * 
         * Approach:
         * 1. Find the highest power of 10 that is less than or equal to the number.
         * 2. Use this power of 10 as a divisor to extract each digit starting from the most significant digit.
         * 3. Reduce the divisor by a factor of 10 in each iteration to move to the next digit.
         * 
         * Example:
         * For the number 23475, start with divisor 10000.
         * 10000 | 2 3475 -> Print 2, New number: 3475, New divisor: 1000
         * 1000  | 3 475  -> Print 3, New number: 475, New divisor: 100
         * 100   | 4 75   -> Print 4, New number: 75, New divisor: 10
         * 10    | 7 5    -> Print 7, New number: 5, New divisor: 1
         * 1     | 5 0    -> Print 5
         */
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Step 1: Find the highest power of 10 that is less than or equal to the number
        int div = 1;
        int temp = n;
        while (temp >= 10) {
            temp = temp / 10;
            div *= 10;
        }

        // Step 2: Extract and print each digit using the divisor
        while (div >= 1) {
            int q = n / div;    // Quotient (current digit)
            int r = n % div;    // Remainder (remaining number)

            System.out.println(q); // Print the current digit
            n = r;    // Update number to the remainder
            div = div / 10; // Reduce divisor by a factor of 10
        }
    }
}
