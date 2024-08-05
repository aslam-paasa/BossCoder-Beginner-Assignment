package _17_ArrayTwoDimensional;

import java.util.Scanner;

public class _07_RowSum {
    public static void main(String[] args) {
        /**
         *     0   1   2   3
         *   +---------------+
         * 0 | 1 | 2 | 3 | 4 | => 10
         *   +---------------+
         * 1 | 2 | 3 | 4 | 1 | => 10
         *   +---------------+ 
         * 2 | 5 | 6 | 1 | 3 | => 15
         *   +---------------+
         * 3 | 2 | 4 | 6 | 8 | => 20
         *   +---------------+
         * 4 | 1 | 9 | 9 | 6 | => 25
         *   +---------------+
         * 
         * Output = 10 10 15 20 
         * 
         * Note:
         * 1. Hum row-wise traverse kr rhe hai
         * 2. Jb hm ek row k col par kaam kr rhe hnge, to unn sbko sum kr lenge aur print kra denge
         * */ 


        Scanner scn = new Scanner(System.in);

        /**
         * Declare array size:
        */
        int[][] arr = new int[3][3];
        int rows = 3;
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
         * function to print row-wise sum:
         */ 
        printRowWiseSum(arr, rows, cols);
    }


    public static void printRowWiseSum(int arr[][], int rows, int cols) {
        for(int i = 0; i < rows; i++) {
            int sum = 0;
            for(int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}
