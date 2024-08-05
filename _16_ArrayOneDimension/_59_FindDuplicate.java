package _16_ArrayOneDimension;

public class _59_FindDuplicate {
    public static void main(String[] args) {
        /**
         * Approach-3: Positioning Method
         * Input: [1, 3, 4, 2, 2]
         * (a) 1 should be at index-1, qki 1 likha hai
         *     Swap element 1 with index-1: [3, 1, 4, 2, 2]
         * (b) 3 should be at index-3
         *     Swap 3 element with index-3: [2, 1, 4, 3, 2]
         * (c) 2 should be at index-2
         *     Swap element 2 with index-2: [4, 1, 2, 3, 2]
         * (d) 4 should be at index-4:
         *     Swap element 4 with index-4: [2, 1, 2, 3, 4]
         * (e) 2 should be at index-2.
         *     But 2 is already at index-2 => extra element
         * 
         * Note: Ek array m sirf first duplicate find kr skte hai.
         *     
         * */ 

        int[] nums = {3, 1, 3, 4, 2};

        /**
         * Positioning Method:
         * Swap elements until the first duplicate is found
         */
        while (nums[0] != nums[nums[0]]) {
            int temp = nums[nums[0]]; // Save the target value
            nums[nums[0]] = nums[0];  // Place the value at the correct index
            nums[0] = temp;           // Update the value at index 0
        }

        /**
         * Print the first duplicate element
         */
        System.out.println(nums[0]);
    }
}
