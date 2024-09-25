package _15_Sorting;

import java.util.Scanner;

public class _25_Radix_Sort {
    /**
     * Radix Sort:
     * => This sort algorithm uses the Count Sort Algorithm inside it.
     * 
     *    2  5  8  3
     *    9  4  6  2
     *       9  9  9
     *    5  1  9  3
     *    7  2  4  6
     *    4  3  8  1
     *    5  4  5  4
     *             |
     *             V
     *             Sbse pehle iske basis pe sorting hogi:
     *             4  3  8  1
     *             9  4  6  2
     *             2  5  8  3 (Stable sort h isliye jo pehle tha wo aaega)
     *             5  1  9  3
     *             5  4  5  4
     *             7  2  4  6
     *                9  9  9
     *                   |
     *                   V
     *                   Ab iske basis pe sort krnge
     *                   7  2  4  6
     *                   5  4  5  4
     *                   9  4  6  2
     *                   4  3  8  1
     *                   2  5  8  3
     *                   5  1  9  3
     *                      9  9  9
     *                      |
     *                      V
     *                      Ab iske basis pe sort krnge
     *                      5  1  9  3
     *                      7  2  4  6
     *                      4  3  8  1
     *                      5  4  5  4 
     *                      9  4  6  2
     *                      2  5  8  3
     *                         9  9  9
     *                      |
     *                      V
     *                      Ab iske basis pe sort krnge
     *                     (Jaha digit naa dikhe waha '0' consider krnge)
     *                      0  9  9  9
     *                      2  5  8  3
     *                      4  3  8  1
     *                      5  1  9  3
     *                      5  4  5  4
     *                      7  2  4  6
     *                      9  4  6  2
     * 
     * Note: FreqArr = 10 size ka bnega qki digits k basis pe game ho rha hai
     *       Aur digits 0-9 tk hai
     * */ 

    public static void radixSort(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int place = 1;
        while(max / place > 0) {
            countSort(arr, place);
            place = place * 10;
        }
    }

    public static void countSort(int[] arr, int exponent) {
        // creating the frequency array and the answer array
        int[] freqArr = new int[10];
        int[] ans = new int[arr.length];

        
        // Collecting the frequencies.
        // 4674 / 1 % 10
        // 4674 / 10 % 10
        // 4674 / 100 % 10
        // 4674 / 1000 % 10
        for(int i = 0; i < arr.length; i++) {
            int val = arr[i] / exponent % 10;
            freqArr[val]++; 
        }

        // Convert the frequency array to prefixSum array
        for(int i = 1; i < freqArr.length; i++) {
            freqArr[i] += freqArr[i-1];
        }

        // Fill the ans
        for(int i = arr.length-1; i >= 0; i--) {
            int val = arr[i] / exponent % 10;
            int position = freqArr[val];
            ans[position-1] = arr[i] ;
            freqArr[val]--;
        }

        // Fill the original array
        for(int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }

        System.out.println("After Sorting on " + exponent + " place -> ");
        print(arr);
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        radixSort(arr);
    }
}
