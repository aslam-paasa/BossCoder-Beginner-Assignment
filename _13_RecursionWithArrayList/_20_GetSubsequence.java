package _13_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _20_GetSubsequence {
    /**
     * Subsequence using Faith & Expectation Trick: O(2^n)
     * => 3C0 => Out of 3, 0 apples are select krne ka 1 tarika hai
     *           X X X
     * => 3C1 => Out of 3, 1 apple is selected, but 1 apple select krne k 3
     *           tarike hai:
     *           (a) a X X
     *           (b) X a X
     *           (c) X X a
     * => 3C2 => Out of 3, 2 apples are selected, but 2 apple select krne k 3
     *           tarike hai:
     *           (a) a a X
     *           (b) X a a
     *           (c) a X a
     * => 3C3 => Out of 3, 1 apple are selected
     *           tarike hai:
     *           X X X
     * Similarly, empty strings k kitne tarike hai? 1 only i.e. "".
     * 
     * Example:
     * 'd' k 2 subsequence hote hai:     _, d
     * 
     * 'cd' k 4 subsequence hote hai:    _ _, _d, c_, cd
     * 
     * 'bcd' k 8 subsequence hote hai:   _ _ _, 
     *                                   _ _ d,  _ c _,  b _ _,
     *                                   _ c d,  b _ d,  b c _,
     *                                   b c d
     * 
     * 'abcd' k 16 subsequence hote hai: _ _ _ _, _ _ _ d, _ _ c _, _ _ c d,
     *                                   _ b _ _, _ b _ d, _ b c _, _ b c d,
     *                                   a _ _ _, a _ _ d, a _ c _, a _ c d,
     *                                   a b _ _, a b _ d, a b c _, a b c d
     * 
     * */
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> subsequence = getSubsequence(str);
        System.out.println(subsequence);
    }

    /**
     * => xyz
     * => yz = _ _, _ z, y _, y z
     * 
    */
    public static ArrayList<String> getSubsequence(String str) {
        /**
         * Base Case:
         * If the input string is empty, return a list containing an empty string.
         * This is because an empty string has only one subsequence, which is itself.
         */
        if(str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
    
        /**
         * Recursive Case:
         * 1. Take the first character of the input string (ch).
         * 2. Get the subsequences of the remaining string (restOfTheStringResult).
         * 3. For each subsequence in restOfTheStringResult, create two new subsequences:
         *    a. One without the first character (ch) - add "" + resultString to myResult.
         *    b. One with the first character (ch) - add ch + resultString to myResult.
         */

        // Line-1
        char ch = str.charAt(0); // x
        // Line-2
        String restOfTheString = str.substring(1); // yz
        // Line-3
        ArrayList<String> restOfTheStringResult = getSubsequence(restOfTheString); // _ _, _ z, y _, y z
    
        ArrayList<String> myResult = new ArrayList<>();
    
        /**
         * Line-4
         * Loop 1: Add subsequences without the first character (ch)
         */
        for(String resultString: restOfTheStringResult) {
            String myString  = "-" + resultString; // add "-" string
            myResult.add(myString);
        } // ---, --z, -y-, -yz
    
        /**
         * Line-5
         * Loop 2: Add subsequences with the first character (ch)
         */
        for(String resultString: restOfTheStringResult) {   
            String myString  = ch + resultString; 
            myResult.add(myString);
        }
    
        // Line-6
        return myResult;
    }
}

/**
 * Initial: xyz
 * 
 * 1. Line-1: x
 * 2. Line-2: yz
 * 3. Line-3: recursive call: getSubsequence("yz")
 * 
 * Recursive Call: getSubsequence("yz")
 * 1. Line-1: y
 * 2. Line-2: z
 * 3. Line-3: recursive call: getSubsequence("z")
 * 
 * Recursive Call: getSubsequence("z")
 * 1. Line-1: z
 * 2. Line-2: ""
 * 3. Line-3: recursive call: getSubsequence("") => [""]
 * 
 * Base Case:
 * => if str.length() == 0
 *       return [""]  // Base Case ArrayList
 * 
 * 4. Line-4:
 * In every recursive call, values will be added to ArrayList:
 * a. "",        => [""]
 * b. "z",       => ["", "z"]
 * 
 * In getSubsequence("z"):
 * a. "",        => [""]
 * b. "z",       => ["", "z"]
 * 
 * In getSubsequence("yz"):
 * a. "",        => [""]
 * b. "z",       => ["", "z"]
 * c. "y",       => ["", "z", "y"]
 * d. "yz",      => ["", "z", "y", "yz"]
 * 
 * 5. Line-5:
 * In getSubsequence("xyz"):
 * a. "",        => [""]
 * b. "z",       => ["", "z"]
 * c. "y",       => ["", "z", "y"]
 * d. "yz",      => ["", "z", "y", "yz"]
 * e. "x",       => ["", "z", "y", "yz", "x"]
 * f. "xz",      => ["", "z", "y", "yz", "x", "xz"]
 * g. "xy",      => ["", "z", "y", "yz", "x", "xz", "xy"]
 * h. "xyz"      => ["", "z", "y", "yz", "x", "xz", "xy", "xyz"]
 */


/**
 * Note: Recursion m 2 hi trick hai:
 * (a) Upar jaate hai fir niche aate hue solve hui 
 * (Faith & Expectation trick)
 * (b) Upar jaate hi solve hoti hai aur ans base case m aata hai
 *     (Level & Options trick)
*/