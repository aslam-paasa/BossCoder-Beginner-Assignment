package _18_RecursionWithBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Level & Option: O(2^n)
 * Storing in an arraylist and then returning it
*/
public class _99_PrintSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> aCont = new ArrayList<>();
        pss(str, "", aCont);
        System.out.println(aCont);
    }

    // xyz, '.'
    public static void pss(String ques, String asnSoFar, ArrayList<String> aCont) {
        if(ques.length() == 0) {
            aCont.add(asnSoFar);
            return;
        }

        // Line-1:
        char ch = ques.charAt(0); // x
        // Line-2:
        String restOfQues = ques.substring(1); // yz

        // Line-3 => No!
        pss(restOfQues, asnSoFar + "-", aCont);
        // Line-4 => Yes!
        pss(restOfQues, asnSoFar + ch, aCont);

        // 37:19
    }
}
