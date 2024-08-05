package Recursion;

import java.util.Scanner;

public class _02_Reverse_Counting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();

        printCounting(n);
    }

    public static void printCounting(int n) {
        /**
         * 1. Base Case
         * */
        if(n == 0) {
            return;
        }

        /**
         * 2. Processing: 
        */
        System.out.print(n + " ");

        /**
         * 3. Recursive Relation:
        */
        printCounting(n-1);

        /**
         * 2. Processing: Recursive Stack => Last In First Out
        */
        System.out.print(n + " ");
    }
}
