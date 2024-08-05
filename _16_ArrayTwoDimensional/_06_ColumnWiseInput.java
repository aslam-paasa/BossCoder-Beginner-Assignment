package _16_ArrayTwoDimensional;

import java.util.Scanner;

public class _06_ColumnWiseInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        /**
         * Declare array size:
        */
        int[][] arr = new int[3][3];
        int rows = 3;
        int cols = 3;

        /**
         * column-wise input:
         * */ 
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[j][i] = scn.nextInt();
            }
        }

        /**
         * Printing column-wise:
        */
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                /**
                 * Humne input col-wise liya to hm row-wsie print krnge(col-to-row swap)
                */
                System.out.print(arr[i][j] + " "); // Swapped indices here
            }
            System.out.println();
        }
    }
}