package _06_TimeAndSpaceComplexity;

import java.util.Scanner;

public class _25_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Q. What will be the time complexity?
         * => i = 2 => 2^1 -> 2^2 -> 2^4 -> 2^8 -> 2^16 -> 2^32
         * => Base is 2, but the exponent is creating a pattern of power of 2
         * => So, can we say : 2^2^0 -> 2^2^1 -> 2^2^2 -> 2^2^3 -> 2^2^4 -> ....
         * => Based this we can say the iteration numbers based on exponent's power: 
         *    (a) 2^2^0 -> iteration-1
         *    (b) 2^2^1 -> iteration-2
         *    (c) 2^2^2 -> iteration-3
         *    (d) 2^2^3 -> iteration-4
         *    (e) 2^2^4 -> iteration-5
         *     ....
         *     ....
         *    (z) 2^2^k -> kth iteration
         * 
         * Note: 2^2^k > N, means when 'k' crosses 'N' then calculate what will be the value of 'K'
         *       and that will be our answer.
         * 
         * => 2^2^k -> N
         * => log2 2^2^k -> log2 N
         * => 2^k -> log2 N
         * => log2 2^K -> log2(log2 N)
         * => K > log2(log2 N)
         * 
         * => TC: O(log(log N))
         */

        for (int i = 2; i <= n; i = i * i) {
            System.out.println(i);
        }
    }
}
