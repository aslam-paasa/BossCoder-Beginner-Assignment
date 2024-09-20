package _26_Two_Pointers_And_Sliding_Window;

public class _04_Number_Of_Subarrays {

    /**
     * 3. No of subarrays where <conditions>
     * => This is very different problem
     * => This type of problem will be solved using the pattern-2.
     *    So, it's very important to understand Longest Subarray or
     *    Substring.
     * => It is very difficult to count the no of subarrays.
     * => In this problem we will understand why it is difficult to
     *    understand when to expand and when to shrink.
     * 
     * Approach:
     * 1. Use a sliding window approach with two pointers, l and r, to track the current subarray.
     * 2. Algorithm:
     *    (a) Initialize l, r, and count to 0.
     *    (b) Iterate over the array with a while loop.
     *    (c) Expand the window by adding elements to the right (r).
     *    (d) Check if the current window satisfies the condition.
     *    (e) If it does, increment count and shrink the window by removing elements from the left (l).
     *    (f) Continue expanding and shrinking the window until r reaches the end of the array.
     * 
    */



    public static void main(String[] args) {

    }
}
