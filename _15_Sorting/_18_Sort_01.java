package _15_Sorting;
import java.util.*;

/**
 * This question is related to Quick Sort.
*/

public class _18_Sort_01 {

    /**
     * Sorting Logic:
     * 1. 0 to j-1 => 0's region
     * 2. j to i-1 => 1's region
     * 3. i to arr.length-1 => unknown
     * 
     * => i & j are at idx-0. Agar idx pe element '1' hai to i++ kro.
     *    Aur agar 'i' ko '0' milega to 'j' se swap kr do, aur i++ & j++
     *    kr do. Iss approach se saare 0's aage and 1's last m chle jaenge.
    */
    public static void sort01(int[] arr) {
        int i = 0;
        int j = 0;

        while(i < arr.length) {
            if(arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }

    /**
     * Used for swapping ith and jth elements of array
    */
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Used for printing the output
    */
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

        sort01(arr);
        print(arr);
    }
}
