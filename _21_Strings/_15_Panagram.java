package _20_Strings;

/**
 * => A Panagram is a sentence containing every letter in the
 *    English Alphabet.
 * 
 * => Input-1: "The quick brown fox jumps over the lazy dog"
 * => Output-1: true
 * => Explanation: Contains all the characters from 'a' to 'z'
 * 
 * => Input-2: "The quick brown fox jumps over the dog"
 * => Output-2: false
 * 
 * => https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
 */

public class _15_Panagram {
    public static boolean check(String sentence) {
        int n = sentence.length();

        // Creating attendance array
        boolean[] attendance = new boolean[26];

        // Finding index
        for (int i = 0; i < n; i++) {
            char currentChar = sentence.charAt(i);
                int index = currentChar - 'a';
                attendance[index] = true;
        }

        // Checking if all letters are present
        for (int i = 0; i < 26; i++) {
            if (!attendance[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "thequickbrownfoxjumpsoverthedog";

        System.out.println(check(sentence1)); // Expected Output: true
        System.out.println(check(sentence2)); // Expected Output: false
    }
}
