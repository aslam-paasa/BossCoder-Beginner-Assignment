package _11_TimeAndSpaceComplexityIII;

import java.util.Scanner;

public class _04_BubbleSort {
    public static void main(String[] args) {


        /**
         * Bubble Sort: O(n^2)
         * - sends larger elements to the end
         * - brings smaller elements to the front
         * 
         * Working principle:
         * - combination of for-loop, swapping, and pointer
         * 
         * Note:
         * - for 'n' elements, maximum 'n-1' comparisons are required
         * - to move the largest element to the last position
         * 
         * Logic:
         * boolean flag = false
         * for round-1 to n-1
         *     for i->0 to n-round-1
         *         if(a[i] > a[i+1]) 
         *           swap(a[i], a[i+1]);
         *           flag = true;
         * 
         * if(flag == false)
         *    break;
         */


        /**
         * Get the input from the user
         * */
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter Input Length : ");
        int n = scn.nextInt();

        System.out.print("Enter Input : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println();

        /**
         * Sort the array
         * */ 
        bubbleSort(arr);

        System.out.println();

        /**
         * Print the array
        */
        System.out.print("Sorted Elements are : ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void bubbleSort(int[] arr) {
        /**
         * We need to repeat the sorting process until no more swaps are needed.
         * This flag will help us track that.
         */
        boolean swapped;

        /**
         * We need to repeat the process for each element in the array
         */
        System.out.println("List of numbers swapped: ");
        for (int itr = 1; itr <= arr.length - 1; itr++) {
            swapped = false; // flag to check if any swaps were made

            /**
             * Compare each pair of adjacent elements
             */
            for (int j = 0; j < arr.length - itr; j++) {

                /**
                 * If the current element is greater than the next one, swap them
                 */
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                    swapped = true; // set flag to true if a swap is made
                }
            }

            /**
             * If no swaps were made in this pass, the array is sorted!
             */
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Swap the values of two elements in the array(i & j)
     */
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
