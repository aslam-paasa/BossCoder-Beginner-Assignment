package _14_TimeAndSpaceComplexityIII;

import java.util.Scanner;

public class _06_Insertion_Sort {

    /**
     * Insertion Sort: O(n^2)
     * => Insertion Sort ek comparison based sorting technique hai jo
     *    array ko sort karti hai by shifting the element one by one from
     *    an unsorted sub-array to the sorted subarray.
     * => Jaise hi ek iteration hoti hai, tb hi ek element(unsorted) input
     *    m se liya jaata hai and is inserted in the sorted list at the 
     *    correct location.
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /**
         * Size of the array:
        */
        int n = scn.nextInt();
        int[] arr = new int[n];

        /**
         * Taking array input:
        */
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        /**
         * Journey from 1 to n-1: (forward)
        */
        for(int i = 1; i <= arr.length-1; i++) {
            /**
             * Journey from i-1 to 0: (backward - Reverse Bubbling Technique)
             * => Loop reverse chalao aur dekho agar "j" is greater than
             *    "j+1" then do swapping. Repeat the swapping process from
             *    "i-1" to 0.
             * => If "j+1" is greater than "j" then break the inner loop
             *    iteration.
            */
            for(int j = i-1; j >= 0; j--) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } else {
                    break;
                }
            }
        }

        /**
         * Print the Sorted Array:
        */
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

/**
 * Dry Run the code:
 * => [20, 10, 90, 40, 15]
 *      0   1   2   3   4
 * 
 * Q. Journey kitni hai?
 * => Length of Array:
 *    => 5 - 1
 *    => 4
 * 
 * Journey-1:
 * => arr = [20, 10, 90, 40, 15]
 *            0   1   2   3   4
 * => Idx-0 => 20 is already sorted. 
 * => Humaara focus hoga 1st index par ki uski sort krne k liye kaha
 *    insert krna chaiye:
 *    [20, 10]
 *    [10, 20]
 * Note: "j" is greater than "j+1" so we will swap the position. We
 *       will repeat the process until inner loop moves from "i-1" to "0".
 * 
 * Journey-2:
 * => Idx-1 is sorted, ab 90 ko iss tarike se insert karnge ki wo
 *    sorted rahega:
 *    [10, 20, 90]
 *    [10, 20, 90]
 * Note: "j+1" is greater than "j" means element is already sorted.
 *       So, we will break the inner loop iteration.
 * 
 * Journey-3:
 * => Idx-2 tk ka sorted hai, now we will focus on Idx-3 so as to insert
 *    it in such a way that array with Idx-3 is sorted.
 *    [10, 20, 90, 40]
 *    [10, 20, 40, 90]
 * Note: "j" is greater than "j+1" so we will swap the position. We
 *       will repeat the process until inner loop moves from "i-1" to "0".
 * 
 * Journey-4:
 * => Idx-3 tk ka sorted hai. Now we will focus on the 4th index such
 *    that after insertion the array still remains sorted.
 *    [10, 20, 40, 90, 15]
 *    [10, 20, 40, 15, 90]
 *    [10, 20, 15, 40, 90]
 *    [10, 15, 20, 40, 90]
 * Note: "j" is greater than "j+1" so we will swap the position. We
 *       will repeat the process until inner loop moves from "i-1" to "0".
 * 
*/