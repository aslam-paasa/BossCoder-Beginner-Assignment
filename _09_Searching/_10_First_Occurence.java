package _09_Searching;

public class _10_First_Occurence {
    public static void main(String[] args) {
        /**
         * Q. Find the first occurrence of an element?
         * => arr = [1, 3, 4, 4, 4, 4, 4, 6, 7, 9]
         *           0  1  2  3  4  5  6  7  8  9
         * => target = 4
         * => Humein btana hai ki 4 ki 1st occurrence kn si index per hai.
         * 
         * 1. First Occurence:
         * => Idx-3
         * 
         * 2. Last Occurence:
         * => Idx-6
         * 
         * TC: O(log n)
         * */ 

        int[] arr = {1, 3, 4, 4, 4, 4, 6, 7};
        int target = 4;

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                /**
                 * Store ans and then search left
                 * */ 
                ans = mid;
                end = mid - 1;
            } else if(target > arr[mid]) {
                /**
                 * Search right
                 * */ 
                start = mid + 1;
            } else if(target < arr[mid]){
                /**
                 * Search left
                 * */ 
                end = mid - 1;
            }
        }
        System.out.println("First Occurrence of target-4 found at index: " + ans);
    }
}
