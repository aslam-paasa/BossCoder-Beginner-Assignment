package _05_Maths;

import java.util.Scanner;

public class _04_PrintAllDigitOfInteger {
    public static void main(String[] args) {
        /**
         * Print all digits of an Integer:
         * N = 1234
         * 
         * 1. N%10 = Remainder    2. Set quotient as N 
         *    => 1234%10 = 4         => N = 1234/10
         * 
         * Logic:
         * 
         *    while(n > 0) {
         *       ones_place = N%10;   => 1234%10 = 4
         *       syso(ones_place);    => print "4"
         *       n = n/10;            => N = 1234/10 = 123
         *    }
         * 
         * */ 

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number to see its digits");
        int n = scn.nextInt();

        printAllDigits(n);
    }

    public static void printAllDigits(int n) {
        while(n > 0) {
            int onesPlaceDigit = n % 10;
            System.out.println("Digit: " + onesPlaceDigit);
            n /= 10;  // n = n / 10;
        }
    }
}
