package _06_Pattern;

import java.util.Scanner;

public class _03_Pattern {
    public static void main(String[] args) {
        /**
         * Pattern Problem Rules:
         * 1. Nested Loops
         * 2. Number of times the outer loop runs = no. of rows
         * 3. Number of times the inner loop runs = no. of columns
         * 4. Print the pattern inside inner loop
         * 5. Formulate the inner loop variable's limit(j) in term of outer loop variable(i) and
         * input(n), i.e. j = f(i,n)
         * 
         * N = 5
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * 
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scn.nextInt();

        System.out.println("Here is your pattern: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {  // This part should be dependent on 'i' and/or 'n'
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
