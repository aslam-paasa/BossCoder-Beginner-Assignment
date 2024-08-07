package _16_Searching;

public class _08_Search_Insert_Position {
    public static void main(String[] args) {
        /**
         * Approach: Binary Search + Lower Bound
         * => TC: O(log n)
         * => SC: O(1)
         * 
         * Example-1:
         * => arr[] = {1,2,4,7}, x = 6
         * => idx=3
         * 
         * Explanation:
         * => 6 is not present in the array.
         * => So, if we will insert 6 in the 3rd index(0-based indexing),
         *    the array will still be sorted. {1,2,4,6,7}.
         * 
         * Example-2:
         * => arr[] = {1,2,4,7}, x = 2
         * => idx=1
         * 
         * Explanation:
         * => 2 is present in the array and so we will return its index i.e. 1.
         * */ 

        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int ind = searchInsert(arr, x);
        System.out.println("The index is: " + ind);
    }

    public static int searchInsert(int [] arr, int x) {
        int n = arr.length; // size of the array
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
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
