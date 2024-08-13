package _14_TimeAndSpaceComplexityIII;

public class _03_ElementsGreaterThanK {
    /**
     * Q. Given an array of N-elements, find no of elements > k.
     * Q. Find how many elements are greater than k i.e. 2?
     * 
     * => Constraint: 0 < Ai < 10^5
     * => Input: A = [7, 3, 1, 5], k = 2
     * 
     * Note: This logic on sorting only. 
     * So, we will learn sorting elements.
     * 
     * Logic of finding elements from a sorted array::
     *                 0  1  2  3  4
     * Example: arr = [1, 2, 3, 5, 7]
     *                          |
     *                          V
     * => k = 5 => lastIndex - index of 5 => 4 - 3 => 1
     * => k = 2 => lastIndex - index of 2 => 4 - 1 => 3
    */
    public static void main(String[] args) {

        /**
         * Counting elements greater than k:
         * */ 

        int[] arr = { 1, 2, 3, 5, 7 };
        int n = arr.length;
        int[] idx = new int[10]; // assuming max value in arr is less than 10

        /**
         * Create an attendance array:
         * => In attendance array, we store if our array element is present or not.
         * => max of elements + 1 => 8
         * => Here, we will idx[] to store "index" to find if the element 
         *    is present or not. [true/false]
         * 
         * Dry Run: 
         * Go and store the value of 'i' at idx[arr[i]];
         * Iteration-1:
         * => i = 0
         * => arr[i] => arr[0] => 1
         * => idx[1] = 0.
         * 
         * Iteration-2:
         * => i = 1
         * => arr[i] => arr[1] => 2
         * => idx[2] => 1
         * ...
         * ...
         * [-1, 0, 1, 2, -1, 3, -1, 4]
         * 
         * Q. How many elements are greater than k? 
         *            0  1  2  3   4  5   6  7
         * => idx = [-1, 0, 1, 2, -1, 3, -1, 4], [k = 2]
         * => k = lastIndex - index of end
         * => k = [n - 1] - idx[k]
         * => k = [5 - 1] - idx[2]
         * => k =  4 - 1
         *      =  3
         * 
         * TC: O(Sorting) + O(n) + O(Q)
         *     O(n logn)  + O(n) + O(Q)
         *     O(n logn) => dominated by sorting
        */
        for (int i = 0; i < n; i++) {
            idx[arr[i]] = i;
        }


        int q = 2; // query
        int count = n - 1 - idx[q]; // count of elements greater than q

        System.out.println(count + " elements are greater than " + q);
    }
}
