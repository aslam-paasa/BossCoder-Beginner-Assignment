package _14_NumberSystemAndBitManipulation;

public class _13_SetKthBit {
    public static void main(String[] args) {
        /**
         * Q. Given a number N and a value K. From the right, set the Kth
         *    bit in the binary representation of N. The position of LSB or
         *    last bit is 0, the second last bit is 1 and so on.
         * 
         * => Input: N = 10, K = 2
         * => Output: 14
         * => Explanation: [ 1 0 1 0 ]
         *                   3 2 1 0
         *                     |
         *                     V
         *                     Kth bit = 1 => [1 1 1 0] = 14
         * 
         * Q. Kth bit ko '1' set kaise krnge?
         * =>    1 0 1 0
         * (OR)| 0 1 0 0
         *       -------
         *       1 1 1 0 => 14
         * 
         * 1. N` = 1010
         * 2. Value => 1 << k (1 ko left shift krnge 2 se), k = 2
         *             1 << 2
         *             100
         * 3. N | Value (N bitwise Value)
         * => 1 0 1 0
         *  |   1 0 0
         *   ---------
         *    1 1 1 0 => 14
         * 
         *    
         * */ 

        int n = 10;
        int k = 2;

        System.out.println(setKthBit(n, k));
    }

    public static int setKthBit(int n, int k) {
        int mask = 1 << k;
        int ans = n | mask;
        return ans;
    }
}
