package _25_Strings;

public class _22_StringCompression {
    public static void main(String[] args) {
        /**
         * String Compression:
         * => "aaabbcccdd" : "a3b2c3d2"
         * 
         * => "abc" : "a1b1c1" => decompressed (wrong)
         * 
         * Note: Agar single time letter aa rha hai to wo likh denge, wrna uska no. dikh dete hai
         * 
         * Logic:
         * 1. Ek count variable rkhnge
         * 2. Ek loop chalaenge : i=0 to str.length()
         * 3. Ab hm kisi character pe aae jo ith position pe hai, to uske liye hm count = 1 kr denge.
         * 4. Fir andr while loop chala denge, jbtk ye character repeat hote rhega tbtk andr wala loop
         *    chalega aur iss loop k andr count++ krte chle jaenge, aur last m dkhnge agar humara count
         *    greater than 1 hai to uss case number likh do wrna sirf character likh do
         *    (a) count > 1 : Number
         *    (b) count = 1 : Character
         * 
         * for(int i = 0 to str.length()) {
         *    ch(i);
         *    count = 1;
         * 
         *    while(repeat) {
         *       count++;
         *       i++;
         *    }
         * }
         * 
         * TC: O(n)
         * 
         * HW: Solve it using StringBuilder
         * */ 

        String str = "aaabbccdd";
        System.out.println(compress(str));

    }

    public static String compress(String str) {
        String newStr = "";

        /**
         * Ye for-loop ek ek kar k saare character ko traverse krega
        */
        for(int i = 0; i < str.length(); i++) {
            Integer count = 1;
            /**
             * Inner Loop tbtk chlega jbtk 
             * (a) "i" chota ho str.length-1 se
             * (b) Next letter == current letter jaisa ho
             * => Jbtk letter same hai tbtk count++ & index++ krenge
             * 
             * => Jaise hi letter same hona band ho jaega, apne letter ko add kr denge new String k andr
             * => Count agar > 1 hai to uss count to apne new String m add kr denge
             * => Finally apne new String ko return kr denge
             * 
             * TC: O(n) => Because dono loop "i++" tk jaa rha hai
             *          => Saare operations mila k "n" tk jaega
            */
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }
}
