package _11_TimeAndSpaceComplexityI;

public class _07_Power {
    /**
     * Q. Find x^n:
     * Teeno logic se same answer aata hai, but teeno
     * ki complexity alag alag hai.
     * 
    */

    /**
     * 1. Logic-1: Power1
     * => Recursively moving from 'n' to 1.
     * => t(n) = t(n-1) + k 
     * => t(n) is propertional to n.
     * => TC: O(n) => Naive Code
    */
    public static int power01(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int xPowNminOne = power01(x, n-1);
        int xPowN = xPowNminOne * x;
        return xPowN;
    }

    /**
     * 2. Logic-2: Power2
     * => Recursively moving half by each iteration.
     * => t(n) = t(n/2) + k 
     * => t(n) is proportional to logn.
     * => TC: O(log n) => Better Code
     * 
     * Dry Run:
     * => x=2, n=5
     * => x^5/2 * x^5/2 * x
     * => x^2 * x^2 * x
     * => 4 * 4 * 2
     * => 32
    */
    public static int power02(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int xPowNbyTwo = power02(x, n/2);
        int xPowN = xPowNbyTwo * xPowNbyTwo;
        /**
         * t(n) = t(n/2) + k
         * 2^19 = 2^9 + 2^9 + 2(extra caculation for odd numbers)
        */
        if(n % 2 == 1) {
            xPowN = xPowN * x;
        }
        return xPowN;
    }

    /**
     * 3. Logic-3: Power3
     * => Looks optimized but worst than naive approach.
     * => TC: O(n)
     * 
     * Proof:
     * 1. Recursive Call Breakdown:
     * => t(n) = power03(x, n/2) * power03(x, n/2) * x;
     * => This indicates that for each recursive call, the function is called twice
     *    with half the exponent and multiplies the result by `x` in some cases.
     * => The term `2^0(t(n)) = 2^1(t(n/2)) + k` starts to break down the number 
     *    of operations in each step, where `k` is a constant for the multiplication.
     * => Essentially, this series tries to capture the cumulative cost of all 
     *    recursive calls. 
     * 
     * => t(n) = power03(x, n/2) * power03(x, n/2) * x;
     * => 2^0(t(n))   = 2^1(t(n/2)) + k (2 equations)
     * => 2^1(t(n/2)) = 2^2(t(n/4)) + 2^1k         
     * => 2^2(t(n/4)) = 2^3(t(n/8)) + 2^2k 
     * => .....
     * => .....
     * => 2^x-1(t(1)) = 2^k-1.k
     * => Sb upar niche katega aur last m bachega:
     *    t(n) = k + 2k + 2^2k + 2^3k + ... + 2^x-1k
     * 
     * 2. Geometric Progression (GP) Analysis:
     * => The formula `t(n) = k + 2k + 2^2k + ... + 2^(log2 n - 1)k` sums up
     *    the total operations performed, expressed as a geometric series.
     * => The sum of a geometric series `a(r^n - 1)/(r - 1)` is used to find 
     *    the sum of all multiplications.
     * => Here, `a` is the initial term (`k`), `r` is the common ratio (`2`), 
     *    and `n` is the number of terms (`log2 n + 1`).
     * 
     * 3. Calculation:
     * => Applying the geometric series sum formula:
     *    
     * GP = a(r^n - 1)/r-1
     *    = k(2^x-1)/2-1
     *    = k(2^x-1)
     * We know from old time, this is: log2 n+1.
     *    = k * (2^log2 n+1 - 1)
     *    = k * (2.2^logn - 1)
     *    = k * (2n - 1) means proportional to n.
     * => This shows that the number of operations grows linearly with `n`,
     *    leading to a time complexity of `O(n)`.
     * 
     * 4. Dry Run:
     * => Suppose `n = 8`, and `k` is a constant time for multiplication.
     * => We would have: `t(8) = k + 2k + 4k + 8k` (breaking down by powers of 2).
     * => Sum: `t(8) = k * (1 + 2 + 4 + 8) = 15k`, proportional to `n`.
     * 
     * TC: O(n)
    */

    public static int power03(int x, int n) {
        if(n == 0) {
            return 1;
        }

        if(n % 2 == 0) {
            return power03(x, n/2) * power03(x, n/2);
        } else {
            return power03(x, n/2) * power03(x, n/2) * x;
        }
    }

    /**
     * 4. Logic-4: Euler Power3 Analysis
    */


    public static void main(String[] args) {
        int x = 2;
        int n = 19;
    }
}
