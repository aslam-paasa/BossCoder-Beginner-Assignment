package _11_TimeAndSpaceComplexityIII;

import java.util.Scanner;

public class _11_Prime_SquareRootOptimization {

        /**
         * Q. Print Prime Numbers till N:
         * 
         * Approach: Square Root Optimization(n) => [2 to root n] 
         * => Time complexity: O(n sqrt(n))
         * => Humein x/2 tk jaane ki v jarurat nhi h square root tk enough h.
         * 
         * Example: Factorization of 36 : 
         *    1 X 36 = 36            36 X 1 = 36 
         *    2 X 18 = 36            18 X 2 = 36
         *    3 X 12 = 36            12 X 3 = 36
         *    4 X 9  = 36            9 X 4  = 36
         *                6 X 6 = 36 
         * Note : n = p*q then p&q cannot be greater then root n.
         * 
         * Note: Agar hm unique factors ki baat kre to uske square root tk hi 
         *       milte h uske baad saare mirror image hai.
         * 
         * 
         * => 35 k liye kare to humein root 6 i.e. 36 k beyond jaane ki jarurat nhi h
         *    Actually humein root 6 tk jaane ki v jarurat nhi h.
         * => Root of 35 :
         *    (a) 2 X
         *    (b) 3 X
         *    (c) 4 X
         *    (d) 5 -> 5.xxx (25) -> 5 se divide ho gya 35 so not a prime
         *    (e) 6 -> 36 (bigger than 35)
         * 
         * =>  Root fo 49 :
         *     (a) 2 X
         *     (b) 3 X
         *     (c) 4 X
         *     (d) 5 X
         *     (e) 6 X
         *     (f) 7 -> 49 is not a Prime

         * =>  Root of 53 :
         *     (a) 2 X
         *     (b) 3 X
         *     (c) 4 X
         *     (d) 5 X
         *     (e) 6 X
         *     (f) 7 X -> Apne half k root tk kisi se divide nhi hua to "prime"
        */

        /** 
         * Advantage:
         * => Square Root approach is much faster for large numbers.
         * => For numbers between 10^6 and 10^12, the square root 
         *    approach is usually faster.
         * 
         * Disadvantage:
         * => Requires calculating the square root, which can be slow for very 
         *    large numbers.
         * => Not as simple to implement as trial division
         * 
        */

        /**
         * Outer-Loop: O(n)
         * => 0 & 1 are both non-prime.
         * => 2 to n tk k digits hi check krnge hum
        */

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int x = 2; x <= n; x++){
            boolean xIsPrime = true;
            /**
             * Inner-Loop: O(root n)
            */
            for(int div = 2; div*div <= x; div++) {
                if(x%div == 0) {
                    xIsPrime = false;
                    break;
                }
            }
            if(xIsPrime == true) {
                System.out.println(x);
            }
        }
    }
}


/** Let's do a dry run of the given code:
 * 
 * Input: n = 30

 * Outer Loop:
 * 1. x = 2
 *    => Inner Loop:
 *       div = 2, div*div = 4, x%div != 0
 *       xIsPrime = true, print 2

 * 2. x = 3
 *    => Inner Loop:
 *       div = 2, div*div = 4, x%div != 0
 *       xIsPrime = true, print 3

 * 3. x = 4
 *    => Inner Loop:
 *       div = 2, div*div = 4, x%div == 0
 *       xIsPrime = false, skip

 * 4. x = 5
 *    => Inner Loop:
 *       div = 2, div*div = 4, x%div != 0
 *       div = 3, div*div = 9, x%div != 0
 *       xIsPrime = true, print 5

 * 5. x = 6
 *    => Inner Loop:
 *       div = 2, div*div = 4, x%div == 0
 *       xIsPrime = false, skip

 * 6. x = 7
 *    => Inner Loop:
 *       div = 2, div*div = 4, x%div != 0
 *       div = 3, div*div = 9, x%div != 0
 *       xIsPrime = true, print 7

 * 7. x = 8
 *    => Inner Loop:
 *       div = 2, div*div = 4, x%div == 0
 *       xIsPrime = false, skip

 * 8. x = 9
 *    => Inner Loop:
 *       div = 2, div*div = 4, x%div != 0
 *       div = 3, div*div = 9, x%div == 0
 *       xIsPrime = false, skip

 * 9. x = 10
 *    => Inner Loop:
 *       div = 2, div*div = 4, x%div == 0
 *       xIsPrime = false, skip

 * 10. x = 11
 *     => Inner Loop:
 *        div = 2, div*div = 4, x%div != 0
 *        div = 3, div*div = 9, x%div != 0
 *        xIsPrime = true, print 11

 * 11. x = 12
 *     => Inner Loop:
 *        div = 2, div*div = 4, x%div == 0
 *        xIsPrime = false, skip

 * 12. x = 13
 *     => Inner Loop:
 *        div = 2, div*div = 4, x%div != 0
 *        div = 3, div*div = 9, x%div != 0
 *        xIsPrime = true, print 13

 * 13. x = 14
 *     => Inner Loop:
 *        div = 2, div*div = 4, x%div == 0
 *        xIsPrime = false, skip

 * 14. x = 15
 *     => Inner Loop:
 *        div = 2, div*div = 4, x%div != 0
 *        div = 3, div*div = 9, x%div != 0
 *        div = 4, div*div = 16, x%div != 0
 *        xIsPrime = false, skip

 * 15. x = 16
 *     => Inner Loop:
 *        div = 2, div*div = 4, x%div == 0
 *        xIsPrime = false, skip

 * 16. x = 17
 *     => Inner Loop:
 *        div = 2, div*div = 4, x%div != 0
 *        div = 3, div*div = 9, x%div != 0
 *        div = 4, div*div = 16, x%div != 0
 *        xIsPrime = true, print 17

 * 17. x = 18
 *     => Inner Loop:
 *        div = 2, div*div = 4, x%div == 0
 *        xIsPrime = false, skip

 * 18. x = 19
 *     => Inner Loop:
 *        div = 2, div*div = 4, x%div != 0
 *        div = 3, div*div = 9, x%div != 0
 *        div = 4, div*div = 16, x%div != 0
 *        xIsPrime = true, print 19

 * 19. x = 20
 *     => Inner Loop:
 *        div = 2, div*div =
 */