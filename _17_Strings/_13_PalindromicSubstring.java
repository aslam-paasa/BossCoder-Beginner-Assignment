package _17_Strings;

import java.util.Scanner;

public class _13_PalindromicSubstring {
    public static void main(String[] args) {
        /**
         * Palindrome: If we read it from front or back, sounds similar like Nitin, Gag
         * etc.
         * Example: Malayalam, Nitin etc...
         * 
         * String: abccbc
         * => Print all the substrings :
         *   sIdx                                                   eIdx
         *   [01]a      [12]b      [23]c       [34]c     [45]b      [56]c
         *   [02]ab     [13]bc     [24]cc      [35]cb    [46]bc
         *   [03]abc    [14]bcc    [25]ccb     [36]cbc
         *   [04]abcc   [15]bccb   [26]ccbc
         *   [05]abccb  [16]bccbc
         *   [06]abccbc
         * 
         * => i=0, j=1,5 i=1, j=2,6 i=2, j=3,6 i=3, j=4,6 i=4, j=5,6 i=5, j=6,6
         * => 'j' har baar "i+1" se shuru hoga, till s.length() tk jaega.
         * 
         * Note:
         * => Generate all substring one-by-one.
         * => Check if a substring is palindrome or not
         * => print it.
         */

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        /**
         * Loop to print all the substring:
         * for(int i = 0; i < s.length(); i++) {
         *    for(int j = i+1; j <= s.length(); j++) {
         *       String sub = s.substring(i, j);
         *    }
         * }
         */
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                boolean isPalindrome = IsPalindrome(sub);

                if (isPalindrome) {
                    System.out.print(sub + " ");
                }
            }
        }
    }

    /**
     * Function to check Palindrome:
     * => flag == true rakhe
     * => Ek loop chalate rhe
     * => while(left < right) => 2 index lete hai:
     *    (a) left
     *    (b) right
     * => Agar left wala element right k equal nhi hai to loop se
     *    bahar ho jao, break kr do, flag ko false kr do
     * => Aur agar left element == right element hai to left++ & right--
     * => Aur agar loop apne aap end hoga to flag avi v true hai so return
     *    true, else false.
     */

    public static boolean IsPalindrome(String sub) {
        boolean flag = true;
        int left = 0;
        int right = sub.length() - 1;

        while (left < right) {
            char chLeft = sub.charAt(left);
            char chRight = sub.charAt(right);

            if (chLeft != chRight) {
                flag = false;
                break;
            }

            left++;
            right--;
        }
        return flag;
    }
}
/**
 * TC: O(n^3)
 * SC: O(n)
 */