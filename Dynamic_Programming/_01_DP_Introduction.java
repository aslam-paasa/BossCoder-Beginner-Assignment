package Dynamic_Programming;

public class _01_DP_Introduction {
    public static void main(String[] args) {
        /**
         * Dynamic Programming:
         * => Dynamic Programming is mainly an optimization over plain recursion.
         * => Whenever we see a recursive solution that has repeated calls for
         *    same inputs, we can optimize it using Dynamic Programming.
         * => The idea is to simply store the result of subproblems, so that we
         *    don't have to recompute them when needed later.
         * => This simple optimization reduces the time complexities from
         *    exponential(2^n => for recursion) to polynomial (O(n) => Linear).
         * 
         * => For example, if we write simple recursion solution for fibonacci
         *    numbers, we get exponential time complexity & if we optimize it
         *    by storing solutions of subproblems, time complexity reduces to
         *    linear. (Agar hum memoization ka use karte hau to TC ho jaegi O(n)
         *    from 2^n).
         * */ 
    }
}
