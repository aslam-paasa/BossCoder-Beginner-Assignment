package _08_String;

import java.util.Scanner;

public class _20_ToggleCase {
    /**
     * Q. You are given a string that contains only lowercase and
     *    uppercase alphabets. You have to toggle the case of every
     *    character of the given string.
     * => Input: pepCODinG
     * => Output: PEPcodINg
     * 
     * => Every character has an ASCII Code:
     *    1. A -> 65       1. a -> 97
     *    2. B -> 66       2. b -> 98
     *    ....             ....
     *    ....             ....
     *    ....             ....
     *    27. Z            27. z
     * => kvi v humein agar "A" to 'a' jaana hai to formula chaiye.
     *    For that we have to understand, jitna "a" <-> "A" k bich
     *    ka distance hai, utna hai "c" <--> "C" ka hai. So, we can
     *    write it as:
     *    => c - a = C - A
     *    => c = C + (a - A) [Formula]
     *    => C = c + (A - a) [Formula]
     * 
     * 1. Lowercase Formula:
     *    lc = uc + ('a' - 'A')
     * 
     * 2. Uppercase Formula:
     *    uc = lc + ('A' - 'a')
     * */ 

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str); // convert string to sb
        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            // Compare ASCII characters 
            if(ch >= 'A' && ch <= 'Z') {
                char lc = (char)(ch + 'a' - 'A'); // converting ASCII back to char
                sb.setCharAt(i, lc); // uppercase ko lowercase m daal do
            } else {
                char uc = (char)(ch + 'A' - 'a');
                sb.setCharAt(i, uc); // lowercase ko uppercase m daal do 
            }
        }
        return sb.toString(); // convert sb to string
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }
}
