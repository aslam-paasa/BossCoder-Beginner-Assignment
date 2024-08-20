package _24_NumberSystemAndBitManipulation;

import java.util.Scanner;

public class _04_DecimalToBinaryConversion {
    public static void main(String[] args) {

        /**
         * Bitwise Method:
         * 1. Obtain bit with bitwise AND operation i.e., (N & 1)
         * 2. Right Shift N by 1. (N = N >> 1)
         * 3. Repeat above steps till N > 0.
         * 4. Reverse the bits so obtained.
         * 
         * N = 10 => 1 0 1 0
         *         & 0 0 0 1
         *        +---------+
         *           0 0 0 0 => 0 (first bit)
         * 
         * N = N >> 1 (Right Shift)
         * => 1 0 1
         *  & 0 0 1
         * +--------+
         *    0 0 1 => 1 (second bit)
         * 
         * N = N >> 1 (Right Shift)
         * => 1 0
         *  & 0 1
         *  +----+
         *    0 0 => 0 (third bit)
         * 
         * N = N >> 1 (Right Shift)
         * => 1
         *  & 1
         * +----+
         *    1 => 1 (fourth bit)
         * 
         * Total bit: 0 1 0 1 => 1 0 1 0(reverse) 
         * 
         * */

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = scn.nextInt();

        /**
         * Bitwise Method:
         */
        int binary = decimalToBinaryMethod(n);
        System.out.println(binary);
        scn.close();
    }

    public static int decimalToBinaryMethod(int n) {
        int binaryNo = 0;
        int placeValue = 1;

        while (n > 0) {
            int bit = (n & 1);
            binaryNo += bit * placeValue;
            placeValue *= 10;
            n = n >> 1;
        }
        return binaryNo;
    }
}
