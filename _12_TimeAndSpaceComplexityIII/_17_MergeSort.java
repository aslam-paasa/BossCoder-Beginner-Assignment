package _12_TimeAndSpaceComplexityIII;

import java.util.Scanner;

public class _17_MergeSort {
    /**
     * Merge Sort: Recursive Algorithm
     * => arr[] = [5, 4, 9, 3, 1, 8, 2, 7]
     * 
     * Step-1: Divide and Conquer:
     * => Adhe element ek taraf bhej do aur wo sort ho k aaenge
     *    [5, 4, 9, 3] => [3, 4, 5, 9]
     * => Adhe element dusri taraf bhej do aur wo sort ho k aaenge
     *    [1, 8, 2, 7] => [1, 2, 7, 8]
     * => Aur humne ek question solve kiya hua hai "Merge two sorted arrays".
     *    To inn dono sorted arrays ko merge kr denge:
     *    [1, 2, 3, 4, 5, 6, 7, 8, 9]
     * 
     * Note: Divide and Conquer means adha idhar bhej diya aur adha
     *       udhar, dono tarf se jawab aaya to dono ko jod diya.
     *       It's not necessary ki isse recursion se hi kiya jae.
     * */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        arr = mergeSort(arr, 0, arr.length-1);

        /**
         * Print the merge sort array:
        */
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println(".");
    }

    public static int[] mergeSort(int[] arr, int low, int high) {

        /**
         * Base Case:
        */
        if(low == high) {
            int[] base = new int[1];
            base[0] = arr[low];
            return base;
        }

        int mid = (low + high) / 2;

        /**
         * First half array sort ho k aaega:
        */
        int[] firstSortedHalf = mergeSort(arr, low, mid);

        /**
         * Second half array sort ho k aaega:
        */
        int[] secondSortedHalf = mergeSort(arr, mid+1, high);

        /**
         * Full Sorted array:
         * => Concept of Merge two sorted arrays
        */
        int[] fullSortedArray = mergeTwoSortedArrays(firstSortedHalf, secondSortedHalf);
        return fullSortedArray;
    }

    private static int[] mergeTwoSortedArrays(int[] firstSortedHalf, int[] secondSortedHalf) {
        /**
         * Merged Array:
        */
        int[] ans = new int[firstSortedHalf.length+secondSortedHalf.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < firstSortedHalf.length && j < secondSortedHalf.length) {
            if(firstSortedHalf[i] <= secondSortedHalf[j]) {
                ans[k] = firstSortedHalf[i];
                i++;
                k++;
            } else {
                ans[k] = secondSortedHalf[j];
                j++;
                k++;
            }

            if(i == firstSortedHalf.length) {
                while(j < secondSortedHalf.length) {
                    ans[k] = secondSortedHalf[j];
                    j++;
                    k++;
                } 
            } else if(j == secondSortedHalf.length) {
                while(i < firstSortedHalf.length) {
                    ans[k] = firstSortedHalf[i];
                    i++;
                    k++;
                }
            }
        }
        return(ans);
    }
}
