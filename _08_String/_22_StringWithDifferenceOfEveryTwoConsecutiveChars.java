package _08_String;

import java.util.Scanner;

public class _22_StringWithDifferenceOfEveryTwoConsecutiveChars {
    /**
     * ASCII Difference:
     * Input: a c e b f d
     * Output: a2c2e-3b4f-2d
     * Explanation: 
     * 1. a => 97
     * 2. b => 98
     * 3. c => 99
     * 4. d => 100
     * 5. e => 101
     * 6. f => 102
     * 
     * => a-c k bich m 2 ASCII value ka gap hai: a2c
     * => c-e k bich m 2 ASCII value ka gap hai: c2e
     * => e-b k bich m -3 ka gap hai: e-3b
     * => b-f k bich m 4 ka gap hai: b4f
     * => f-d k bich m -2 value ka gap hai: f-2d
     * */ 

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(i == str.length() - 1) {
                char chi = str.charAt(i);
                sb.append(chi);
            } else {
                char chi = str.charAt(i);
                char chip1 = str.charAt(i + 1);
                sb.append(chi);
                sb.append(chip1 - chi);
            }
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}
