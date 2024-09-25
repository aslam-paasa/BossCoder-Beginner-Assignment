package _15_Sorting;

import java.util.Scanner;

public class _23_Quick_Select {
    /**
     * Quick Select:
     * arr = [5, 9, 3, 2, 6, 8, 17]
     * Find the 4th smallest element? i.e. 6
     * 
     * => Quick Select kehta hai ek unsorted array k andr O(N) m kth
     *    smallest element find kr k do.
     * */ 

    /**
     * Explanation:
     * Let's do partition:
     *        i                 
     * arr = [5, 9, 3, 2, 6, 8, 17]
     *        j
     *
     *           [partitionIdx]
     *              |  j
     *        ----> V <-----------        
     * arr = [3, 2, 5, 9, 6, 8, 17]
     *        (<=5) | (>5)        i
     *              V
     *              3rd smallest element
     * 
     * We are looking for 5th smallest element?
     * => Discard the left side:
     *           i
     *    arr = [9, 6, 8, 17]
     *           j
     * 
     * => Agar hum kisi v element ko utha k partition krnge to wo element
     *    apne correct spot pe pahuch jaega
    */

    /**
     * arr    = [5, 2, 9, 8, 3]
     * sorted = [2, 3, 5, 8, 9]
     *                 |
     *                 V
     *               idx-2
     * [kth smallest element k-1 idx pe hota hai]
    */
    
    public static int quickSelect(int[] arr, int low, int high, int k) {

        if(low == high) {
            return arr[low];
        }

        int pivot = arr[high];
        // pivot now lives at partitionIdx and that is it's current position
        int partitionIdx = partition(arr, low, high, pivot); 

        if(k == partitionIdx) {
            return pivot;
        } else if(k > partitionIdx) {
            return quickSelect(arr, partitionIdx+1, high, k);
        } else {
            return quickSelect(arr, low, partitionIdx-1, k);
        }
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        System.out.println("pivot: " + pivot);
        int i = 0;
        int j = 0;
        while(i < arr.length) {
            if(arr[i] > pivot) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        return j - 1; 
        // j is the 1st of the (larger than pivot) elements
        // pivot lives at j-1
        // pivot lives at its eventual sorted position
    }

    public static void swap(int[] arr, int i, int j) {
        // System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt(); // kth smallest element
        // k-1 bcoz 5th smallest ele 4th idx pe hota hai
        System.out.println(quickSelect(arr, 0, arr.length-1, k-1));
    }    
}
