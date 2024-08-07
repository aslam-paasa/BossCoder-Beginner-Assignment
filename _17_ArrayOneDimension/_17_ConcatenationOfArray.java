package _17_ArrayOneDimension;

/**
 * Concatenation of array:
 * => https://leetcode.com/problems/concatenation-of-array/description/
 * => Create an array of length 2n, where
 * (a) ans[i] == nums[i], and
 * (b) ans[i+n] == nums[i], for 0 <= i < n (0-indexed)
 * Note: Same as permutation of array(formula is provided).
 */

public class _17_ConcatenationOfArray {

    public static void main(String[] args) {
        int[] input = { 1, 2, 1 };
        int n = input.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = input[i];
            ans[i + n] = input[i];
        }

        // Printing the result array
        System.out.print("Output: [");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}



/**
 * Dry Run:
 * => Let's go through the code with the example input [1, 2, 1].
 * => (a) Initializing a new array of length 2 * n.
 *    (b) Copying each element of the original array to two positions 
 *        in the new array: 
 *        -> once at the same index and once at index + n.
 *    (c) Printing the new concatenated array.
 * 
 * 
 * 1. Initial Setup:
 * => input = [1, 2, 1]
 * => n = 3 (length of the input array)
 * => ans = [0, 0, 0, 0, 0, 0] (new array of length 2 * 3 = 6)
 * 
 * 2. For Loop Execution:
 * => Loop through each index i from 0 to n-1 (i.e., 0 to 2).
 * => Iteration 1 (i = 0):
 *   
 *      (a) ans[i] = input[i];
 *          ans[0] = input[0];
 *          ans[0] = 1
 * 
 *      (b) ans[i + n] = input[i];
 *          ans[0 + 3] = input[0];
 *          ans[3] = 1
 * 
 *       => ans = [1, 0, 0, 1, 0, 0]
 * 
 * => Iteration 2 (i = 1):
 * 
 *      (a) ans[i] = input[i];
 *          ans[1] = input[1];
 *          ans[1] = 2
 * 
 *      (b) ans[i + n] = input[i];
 *          ans[1 + 3] = input[1];
 *          ans[4] = 2
 * 
 *       => ans = [1, 2, 0, 1, 2, 0]
 * 
 * => Iteration 3 (i = 2):
 * 
 *      (a) ans[i] = input[i];
 *          ans[2] = input[2];
 *          ans[2] = 1
 * 
 *      (b) ans[i + n] = input[i];
 *          ans[2 + 3] = input[2];
 *          ans[5] = 1
 * 
 *       => ans = [1, 2, 1, 1, 2, 1]
 * 
 * 3. Final Output:
 * => The new array ans after concatenation is [1, 2, 1, 1, 2, 1]. 
*/