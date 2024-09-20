package _12_RecursionWithArrayList;

public class _906_Reverse_a_number {
    /**
     * N = 1824 => 4281
     * 
     * Pattern:
     * Whenever we are asked digit-by-digit problems, in that case we
     * are going to take remainder and divide the number by 10.
     * => f(N) = (N%10) + f(N/10)
     * */

    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);

        System.err.println(rev2(1234));
    }

    /**
     * Way-1: With global variable
     * sum = 0;
     * f(n) {
     *    if(n == 0) {
     *       return;
     *    }
     *    rem = n%10;
     *    sum = sum * 10 + rem;
     *    f(n/10);
     * }
    */
    public static int sum = 0;
    public static void rev1(int n) {
        if(n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    /**
     * Way-2: 
     * 4 + 123
     * 4 * 1000 + 123
     * 4 * 10^3 + 123
     *             |
     *             V
     *            3 * 10^2 + f(12)
     * 
     * f(n, arg) = rem % 10^arg-1 + f(n/10, arg-1)
    */
    public static int rev2(int n) {
        // sometimes you might need some additional variables in the
        // argument in that case, make another function - helperFn()
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    
}
