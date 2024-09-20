package _23_ArrayOneDimension;

import java.util.HashMap;

public class _63_FirstRepeatingElement {
    public static void main(String[] args) {
        /**
         * Approach: Using Hashing for searching duplicate elements
         * We store the occurrence count of each element in a HashMap.
         * 
         * Time Complexity: O(n)
         * Space Complexity: O(n)
         * 
         * Link: https://www.geeksforgeeks.org/problems/first-repeating-element4018/1
         */ 

        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int n = 7;

        // Unordered HashMap => HashMap Declaration
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        /**
         * Dry Run:
         * 
         * Iterate through the array and populate the HashMap
         * 
         * i = 0, current = 1
         * hash = {1: 1}
         * 
         * i = 1, current = 5
         * hash = {1: 1, 5: 1}
         * 
         * i = 2, current = 3
         * hash = {1: 1, 5: 1, 3: 1}
         * 
         * i = 3, current = 4
         * hash = {1: 1, 5: 1, 3: 1, 4: 1}
         * 
         * i = 4, current = 3
         * hash = {1: 1, 5: 1, 3: 2, 4: 1}
         * 
         * i = 5, current = 5
         * hash = {1: 1, 5: 2, 3: 2, 4: 1}
         * 
         * i = 6, current = 6
         * hash = {1: 1, 5: 2, 3: 2, 4: 1, 6: 1}
         * 
         */

        for (int i = 0; i < n; i++) {
            // Get the current element
            int current = arr[i];
            // If the element is already in the HashMap, increment its count
            if (hash.containsKey(current)) {
                hash.put(current, hash.get(current) + 1);
            } else {
                // Otherwise, add the element to the HashMap with a count of 1
                hash.put(current, 1);
            }
        }

        /**
         * Dry Run:
         * 
         * Iterate through the array to find the first repeating element
         * 
         * i = 0, current = 1
         * hash.get(current) = 1 (not greater than 1, so continue)
         * 
         * i = 1, current = 5
         * hash.get(current) = 2 (greater than 1, so print and exit)
         * Output: 5
         * 
         * Since we found the first repeating element (5), we exit the loop
         * 
         */

        for (int i = 0; i < n; i++) {
            int current = arr[i];
            if (hash.get(current) > 1) {
                System.out.println(current); 
                return; // Exit after finding the first repeating element
            }
        }

        // If no repeating element is found
        System.out.println(-1);
    }
}