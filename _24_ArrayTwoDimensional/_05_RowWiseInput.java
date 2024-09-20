package _24_ArrayTwoDimensional;

import java.util.Scanner;

public class _05_RowWiseInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /**
         * Declare array size:
        */
        int[][] arr = new int[4][3];
        int rows = 4;
        int cols = 3;

        /**
         * row-wise input:
         * */ 
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        /**
         * Printing row-wise:
        */
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
