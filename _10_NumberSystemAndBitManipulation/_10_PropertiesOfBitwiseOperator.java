package _10_NumberSystemAndBitManipulation;

public class _10_PropertiesOfBitwiseOperator {
    public static void main(String[] args) {
        /**
         * Properties of Bitwise Operator:
         * 1. Commutative:
         *    => A X B = B X A, where X is any operator
         * 
         * 2. Associative:
         *    => AX(BXC) = (AXB)XC, where X is any operator
         */ 
        
        
        /** 
         * Q. Find the parity of a number using Bit Manipulation.
         *    (Parity means odd-even)
         * => 2^4 2^3 2^2 2^1 2^0
         * => 16  8   4   2   1
         * => E   E   E   E   O 
         * 
         * So, if LSB(Least significant bit) == 1 (Odd)
         *     if LSB                        != 1 (Even)
         *    
         * 
         * Q. How to find if LSB is 1 or not?
         * => 1100001101X, find X is 1 or not.
         * => We take another number, and we don't care what the above
         *    bits are.
         * => In our number we will make all bits as 0 and only set LSB
         *    as 1. (00000000001)
         * => Then we will take a "&" of these two numbers, where 1&0 = 0
         * 
         * 11000011010
         * 00000000001 <--- "Bitmask"
         * -----------
         * 00.......00
         * 
         * => if(x & 1 == 0) {
         *        even number
         *    } else {
         *        odd number
         *    }
         * 
         * => Bitmask basically means applying mask over the above guy to
         *    retrieve its sum property.
         * */ 


        /**
         * 3. Left Shift: Shift all the numbers to the left and one place is empty, then fill 0.
         * =>   1101 -> 13
         *     11010 -> 26
         *    110100 -> 52
         * Note: When we are left shifting, the number is getting doubled.
         * 
         * (abcd)base-2 = d.2^0 + c.2^1 + b.2^2 + a.2^3
         * (abcd0)base-2 = d.2^1 + c.2^2 + b.2^3 + a.2^4
         *               = 2(abcd)
         * 
         * x << 1 = 2.x
         * x << k = 2^k.x (Formula)
         * */ 


        /**
         * 4. Right Shift: Shift each numbers to the right and then no place for the LSB, then trim that no.
         * => 1101 => 13
         *     110 => 6
         *      11 => 3
         * 
         * (abcd) --------> (abc)base-2
         * 
         * => x >> 1 = x/2
         * => x >> k = x/2^k (Formula)
         * */  
    }
}
