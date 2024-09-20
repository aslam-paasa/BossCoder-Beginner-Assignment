package _12_Recursion_With_ArrayList_And_String;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_GetKeypadCombination {
    /**
     * GFG: Possible words from Phone Digits
     * Leetcode: Letter Combination of a Phone Number
     * 
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
     * Keypad phone m har key k upar kuch text likha hota tha:
     * 0 -> .;
     * 1 -> abc
     * 2 -> def
     * 3 -> ghi
     * 4 -> jkl
     * 5 -> mno
     * 6 -> pqrs
     * 7 -> tu
     * 8 -> vwx
     * 9 -> yz
     * 
     * Input: 6 7
     *        p t
     *        q u
     *        r
     *        s
     * All Possible Values of 67: pt, pu, qt, qu, rt, ru, st, su
    */

    /**
     * 1. Expectation:
     * => f(67) = [pt, pu, qt, qu, rt, ru, st, su]
     * 
     * 2. Faith: 
     * => f(7) = [t, u]
     * 
     * 3. EwF:
     * => p.f(7)
     * => q.f(7)
     * => r.f(7)
     * => s.f(7)
    */

    /**
     * High Level: f(367)
     * Input: 3 6 7
     *        g p t
     *        h q u
     *        i r
     *          s
     * 
     * 1. Expectation: f(367)
     * => gpt, gpu, gqt, gqu, grt, gru, gst, gsu
     * => hpt, hpu, hqt, hqu, hrt, hru, hst, hsu
     * => ipt, ipu, iqt, iqu, irt, iru, ist, isu
     * => 24 
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    // Keypad Button:                0      1      2      3      4     5       6      7      8      9  
    public static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "uvw", "xyz"};

    // Function to find list of all words possible by pressing given number
    // 367
    public static ArrayList<String> getKPC(String str) {

        /**
         * 2. Base Case:
         * => Blank String ki ek subsequence hoti hai => ""
         * => [] is wrong, so we have added [""] inside arraylist
         *    (a) []   : 0
         *    (b) [""] : 2^0 => 1
        */
        if(str.length() == 0) {
            ArrayList<String> blankResult = new ArrayList<>();
            blankResult.add("");
            return blankResult;
        }

        /**
         * 1. Recursive Relation:
        */
        char firstChar = str.charAt(0); // 3 -> ghi
        String restOfChar = str.substring(1); // 67

        /**
         * Store the Recursive Result(Faith Result):
         * */ 
        ArrayList<String> faithResult = getKPC(restOfChar); // all words for 67

        /**
         * Store Expectation Result:
        */
        ArrayList<String> expectationResult = new ArrayList<>();

        /**
         * Convert Character to String:
         * Issue: firstChar '3' !== int 3
         * Soln : ASCII of '0' = 48
         *        ASCII of '1' = 49
         *        ASCII of '2' = 50
         *        ASCII of '3' = 51
         * => '3' - 48 = 3
         * Note: To convert char to integer, always subtract to 48.
        */
        String code = codes[firstChar - 48]; // '3' - 48 = 3 => ghi

        /**
         * Looping ghi:
         * 1. Iteration-1: g
         * 2. Iteration-2: h
         * 3. Iteration-3: i
         * 
         * => Loop m bolnge ki "i" tu "0" se start kro aur code.length()
         *    tk naa ho jae tbtk ++ krte rho.
         * => i=0 : g
         *    i=1 : h
         *    i=2 : i
        */
        for(int i = 0; i < code.length(); i++) {
            char chi = code.charAt(i);
            /**
             * 1. g + getKPC(ros)
             * 2. h + getKPC(ros)
             * 3. i + getKPC(ros)
            */
            for(String finalString: faithResult) {
                expectationResult.add(chi + finalString);
            }
        }

        return expectationResult;

    }

}
