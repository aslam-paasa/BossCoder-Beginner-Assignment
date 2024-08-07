package _07_Array_I;

public class _21_InverseArrayIssue {

    public static int[] inverse(int[] input) {
        int n = input.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            /**
             * ans[i] = input[input[i]], where index = input[i]
             * ans[1] = input[input[0]]
             *        = input[4]
             *        = Error! IndexOutOfBoundsException: No value at index 4
             * 
             * Note: Constraints => 0 <= nums[i] <= nums.length
             */

            ans[i] = input[input[i]];
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = { 4, 2 }; // IndexOutOfBoundsException: No value at index 4
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
