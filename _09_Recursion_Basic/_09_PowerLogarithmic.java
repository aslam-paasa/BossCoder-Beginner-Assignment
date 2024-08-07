package _09_Recursion_Basic;

import java.util.Scanner;

public class _09_PowerLogarithmic {
    /** Q. To calculate the power, we are multiplying it 5 times.
     *     Do we have any smarter way?
     * => Yes!
     *
     * Way-1: Linear Formula (Naive)
     *        => x^n  = x.x^n-1
     *        => 2^18 = 2.2^17     
     * 
     * Way-2: Logarithmic Formula (Better)
     * (a) Case-1: If x^n is even
     *     => x^n  = x^n/2 * x^n/2
     *     => 2^18 = 2^9   * 2^9    
     * 
     * (a) Case-2: If x^n is odd
     *     => x^n  = x^n/2 * x^n/2 * x
     *     => 2^18 = 2^9   * 2^9   * 2
     */
    
    
    /** 
     * Q. 2^8
     * 
     * (a) Linear       (b) Logarithmic
     * => 2.2^7 = 256    => 2^8 = 2^4.2^4 = 256
     * => 2.2^6 = 128    => 2^4 = 2^2.2^2 = 16
     * => 2.2^5 = 64     => 2^2 = 2^1.2^1 = 6
     * => 2.2^4 = 32     => 2^1 = 2^0.2^0 = 2
     * => 2.2^3 = 16     TC: O(log2 8) => O(log n+1)
     * => 2.2^2 = 8
     * => 2.2^1 = 4
     * => 2.2^0 = 2
     *  
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        int xpn = power(x, n);
        System.out.println(xpn);
    }

    public static int power(int x, int n) {

        /**
         * Base Case:
        */
        if(n == 0) {
            return 1;
        }

        /**
         * Recursive Relation:
        */
        int xpb2 = power(x, n/2);
        int xpn = xpb2 * xpb2;

        if(n % 2 == 1) {
            xpn = xpn * x;
        }

        return xpn;
    }
}
