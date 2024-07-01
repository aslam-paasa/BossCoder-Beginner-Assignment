package _10_NumberSystemAndBitManipulation;

public class _09_PropertiesOfBitwiseOperator {
    public static void main(String[] args) {
        
        /**
         * Property-1: AND with off means everything is off
         * => X & False = 0
         * => 2 & 0     = 0
         */
        System.out.println("Property-1:");
        System.out.println("0 & 0 = " + (0 & 0));
        System.out.println("1 & 0 = " + (2 & 0));
        System.out.println("2 & 0 = " + (2 & 0)); // 0

        /**
         * Property-2: OR with off keeps the original value
         * => x | False = x (x will remain same)
         * => 2 | 0     = 2
         */
        System.out.println("\nProperty-2:");
        System.out.println("0 | 0 = " + (0 | 0));
        System.out.println("1 | 0 = " + (1 | 0));
        System.out.println("2 | 0 = " + (2 | 0)); // 2

        /**
         * Property-3: XOR with off keeps the original value
         * => x ^ False = x
         * => 2 ^ 0     = 2
         * => 2 ^ 2     = 0 (XOR with itself turns off all bits)
         */
        System.out.println("\nProperty-3:");
        System.out.println("0 ^ 0 = " + (0 ^ 0));
        System.out.println("0 ^ 1 = " + (0 ^ 1));
        System.out.println("1 ^ 0 = " + (1 ^ 0));
        System.out.println("1 ^ 1 = " + (1 ^ 1));
        System.out.println("2 ^ 0 = " + (2 ^ 0)); // 2
        System.out.println("2 ^ 2 = " + (2 ^ 2)); // 0

        /**
         * Property-4: AND with True retains the original value
         * (if X is a single bit; otherwise it depends on the bit position)
         * => x & True = x (When X is a single bit (either 0 or 1))
         * => 1 & 1    = 1
         * => 0 & 1    = 0
         * 
         * When X is multiple bits, AND with 1 will only check the least significant bit (the rightmost bit):
         * => 5 & 1 = 1
         * => 10 & 1 = 0
         * 
         * Examples:
         * => 101  & 001 = 001 -> 1
         * => 1010 & 0001 = 0000 -> 0
         * 
         * Note: True means all the bits set to '1'
         */
        System.out.println("\nProperty-4:");
        System.out.println("1 & 1 = " + (1 & 1)); // 1
        System.out.println("0 & 1 = " + (0 & 1)); // 0
        System.out.println("10 & 1 = " + (10 & 1)); // 0
        System.out.println("5 & 1 = " + (5 & 1)); // 1

        /**
         * Property-5: OR with True sets the value to 1
         * => x | True = 1 (When X is a single bit (0 or 1))
         * => 0 | 1    = 1
         * => 1 | 1    = 1
         * 
         * When X is multiple bits, OR with 1 will turn on the least significant bit (the rightmost bit):
         * => 8 | 1 = 9
         * 
         * Examples:
         * => 1000 | 0001 = 1001 -> 9
         * 
         * Note: False means '0' means True doesn't means '1'.
         *       True can be 1,2,3,4,...
         *       True means all the bits are set to '1'. 
         */
        System.out.println("\nProperty-5:");
        System.out.println("0 | 1 = " + (0 | 1)); // 1
        System.out.println("1 | 1 = " + (1 | 1)); // 1
        System.out.println("8 | 1 = " + (8 | 1)); // 9

        /**
         * Property-6: 
         * => X ^ True = !X (reverse)
         * => Example:
         *    X = 1 1 0 1
         *    ^ = 1 1 1 1
         *    -----------
         *        0 0 1 0
         */
        System.out.println("\nProperty-6:");
        System.out.println("0 ^ 1 = " + (0 ^ 1));
        System.out.println("1 ^ 1 = " + (1 ^ 1));

        /**
         * Property-7:
         * X & X = X
         * */ 
        System.out.println("\nProperty-7:");
        System.out.println("0 & 0 = " + (0 & 0));
        System.out.println("1 & 1 = " + (1 & 1));

        /**
         * Property-8:
         * X | X = X
         * */ 
        System.out.println("\nProperty-8:");
        System.out.println("0 | 0 = " + (0 | 0));
        System.out.println("1 | 1 = " + (1 | 1));

        /**
         * Property-9:
         * X ^ X = 0
         * */ 
        System.out.println("\nProperty-9:");
        System.out.println("0 ^ 0 = " + (0 ^ 0));
        System.out.println("1 ^ 1 = " + (1 ^ 1));
    }
}
