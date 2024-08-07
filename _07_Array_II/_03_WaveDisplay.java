package _07_Array_II;

import java.util.Scanner;

public class _03_WaveDisplay {
    /**
     * rows = arr.length;
     * cols = arr[0].length;
     * 
     *     0    1    2    3
     *   +----+----+----+----+
     * 0 | 11 | 12 | 13 | 14 |
     *   +----+----+----+----+
     * 1 | 21 | 22 | 23 | 24 |
     *   +----+----+----+----+
     * 2 | 31 | 32 | 33 | 34 |
     *   +----+----+----+----+
     * 
     * => Travel:
     *    (a) top to bottom: [0,0], [1,0], [2,0]
     *    (b) left to right: [2,0], [2,1]
     *    (c) bottom to top: [2,1], [1,1], [0,1]
     *    (d) left to right: [0,1], [0,2]
     *    (e) top to bottom: [0,2], [1,2], [2,2]
     *    (f) left to right: [2,2], [2,3]
     *    (g) bottom to top: [2,3]. [1,3], [0,3]
     * => 11, 21, 31, 32, 22, 12, 13, 23, 33, 34, 24, 14
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] arr = new int[row][col];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        /**
         * Print everything from top to bottom:
        */ 
        // for(int j = 0; j < arr[0].length; j++) {
        //     for(int i = 0; i < arr.length; i++) {
        //         System.out.println(arr[i][j] + " ");
        //     }
        // }


        /**
         * Print even cols top to bottom & odd cols bottom to top:
        */
        for(int j = 0; j < arr[0].length; j++) {
            /**
             * 1. Even: Top to Bottom
            */
            if(j % 2 == 0) {
                for(int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } 
            /**
             * 2. Odd: Bottom to Top
            */
            else {
                for(int i = arr.length-1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            
        }
    }
}
