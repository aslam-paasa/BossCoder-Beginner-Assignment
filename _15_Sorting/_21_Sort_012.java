package _15_Sorting;

import java.util.Scanner;

public class _21_Sort_012 {
    /**
     * arr = [1, 1, 0, 2, 0, 2, 2, 0, 1, 1]
     *     = [0, 0, 0, 1, 1, 1, 1, 2, 2, 2]
     * 
     *        i                          k
     * arr = [1, 1, 0, 2, 0, 2, 2, 0, 1, 1]
     *        j
     * 1. unknown region = i to k [initially]
     * 2. 0's region = 0 to j-1
     * 3. 1's region = j to i-1
     * 4. 2's region = k+1 to end
     * 
     * =>  i <= k
     *        arr[i] == 1
     *           i++;
     *        arr[i] == 0
     *           swap(i, j);
     *           i++;
     *           j++;
     *       arr[i] == 2
     *          swap(i, k);
     *          k--;
    */

    public static void sort012(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        // 0 to j - 1 => is all 0's
        // j to i - 1 => is all 1's
        // i to k     => unknowns
        // K+1 to end => is all 2's 
        while(i <= k) {
            if(arr[i] == 1) {
                i++;
            } else if(arr[i] == 2) {
                swap(arr, i, k);
                k--;
            } else {
                // i.e. it is 0
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        sort012(arr);
        print(arr);
    }
}
