package _21_NumberSystemAndBitManipulation;

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
         * 3. Left Shift: (<<) 
         * => Shift all the numbers to the left and one place is empty, then fill 0.
         * =>   1101 -> 13
         *     11010 -> 26
         *    110100 -> 52
         * Note: When we are left shifting, the number is getting doubled.
         * 
         * (abcd)base-2 = d.2^0 + c.2^1 + b.2^2 + a.2^3
         * (abcd0)base-2 = d.2^1 + c.2^2 + b.2^3 + a.2^4
         *               = 2(abcd)
         * 
         * Formula:
         * a << b = a * 2^b
         * 5 << 2 = 5 * 2^2
         *        = 5 * 4
         *        = 20
         * */ 

        System.out.println(5 << 1);
        System.out.println(5 << 2); 
        System.out.println(5 << 3); 

        /**
         * -2147483648: Ye baar baar change ho rha hai qki negative k case
         *              m ye humein garbage value throw kr rha hai.
         * => Grabage Value means koi v random value.
        */

        System.out.println(5 << -1);

        int a = 12;
        a = a << 3;
        System.out.println(a);


        /**
         * 4. Right Shift: (>>) 
         * => Shift each numbers to the right and then no place for the LSB, then trim that no.
         * => 1101 => 13
         *     110 => 6
         *      11 => 3
         * 
         * Note: When we are right shifting, the number is getting half.
         * 
         * (abcd) --------> (abc)base-2
         * 
         * Formula:
         * a >> b = a / 2^b
         * 6 >> 1 = 6 / 2^1
         *        = 6 / 2
         *        = 3
         * */  

        System.out.println(6 >> 1);
        System.out.println(100 >> 1);
        System.out.println(100 >> 2); 
        System.out.println(100 >> 3); 
        System.out.println(-100 >> 1);
        System.out.println(25 >> 1);

        /**
         * Agar mai kisi negative number k upar >> kr du to wo ek high
         * value positive number mujhe de skta hai
        */

        /**
          * 0: 
          * => Grabage Value means koi v random value.
         */

        System.out.println(100 >> -1);

    }
}
