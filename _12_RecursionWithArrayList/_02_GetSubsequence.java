package _12_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_GetSubsequence {
    /**
     * abc: 
     * => Total 8 subsequences: 2^n 
     *    x x x => x (blank)
     *    x x c => c
     *    x x b => b
     *    x b c => bc
     *    a x x => a
     *    a x c => ac
     *    a b x => ab
     *    a b c => abc
     * => We have to return all the subsequences of abc.
     * 
     * Note: abc = 2^3 = 8
     *       ""  = 2^0 = 1
     * 
     * Q. How can we pay 0 rupees?
     * => By paying nothing:
     *    ""  = 2^0 = 1
     * 
     * Remember:
     * 1. nC0 
     * => In how many ways can we select 0 apples out of 5?
     * => Don't pick any apple -> 5C0
     * 
     * 2. x^0 = 1
     * 
     * 3. In how many ways can I pay you 0 rupees?
     * => 1 way: I don't pay you anything
     * 
     * 4. In how many ways can we walk from 0th stair to 0-stair?
     * => 1 way: Don't move
     */ 
    
    /** 1. Expectation:
     * => gss(abc) = x x x      a x x
     *               x x c      a x c
     *               x b x      a b x
     *               x b c      a b c
     * 
     * 2. Faith: gss(bc) = x x
     *                     x c
     *                     x b
     *                     b c
     * 
     * 3. EwF: gss(abc) = x.gss(bc) + a.gss(bc)
    */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> subseq = getSubseq(str);
        System.out.println(subseq);
    }

    /**                           <------- . --------->   <-------- a ------->
     * 1. Expectation: gss(abc) = [..., ...c, .b., .bc] + [a.., a.c, ab., abc]
     * 2. Faith      : gss(bc)  = [.., .c, b., bc]
     * 3. EwF        : gss(abc) = .gss(bc) + a.gss(bc) 
    */
    public static ArrayList<String> getSubseq(String str) {
        
        /**
         * Base Case:
        */
        if(str.length() == 0) {
            ArrayList<String> baseRes = new ArrayList<>();
            /**
             * Q. How can we pay 0 rupees?
             * => By paying nothing: ""  = 2^0 = 1
            */
            String theSS = "";
            baseRes.add(theSS); // if [] with size 0 then return ""
            return baseRes;    // [""] with size 1, bres.get(0).length == 0
        }

        char ch = str.charAt(0); // abc -> a
        String ros = str.substring(1); // abc -> bc
        ArrayList<String> rres = getSubseq(ros); // [.., .c, b., bc]

        ArrayList<String> mres = new ArrayList<>(); // empty -> everything
        
        for(String rstr: rres) {
            mres.add("." + rstr);
        } // mres = ..., ..c, .b., .bc

        for(String rstr: rres) {
            mres.add(ch + rstr);
        } // mres = ..., ..c, .b., .bc, a.., a.c, ab., abc
        return mres;
    }
}
