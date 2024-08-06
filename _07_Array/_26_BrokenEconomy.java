package _07_Array;

import java.util.Scanner;

public class _26_BrokenEconomy {
    public static void main(String[] args) {

        // Input handling
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();

        // Initialize floor and ceil
        int floor = -1;
        int ceil = -1;

        /**
         * What is Floor and Ceil?
         * 1. Floor: 
         * => The largest number in the array that is smaller than or
         *    equal to the given number.(just smaller)
         * 
         * 2. Ceil: 
         * => The smallest number in the array that is greater than or 
         *    equal to the given number.(just greater)
         */ 
        
        /** Binary Search Approach:
         * 1. Initialize left and right pointers to the start and end of the array.
         * 2. Calculate the mid index.
         * 3. If the data is greater than the mid element, update the floor and move the left pointer to mid + 1.
         * 4. If the data is smaller than the mid element, update the ceil and move the right pointer to mid - 1.
         * 5. If the data is equal to the mid element, update both floor and ceil and break the loop.
         * 6. Repeat steps 2-5 until left <= right.
         */

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (data > arr[mid]) {
                // Update floor and move left pointer(discard left)
                floor = arr[mid]; // chote m sbse bda(biggest discarded number)
                left = mid + 1;
            } else if (data < arr[mid]) {
                // Update ceil and move right pointer(discard right)
                ceil = arr[mid];// bade m sbse chota(smallest discarded number)
                right = mid - 1;
            } else {
                // Data found, update both floor and ceil
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }

        // Output floor and ceil
        System.out.println("Floor : " + floor);
        System.out.println("Ceil : " + ceil);
    }
}