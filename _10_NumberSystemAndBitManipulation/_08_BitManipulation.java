package _10_NumberSystemAndBitManipulation;

public class _08_BitManipulation {
    public static void main(String[] args) {
        
        /** Bit Manipulation:
         * => Same as we have operators, functions for arithmetic number, machines also has to
         *    play around with binary numbers.
         * => When we say go and solve 100 problems, means 100 in decimal, but if we tell machine
         *    it only communicates in binary number. 
         * => int x = 100; => Machine will go and convert this into binary and then it will understand.
         * => For decoding, we will be doing a lot of operations like arithmetic.
         * => Similarly, we have binary operators also.
         * 
         * Binary/Bitwise Operators:
         * 1. AND Operator (|) => Binary Operator
         * 2. OR Operator  (&) => Binary Operator
         * 3. NOT Operator (!) => Unary Operator
         * 4. XOR Operator (^) => Binary Operator
         * => 0 -> False
         * => 1 -> True
         * 
         * 
         * 1. OR Operation:
         * => It says result is true when any operand is true.
         * => True|False|False|False = True
         * 
         *    X      Y      X | Y (OR)
         *    false  false  false
         *    true   false  true
         *    false  true   true
         *    true   true   true
         * 
         * 2. AND Operation:
         * => It says result is false when any of the operand is false.
         * => False & True & True & True.
         * 
         *    X      Y      X & Y (AND)
         *    false  false  false
         *    true   false  false
         *    false  true   false
         *    true   true   true
         * 
         * 3. NOT Operation:
         * => Opposite of operand
         * 
         *     X      !X (NOT)  
         *     false  true  
         *     true   false 
         * 
         * 4. XOR Operation:
         * => It is said to be true if both the operands are different.
         * => True ^ True = False
         * => False ^ True = True
         * => False ^ False = False
         * 
         *     X      Y       X ^ Y (XOR)  
         *     false  false   false  
         *     true   false   true
         *     false  true    true
         *     true   true    false
         * 
         * 
         * Note:
         * (a) Set Bit   => Bit == 1
         * (b) Unset Bit => Bit == 0
         * (c) Toggle(switch) => !Bit
         * => Basically we are just changing the condition. 
         * 
         * 
         * Q. How many set bits are here: 10110011?
         * => Set Bits = 5
         * => Unset Bits = 3
         * 
         * Q. Toggle all the bits: 10110011?
         * => 01001100
         * 
         * Q. How is toggle different from NOT?
         * => Toggle is per bit.
         * => NOT is usually not per bit, it just make everything just 0.
         * => Example: Toggle the AC means:
         * (a) If AC is ON, turn it OFF.
         * (b) If AC is OFF, turn it ON.
         * 
         * Note: int x = 13; // 1011
         * System.out.println(!x); // This will not give 0100, it will give => 0
         * 
         * Q. Why it is 0?
         * => Because everything which is !0 is true, so, as soon as we are using '!', it assumes 
         *    to be a boolean and see either true or false.
         * => So, if it is 0, the answer will be 1, and rest all the cases it will make it false, which means 0 always.
         * => And that's why toggle and NOT is different.
         * 
         * Example:
         * (a) 7 & 5 : 5
         *  => 7 -> 111
         *  => 5 -> 101
         *  => 7&5  101 => 5
         * 
         * (b) 7 | 5 : 7
         * => 111
         * => 101
         * => 111 -> 7
         * 
         * (c) 7 ^ 5 : 2
         *  => 111
         *  => 101
         *  => 010 
         * */ 

        System.out.println(7 & 5);
        System.out.println(7 | 5);
        System.out.println(7 ^ 5);
    }
}
