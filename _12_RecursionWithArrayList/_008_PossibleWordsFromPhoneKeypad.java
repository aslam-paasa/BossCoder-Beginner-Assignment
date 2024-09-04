package _12_RecursionWithArrayList;

import java.util.ArrayList;

public class _008_PossibleWordsFromPhoneKeypad {
    /**
     * GFG:
     * Hum bolnge avi mai 2 pe hu, ek loop laa jisme "A" pe tk
     * temp bna de, aur isko bolnge "A" ko maine add kr diya
     * hai, tu jaa aur agar main 4 ko press karunge to kitne 
     * multiple answers aa skte hai wo saare laa k de de
     * temp = A
     * => AG, AH, AI
     * 
     * temp = B
     * => BG, BH, BI
     * 
     * temp = C
     * => CG, CH, CI
     * Aur aise humaare saare strings generate ho jaenge.
     * */ 

    /**
     * Example:
     * n = 3, [2, 3, 4] btao isme kya kya generate hoga?
     * 2: A, B, C
     * 3: D, E, F
     * 4: G, H, I
     * 
     * A _ _
     * B _ _
     * C _ _
     * 
     * => "A" ko bolnge ki jaa 2nd place bhar kr le aa (3)
     *    A D _
     *    A E _
     *    A F _
     * => "A" ko bolnge ki ab jaa 3rd place bhar k le aa (4)
     *    A D G
     *    A D H
     *    A D I
     *    ... 
     *    ...
     * 
     *    
    */

    // Keypad Button:                0      1      2      3      4     5       6      7      8      9  
    public static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "uvw", "xyz"};

    

    public static void helper(int[] a, int n, String temp, int i) {
        if( i == n ) {
            // ans.add(temp);
        }
    }

    // Function to find list of all words possible by pressing given number
    // 367
    public static ArrayList<String> getKPC(String str) {

        /**
         * 2. Base Case:
        */
        if(str.length() == 0) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("");
            return baseRes;
        }

        /**
         * 1. Recursive Relation:
        */
        char ch = str.charAt(0); // 3 -> ghi
        String ros = str.substring(1); // 67
        ArrayList<String> rres = getKPC(ros); // all words for 67
        ArrayList<String> mres = new ArrayList<>();

        /**
         * Convert Character to String:
         * Issue: ch '3' !== int 3
         * Soln : ASCII of '0' = 48
         *        ASCII of '1' = 49
         *        ASCII of '2' = 50
         *        ASCII of '3' = 51
         * => '3' - 48 = 3
         * Note: To convert char to integer, always subtract to 48.
        */
        String code = codes[ch - 48]; // '3' - 48 = 3 => ghi

        /**
         * Looping ghi:
         * 1. Iteration-1: g
         * 2. Iteration-2: h
         * 3. Iteration-3: i
        */
        for(int i = 0; i < code.length(); i++) {
            char chi = code.charAt(i);
            /**
             * 1. g + getKPC(ros)
             * 2. h + getKPC(ros)
             * 3. i + getKPC(ros)
            */
            for(String rstr: rres) {
                mres.add(chi + rstr);
            }
        }

        return mres;

    }
}
