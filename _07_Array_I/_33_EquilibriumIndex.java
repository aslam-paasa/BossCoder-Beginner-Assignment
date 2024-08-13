package _07_Array_I;

public class _33_EquilibriumIndex {
    /**
     * Concept of Equilibrium Index:
     * +-------------------------------+
     * |   |   |   |   |   |   |   |   |
     * +-------------------------------+
     *   0   1   2   3   4   5   6   7
     * 
     * => An Equilibrium Index is that index over where the sum of all
     *    the elements to its right is equal to the sum of elements
     *    to its left side.
     * 
     * For example:
     * +-------------------------------+
     * | 5 | 5 |-4 | 1 | 2 | 3 | 3 | 1 |
     * +-------------------------------+
     *   0   1   2   3   4   5   6   7
     * <------>EqIdx<------------------>
     *    X                  X
     * 
     * => If Equilibrium Index is 2, means:
     *    sum of elements from idx-0to1    [5+5]       = [10]
     *              ==                       
     *    sum of elements from idx-3to7.   [1+2+3+3+1] = [10]
     * */ 

    /**
     * Example-1
     * Input : A[] = {-7, 1, 5, 2, -4, 3, 0}
     * Output: 3
     * Explanation:
     * => 3 is an equilibrium index, because:
     *    A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
     * 
     * Example-2
     * Input : A[] = {1, 2, 3}
     * Output: -1
    */

    /**
     * Approach-1: Brute Force
     * for(int i = 0; i < n; i++) {
     *    /left sum/
     *    ls = 0;
     *    for(int j = 0; j < i; j++) {
     *       ls = ls + arr[j];
     *    }
     * 
     *    /right sum/
     *    rs = 0;
     *    for(int k = i+1; k < n; k++) {
     *       rs = rs + arr[k];
     *    }
     * 
     *    if(ls == rs)
     *       return i;
     * }
     * return -1;
    */

    /**
     * Approach-2:
     * rs = 0;
     * for(int p = 1; p < n; p++) {
     *    rs = rs + arr[p];
     * }
     * 
     * ls = 0;
     * 
     * for(int i = 1; i < n; i++) {
     *    rs = rs - arr[i];
     *    ls = ls + arr[i-1];
     * 
     *    if(ls == rs) {
     *       return i;
     *    }
     * }
    */

    /**
     * Approach-3: Try Prefix-Suffix Sum yourself
    */
}
