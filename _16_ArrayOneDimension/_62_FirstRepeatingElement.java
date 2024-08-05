package _16_ArrayOneDimension;

public class _62_FirstRepeatingElement {
    public static void main(String[] args) {
        /**
         * Q. Find first repreating element(first occurrence)
         * => Input  = n = 7
         *           = arr = {1, 5, 3, 4, 3, 5, 6}
         *                    0  1  2  3  4  5  6
         * => Output = 2
         * => Note: The position you return should be accoring to 1-based indexing.
         * => Note: If no elements are repeating: -1.
         * 
         * => Explanation:
         *    5 is appearing twice and its first appearance is at index-2
         *    which is less than 3 whose first index is 3.
         * 
         * TC: O(n)
         * SC: O(n)
         * */ 

        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int n = 7;
        /**
         * Approach-1: Nested Searching
         * => Har element ko pakdu aur linearly dekhu kya wo element repeated hai.
        */

        boolean isRepeated = false;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(i+1); // 1-based index
                    isRepeated = true;
                    break; // break the inner loop as we found the first repeating element
                }
            }
            if(isRepeated == true) {
                break;  // break the outer loop as we already found the answer
            }   
        }
        if(isRepeated == false) {
            System.out.println(-1);
        }
    }
}

/**
 * Note: Time Limit Exceeded
 * TC: O(n^2)
 * 
*/
