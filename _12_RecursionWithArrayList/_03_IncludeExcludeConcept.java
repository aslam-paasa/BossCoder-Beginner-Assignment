package _12_RecursionWithArrayList;

import java.util.ArrayList;

public class _03_IncludeExcludeConcept {
    /**
     * Include-Exclude Pattern:
     * => String str = " a b c "
     *                   0 1 2
     * => Jo answer mai nikaalna chahta hu wo String hogi, but wo String
     *    starting m "" (empty) hogi. To humne ek empty string le li aur
     *    isse humne apna output string bol diya.
     * => So, basically:
     * (a) Maine apne input string k starting index-0 pe 'i' lga diya.
     *                   i
     * => String str = " a b c "
     *                   0 1 2
     * (b) Aur maine ek output string li jisko starting m main empty rkha
     *     hai.
     * 
     *    Output: ""
     * 
     * => Ab humaare paas 2 choices hai, 
     *    (a) Jiss variable pe humaara 'i' hai usse either "include" krnge
     *        or "exclude" krnge.
     * 
     * Q. But kisme include karein? Or kisme exlcude karein?
     * => Iss "a" ko apne output string m andr "include" or "exclude"
     *    krnge.
     * 
     * 1. The first character is 'a'.
     *    (a) Include 'a': 
     *     => Output string "a".
     * 
     *    (b) Exclude 'a': 
     *     => Output string "".
     * 
     * 2. For the string "b":
     *    (a) Include 'b': 
     *     => Output string:
     *       (i)  "ab" 
     *       (ii) "b".
     *    (b) Exclude 'b': 
     *     => Output string:
     *        (i)  "a"
     *        (ii) "".
     * 
     * 3. For the string "c":
     *    (a) Include 'c': 
     *     => Output string:
     *        (i)   "abc", 
     *        (ii)  "bc", 
     *        (iii) "ac", 
     *        (iv)  "c".
     * 
     *    (b) Exclude 'c': 
     *     => Output string:
     *        (i)   "ab", 
     *        (ii)  "b", 
     *        (iii) "a",
     *        (iv)  "".
    */

    public static void printSubsequences(String str, String output, int i, ArrayList<String> list) {
        /**
         * Base Case:
        */
        if(i >= str.length()) {
            // Store inside ArrayList
            list.add(output);
            // System.out.println(output);
            return;
        }

        /**
         * Case-1: Exclude
         */
        printSubsequences(str, output, i + 1, list);

        /**
         * Case-2: Include
         * => Adding "i" to the output recursively.
         * => Below line is responsible for concatenation of output string,
         *    ans ith character of str string.
         */
        printSubsequences(str, output + str.charAt(i), i + 1, list);
    }
    public static void main(String[] args) {
        /**
         * Store the output string inside this ArrayList
         */
        ArrayList<String> list = new ArrayList<String>();

        String str = "abc";
        String output = "";

        int i = 0;
        printSubsequences(str, output, i, list); // Pass the list to the method

        System.out.println("Subsequences are : " + list);
    }
}

/**
 * We can solve this using Bit Masking.
*/