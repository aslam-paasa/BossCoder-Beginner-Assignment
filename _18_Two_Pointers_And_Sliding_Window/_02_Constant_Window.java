package _18_Two_Pointers_And_Sliding_Window;

public class _02_Constant_Window {

        /**
         * Q. Given an array with positive and negative numbers, find the
         *    maximum sum of k consecutive elements.
         * => Array: [-1, 2, 3, 3, 4, 5, -1]
         *    k = 4
         * 
         * => Goal: Find the maximum sum of 4 consecutive elements.
         * 
         * Approach:
         * 1. Initialize two pointers, l (left) and r (right), to the start of the array.
         * 2. Calculate the sum of the first window (l to r).
         * 3. Slide the window to the right by incrementing l and r.
         * 4. Update the sum by subtracting the leftmost element and adding the new rightmost element.
         * 5. Repeat steps 3-4 until r reaches the end of the array.
         * 6. Keep track of the maximum sum found.
         * 
         * Algorithm:
         * 1. for loop: Calculate the sum of the first window (l to r).
         * 2. while loop: Slide the window to the right.
         *    (a)  sum = sum - arr[l] (remove leftmost element)
         *    (b)  l++ (move left pointer to the right)
         *    (c)  r++ (move right pointer to the right)
         *    (d)  sum = sum + arr[r] (add new rightmost element)
         *    (e)  maxSum = max(maxSum, sum) (update maximum sum)
         * 
         * Key Points:
         * (a) Use two pointers, l and r, to represent the window.
         * (b) Slide the window to the right by incrementing l and r.
         * (c) Update the sum accordingly.
         * (d) Keep track of the maximum sum found.
         * */

    public static int maxSumInWindow(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        int n = arr.length;
        int sum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        int l = 0;
        int r = k - 1;

        // Slide the window to the right
        while (r < n - 1) {
            sum = sum - arr[l] + arr[r + 1];
            l++;
            r++;
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;
        System.out.println("Maximum sum in window of size " + k + ": " + maxSumInWindow(arr, k));
    }
}
