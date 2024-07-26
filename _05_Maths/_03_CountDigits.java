package _05_Maths;

import java.util.Scanner;

public class _03_CountDigits {
    public static void main(String[] args) {
        
        /**
         * => This program demonstrates counting the number of digits in 
         *    a given number.
         * => Input: 87654
         * => Output: 8
         *            7
         *            6
         *            5
         *            4
         * 
         * Explanation:
         * => In this problem, we need to determine the number of digits in the number '65784383', which is '8'.
         * => Constraints: 1 <= n < 10^9 means we can use the integer data type.
         * 
         * => Example: For the number 453827, the output should be 6 digits.
         *             To achieve this, we use division by 10 to remove the last digit of the number.
         *  
         *              10 | 453827                                          Counter (digit count)
         *              10 | 45282  -> 7 remainder (last digit removed)      1
         *              10 | 4528   -> 2 remainder (last digit removed)      2
         *              10 | 452    -> 8 remainder (last digit removed)      3
         *              10 | 45     -> 2 remainder (last digit removed)      4
         *              10 | 4      -> 5 remainder (last digit removed)      5
         *                 | 0      -> 4 remainder (last digit removed)      6
         * => Continue dividing until the quotient becomes 0, and increment the counter each time.
        */


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to count its digits:");
        int n = scn.nextInt();

        // Initialize the digit counter to 0
        int counter = 0;

        // Continue dividing 'n' by 10 until 'n' becomes 0
        while (n != 0) {
            // Divide 'n' by 10 to get the quotient
            int quotient = n / 10;

            // Update 'n' to the quotient value
            n = quotient;

            // Increment the digit counter
            counter++;
        }

        // Print the total number of digits
        System.out.println("Number of digits: " + counter);
    }
}
