package _18_ArrayOneDimension;

import java.util.ArrayList;

public class _39_UnionOfTwoArray {
    public static void main(String[] args) {
        /**
         * Input array:
         * (a) a[] = {2, 4, 6, 8}
         * (b) b[] = {1, 3, 7}
         * 
         * Union of two array :
         * => Dono array k saare elements ko teesre array m daal denge.
         * => {1, 2, 3, 4, 6, 7, 8}
         * 
         * Logic:
         * 1. Create an ans[]
         * 2. Put all elements of a[] in ans[]
         * 3. Put all elements of b[] in ans[]
         * 
         * Note: In this problem, we are not handling duplicates, sorting.
        */

        int arr[] = {1, 3, 5, 7, 9};
        int brr[] = {2, 4, 6, 8};

        ArrayList<Integer> ans = new ArrayList<>();

        /**
         * Push all elements of array arr to ans:
         * */ 
        for(int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }

        /**
         * Push all elements of array brr to ans:
         * */ 
        for(int i = 0; i < brr.length; i++) {
            ans.add(arr[i]);
        }

        /**
         * Print ans[]:
        */
        System.out.println("Printing ans array:");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
