package _09_Strings;

public class _07_CheckStringIsPalindrome {
    public static void main(String[] args) {

        /**
         * Q. Check if a String is Palindrome?
         * => "racecar", "noon", "madam"
         * 
         * => Palindrome dhundne ka easiest way h : divide the String
         *    into half, aur fir saamne wale first letter ko last se 
         *    compare kre. 2nd ko 2nd last se compare kre and so on
         *    jbtk middle point pe hm naa pahuch jae.
         * => Aur agar same aa rhe aur hm mid m v aa gye means humaari
         *    String Palindrome hai.
         * 
         * Logic: Compare first with last index :
         * => for(int i = 0 to length/2) {
         *       str(i) == str(n-1-i)
         *    }
         * 
         *    (a) race car                      => r a c e c a r
         *     => r == r (0 == n-1-0)              0 1 2 3 4 5 6
         *     => a == a (1 == n-1-1)              0           n-1-i
         *     => c == c (2 == n-1-2)           => length = 7
         *     =>    e   (3 == n-1-3)
         * */ 

        String str = "racecar";
        String str01 = "Mohammad";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str01));
    }

    public static boolean isPalindrome(String str) { 
        
        for(int i = 0; i < str.length()/2; i++) {
            /**
             * Compare firstIdx with lastIdx:
            */
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                // not a palindrome
                return false;
            }
        }
        // palindrome
        return true;
    }
}
