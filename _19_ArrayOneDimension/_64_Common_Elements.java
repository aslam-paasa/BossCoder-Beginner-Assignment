package _18_ArrayOneDimension;

import java.util.ArrayList;

public class _64_Common_Elements {
    public static void main(String[] args) {
        /**
         * Commong Elements in 3 sorted Array:
         * => 3 sorted array => increasing 
         * 
         * 1. n1 = 6; A = {1, 5, 10, 20, 40, 80};
         * 2. n2 = 5; B = {6, 7, 20, 80, 100};
         * 3. n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120};
         * 
         * => Output: 20 80
         * 
         * TC: O(n1 + n2 + n3)
         * SC: O(n1 + n2 + n3)
         * 
         *  3-Pointers use krnge: [i, j, k]
         * +-------------------------------+
         *                'i'
         * 1. n1 = 6; A = {1, 5, 10, 20, 40, 80};
         * 
         *                'j'
         * 2. n2 = 5; B = {6, 7, 20, 80, 100};
         * 
         *                'k'
         * 3. n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120};
         * 
         * (1) if(A[i] == B[j] == C[j] == ([k])) => Common Found
         *     i++;
         *     j++
         *     k++;
         * 
         * (2) else if(A[i] < B[j]) {
         *        i++;
         *     }
         * 
         * (3) else if(B[j] < C[k]) {
         *        j++;
         *     }
         * 
         * (4) else {
         *        k++;
         *     }
         * */ 

        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < A.length && j < B.length && k < C.length) {
            if(A[i] == B[j] && B[j] == C[k]) {
                // System.out.println(A[i]);
                ans.add(A[i]);
                i++;
                j++;
                k++;
            } else if(A[i] < B[j]) {
                i++;
            } else if(B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }
        System.out.println(ans);
        // return ans;
    }
}

/**
 * Note: Test Case Filed: Cannot handle large input*/ 
