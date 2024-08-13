package _07_Array_I;

public class _31_PrefixSum {
    public static void main(String[] args) {
        int[] arr = {6, -3, 4, 5, -8, 1};
        int n = arr.length;
        
        /**
         * Theory: O(n^2)
         * 
         * Find max subarray sum using prefix sum.
         * 
         * Prefix sum is the sum of all elements up to a given index.
         * It can be used to find the sum of any subarray in O(1) time.
         * 
         * Example:
         * arr[] = [1, -2, 6, -1, 3]
         * 
         * Step 1: Calculate prefix sum array:
         * (a) i = 0, Sum = 1
         * (b) i = 1, Sum = 1 + (-2) = -1
         * (c) i = 2, Sum = -1 + 6 = 5
         * (d) i = 3, Sum = 5 + (-1) = 4
         * (e) i = 4, Sum = 4 + 3 = 7
         * 
         * preSum[] = prefix[i-1] + arr[i] 
         * preSum[] = [1, 1-2, 1-2+6, 1-2+6-1, 1-2+6-1+3]
         *          = [1, -1, 5, 4, 7]
         * 
         * Step 2: Use prefix sum formula to find sum of subarray
         * sum = preSum[end] - preSum[start-1]
         * 
         * Example subarray: [-2, 6, -1]
         * sum = preSum[3] - preSum[0] = 4 - 1 = 3
         */
        
        // Calculate prefix sum array
        int[] preSum = new int[n];
        preSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i-1] + arr[i];
        }
        
        // Find maximum subarray sum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = preSum[j];
                if (i != 0) {
                    sum -= preSum[i-1];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }   
        System.out.println("Maximum subarray sum: " + max);
    }    
}