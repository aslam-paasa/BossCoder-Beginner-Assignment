package _18_ArrayOneDimension;

/**
 * Using Permutation, inverse the array:
 * => https://leetcode.com/problems/build-array-from-permutation/description/ 
 * => Formula: ans[i] = input[input[i]];
 * => TC: O(n)
*/

public class _14_BuildArrayFromPermutation {

    public static int[] inverse(int[] input) {
        int n = input.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            /**
             * ans[i] = input[input[i]], where index = input[i]
             * ans[1] = input[input[1]]
             *        = input[2]
             *        = 1
            */

            ans[i] = input[input[i]];
        }
        return ans;
    }

    public static void main(String[] args) {


        // Test the build function with the provided example
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] result = inverse(nums);

        // Print the result array
        System.out.print("Output: [");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i < result.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println("]");

    }
}

/**
 * Dry Run:
 * => Let's start with the original list (input):
 *    input=[0,2,1,5,3,4]
 * 
 * => We want to create a new list (ans) where each element is found by 
 *    following the rule ans[i] = input[input[i]].
 * 
 * Initial Setup:
 * => Original list(input) = 0, 2, 1, 5, 3, 3
 * => New list (ans): Initially empty, we will fill this step by step.
 * 
 * 
 * Step-by-Step Dry Run:
 * 1. Position 0 (i = 0):
 * => Look at input[0], which is 0.
 * => Now, look at input[0] (again), which is 0.
 * => So, ans[0] = input[0] = 0.
 * => New list (ans): 0, _, _, _, _, _
 * 
 * 2. Position 1 (i = 1):
 * => Look at input[1], which is 2.
 * => Now, look at input[2], which is 1.
 * => So, ans[1] = input[2] = 1.
 * => New list (ans): 0, 1, _, _, _, _
 * 
 * 3. Position 2 (i = 2):
 * => Look at input[2], which is 1.
 * => Now, look at input[1], which is 2.
 * => So, ans[2] = input[1] = 2.
 * => New list (ans): 0, 1, 2, _, _, _
 * 
 * 4. Position 3 (i = 3):
 * => Look at input[3], which is 5.
 * => Now, look at input[5], which is 4.
 * => So, ans[3] = input[5] = 4.
 * => New list (ans): 0, 1, 2, 4, _, _
 * 
 * 5. Position 4 (i = 4):
 * => Look at input[4], which is 3.
 * => Now, look at input[3], which is 5.
 * => So, ans[4] = input[3] = 5.
 * => New list (ans): 0, 1, 2, 4, 5, _
 * 
 * 6. Position 5 (i = 5):
 * => Look at input[5], which is 4.
 * => Now, look at input[4], which is 3.
 * => So, ans[5] = input[4] = 3.
 * => New list (ans): 0,1,2,4,5,3
 * 
 * Final Result:
 * => The new list (ans) after applying the formula is: 
 * => ans = 0,1,2,4,5,3
 *  */ 