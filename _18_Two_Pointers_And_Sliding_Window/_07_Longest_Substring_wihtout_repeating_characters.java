package _18_Two_Pointers_And_Sliding_Window;

import java.util.HashMap;

public class _07_Longest_Substring_wihtout_repeating_characters {
    /**
     * Longest substring without repeating characters:
     * => Any portion of the string which is consecutive in nature.
     * => We have 255 ASCII characters total.
     * 
     * s = c a d b z a b c d
     * 
     * => c
     * => c a
     * => c a d
     * => c a d b
     * => c a d b z => 5
     * 
     * Brute Force Algorithm:
     * maxLength = 0;
     * for(int i = 0; i < n; i++) {
     *    hash[] hash = new hash[255];
     *    sub = ""; <= empty string
     *    for(int j = i; j < n; j++) {
     *       => handle repeatition
     *       if(hash[s[j] == i) {
     *          break;
     *       }
     *       len = j-i+1
     *       maxLength = max(len, maxLength);
     *       hash[s[j]] = 1
     *    }
     *    print(maxLength);  
     * }
     * 
     * TC: O(n*n) => O(n^2)
     * SC: O(256)
     * 
     * Optimized Approach:
     * 
     * Q. How do we figure out which algorithm should we use?
     * => Previous solution was taking O(n^2), which means somewhere around
     *    O(nlogn, n, logn, 1)
     * => Any problem which involves finding the max substring etc like that
     *    we should start thinking "two pointer+sliding window" approach.
     * 
     * 1. Note down the indexes:
     *        0 1 2 3 4 5 6 7 8
     *    s = c a d b z a b c d
     *        l 
     *        r
     *    => 'l' to 'r' is the substring or answer we are looking at.
     * 2. At the same time we are taking a hash to remember the character.
     *    It will store the character, index where we have seen it previously.
     *    (a) r = 'c' -> look in the hashmap that have we seen this previously.
     *        idx-0 = c
     *        length = r - l + 1 => 0 - 0 + 1
     *                           => 1
     * 
     *    (b) r = 'a' -> look in the hashmap that have we seen this? No!
     *        len = r - l + 1 => 1 - 0 + 1
     *                        => 2
     * 
     *    (c) r = 'd' -> look in the hashmap that have we seen this? No!
     *        len = r - l + 1 => 2 - 0 + 1
     *                        => 3
     * 
     *    (d) r = 'b' -> look in the hashmap that have we seen this? No!
     *        len = r - l + 1 => 3 - 0 + 1
     *                        => 4
     * 
     *    (e) r = 'z' -> look in the hashmap that have we seen this? No!
     *        len = r - l + 1 => 4 - 0 + 1
     *                        => 5
     * 
     *    (f) r = 'a' -> look in the hashmap that have we seen this? Yes!
     *        len = hashmap[s[r]]+1
     *            = 1 + 1
     *    
     *  => hashmap = [(c, 0), (a,1), (d, 2), (b, 3), (z, 4)]
     * 3. maxLength = 0 -> 1 -> 2 -> 3 -> 4 -> 5
     *        
     * 
     * Algorithm:
     * function(string s) {
     *    hash[256] -> [-1] <= -1 means we haven't seen them before
     *    l = 0;
     *    r = 0;
     *    n = s.size();
     *    maxLength = 0;
     * 
     *    while(r < n) {
     *    => check if the char is present in the hash
     *       if(hash[s[r]] != -1) <= means it is in the map
     *       {
     *          if(hash[s[r]] >= l) {
     *             l = hash[s[r]] + 1;
     *          }
     *       }
     *       len = r - l + 1;
     *       maxLength = max(len, maxLength);
     *       hash[s[r]] = r;
     *       r++;
     *    }
     *    return maxLength;
     * } 
     * 
     * TC: O(n)
     * SC: O(256)
     * 
    */

    public static int longestSubstringBruteForce(String s) {
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            boolean[] seen = new boolean[256];
            int currentLength = 0;

            for (int j = i; j < n; j++) {
                char currentChar = s.charAt(j);
                if (seen[currentChar]) {
                    break; // Repeated character found, break out of the loop
                }

                seen[currentChar] = true;
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static int longestSubstringOptimized(String s) {
        int n = s.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < n) {
            char currentChar = s.charAt(right);

            if (hashMap.containsKey(currentChar)) {
                left = Math.max(hashMap.get(currentChar) + 1, left);
            }

            hashMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "aaaaaaab";
        System.out.println("Longest substring length (Brute Force): " + longestSubstringBruteForce(s));
        // System.out.println("Longest substring length (Optimized): " + longestSubstringOptimized(s));
    }
}
