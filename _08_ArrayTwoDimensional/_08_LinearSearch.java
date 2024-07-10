package _08_ArrayTwoDimensional;

import java.util.Scanner;

public class _08_LinearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /**
         * Declare array size:
         */
        int[][] arr = new int[3][3];
        int rows = 3;
        int cols = 3;
        int key = 5;

        /**
         * row-wise input:
         */
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        /**
         * function to find key:
         */
        boolean found = findKey(arr, rows, cols, key);
        if (found) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }
    }

    public static boolean findKey(int arr[][], int rows, int cols, int key) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j] == key) {
                    return true;
                }
            }

        }
        /**
         * Value is not present:
         */
        return false;
    }
}
