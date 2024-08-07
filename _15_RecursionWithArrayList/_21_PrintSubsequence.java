package _15_RecursionWithArrayList;

import java.util.Scanner;

public class _21_PrintSubsequence {
    /**
     * Subsequence by Level and Option Trick: O(2^n)
     * => Numerator   = xyz
     * => Denominator = ans
     * 
     * We will solve character by character. Ye 'x' character 2 tarike se
     * solve ho skta hai. Yaa to ye kahegi ki main solution ka part
     * nhi banunga ya mai solution ka part banunga. Fir next level par
     * humaare paas question m 'y' & 'z' bachega, qki 'x' has been 
     * solved. Level and Options can be solved in a No! or Yes!.
     *                       xyz
     *                 x      |          -                               [Level-x]
     *           ------------------------------------
     *           |                                  |                  
     *           V                                  V
     *           yz[x]                              yz[-]                [Level-y]
     *      ----------------                   ----------------
     *      |              |                   |              | 
     *      V              V                   V              V
     *      z[--]          z[-y]               z[x-]          z[xy]      [Level-z]
     *      |              |                   |              |
     * -----------    -----------          -----------    -----------      
     * |         |    |         |          |         |    |         |
     *---       --z  -y-       -yz        x-z       x--  xy-       xyz
     *
     * Note: For each level, these two are options.
     * (a) calls = options
     * (b) parameters & base case = levels
     * 
     * Note: Question k format se pta lga jaata hai kn sa approach lena hai:
     * (a) returnType void in functional question - Level & Options
     * (b) returnType ArrayList etc - Faith & Expectation
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        pss(str, "");
    }

    // xyz, '.'
    public static void pss(String ques, String asnSoFar) {
        if(ques.length() == 0) {
            System.out.println(asnSoFar);
            return;
        }

        // Line-1:
        char ch = ques.charAt(0); // x
        // Line-2:
        String restOfQues = ques.substring(1); // yz

        // Line-3 => No!
        pss(restOfQues, asnSoFar + "-");
        // Line-4 => Yes!
        pss(restOfQues, asnSoFar + ch);
    }
}

/**
  * Here is the dry run in the requested format:
  * 1. xyz
  * (a) Line-1: x
  * (b) Line-2: yz
  * (c) Line-3: -yz (no!)
  * (d) Line-4: xyz (yes!)
  *
  * 2. yz
  * (a) Line-1: y
  * (b) Line-2: z
  * (c) Line-3: -z (no!)
  * (d) Line-4: yz (yes!)
  * 
  * 3. z
  * (a) Line-1: z
  * (b) Line-2:
  * (c) Line-3: - (no!)
  * (d) Line-4: z (yes!)
  * 
  * => Now, combining the results:
  *    (from z, no!)
  * 1. z (from z, yes!)
  * 2. -z (from yz, no!)
  * 3. yz (from yz, yes!)
  * 4. -yz (from xyz, no!)
  * 5. xyz (from xyz, yes!)
  *
  * This is the dry run of the code in the requested format. 
  * Let me know if you have any further questions! 
  **/ 
