package _07_Recursion_Basic;

import java.util.Scanner;

public class _08_PowerLinear {
    /**
     * Calculate x raise to the power n.
     * => Example: x^n => 2^5 = 32
     * 
     * Q. Power(2, 5) = 2.2.2.2.2 = 32
     * 
     * 1. Expectation: Power(2, 5) = 2.2.2.2.2
     * 2. Faith      : Power(2, 4) = 2.2.2.2
     * 3. EwF        : Power(2, 5) = Power(2, 4) x 2
     * Note: Here, x is contant and n varies. So, we are multiplying it
     *       5 times.
     */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        int xpn = power(x, n);
        System.out.println(xpn);
    }

    /**
     * 1. Expectation: p(2, 5) = 2.2.2.2.2
     * 2. Faith      : p(2, 4) = 2.2.2.2
     * 3. EwF        : p(2, 5) = p(2, 4).2
    */
    public static int power(int x, int n) {
        /**
         * Base Case:
        */
        if(n == 1) {
            return 1;
        }

        int xpnm1 = power(x, n-1); // x.x... n-1 times
        int xpn = xpnm1 * x; // x.x... n times

        return xpn;
    }
}
