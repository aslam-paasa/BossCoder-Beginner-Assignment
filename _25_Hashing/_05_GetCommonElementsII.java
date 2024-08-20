package _25_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class _05_GetCommonElementsII {
    /**
     * Two inputs:
     * (a) one = 1 1 1 2 2 3 5
     * (b) two = 1 1 2 2 2 4 5
     * Note: Sorted hona jaruri nhi hai
     * 
     * 1. Get Common Element-I
     * => Print common elements: 1, 2, 5
     * 
     * 2. Get Common Element-II
     * => 1 1 2 2 5
     * */ 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        /**
         * Travel through arr1 and fill hashmap
        */
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        /**
         * Ek Ek kr k elements aaenge [key]
         * Agar key present nhi hai to "1" daal denge
         * Aur agar pehle se hai to oldFreq get() kro
         * Increment the newFreq with oldFreq+1
         * And update val[key] : newFreq[value] if existing
         */
        for(int val: arr1) {
            if(freqMap.containsKey(val) == false) {
                freqMap.put(val, 1);
            } else {
                int oldFreq = freqMap.get(val);
                int newFreq = oldFreq + 1;
                freqMap.put(val, newFreq);
            }
        }

        /**
         * Travel through second array, print and remove
        */
        for(int val: arr2) {
            if(freqMap.containsKey(val) == true && freqMap.get(val) > 0) {
                System.out.println(val);
                int oldFreq = freqMap.get(val);
                int newFreq = oldFreq - 1;
                freqMap.put(val, newFreq);
            }
        }
    }
}
