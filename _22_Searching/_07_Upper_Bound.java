package _22_Searching;

public class _07_Upper_Bound {
    public static void main(String[] args) {
        /**
         * Upper Bound:
         * https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
         * => The first index in a sorted array where the value at the
         *    index is greater than the key.
         * => arr[ind] > x
         * 
         * Approach: Binary Search
         * => TC: O(n)
         * => SC: O(1)
         * */ 
        int[] arr = {3, 5, 8, 9, 15, 19};
        int n = 6, x = 9;
        int ind = upperBound(arr, x, n);
        System.out.println("The upper bound is the index: " + ind);
    }

    public static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
}
