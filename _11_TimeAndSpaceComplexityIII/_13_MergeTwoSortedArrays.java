package _11_TimeAndSpaceComplexityIII;

import java.util.Scanner;

public class _13_MergeTwoSortedArrays {
    /**
     * TC: O(n logn)
     * */ 

    /** 
     * Brute Force Approach: (Not Good Approach)
     * => 2-sorted arrays ko merge karne k liye hum basic approach v
     *    use kr skte hai.
     * 1. Ye humaare paas 2-array given honge:
     *           i
     * arr1[] = [2, 5, 12, 18, 20]
     * arr2[] = [7, 9, 11, 15, 25, 28, 30, 35]
     *           j
     * 
     * 2. Humein inn dono ko merge karna hai to hum 1st array k piche
     *    2nd array ko append kar denge:
     * => final[] = [2, 5, 12, 18, 20, 7, 9, 11, 15, 25, 28, 30, 35]
     * => We have appended Array2 after Array 1.
     * => TC: O(n^2)
     * 
     * => final[] = [2, 5, 12, 18, 20, 7, 9, 11, 15, 25, 28, 30, 35]
     * => We have now the sorted the array.
     * TC  : O(n log n)
     * 
     * Note: Overall Time Complexity: O(n^2) + O(n log n) => O(n^2)
     *       Brute Force Method(Straight Forward Method) se hum Merge
     *       Sorted Array problem ko solve karne se n^2 TC lagti hai.
    */
    
    
    /** 
     * Better Approach:
     * => Humein 2 Array given honge
     *                   0   1   2   3   4
     *    (a) arr1[] = [10, 20, 30, 40, 50]
     *                   i
     * 
     *                   0   1   2   3   4   5   6   7
     *    (b) arr2[] = [11, 15, 22, 28, 44, 66, 88, 92]
     *                   j
     * 
     * 1. Ab ek new array m inn dono array content ko(dono array k element
     *    ko) sort karke daalna hai.
     * 
     * 2. Humein ek array bnana hoga arr1[] aur arr2[] k sum k size jitna:
     *    int[] ans = new int[m+n];
     * 
     *             0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
     *    ans[] = [                                        ]
     *             k
     * => 'k' se travel karte hai aur saare elements ko ans array k.
     * arr1[i] < arr2[j]
     * 
     *               k
     * => final[] = [2, 5, 12, 18, 20, 7, 9, 11, 15, 25, 28, 30, 35]
     * 
     * 3. Now compare values of arr1[] & arr2[] and assigning values
     *    which are smaller in answer:
     *    arr1[] = [10, 20, 30, 40, 50]
     *    arr2[] = [11, 15, 22, 28, 44, 66, 88, 92]
     * 
     *             0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
     *    ans[] = [2                                       ]
     *             k
     * => 2 < 7
     * => final[0] = 2
     *    i++;
     *    k++;
     * 
     *             0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
     *    ans[] = [2  5                                    ]
     *                k
     * => 5 < 7
     * => final[1] = 5
     *    i++;
     *    k++;
     * 
     *             0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
     *    ans[] = [2  5  7                                 ]
     *                   k
     * => 7 < 12
     * => final[2] = 7
     *    j++;
     *    k++;
     * 
     * So, we are slowly maoving across the arrays and building a new merged
     * array which is also in sorted order by making greedy decision at
     * every point of choosing the smaller value.
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /**
         * Array-1:
        */
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = scn.nextInt();
        }

        /**
         * Array-2:
        */
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++){
            arr2[i] = scn.nextInt();
        }

        /**
         * Merged Array:
        */
        int[] ans = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }

            if(i == arr1.length) {
                while(j < arr2.length) {
                    ans[k] = arr2[j];
                    j++;
                    k++;
                } 
            } else if(j == arr2.length) {
                while(i < arr1.length) {
                    ans[k] = arr1[i];
                    i++;
                    k++;
                }
            }
        }
        printMergedArr(ans);
    }

    /**
     * Print the merged array:
    */
    public static void printMergedArr(int[] ans) { 
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

