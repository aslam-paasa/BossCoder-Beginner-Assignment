package _18_RecursionWithBacktracking;

public class _05_StringPalindrome {
    /**
     * String Palindrome:
     * => A String on reversal reads the same.
     * => Example: MADAM, "11211"
     * */
    
    /**
     * Logic:
     * f(i) {
     *    if(i >= n/2) {
     *       return true;  => string is equal
     *    }
     * 
     *    if(s[i] != s[n-i-1]) {
     *       return false; => string not equal
     *    }
     * 
     *    return f(i+1);
     * }
     * 
     * main() {
     *    print(f(0))
     * }
    */
}
