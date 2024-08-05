package _09_RecursionWithArray;

import java.util.Scanner;

public class _02_DisplayArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        displayArray(arr, 0);
    }

    /**
     * arr = [10, 20, 30, 40, 50]
     *         0   1   2   3   4
     * 
     * 1. Expectation: 
     * => d(arr, 0) means arr array k index-0 aur uske baad ka
     *    saara array print ho jae:
     *    d(arr, 0) = 10, 20, 30, 40, 50
     * 2. Faith: 
     * => d(arr, 1) means arr array k index-1 aur uske baad ka
     *    saara array print ho jae:
     *    d(arr, 1) = 20, 30, 40, 50
     * 3. EwF:
     * => d(arr, 0) = 10.d(arr, 1)
     *              = 10, 20, 30, 40, 50
    */

    /**
     * 1. Expectation: da(a, v) => a[v] a[v+1] ... a[n-1]
     * 2. Faith: da(a, v+1) => a[v+1] a[v+2] ... a[n-1]
     * 3. EwF: da(a, v) => a[v] da(a, v+1)
    */
    public static void displayArray(int[] arr, int i) {
        /**
         * Base Case:
         * */ 
        if(i == arr.length) {
            return;
        }

        /**
         * Recursive Relation:
        */
        System.out.println(arr[i]);
        displayArray(arr, i+1); // it promises to print everything from i+1 to end
    }
}
