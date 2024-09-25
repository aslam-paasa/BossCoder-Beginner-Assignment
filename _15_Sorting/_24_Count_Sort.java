package _15_Sorting;

import java.util.Scanner;

public class _24_Count_Sort {
    /**
     * arr = [5, 3, 7, 3, 5, 7, 2, 5, 2, 7, 6, 5, 6]
     * 
     * Steps:
     * 1. Sbse chota value dhundo i.e. min = 2 
     * 2. Sbse bda value dhundo i.e. max = 7
     * 3. Fir range nikaalo i.e. max - min + 1 => 7 - 2 + 1 = 6
     *    ele = [2, 3, 4, 5, 6, 7]
     * 4. Create an array of size of range i.e. 6
     * idx    0  1  2  3  4  5
     * fre = [                ]
     * ele    2  3  4  5  6  7
     *    This array will store the frequencies of the arr-elements.
     *    a. idx-0 will store freq of elem-2.
     *    b. idx-1 will store freq of elem-3.
     *    c. idx-2 will store freq of elem-4.
     *    d. idx-3 will store freq of elem-5.
     *    e. idx-4 will store freq of elem-6.
     *    f. idx-5 will store freq of elem-7.
     * 
     * Q. Kn si freq kaha jaegi?
     * => min - ele = freq idx
     * =>  2  - 5   = 3 (idx-3 pe 5 ki freq store krte hai) 
     * => count++ at idx-3
     * 
     * idx    0  1  2  3  4  5
     * fre = [2  2  0  4  2  3]
     * ele    2  3  4  5  6  7
     * 
     * 5. Ab bnaenge isi freq ko prefix-Sum array bnaenge. Means it is
     *    just like fibonacci, prev value apne next value k saath add
     *    hote jaega, aur wo sum value apne agle value k saath add hote
     *    jaega.
     * fre           = [2  2  0  4  2  3 ]
     * freqPrefixSum = [2  4  4  8  10 13]
     * 
     * 6. Answer array bnaenge jiska size original array k baraabar hoga.
     *    ans = [                                        ] 
     *           0  1  2  3  4  5  6  7  8  9  10  11  12 
     * 
     *                     0  1  2  3  4  5
     * => freqPrefixSum = [2  4  4  8  10 13]
     * 
     *           0  1  2  3  4  5  6  7  8  9  10 11 12
     * => arr = [5, 3, 7, 3, 5, 7, 2, 5, 2, 7, 6, 5, 6]
     *    (a) ele-5 = ele - min
     *              = 5 - 2
     *              = 3
     * 
     *     => freqPrefixSum k idx-3 pe iski information hai. idx-3 pe pda
     *        hai '8' jo ye bta rha hai ki ele-5 7th idx pe jaega i.e.(n-1).
     * 
     *    (b) ele-3 = ele - min
     *              = 3 - 2
     *              = 1
     * 
     *     => freqPrefixSum k idx-1 pe iski information hai. idx-1 pe pda
     *        hai '4' jo ye bta rha hai ki ele-1 3th idx pe jaega i.e.(n-1).
     *   
     * 
     * Note: Count Sort is basic of Radix Sort that is why count sort is
     *       done like that. Count Sort has to be stable because other 
     *       algorithms like Radix are dependent on stability property of
     *       Count Sort, that's why Count Sort is important.
    */

    public static void countSort(int[] arr, int min, int max) {
        // creating the frequency array and the answer array
        int range = max - min + 1;
        int[] freqArr = new int[range];
        int[] ans = new int[arr.length];

        /**
         * 1. Collecting the frequencies.
         * 2. Then array m se value uthe, value se min minus kr diye,
         *    isse frequency array m uss value ka spot pta lga gya 
         *    jisko hmne fir +1 se count increase kr diya.
        */
        for(int i = 0; i < arr.length; i++) {
            
            int val = arr[i];
            freqArr[val - min]++; 
        }

        // Convert the frequency array to prefixSum array
        for(int i = 1; i < freqArr.length; i++) {
            freqArr[i] += freqArr[i-1];
        }

        // Fill the ans
        for(int i = arr.length-1; i >= 0; i--) {
            int val = arr[i];
            int position = freqArr[val-min];
            ans[position-1] = val;
            freqArr[val-min]--;
        }

        // Fill the original array
        for(int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
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
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        countSort(arr, min, max);
        print(arr);
    }

}
