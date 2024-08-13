package _21_Two_Pointers_And_Sliding_Window;

public class _05_Shortest_Window {
    /**
     * 4. Shortest/Minimum Window/Length <condition>
     * => Rare Question
     * => We will take 'l' & 'r' and we are 'r' and this turns out
     *    to be a valid window. I am looking for a minimum size.
     * => Once I got a valid window what I try to do is, I try to
     *    shrink(l) and check is this a valid window or not. And
     *    the shortest shrinked window whichever is valid is stored
     *    as an answer.
     * 
     * Approach:
     * 1. Use a sliding window approach with two pointers, l and r, to track the current subarray.
     * 2. Algorithm:
     *    (a) Initialize l, r, minLength to 0, and minWindow to an empty array.
     *    (b) Iterate over the array with a while loop.
     *    (c) Expand the window by adding elements to the right (r).
     *    (d) Check if the current window satisfies the condition.
     *    (e) If it does, shrink the window by removing elements from the left (l) and update minLength and minWindow if the current window is smaller.
     *    (f) Continue expanding and shrinking the window until r reaches the end of the array.
    */


    public static void main(String[] args) {

    }
}
