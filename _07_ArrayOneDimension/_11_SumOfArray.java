package _07_ArrayOneDimension;

/**
 * Sum of an Array:
 * => https://leetcode.com/problems/running-sum-of-1d-array/description/
 * => sum[i] = sum(nums[0]...nums[i])
 * 
 * => Input: nums = [1, 2, 3, 4]
 *    Output: [1, 3, 6, 10]
 * => Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
 * 
 * => TC: O(n^2)
*/

public class _11_SumOfArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4}; // Original array
        int n = input.length; // Length of the original array
        int[] arr = new int[n]; // Array to store the running sum

        /**
         * Corrected the inner loop to correctly compute the running sum.
         * The outer loop will run from 0 to n-1.
         * The inner loop will sum up the values from index 0 to index i.
         */

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) { 
                sum += input[j];
            }
            arr[i] = sum; // Store the running sum in arr
        }
        
        // Print the running sum array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


/**
 * Dry Run:
 * => Initializing a new array arr to store the running sums.
 * => Using nested loops where the inner loop sums up elements from the start of the array to the current index i.
 * => Storing and printing the running sums in the new array.
 * 
 * 
 * 1. Initial Setup:
 * => input = [1, 2, 3, 4]
 * => n = 4
 * => arr = [0, 0, 0, 0] (initialized to store the running sums)
 * 
 * 2. Outer Loop Execution:
 * => Loop through each index i from 0 to n-1 (i.e., 0 to 3).
 * => Iteration 1 (i = 0):
 *         -> sum = 0 (initialize sum)
 *         -> Inner loop runs from 0 to 0 (inclusive):
 *               sum += input[0];
 *               sum = 0 + 1 = 1
 *         -> arr[0] = sum
 *         -> arr[0] = 1
 * 
 *    => arr = [1, 0, 0, 0]
 * 
 * 3. Iteration 2 (i = 1):
 * => sum = 0 (initialize sum)
 * => Inner loop runs from 0 to 1 (inclusive):
 *         -> sum += input[0] → sum = 0 + 1 = 1 
 *         -> sum += input[1] → sum = 1 + 2 = 3
 * => arr[1] = sum 
 *    arr[1] = 3
 * => arr = [1, 3, 0, 0]
 * 
 * 4. Iteration 3 (i = 2):
 * => sum = 0 (initialize sum)
 * => Inner loop runs from 0 to 2 (inclusive):
 *         -> sum += input[0] → sum = 0 + 1 = 1
 *         -> sum += input[1] → sum = 1 + 2 = 3
 *         -> sum += input[2] → sum = 3 + 3 = 6 
 * => arr[2] = sum
 * => arr[2] = 6
 * => arr = [1, 3, 6, 0]
 * 
 * 5. Iteration 4 (i = 3):
 * => sum = 0 (initialize sum)
 * => Inner loop runs from 0 to 3 (inclusive):
 *         -> sum += input[0] → sum = 0 + 1 = 1
 *         -> sum += input[1] → sum = 1 + 2 = 3
 *         -> sum += input[2] → sum = 3 + 3 = 6
 *         -> sum += input[3] → sum = 6 + 4 = 10
 * => arr[3] = sum
 * => arr[3] = 10
 * => arr = [1, 3, 6, 10]
 * 
 * 6. Final Output:
 * => The array arr after computing the running sum is [1, 3, 6, 10].
*/