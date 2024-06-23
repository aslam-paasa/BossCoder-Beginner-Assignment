package _10_NumberSystemAndBitManipulation;

public class _03_DecimalToAnybase {
    public static void main(String[] args) {
        
        /**
         * 
         * 1. Keep in dividing this number by 2 & storing the remainder, till possible.
         * 
         *      |  Q | R |
         *      +----+---+
         * => 2 | 13 |   |   ^
         *    2 |  6 | 1 |   |
         *    2 |  3 | 0 |   ^
         *    2 |  1 | 1 |   |
         *        --->------->
         * 
         * 2. Read this fro top-to-bottom 
         * => 13 = (1101)base-2
         *       = 1.2^0 + 0.2^1 + 1.2^2 + 1.2^3 
         *       = 1 + 0 + 4 + 8
         *       = 13
         * 
         * Example: int x = 13;
         * => (1101)base-2 is filled at the last, rest all are filled with 0's.
         * => 00000000, 00000000, 00000000, 00001101 => So, we are wasting this much amount of space.
         * => This is the reason why for every datatype we have limit.
         * 
        */

        /**
         * Steps:
         * 1. Work until your nummber is !0
         *    -> remainder nikaalo with the help of given help
         *    -> reduce your number with the help of given base
         *    -> ans create
         *    -> mul = mul*10 (har baar wo 10 se increase v hote rhega)
         * 
         *      |  Q  | R |
         *      +-----+---+
         * => 8 | 634 |   |   ^
         *    8 |  79 | 2 |   |  => 10^0
         *    8 |   9 | 7 |   ^  => 10^1
         *    8 |   1 | 1 |   |  => 10^2
         *      |   0 | 1 |   |  => 10^3
         *        --->------->      1172
         * */ 

        int number = 621;
        int base = 2;

        int mult = 1;
        int ans = 0;

        /**
         * 1. Hum tbtk kaam krnge jbtk humara number = 0 nhi ho jaata
         * 2. remainder base k according nikaalna hai
         * 3. number reduce krna hai
         * 4. ans k andr => ans+remainder*multi
         * 5. Next iteration, multi ko 10 times increase kr lo
        */
        while(number > 0) {
            int remainder = number % base;
            number = number / base;

            ans = ans+remainder*mult;

            mult = mult*10;
        }
        System.out.println(ans); // return ans;
    }
}
