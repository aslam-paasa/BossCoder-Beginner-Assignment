package _14_TimeAndSpaceComplexityIII;

import java.util.Arrays;
import java.util.Scanner;

public class _15_TargetSumPair {
    public static void main(String[] args) {
        /**
         * TC: O(n logn)
         * */
        
        /**
         * arr[] = [6, 9, 14, 4, 7, 11, 12, 3, 15]
         * target = 18
         * 
         * => Print all those pair or elements whose sum is 18.
         *    (a) 6 + 12
         *    (b) 4 + 14
         *    (c) 7 + 11
         *    (d) 3 + 15
         * 
         * 
         * Step-1: Array.sort(arr) => O(n logn)
         * [3, 4, 6, 7, 9, 11, 12, 14, 15]
         * Step-2: 
         * => 2 Pointers: leftIdx & rightIdx = Sum of leftIdx + rightIdx = 18
         *    (a) 3 + 15 = 18 [print]
         *        leftIdx++;
         *        rightIdx--;
         *    (b) 4 + 14 = 18 [print]
         *        leftIdx++;
         *        rightIdx--;
         *    (c) 6 + 12 = 18 [print]
         *        leftIdx++;
         *        rightIdx--;
         *    (d) 7 + 11 = 18 [print]
         *        leftIdx++;
         *        rightIdx--;
         *    (e) 9 + 9 = 18 [print]
         *        leftIdx++;
         *        rightIdx--;
        */

        /**
         * Example-2:
         * arr[] = [18, 5, 4, 20, 7, 19, 22, 25]
         * target = 25
         * 
         * Step-1: Arrays.sort(arr) => O(n logn)
         * [4, 5, 7, 18, 19, 20, 22, 25]
         * 
         * Step-2: Two Pointer: leftIdx & rightIdx
         * (a) 4 + 25 = 29 [greater than target, so -- the sorted rightIdx]
         *     rightIdx--;
         * (b) 4 + 22 = 26 [greater than target, so -- the sorted rightIdx]
         *     rightIdx--;
         * (c) 4 + 20 = 24; [less than target, so ++ the sorted leftIdx]
         *     leftIdx++;
         * (d) 5 + 20 = 25; [print]
         *     leftIdx++;
         *     rightIdx--;
         * (e) 7 + 19 = 26; [greater than target, so -- the sorted rightIdx]
         * (f) 7 + 18 = 25; [print]
         *    
        */

        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // sort => O(n logn)
        Arrays.sort(arr);

        /**
         * Meet in the middle: Two Pointer
        */
        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        /**
         * O(n)
        */
        while(leftIdx < rightIdx) {
            if(arr[leftIdx] + arr[rightIdx] > target) {
                rightIdx--;
            } else if(arr[leftIdx] + arr[rightIdx] < target) {
                leftIdx++;
            } else {
                System.out.println(arr[leftIdx] + " " + arr[rightIdx]);
                leftIdx++;
                rightIdx--;
            }
        }
    }
}
