package _15_Searching;

public class _03_FindXinSortedArray {
    public static void main(String[] args) {
        /**
         * https://leetcode.com/problems/binary-search/
         * 
         * Approach: Two Pointer (Binary Search)
         * => [3, 4, 6, 7, 9, 12, 16, 17]
         *    low                     high
         * 
         * 1. Divide the search space into 2 halves:
         * => In order to divide the search space, we need to find the 
         *    middle point of it. So, we will take a ‘mid’ pointer and 
         *    do the following:
         *       mid = (low+high) / 2 
         * 
         * 2. Step 2: Compare the middle element with the target:
         * => Observe 3 different cases:
         *    (a) arr[mid] == target
         *     => Found the target, return the index.
         * 
         *    (b) target > arr[mid]:
         *     => Target is located at the right half of the array.
         * 
         *    (c) target < arr[mid]:
         *     => Target is located at the left half of the array.
         * 
         * 3. Step 3: Trim down the search space:
         * (a) If target occurs on the left, we should set the high
         *     pointer to 'mid-1'.
         * (b) Similarly, if the target occurs on the right, set the
         *     low pointer to mid+1.
         * 
         * Iteration-1: (target < arr[mid])
         * => [3, 4, 6, 7, 9, 12, 16, 17]
         *    low      mid            high
         * 
         *    mid = (low + high) / 2
         *        = (0 + 7) / 2
         *        = 3
         * 
         * Iteration-2: (target > arr[mid])
         * => [3, 4, 6, 7, 9, 12, 16, 17]
         *   low mid high
         * 
         *    mid = (low + high) / 2
         *        = (0 + 2) / 2
         *        = 1
         * 
         * Iteration-3:
         * => [3, 4, 6, 7, 9, 12, 16, 17]
         *          low      
         *          mid
         *          high
         * 
         *    mid = (low + high) / 2
         *        = (2 + 2) / 2
         *        = 2
         *    target = 6
         * */ 

        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                ans = mid;
                System.out.println(ans);
                break;
            } else if(target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // System.out.println(ans);
    }
}

/**
 * Time Complexity:
 * => If a number 'n' can be divided by 2 for 'x' times:
 *     2^x = n;
 * => Therefore, x = logn (base is 2).
 * => So, overall TC = O(logn)
 * 
*/