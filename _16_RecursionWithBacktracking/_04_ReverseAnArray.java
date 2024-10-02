package _16_RecursionWithBacktracking;

public class _04_ReverseAnArray {
    /**
     * Functional Way:
     * arr = [1, 2, 3, 4, 2]
     * rev = [2, 4, 3, 2, 1]
     */ 
    
    /** 1. Using Two Pointer:
     * => recursion + swap
     * 
     * f(l, r) {
     *    if(l >= r) {
     *       return
     *    }
     * 
     *    swap(arr[l], arr[r]);
     * 
     *    f(l+1, r-1);
     * }
     * 
     * main() {
     *    arr = [1, 2, 3, 4, 2]
     *    f(0, n-1);
     * }
     * */

    /**
     * 2. Using One Pointer:
     * => i to n-i-1
     * 
     * 1. i = 0
     * => n-i-1 = 5-0-1 => 4
     * => Swap 0 and 4.
     * 
     * 2. i = 1
     * => n-i-1 = 5-1-1 => 3
     * => Swap 1 and 3.
     * 
     * 3. i = 2
     * => n-i-1 = 5-2-1 => 2
     * => Swap 2 and 2 [Stopping Point]
     * 
     * Logic:
     * f(i) {
     *    if(i >= n/2) {
     *       return;
     *    }
     * 
     *    swap(a[i], a[n-i-1]);
     * 
     *    f(i+1);
     * } 
     * 
     * main() {
     *    int n = 5;
     *    f(0);
     * }
    */
    
}
