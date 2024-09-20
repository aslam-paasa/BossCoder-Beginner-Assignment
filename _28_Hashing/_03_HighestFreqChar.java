package _28_Hashing;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class _03_HighestFreqChar {
    /**
     * Find the max frequency of the character?
     * "abbcbddabccb"
     * => a : 2
     * => b : 5
     * => c : 3
     * => d : 2
     * 
     * TC: O(n)
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        /**
         * 1. Make char as key
         * 2. Integer as value
        */
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            /**
             * Ek Ek kr k character aaenge [key]
            */
            char ch = str.charAt(i);
            /**
             * Agar key present nhi hai to "1" daal denge
            */
            if(freqMap.containsKey(ch) == false) {
                freqMap.put(ch, 1);
            } 
            /**
             * Agar key existing hai to increment by 1
            */
            else {
                int  oldFreq = freqMap.get(ch);
                int newFreq = oldFreq + 1;
                freqMap.put(ch, newFreq);
            }
        }

        /**
         * Logic-1:
         * char maxFreqCh = str.charAt(0);
         * for(int i = 1; i < str.length(); i++) {
         *    char ch = str.charAt(i);
         * 
         *    if(freqMap.get(ch) > freqMap.get(maxFreqCh)) {
         *        maxFreqCh = ch;
         *    }
         * }
         * 
         * Logic-2: More Optimized
         * char maxFreqCh = str.charAt(0);
         * Set<Character> uniqueChar = freqMap.keySet();
         * for(char ch: uniqueChar) {
         *    if(freqMap.get(ch) > freqMap.get(maxFreqCh)) {
         *        maxFreqCh = ch;
         *    }
         * }
         * 
         * 1. maxFreqCh humne 0th ko maan liye i.e. "a"
         * 2. Set<Character> m sirf unique keys aaengi
         * 2. loop "1" se start hoga
         * 3. Har char apni freq "a" se compare krega aur jo max
         *    hoga wo update ho k maxFreqCh m store ho jaega
         * 
        */

        char maxFreqCh = str.charAt(0);
        Set<Character> uniqueChar = freqMap.keySet();
        for (char ch : uniqueChar) {
            if (freqMap.get(ch) > freqMap.get(maxFreqCh)) {
                maxFreqCh = ch;
            }
        }
        System.out.println(maxFreqCh);
    }
}


