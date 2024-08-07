package _13_TimeAndSpaceComplexityIII;

import java.util.Arrays;
import java.util.Scanner;

public class _14_Check_Duplicates {
    /**
     * Check Duplicates: [Merge Sort Dependent Prob]
     * Humein ek array given hai, uss array m values v given hogi. Humein
     * ye btana hai ki uss array m koi value duplicates hai ya nhi aur
     * agar uss array m koi value duplicates hai to wo kn si value hai.
     * Agar array m koi v value duplicate nhi hai to return -1 aur agar
     * duplicate hai to return that value.
     * 
     * Example-1: arr1 = [10, 20, 5, 4, 44, 88, 3] = -1
     * Example-2: arr2 = [10, 20, 5, 44, 88, 5, 3] = 5
     * 
     * Approach-1:
     * => O(n^2) => for*for-loop
     * 
     * Approach-2:
     * => O(n logn) => Merge Sort
     * 
     * Approach-3:
     * => O(n) => Hashmap
     * 
     * (a) O(n logn) TC Merge Sort ki hoti hai.
     * (b) To iss question ko merge sort se solve krnge.
     * (c) Avi humein merge sort nhi aata to hum iss inbuilt fn se
     *     sort krnge i.e. Arrays.Sort(arr)
     * Note: Arrays.Sort() internally uses Insertion Sort + Merge Sort.
     *       Tim Sort(Insertion+Merge) is a sorting algorithm based on
     *       Insertion Sort & Merge Sort.
     * */ 

    /**
     * Example: No Duplicates
     * arr = [10, 20, 5, 4, 44, 88, 3]
     * => To ab iss array ko hum sort krnge O(n logn) time complexity m
     *    using Arrays.Sort(arr) function
     *    [3, 4, 5, 10, 20, 44, 88]
     * => Ab humein iss array m har ek element ko next element se compare
     *    karna hai aur ye check krna hai ki kya wo element next element
     *    k equal hai? Agar hai to return that element otherwise next
     *    element par jao aur usko uske next element se compare karo.
     *    Agar koi v element(till arr.length-2) usse nexy element k equal
     *    nhi hai, then we need to return.
     *     0  1  2   3   4   5   6
     *    [3, 4, 5, 10, 20, 44, 88]
     * Note: Not equal to the next element so, we need to return -1 as the
     *       answer.
     * 
     * TC: O(n logn)[for sorting] + n[for comparison with next element]
     *     O(n logn) => nlogn aur n m se badi wali time complexity hogi
     *                  overall complexity.
    */

    /**
     * Example-1: 1 Duplicate
     * arr = [10, 20, 5, 5, 44, 88, 3]
     * => Humein iss array ko sort krna hai in O(n logn) TC using the
     *    Arrays.sort(arr) function.
     *    [3, 5, 5, 10, 20, 44, 88]
     * 
     * => Now we need to compare every element of this array with the
     *    next element of the array. Agar koi v element next element k 
     *    equal mila to humein wo element return krna hai.
     *    [3, 5, 5, 10, 20, 44, 88]
     *           X
     *    (a) 3 is not equal to its next element 5
     *    (b) 5 is equal to its next element 5
     * 
     * TC: O(n logn)[for Sorting] + O(n)[Comparison]
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Size of the array:
        */
        int[] arr = new int[n];

        /**
         * Taking Input:
        */
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        /**
         * TC: O(n logn)
        */
        Arrays.sort(arr);
        
        /**
         * Comparison Logic:
         * TC: O(n)
        */
        int duplicate = -1;
        for(int i = 0; i < arr.length-2; i++) {
            if(arr[i] == arr[i+1]) {
                duplicate = arr[i];
                break;
            }
        }
        System.out.println(duplicate);
    }
}
