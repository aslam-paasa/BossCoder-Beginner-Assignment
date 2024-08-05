package _09_RecursionWithArray;

import java.util.Scanner;

public class _03_DisplayArrayInReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        displayArrReverse(arr, 0);
    }

    /**
     * arr = [10, 20, 30, 40, 50]
     * 
     * 1. Expectation: dar(a, 0) = 50, 40, 30, 20, 10
     * 2. Faith      : dar(a, 1) = 50, 40, 30, 20
     * 3. EwF        : dar(a, 0) = dar(a, 1).ar[0]
     *                           = 50, 40, 30, 20, 10
    */

    // idx se end tk ulta print krna hai
    public static void displayArrReverse(int[] arr, int idx) {
        /**
         * Base Case
        */
        if(idx == arr.length) {
            return;
        }

        /**
         * Recursive Relation
        */
        displayArrReverse(arr, idx+1); // idx+1 se end tk ulta print kr do
        System.out.println(arr[idx]);
    }
}
