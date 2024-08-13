package _23_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class _06_HighestFrequencyCharacter {
    public static void main(String[] args) {
        
        /**
         * Approach:
         * 1. We create a new HashMap of Character Vs Integer named "hm"
         *    (a) key : Character
         *    (b) value : Integer
         * 2. We iterate through all the characters of the String and check
         *    if the hashmap contains the given character. If it does, then
         *    we get the frequency of that character and store in the "old"
         *    variable. Then we increase it by 1 and store in the "new". 
         *    The "new" gets inserted in hashmap against Character.
         * 3. Else if the hashmap does not contain that character then we add
         *    it to hashmap with its frequency 1.
         * 4. We initialize a variable "max" with the first character of the
         *    given String  where "max" is the character with highest frequency.
         *    => char max = str.charAt(0);
         *    => means max m wo character store hogi jiski frequency sbse jyda hai.
         * 5. We apply the for loop for every character of the HashMap. If the 
         *    frequency of current character is greater than the frequency of "max"
         *    then that character gets stored in max.
         * 6. After comparing the frequency of all the characters, we print the "max".
         * */ 

        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                int old = hm.get(ch);
                int neW = old + 1;
                hm.put(ch, neW);
            } else {
                hm.put(ch, 1);
            }
        }

        char max = str.charAt(0);
        
        for (Character key : hm.keySet()) {
            if (hm.get(key) > hm.get(max)) {
                max = key;
            }
        }
        
        System.out.print(max);

        /**
          * TC of Highest Frequency Character Function = O(n) + O(n) [2 loops]
          *                                            = O(n) 
         */
    }
}
