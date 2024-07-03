package _10_NumberSystemAndBitManipulation;

public class _14_SetKthBit {
    public static void main(String[] args) {

        /**
         * Example: n = 5, k = 1 (1 << k)
         * =>   1 0 1
         *     |  1 0
         *      ------
         *      1 1 1
        */

        int n = 10;
        int k = 2;

        System.out.println(n | (1<<k));
    }
}
