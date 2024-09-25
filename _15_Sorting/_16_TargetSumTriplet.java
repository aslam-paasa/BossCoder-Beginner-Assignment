package _15_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class _16_TargetSumTriplet {
    public static void main(String[] args) {
        /**
         * Target Sum Triplet:
         * arr[] = [1, 9, 6, 4, 8, 3, 12, 14, 24,, 10, 15]
         * target = 25
         * 
         * => i, j, k should be different.
         * => unique
         * 
         * Step-1: Array.sort(arr) => O(n logn)
         * arr[] = [1, 3, 4, 6, 8, 9, 10, 12, 14, 15, 24]
         * 
         * Step-2: Three Pointer: i, j, k
         * 
         * */
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Sort: O(n logn)
        Arrays.sort(arr);

        /**
         * Logic: Three Pointer O(n^2)
        */
        for(int i = 0; i < arr.length; i++) {
            int nTarget = target - arr[i];
            int j = i+1;
            int k = arr.length - 1;
            boolean atLeastOneFound = false;

            while(j < k) {
                if(arr[j] + arr[k] > nTarget) {
                    k--;
                } else if(arr[j] + arr[k] < nTarget) {
                    j++;
                } else {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    j++;
                    k--; 
                    atLeastOneFound = true;
                }
            }
            if(atLeastOneFound == false) {
                break;
            }
        }
    }
}
