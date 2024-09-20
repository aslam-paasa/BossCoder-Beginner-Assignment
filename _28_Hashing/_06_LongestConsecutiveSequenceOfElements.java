package _28_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class _06_LongestConsecutiveSequenceOfElements {
    /**
     * Input: 9
     *        arr = [8 1 5 10 3 12 11 6 9 2]
     * (a) 1, 2, 3
     * (b) 5, 6
     * (c) 8, 9, 10, 11, 12 [Longest Concsecutive Sequence]
     * 
     * TC: O(n)
     * 
     * 1. Map -> TreeMap -> O(logn)
     * 2. Unordered Map -> HashMap -> O(1)
     * 
     * 1. Loop lagao aur sbke saamne startup sequence "true" kr do.
     * 2. Fir se loop lagao aur jiske liye usse ek number km mil jae
     *    i.e. -1 to false kr do. Jisse humein ye pta laga sirf 1, 5
     *    and startup sequence hai.
     * 3. Ek new hashmap bna lo jisme sirf 1, 5, 8 ko rkho.
     *    => "1" k aage loop lagaenge aur dekhnge ki kya "2" hai,
     *       agar hai to value update kr k "2" kr denge, fir dekhnge
     *       ki "3" hai, agar hai to value "3" kr denge, fir dekhnge
     *       ki "4" hai, agar nhi hai to "1" ki sequence "3" hai.
     *    => Ab hm "5" pe loop lagaenge aur ki kya "6" hai, agar hai to
     *       value update kr k "2" kr denge. 
     *    => Ab "8" k liye loop lagaenge jisme longest consecutive
     *       element "5" hai.
     *    
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        HashMap<Integer, Boolean> map = new HashMap<>();
        
        // O(n)
        for(int val: arr) {
            map.put(val, true);
        }

        // O(n)
        for(int val: arr) {
            if(map.containsValue(val - 1) == true) {
                map.put(val, false);
            }
        }

        int maxStartPoint = 0;
        int maxLength = 0;
        for(int val: arr) {
            if(map.get(val) == true) {
                int tempStartingPoint = val;
                int tempLength = 1;

                while(map.containsKey(tempStartingPoint + tempLength) == true) {
                    tempLength++;
                }

                if(tempLength > maxLength) {
                    maxStartPoint = tempStartingPoint;
                    maxLength = tempLength;
                }
            }
        }

        for(int i = 0; i < maxLength; i++) {
            System.out.print(maxLength + i + " ");
        }
    }
}
