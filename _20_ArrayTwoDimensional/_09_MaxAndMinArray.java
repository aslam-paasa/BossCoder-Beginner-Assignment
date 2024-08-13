package _19_ArrayTwoDimensional;

import java.util.Scanner;

public class _09_MaxAndMinArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /**
         * Declare array size:
         */
        int[][] arr = new int[3][3];
        int rows = 3;
        int cols = 3;

        /**
         * row-wise input:
         */
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        /**
         * Print max fn:
        */
        System.out.println("Max Number: " + getMax(arr, rows, cols));

        /**
         * Print max fn:
        */
        System.out.println("Min Number: " + getMin(arr, rows, cols));
    }


    /**
     * Function to calculate Max element in an array:
    */
    public static int getMax(int arr[][], int rows, int cols) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }


    /**
     * Function to calculate Min element in an array:
    */
    public static int getMin(int arr[][], int rows, int cols) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
