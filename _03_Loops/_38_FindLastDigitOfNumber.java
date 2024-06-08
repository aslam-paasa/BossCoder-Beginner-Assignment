package _03_Loops;

import java.util.Scanner;

public class _38_FindLastDigitOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int lastDigit = num % 10;
        System.out.println(lastDigit);
    }
}


/**Use of finding last digit:
 * 1. Validation checks: For example, in certain types of barcodes or 
 *    serial numbers, the last digit can be a check digit used to verify 
 *    the correctness of the entire sequence.
 * 
 * 2. Financial Systems: In banking and finance, the last digit is often used 
 *    in algorithms to verify account numbers, credit card numbers, and other 
 *    financial data.
 * 
 * 3. Cryptography: Some encryption algorithms use properties of the last digit 
 *    in their calculations.
 * 
 * 4. Computer Science Competitions: Many problems in coding competitions involve 
 *    operations with digits, including finding the last digit, reverse of number.
*/