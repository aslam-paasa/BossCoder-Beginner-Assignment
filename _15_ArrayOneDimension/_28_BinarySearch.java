package _15_ArrayOneDimension;

public class _28_BinarySearch {
    public static void main(String[] args) {
        
        /**
         * Prerequisite - Sorted Arrays
         * => [1,2,3,4,5,6,7]
         * => [2,4,6,8,10,12,14], key=10
         * 
         * Logic:
         *    start=0, end=n-1
         *    while(start<=end) {
         *       find mid (start + end) / 2
         *       compare mid & key
         *          mid == key // Found
         *          mid > key  // Left
         *          mid < key  // Right
         *    }
         * 
         * TC: Based on Iteration : O(log n)
         * 1. Iteration-1 = n/2^0 (0)
         * 2. Iteration-2 = n/2^1
         * 3. Iteration-3 = n/2^2
         * ...
         * ...
         *   1            = n/2^k = 1
         * 
         * => n/2^k = 1
         * => n = 2^k
         * => k = logn base-2
        */
            int numbers[] = {2,4,6,8,10,12,14};
            int key = 10;

            System.out.println("Index for key is : " + binarySearch(numbers, key));

    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if(numbers[mid] == key) { // found
                return mid;
            } 
            if(numbers[mid] < key) { // right
                start = mid + 1;
            } 
            else { // left
                end = mid - 1;
            }
        }
        return -1;
    }
}
