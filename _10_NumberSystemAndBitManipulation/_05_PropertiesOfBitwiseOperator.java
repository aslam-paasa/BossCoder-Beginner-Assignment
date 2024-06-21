package _10_NumberSystemAndBitManipulation;

public class _05_PropertiesOfBitwiseOperator {
    public static void main(String[] args) {
        
        /**
         * Property-1:(AND with off means everything is off)
         * => X & False = 0
         * => 2 & 0     = 0
         * */
        
        System.out.println(2 & 0); // 0

        /**
         * Property-2:(OR with off keeps the original value)
         * => x | False = x (x will remain same)
         * => 2 | 0     = 2
         * */
        
        System.out.println(2 | 0); // 2


        /**
         * Property-3:(XOR with off keeps the original value)
         * => x ^ False = x
         * => 2 ^ 0     = 2
         * => 2 ^ 2     = 0 (XOR with itself turns off all bits)
         * 
         * */ 

        System.out.println(2 ^ 0); // 2
        System.out.println(2 ^ 2); // 0

        /**
         * Property-4:(if X is a single bit; otherwise it depends on the bit position)
         * => x & True = x (When X is a single bit (either 0 or 1))
         * => 1 & 1    = 1
         * => 0 & 1    = 0
         * 
         * => When X is multiple bits, AND with 1 will only check the least significant bit (the rightmost bit):
         * => 5 & 1 = 1
         * 
         * => 101
         * => 001
         *    001 -> 1
         * 
         * => 10 & 1 = 0
         * 
         * => 1010
         * => 0001
         *    0000
         *      
         * Note: True means all the bits set to '1'
         * */
        
        System.out.println(1 & 1); // 1
        System.out.println(0 & 1); // 0

        System.out.println(10 & 1); // 0
        System.out.println(5 & 1); //  1



        /**
         * Property-5: 
         * => x | True = 1 (When X is a single bit (0 or 1))
         * => 0 | 1    = 1
         * => 1 | 1    = 1
         * 
         * => When X is multiple bits, OR with 1 will turn on the least significant bit (the rightmost bit):
         * => 8 | 1 = 9
         * 
         * => 1000
         * => 0001 
         *    1001 -> 9
        */
        System.out.println(0 | 1); // 1
        System.out.println(1 | 1); // 1
        System.out.println(8 | 1); // 9

        /**
         * Property-6: 1:29:10
        */
    }
}
