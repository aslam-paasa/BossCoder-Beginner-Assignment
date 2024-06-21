package _10_NumberSystemAndBitManipulation;

public class _03_ConvertDecimalToBinary {
    public static void main(String[] args) {
        
        /**
         * 1. Keep in dividing this number by 2 & storing the remainder, till possible.
         * 
         *      |  Q | R |
         *      +----+---+
         * => 2 | 13 |   |   ^
         *    2 |  6 | 1 |   |
         *    2 |  3 | 0 |   ^
         *    2 |  1 | 1 |   |
         *        --->------->
         * 
         * 2. Read this fro top-to-bottom 
         * => 13 = (1101)base-2
         *       = 1.2^0 + 0.2^1 + 1.2^2 + 1.2^3 
         *       = 1 + 0 + 4 + 8
         *       = 13
         * 
         * Example: int x = 13;
         * => (1101)base-2 is filled at the last, rest all are filled with 0's.
         * => 00000000, 00000000, 00000000, 00001101 => So, we are wasting this much amount of space.
         * => This is the reason why for every datatype we have limit.
         * 
        */
    }
}
