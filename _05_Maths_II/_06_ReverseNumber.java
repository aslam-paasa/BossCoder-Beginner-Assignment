package _05_Maths_II;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/reverse-integer/submissions/1289198808/
*/

public class _06_ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // reverse the number - 1234 -> 4321
        int number = scn.nextInt();

        int reverse = 0;
        while (number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}

