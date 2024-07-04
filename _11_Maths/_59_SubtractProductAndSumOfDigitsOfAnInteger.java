package _11_Maths;

import java.util.Scanner;

public class _59_SubtractProductAndSumOfDigitsOfAnInteger {
    /**
     * Subtract the Product and Sum of Digits of an Integer:
     * => Input: n = 234
     * => Output: 15
     * => Explanation:
     * (a) Products of digits = 2 * 3 * 4 = 24
     * (b) Sum of Digits = 2 + 3 + 4 = 9
     * (c) Result = 24 - 9 = 15
     * Note:
     * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
     */

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            product *= digit; // product = product * digit
            sum += digit; // sum = sum + digit
            n /= 10;
        }
        return (product - sum);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(subtractProductAndSum(n));
    }
}
