package _16_RecursionWithBacktracking;

public class _06_MultipleRecursionCalls {
    /**
     * Fibonacci Number:
     * 
     * f[0] = 0, f[1] = 1
     * for(i = 2 -> n) {
     *    f[i] = f[i-1] + f[i-2]
     * }
     * 
     * 
     * Fibonacci Logic:
     * f(n) = f(n-1) + f(n-2);
     * 
     * f(n) {
     *    if(n <= 1) {
     *       return n;
     *    }
     * 
     *    last = f(n-1);
     *    secLast = f(n-2);
     *    return last + secLast;
     * }
     * 
     * main() {
     *    int n = 4;
     *    print(f(4));
     * }
     * 
     * Q. How does this work in recursion?
     * => f(n)
     *    (a) First f(n-1) will go and then come back
     *    (b) Then secLast f(n-2) will go and come back
     * So, it happens line-by-line means whichever recursion is
     * at first, it will go and come back and then it will go for
     * the next one.
     * 
     * 1. f(4)
     *    (a) last: f(n-1) = 3
     *        (i) Base Case: Not satisfied
     *        (ii) last: f(2)
     *        (iii) secLast: f(1)
     *        (iv) return last + secLast;
     *    (b) last: f(n-1) = 2
     *        (i) Base Case: Not satisfied
     *        (ii) last: f(1)
     *        (iii) secLast: f(0)
     *        (iv) return last + secLast;
     *    (c) 
     *  
     * */ 
}
