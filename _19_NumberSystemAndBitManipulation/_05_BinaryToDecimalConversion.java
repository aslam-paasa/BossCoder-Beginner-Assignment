package _19_NumberSystemAndBitManipulation;

public class _05_BinaryToDecimalConversion {
    public static void main(String[] args) {
        int number = 111001;
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
            int remainder = number % 10;
            number = number / 10;

            ans = ans+remainder*mult;

            mult = mult*base;
        }
        System.out.println(ans); // return ans;
    }
}
