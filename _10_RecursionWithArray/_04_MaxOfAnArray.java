package _10_RecursionWithArray;

import java.util.Scanner;

public class _04_MaxOfAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int max = maxOfAnArray(arr, 0);
        System.out.println(max);
    }

    /**
     * arr[] = [20, 4, 14, 26, 7]
     *           0  1   2   3  4
     * 1. Expectation: max(a, o) = Compares (20, 4, 14, 26, 7) => 26
     * 2. Faith      : max(a, 1) = Compares (4, 14, 26, 7)     => 26
     * 3. EwF        : max(a, 0) = 
    */

    // the largest element from idx to the end
    public static int maxOfAnArray(int[] arr, int idx) {
        if(idx == arr.length - 1) {
            return arr[idx];
        }
        
        int misa = maxOfAnArray(arr, idx+1); // misa is the greatest element from idx+1 to the end
        if(arr[idx] > misa) {
            return arr[idx];
        } else {
            return misa;
        }
    }
}
