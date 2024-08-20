package _24_NumberSystemAndBitManipulation;

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
         * 1. AND Operator (&) => Binary Operator
         * 2. OR Operator  (|) => Binary Operator
         * 3. NOT Operator (!) => Unary Operator
         * 4. XOR Operator (^) => Binary Operator
         * => 0 -> False
         * => 1 -> True
         */ 
        
        /** 
         * 1. OR Operation:
         * => It says result is true when any operand is true.
         * => True|False|False|False = True
         * 
         *    X      Y      X | Y (OR)
         *    0      0      0
         *    1      0      1
         *    0      1      1
         *    1      1      1
         * Note: Koi v ek condition true ho to output true hoga.
         */ 

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        System.out.println("*** OR Operation: ***");
        System.out.println("true | false : " + (a | b));
        System.out.println("true | true : " + (a | c));
        System.out.println("false | false : " + (b | d));

        /**
         * Example-1:
         * 3 =>  11
         * 4 => 100
         * 
         * 3 | 4 =>   1 1
         *        | 1 0 0
         *        +-------+
         *          1 1 1 => 7 
         * */ 

        System.out.println("3 | 4 " + (3 | 4));
        System.out.println();
        
        /** 
         * 2. AND Operation:
         * => It says result is false when any of the operand is false.
         * => False & True & True & True.
         * 
         *    X      Y      X & Y (AND)
         *    0      0      0
         *    1      0      0
         *    0      1      0
         *    1      1      1
         * Note: Saari condition true honi chaiye tb true hoga.
         */ 

        System.out.println("*** AND Operation: ***");
        System.out.println("true & false : " + (a & b));
        System.out.println("true & true : " + (a & c));
        System.out.println("false & false : " + (b & d));

        /**
         * Example-1:
         * 2 => 10
         * 3 => 11
         * 
         * 2 & 3 =>  1 0
         *         & 1 1
         *         +-----+
         *           1 0 => 2
         * 
         * Example-2:
         * 5  =>  101
         * 10 => 1010
         * 
         * 5 & 10  =>   1 0 1
         *          & 1 0 1 0
         *          +---------+
         *            0 0 0 0 => 0
        */
        
        System.out.println("2 & 3 : " + (2 & 3));
        System.out.println();

        /** 
         * 3. One's Compliment/NOT Operation:
         * => Opposite of operand
         * 
         *     X      ~X (NOT) => tilda(~) or !  
         *     0      1  
         *     1      0 
         */ 
        System.out.println("*** NOT Operation: ***");
        System.out.println("!true : " + (!a));
        System.out.println("!false : " + (!b));
        System.out.println(~5);
        System.out.println(~1);
        System.out.println(~0); // Trick: -1
        System.out.println();
        
        /** 
         * 4. XOR Operation:
         * => It is said to be true if both the operands are different.
         * => True ^ True = False
         * => False ^ True = True
         * => False ^ False = False
         * 
         *     X      Y       X ^ Y (XOR)  
         *     0      0       0  
         *     1      0       1
         *     0      1       1
         *     1      1       0
         * Note: Agar saare output same h to false/0 aaega.
         * => Using this we can find two numbers are equal or not.
         */ 
        
        System.out.println("*** XOR Operation: ***");
        System.out.println("true ^ false : " + (a ^ b));
        System.out.println("true ^ true : " + (a ^ c));
        System.out.println("false ^ false : " + (b ^ d));
        System.out.println();
        
        /** 
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
