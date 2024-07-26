package _10_Sorting;

import java.util.Scanner;

public class _04_BubbleSort {
    public static void main(String[] args) {

        /**
         * Get the input from the user
         */
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Input Length : ");
        int n = scn.nextInt();

        System.out.print("Enter Input : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println();

        /**
         * Sort the array
         */
        bubbleSort(arr);

        System.out.println();

        /**
         * Print the array
         */
        System.out.print("Sorted Elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;

        System.out.println("List of numbers swapped: ");
        for (int itr = 1; itr <= arr.length - 1; itr++) {
            swapped = false;
            for (int j = 0; j < arr.length - itr; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
