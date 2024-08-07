package _07_Array_II;

import java.util.Scanner;

public class _06_RotateBy90 {
    /**
     * Rotate this array by 90 degrees:
     * 11  12  13  14     41  31  21  11
     * 21  22  23  24 ==> 42  32  22  12
     * 31  32  33  34     43  33  23  13
     * 41  42  43  44     44  34  24  14
     * 
     *  => 1st row    ==> 4th col
     *  => 2nd row    ==> 3rd col
     *  => 3rd row    ==> 2nd col
     *  => 4th row    ==> 1st col
     * 
     * 
     * Step-1: Transpose of matrix
     *     0    1    2    3            0    1    2    3
     *   +----+----+----+----+       +----+----+----+----+
     * 0 | 11 | 12 | 13 | 14 |     0 | 11 | 21 | 31 | 41 |
     *   +----+----+----+----+       +----+----+----+----+
     * 1 | 21 | 22 | 23 | 24 |     1 | 12 | 22 | 32 | 42 |
     *   +----+----+----+----+ ===>  +----+----+----+----+
     * 2 | 31 | 32 | 33 | 34 |     2 | 13 | 23 | 33 | 43 |
     *   +----+----+----+----+       +----+----+----+----+
     * 3 | 41 | 42 | 43 | 44 |     3 | 14 | 24 | 34 | 44 |
     *   +----+----+----+----+       +----+----+----+----+
     *     +                                          +
     *     |                                          |
     *     |                                          |
     *     +------------------------------------------+
     *     Swap 1st col with last col then reverse the cols:
     * Note: Loop poora nhi chalana hai warna 2 baar swap ho jaega
     *       jiske wajah se wo apne original position pe pahuch jaega.
     *       Loops ko upper diagonally chalana hai:
     *       (a) int i = 0; i < arr.length; i++
     *       (b) int j = i; j < arr[0].length; j++   
     *           => int temp = arr[i][j];
     *           => arr[i][j] = arr[j][i]; 
     *           => arr[i][j] = temp;
     * 
     *          (a) [0,0] <==> [0,0]
     *          (b) [0,1] <==> [1,0]
     *          (c) [0,2] <==> [2,0]
     *          (d) [0,3] <==> [3,0]
     *          (e) [1,1] <==> [1,1]
     *          (f) [1,2] <==> [2,1]
     *          (g) [1,3] <==> [3,1]
     *          (h) [2,2] <==> [2,2]
     *          (i) [2,3] <==> [3,2]
     *          (j) [3,3] <==> [3,3]
     *          (k) [3,4] <==> [4,3]
     *          (l) [4,4] <==> [4,4]
     *     
     *  => Step-2: Reverse the transpose matrix:
     *      0    1    2    3              0    1    2    3
     *    +----+----+----+----+         +----+----+----+----+
     *  0 | 11 | 21 | 31 | 41 |       0 | 14 | 13 | 12 | 11 |
     *    +----+----+----+----+         +----+----+----+----+
     *  1 | 12 | 22 | 32 | 42 |       1 | 24 | 23 | 22 | 21 |
     *    +----+----+----+----+ ==>     +----+----+----+----+
     *  2 | 13 | 23 | 33 | 43 |       2 | 34 | 33 | 32 | 31 |
     *    +----+----+----+----+         +----+----+----+----+
     *  3 | 14 | 24 | 34 | 44 |       3 | 44 | 43 | 42 | 41 |
     *    +----+----+----+----+         +----+----+----+----+
     * 
     * => Swap each row:
     *          start = 0 <==> end = arr.length-1
     *          start++;
     *          end--;
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        /**
         * 1. Transpose of Matrix:
         * => Rows ko cols bnane hai
         * => Cols ko rows bnane hai
         * Note: Loop poora nhi chalana hai warna 2 baar swap ho jaega
         *       jiske wajah se wo apne original position pe pahuch jaega.
         *       Loops ko upper diagonally chalana hai:
         *       (a) int i = 0; i < arr.length; i++
         *       (b) int j = i+1; j < arr[0].length; j++
        */
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i]; 
                arr[j][i] = temp;
            }
        }

        /**
         * 2. Reverse Cols:
         * => Reverse row by row.
        */
        for(int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;

            while(start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }

        /**
         * 3. display:
        */
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}
