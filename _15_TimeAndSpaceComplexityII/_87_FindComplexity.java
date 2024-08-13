package _15_TimeAndSpaceComplexityII;

import java.util.Scanner;

public class _87_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => n = 1000
         * => i = 1  -> 2 -> 4 -> 8 -> 16 -> 32 -> 64 -> 128 -> 256 -> 512 -> 1024 
         *        2^0   2^1  2^2  2^3  2^4   2^5   2^6   2^7    2^8    2^9    2^k
         * 
         * Note: We have to check at what value 2^k is crossing n.
         * => 2^k >= n
         * => log2 2^k >= log2 n
         * => k >= log2 n
         *  
         * => TC: O(log n)
         */

        for (int i = 1; i < n; i*=2) {
            System.out.println(i + " ");
        }

        /**
         * Q. What does log means?
         * => log2 16 => 2^n = 16?
         *            => 2^4 = 16
         * => So, if we are increasing in terms of 2. It is log n with base 2
         * */
    }
}
