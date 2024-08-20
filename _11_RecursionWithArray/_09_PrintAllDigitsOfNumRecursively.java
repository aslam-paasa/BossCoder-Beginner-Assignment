package _11_RecursionWithArray;

public class _09_PrintAllDigitsOfNumRecursively {
    /**
     * Using loop:
     * 1. 647 % 10 = 7
     *    647 / 10 = 64
     * 
     * 2. 64 % 10  = 4
     *    64 / 10  = 6
     * 
     * 3. 6 % 10   = 6
     *    6 / 10   = 0 [Base Case]
     * 
     * => Print all the digits recursively
    */

    public static void printDigits(int n) {
        /**
         * 1. Base Case:
        */
        if(n == 0) {
            return;
        }

        /**
         * 3. Baaki recursion sambhal lega
        */
        printDigits(n/10);

        /**
         * 2. Ek base mai solve karunga
        */
        int digit = n % 10;
        System.out.print(digit + " ");
    }
    public static void main(String[] args) {
        int n = 647;

        printDigits(n);

    }
}
