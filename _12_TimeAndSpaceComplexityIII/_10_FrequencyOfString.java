package _12_TimeAndSpaceComplexityIII;

import java.util.Scanner;

public class _10_FrequencyOfString {
    public static void main(String[] args) {
        /**
         * Highest Frequency Character: O(n)
         * Q. Wo character print kro jiski frequency sbse jyda hai:
         * => a b r a c a b a r a
         * => TC: O(n)
         * 
         * Explanation:
         * => Isme 26-size ka array bnate hai.
         *     a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z
         *    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ]
         *     0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
         * => Default value = 0
         * => If any character found, increase the count of that index.
         * => Fir loop lga kr jo value sbse bdi hai wo index dhund liye.
         *    But isme se character kaise print krnge?
         *    => ch = character - ASCII 'a'
         *    => ch = d - a
         *          = 100 - 97
         *          = 3
         * => Means 'd' is stored at index-3.
         * */ 

        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int[] freqArr = new int[26]; // 0 par 'a' ki freq, 1 par 'b' ki freq save karunga

        /**
         * Store character to their respective index:
        */
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            freqArr[idx]++; // count badhai index ki
        }

        /**
         * Find Index of maxValue:
        */
        int maxIdx = 0;
        for(int i = 0; i < freqArr.length; i++) {
            if(freqArr[i] > freqArr[maxIdx]) {
                maxIdx = i;
            }
        }        

        /**
         * Convert the character to integer and display maxFreq:
         * => maxIdx + 'a'
         * => 0 + 97
         * => 'a'
        */
        char maxFreq = (char)(maxIdx + 'a');
        System.out.println(maxFreq);
    }
}
