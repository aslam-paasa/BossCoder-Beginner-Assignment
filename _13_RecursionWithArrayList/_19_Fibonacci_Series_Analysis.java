package _13_RecursionWithArrayList;

/** 
 * => TC: O(2^n)
 * 
 * Fibonacci Series Exponential Complexity Analysis: 
 * => 0 1 1 2 3 5 8 13 21 34 55 ....
 *    0 1 2 3 4 5 6  7  8  9 10
 */ 


/** 
 * Recursive Analysis:
 * (a) T(n) represents the time complexity of calculating the n-th Fibonacci number.
 * (b) k represents a constant time complexity (e.g., for addition).
 * 
 * The equations are derived from the recursive formula for Fibonacci numbers:
 * T(n) = T(n-1) + T(n-2) + k
 * => This equation says that the time complexity of calculating the n-th 
 *    Fibonacci number is the sum of the time complexities of calculating
 *    the (n-1)-th and (n-2)-th Fibonacci numbers, plus some constant time
 *    complexity k.
 * 
 * => The next equations are derived by repeatedly applying the above 
 *    equation:
 *    T(n) <= T(n-1) + T(n-1) + k (by replacing T(n-2) with T(n-1))
 *    2^0 * T(n) <= k + 2T(n-1) (by multiplying both sides by 2^0) -- (1)
 *    2^1 * T(n) <= k + 2T(n-2) (by replacing T(n-1) with T(n-2) and multiplying both sides by 2^1) -- (2)
 *    ....
 *    ....
 * => The pattern continues, with each equation having a power of 2 multiplied
 *    by T(n) on the left-hand side, and a sum of k and 2T(n-i) on the right-hand
 *    side, where i increases by 1 in each equation.
 * 
 * => The final equation is a sum of all these equations, which simplifies to:
 *    T(n) <= 2^0k + 2^1k + 2^2k + ... + 2^(n-1)k
 * 
 * => This equation represents the total time complexity of calculating 
 *    the n-th Fibonacci number using the recursive formula.
 * 
 * Note: This is an exponential time complexity, which makes the recursive
 *       approach inefficient for large values of n.
*/

public class _19_Fibonacci_Series_Analysis {
    public static int fibRecursive(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        int fibNminOne = fibRecursive(n - 1); // => 34
        int fibNminTwo = fibRecursive(n - 2); // => 21
        int fibN = fibNminOne + fibNminTwo;   // => 10 => 55

        return fibN;
    }
    public static void main(String[] args) {
        int n = 10;
    }
}
