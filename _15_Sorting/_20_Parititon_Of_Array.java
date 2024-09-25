package _15_Sorting;

import java.util.Scanner;

public class _20_Parititon_Of_Array {
    /**
     * Partition of Array:
     *        i
     * arr = [5, 7, 3, 18, 9, 1, 14], pivot = 8
     *        j
     * 
     * => Let's say hum 8 pe split krna chahte hai, means 8 se chote
     *    aur baraabar left side ho jae aur 8 se bade right side ho jae.
     * => This is similar to odd-even, zero-one.
     * 
     * => Humein ek pivot diya jaata hai, aur pivot se chote ek taraf aur
     *    pivot se bade ek taraf.
     *    (a) arr[i] > pivot
     *        i++;
     *    (b) arr[i] <= pivot
     *        swap();
     *        i++;
     *        j++;
     * 
     * */ 

     public static void partition(int[] arr, int pivot) {
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
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int pivot = scn.nextInt();
        partition(arr, pivot);
        print(arr);
    }    
}

/**
 * Input:
 * => 6 (n)
 * => 5 9 18 16 2 7 (arr[n])
 * => 8 (pivot)
*/