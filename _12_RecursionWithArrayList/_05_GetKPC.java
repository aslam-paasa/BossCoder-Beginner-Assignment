package _12_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_GetKPC {
    /**
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
     * Possible Values: pt, pu, qt, qu, rt, ru, st, su
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
