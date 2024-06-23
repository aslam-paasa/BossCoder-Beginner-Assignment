package _03_Loops;

import java.util.Scanner;

public class _25_Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // N = 5 => 5 * 4 * 3 * 2 * 1 = 120

        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
