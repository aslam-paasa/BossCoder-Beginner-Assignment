package _18_ArrayOneDimension;

import java.lang.reflect.Array;

public class _57_FindDuplicate {
    public static void main(String[] args) {
        /**
         * Find Duplicate:
         * Q. Given an array of integers nums containing n+1 integers where
         *    each integer is in the range [1, n] inclusive. This is only
         *    one repeated number in nums, return this repeated number.
         * => Solve without modifying the array nums and use constant space.
         * 
         * Input: nums = [1, 3, 4, 2, 2]
         * Output: 2
         *  => N + 1 = 5 (one extra integer)
         *  => N = 4
         * 
         * Array originally aise dikhni chaiye thi: [1, 3, 4, 2].
         * 
         * Note: Ab hum dhire dhire optimized solution ki aur jaenge.
         * 
         * Approach:
         * 1. Sort: [1, 2, 2, 3, 4] => Agar 'i' & 'i+1' same hue to element duplicate hai.
         * 
         * Example-1:
         *    [1, 2, 2, 3, 4]
         *     i i+1             =>[i != i+1] = [1 != 2]
         *    [1, 2, 2, 3, 4]
         *        i i+1          =>[i == i+1] = [2 == 2] => 2 is duplicate.
         * 
         * Example-2:
         *    [2, 3, 1, 4, 2]
         *    [1, 2, 2, 3, 4] (Sort)
         *     i i+1             =>[i != i+1] = [1 != 2]
         *    [1, 2, 2, 3, 4]
         *        i i+1          =>[i == i+1] = [2 == 2] => 2 is duplicate.
         * TC: O(n log n) 
         * SC: O(n) => Not efficient, because we are using extra space.
         * */ 

        // int[] arr = {2, 3, 1, 4, 2}; // Sorting
        int[] nums = {1, 2, 2, 3, 4};

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                System.out.println(nums[i]);
                // return nums[i];
            }
        }
        // return -1;
        
    }
}
