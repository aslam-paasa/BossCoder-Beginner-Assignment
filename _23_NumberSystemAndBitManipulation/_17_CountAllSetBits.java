package _22_NumberSystemAndBitManipulation;

public class _17_CountAllSetBits {
    public static void main(String[] args) {
        /**
         * Q. Given an Integer 'N' count no of set bits in it.
         * => N = 34, Binary = 1 0 0 0 1 0 => 2
         * => N = 10, Binary = 1 0 1 0 => 2
         * => N = 7,  Binary = 1 1 1 => 3
         * Note: Set Bits means jo jo bits '1' hai.
         * 
         * Logic:
         * 1. Convert Number to Binary
         *    2 | 34 |                     2 | 10 | 
         *    2 | 17 | 0                   2 |  5 | 0
         *    2 |  8 | 1                   2 |  2 | 1
         *    2 |  4 | 0                     |  1 | 0
         *    2 |  2 | 0                    => 1 0 1 0
         *      |  1 | 0                    => 0 1 0 1 (reverse)
         *    => 0 1 0 0 0 1
         *    => 1 0 0 0 1 0 (reverse)
         *       
         * 2. bit = N % 2               => bit = 10%2 = 0  => 5%2 = 1      => 2%2 = 0     => 1%2 = 1
         * 3. if(bit == 0) count++;     => count = 0;      => count = 1    => count = 1   => count = 2
         * 4. N = N/2;                  => N = 10/2 = 5;   => N = 5/2 = 2; => N = 2/2 = 1 => N = 1/2 = 0(stop)
         * 
         * Note: while(n > 0) => Stop at this condition
         * */ 

        int n = 7;
        int setBitCount = countSetBit(n);
        System.out.println(setBitCount);
    }

    public static int countSetBit(int n) {
        int count = 0;

        while(n > 0) {
            // bit nikaalo
            int bit = n % 2;

            if(bit == 1) {
                count++;
            }
            n = n/2;
        }
        return count;
    }
}
