package _16_ArrayTwoDimensional;

import java.util.Scanner;

public class _10_TransposeMatrix {
    public static void main(String[] args) {
        /**
         * Transpose a matrix:
         * => Transpose means:
         *    (a) rows cols bn jaate hai
         *    (b) cols rows bn jaate hai
         * 
         *                   Swap
         *      (i, j)     =========>     (j, i)
         * 
         *     0   1   2   row-to-col   0   1   2  
         *   +-----------+            +-----------+ 
         * 0 | 2 | 4 | 6 | =========> | 2 | 1 | 9 | 0
         *   +-----------+            +-----------+
         * 1 | 1 | 3 | 5 |            | 4 | 3 | 11| 1
         *   +-----------+            +-----------+
         * 2 | 9 | 11| 13|            | 6 | 5 | 13| 2
         *   +-----------+            +-----------+
         *  
         *   a. 2 => arr[0][0]        a. 2 => arr[0]0]
         *   b. 4 => arr[0][1]        b. 4 => arr[1][0]
         *   c. 6 => arr[0][2]        c. 6 => arr[2][0]
         * 
         * Note: Sirf inka 'i' & 'j' change ho gya hai.    
         *       Mujhe sirf value shift krni hai means:
         *       => arr[i][j] k andr arr[j][i] daalni hai (swap)
         *    
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
         */
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        /**
         * Print array function:
         * */
        System.out.println("Printing Array:");
        printArray(arr, rows, cols); 

        /**
         * Print transpose function:
         * => Output is same because double transpose ho rha hai
         * Case-1: When we are at (0, 1):
         *     (0, 1) <===> (1, 0)
         *      2     <===>    4
         *      4     <===>    2
         * Case-2: When we reach (1, 0), again we are swapping:
         *     (1, 0) <===> (0, 1)
         *      4     <===>    2
         *      2     <===>    4
         * Note: Humaare elements wapas se apne initial position pe aa gye.
         *       It means humein loop poora nhi chalana tha.
         *       Instead of swap hum index new array m index swap krnge:
         *       => transpose[j][i] = arr[i][j];
         * */ 
        System.out.println("Starting Transpose:");
        int transpose[][] = new int[3][3];
        transpose(arr, rows, cols, transpose);
        printArray(transpose, rows, cols);

    }

    /**
     * function to transpose array:
     * */ 
    public static void transpose(int arr[][], int rows, int cols, int transpose[][]) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                // swap logic
                // int temp = arr[i][j];
                // arr[i][j] = arr[j][i];
                // arr[j][i] = temp; 
                transpose[j][i] = arr[i][j];
            }
        }
    }


    /**
     * Function to print transposed array:
     * */
    public static void printArray(int arr[][], int rows, int cols) { 
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.print(arr[i][j] + " "); // Accessing arr[j][i] for transpose
            }
            System.out.println();
        }
    }
}
