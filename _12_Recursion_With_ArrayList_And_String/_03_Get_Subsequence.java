package _12_Recursion_With_ArrayList_And_String;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Get_Subsequence {
    /**
     * Q. Humein ek string mila "abc", uske saare subsequence print karaane
     *    hai.
     * => Subsequence: 2^n
     * => Every character has two option:
     *    (a) include
     *    (b) exclude
     * => Example: subsequence of "abc" => 2^3 => 8 output possible
     *    _ _ _ (teeno ne mana kr diya)
     *    _ _ c (sirf 'c' ne haa kaha)
     *    _ b _ (sirf 'b' ne haa kaha)
     *    _ b c ('b & c' ne haa kaha)
     *    a _ _ (sirf 'a' ne haa kaha)
     *    a _ c ('a' & 'c' ne haa kaha)
     *    a b _ ('a' & 'b' ne haa kaha)
     *    a b c (teeno ne haa kaha)
     * => We have to get all these subsequences.
     * 
     * Note: Substring is different. For n-char: n(n+1)/2
     *       => a
     *          a b
     *          a b c
     *          b
     *          b c
     *          c
     * */ 

    // Expectation: getSubSeq(abc) = All 8 possible results
    // Faith: getSubSeq(bc) = All 2^2 => 4 possible results
    // FwE: getSubSeq(abc) = getSubSeq(bc) => a + getSubSeq(bc) [4 include + 4 exclude of 'a']

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        /**
         * Storing the Recursive Call:
        */
        ArrayList<String> result = getSubSeq(str);
        System.out.println(result);
    }

    public static ArrayList<String> getSubSeq(String str) {
        /**
         * 'abc' depends on res of 'bc'
         * 'bc' ka result mil jae i.e. [_ _, _ c, b _, b c]
         * (a) Exclude: [_ _ _, _ _ c, _ b _, _ b c]
         * (b) Include: [a _ _, a _ c, a b _, a b c]
         * */ 

        /**
         * 4. Base Case:
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
         * 1. 'abc' ka pehla character le lenge i.e. 'a'
        */
        char firstChar = str.charAt(0); // 0th char
        String restOfChar = str.substring(1); // 1-end tk char

        /**
         * 2. Store the Recursive Result(Faith Result):
        */
        ArrayList<String> faithResult = getSubSeq(restOfChar); // Faith result

        /**
         * 3. Store the Include-Exclude Result(Expectation Result):
         * => Faith Result pe loop lagaenge:
         *    (a) Ek baar isme kuch add nhi krnge
         *    (b) Dusri baar k loop m 'a' add kr denge
         *    
        */
        ArrayList<String> expectationResult = new ArrayList<>();
        
        for(String finalString: faithResult) {
            // Include
            expectationResult.add(firstChar + finalString);
            // Exclude
            expectationResult.add("_" + finalString);
        }

        return expectationResult;
    }
}

/**
 * (4) [_]         => (5) [_]     
 *      | 
 *      V
 * (3) [c, _]      => (6) [_ _, c _]
 *      |  
 *      V 
 * (2) [b, c]      => (7) [_ _ _, b _ _, _ c _, b c _]
 *      |       
 *      V
 * (1) [a, b, c]   => (8) [_ _ _ _, _ b _ _, _ _ c _, _ b c _, a _ _ _, a b _ _, a _ c _, a b c _]
 * 
*/