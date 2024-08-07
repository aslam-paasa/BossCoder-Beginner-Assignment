package _16_Searching;

public class _04_Lower_Bound {
    public static void main(String[] args) {
        /**
         * Lower Bound:
         * https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
         * => This algorithms finds the first index in a sorted array
         *    where the value at the index is greater than or equal to
         *    the key element.
         * => arr[ind] >= x
         * 
         * Brute Force Approach: Linear Search
         * => TC: O(n)
         * => SC: O(1)
         * 
         * */
        
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }

    public static int lowerBound(int []arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                // lower bound found:
                return i;
            }
        }
        return n;
    }
}
