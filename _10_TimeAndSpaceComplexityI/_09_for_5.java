package _10_TimeAndSpaceComplexityI;

public class _09_for_5 {
    public static void main(String[] args) {

        /**
         * Q. What is the time complexity of this single for-loop?
         * => TC: O(n^2)
        */

        /**
         * Explanation:
         * Initialize variables: n = 10, i = 1, j = 1
         * 
         * Iteration 1:
         * => i = 1, j = 1
         * => Do some work (k)
         * => j is incremented to 2 (j > 1 is false, so no reset)
         * 
         * Iteration 2:
         * => i = 1, j = 2
         * => Do some work (k)
         * => j is reset to 1 (j > 1 is true)
         * => i is incremented to 2
         * 
         *  i   j   
         *  1   1   k   
         *  2   1   k   
         *  2   2   k
         *  3   1   k
         *  3   2   k
         *  3   3   k
         *  4   1   k
         *  4   2   k
         *  4   3   k
         *  4   4   k
         *  .....
         *  .....
         *  .....
         * => 1k + 2k + 3k + 4k + .... + nk
         * => k(1 + ... + n)
         * => kn(n+1)/2 proportional to n^2.
         * 
         * Note that j is reset to 1 only when j > 1, and i is incremented
         * only when j is reset.
        */

        int n = 10;
        for(int i = 1, j = 1; i <= n; j++) {
            // do some work k
            if(j > 1) {
                j = 1;
                i++;
            }
        }
    }
}
