package _12_RecursionWithArrayList;

public class _895_FibonacciNum {
    /**
     * 0th  1st  2nd  3rd  4th  5th  6th  7th ....
     * 0,   1,   1,   2,   3,   5,   8,   13  ....
     * 
     * fib(N) = fib(N-1) + fib(N-2)
     * => This is known as Recurrence Relation. When you write the
     *    recursion in a formula is known as Recurrence Relation.
     * 
     * Find fib(5):
     * => Break it down into smaller problems.  
     * => fibb(5) = fib(5-1)      +              fib(5-2)
     *            = fib(4)        +              fib(3)
     *               |                            |
     *           +---------+               +--------------+
     *      fib(3)   +    fib(2)          fib(2)  +      fib(1)
     *       |             |               |              
     *   +------+      +------+         +------+      
    * fib(2) + fib(1) fib(1) + fib(0) fib(1) + fib(0) 
     *  |
     *  V
     *fib(1) + fib(0) 
     *
     * => The base condition is represented by the answers we already
     *    have.
     * => For example, in this case, we know that fib(0) = 0 & fib(1) = 1.
     *    This is base case.
     * 
     * */ 

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        /**
         * Base Condition
        */
        if( n < 2 ) {
            return n;
        }

        /**
         * Recursive Relation:
        */
        return fib(n-1) + fib(n-2);
    }
}
