package _15_Sorting;

import java.util.Scanner;

public class _26_Sort_Dates {
    /**
     * Dates are given in DDMMYY format, sort them:
     * 12041996
     * 20101996
     * 05061997
     * 12041989
     * 11081987
     * 
     * 
     * Constraints:
     * 1. 1 <= N <= 10000
     * 2. All dates are between year 0 to 2500
     *    a. DD - 1 to 31
     *    b. MM - 1-12
     *    c. YY - 0-2500
     * 
     * Q. How to find date?
     * => 12041996 / 1000000 % 100 => 12
     * 
     * Q. How to find month?
     * => 12041996 / 10000 % 100 => 04
     * 
     * Q. How to find year?
     * => 12041996 / 1 % 10000 => 1996
     * 
     * DD-MM-YY
     * => Pehle date sort hoga fir month because:
     *      15-07
     *      18-05
     * => Jb date sort kiya to 15-07 choti thi, but fir jb humne month
     *    ko sort kiya to pta lga 18-05 choti hai aur 15-07 bdi.
     * => So, DD < MM < YYYY
    */

    public static void sortDates(String[] arr) {
        // 1. Pehle DD sort krnge using countSort()
        countSort(arr, 1000000, 100, 32); // 0-31 idx in freqArr

        // 2. Fir MM sort krnge using countSort()
        countSort(arr, 10000, 100, 13); // 0-12 idx for freqArr

        // 3. Fir YYYY Sort krnge using countSort()
        countSort(arr, 1, 10000, 2501); // 0-2500 idx for freqArr
    }

    public static void countSort(String[] arr, int div, int mod, int range) {
        // creating the frequency array and the answer array
        int[] freqArr = new int[range];
        String[] ans = new String[arr.length];

        
        // Collecting the frequencies.
        // 4674 / 1 % 10
        // 4674 / 10 % 10
        // 4674 / 100 % 10
        // 4674 / 1000 % 10
        for(int i = 0; i < arr.length; i++) {
            int val = Integer.parseInt(arr[i]) / div % mod;
            freqArr[val]++; 
        }

        // Convert the frequency array to prefixSum array
        for(int i = 1; i < freqArr.length; i++) {
            freqArr[i] += freqArr[i-1];
        }

        // Fill the ans
        for(int i = arr.length-1; i >= 0; i--) {
            int val = Integer.parseInt(arr[i]) / div % mod;
            int position = freqArr[val];
            ans[position-1] = arr[i] ;
            freqArr[val]--;
        }

        // Fill the original array
        for(int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void print(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
        }

        sortDates(arr);
        print(arr);
    }
}
