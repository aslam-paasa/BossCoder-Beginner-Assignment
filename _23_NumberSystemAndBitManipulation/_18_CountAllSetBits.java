package _22_NumberSystemAndBitManipulation;

public class _18_CountAllSetBits {
    public static void main(String[] args) {

        /**
         * Example: 
         * 1. 7 = "111"
         * => (7 & 1) =   1 1 1
         *              & 0 0 1
         *                ------
         *                0 0 1 => 1
         * 
         * Note: Agar mai kisi number ko bitwise AND krta hu 1 se to mujhe 
         *       uski LSB mil jaati hai.
         * 
         * 2. 10 = 1 0 1 0
         *    10 & 1 => 1 0 1 0
         *            & 0 0 0 1
         *              -------
         *              0 0 0 0
         * 
         * (a) 1010 & 1 => 0 
         * (b) Now use right shift:
         *     101 & 1 => 1
         * (c) Now use right shift:
         *     10 & 1 => 0
         * (d) Now use right shift:
         *     1 & 1 => 1
         * Note: Jb Jb '1' aaega tb count ++ kr denge.
         * 
         * Logic:
         * => while(n > 0) {
         *       1. bit = (n & 1)
         *       2. if(bit == 1) count++;
         *       3. n = n >> 1
         *    }
        */

        int n = 7;
        int setBitCount = countSetBit(n);
        System.out.println(setBitCount);
    }

    public static int countSetBit(int n) {
        int count = 0;

        while(n > 0) {
            // bit nikaalo
            int bit = (n & 1);

            if(bit == 1) {
                count++;
            }
            n >>= 1; // n = n >> 1;
        }
        return count;
    }
}
