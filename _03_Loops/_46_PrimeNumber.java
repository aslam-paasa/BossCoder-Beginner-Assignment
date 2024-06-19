package _03_Loops;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/count-primes/description/
*/

public class _46_PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 2; i <= n-1; i++) {
            if(n%i == 0) {
                System.out.println(i + " is not prime number");
            } else {
                System.out.println(i + " is prime number");
            }
        }
    }
}
