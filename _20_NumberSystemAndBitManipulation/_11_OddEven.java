package _20_NumberSystemAndBitManipulation;

public class _11_OddEven {
    public static void main(String[] args) {
        /**
         * Bitwise Operator:
         * => Computer Memory k andr registers hote hai, aur CPU humesa
         *    binary m kaam krta hai.
         * => For example, 5: [0101]
         * => Fir ye load hone k baad humaare registers pe operations
         *    hote hai, aur isko hum Binary System bolte hai.
         * 
         * Note: Jitne v even number hote h unko jb binary m convert krte
         *       hai to unke end m (LSB - Least Significant Bit) wo humesa
         *       '0' hogi, aur odd ki LSB humesa '1' hoti hai
         * 
         * => Isse humein ye smjh aata hai ki agar hum bitwise operation kre:
         * 
         * (a) if(N & 1 == 0) => Even
         * 
         * => Example: 4 -> 0100
         *                 &0001
         *                  ----
         *                  0000 => 0 => Even
         * 
         * => Example: 5 -> 0101
         *                 &0001
         *                  ----
         *                  0001 => 1 => Odd
         * 
         * TC: O(1)
         */

        int n = 10;
        boolean isEven = checkEven(n);

        if (isEven == true) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
    }

    public static boolean checkEven(int n) {
        if ((n & 1) == 0) {
            return true; // it's an even no
        } else {
            return false; // it's an odd number
        }
    }
}
