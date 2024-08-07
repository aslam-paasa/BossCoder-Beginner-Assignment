package _07_Array_II;

import java.util.Scanner;

public class _08_DiagonalDisplay {
    /**
     * Square matrix: (GAP Strategy - VVI)
     * => We will take one input: n => [n*n]
     * 
     *     0    1    2    3 
     *   +----+----+----+----+
     * 0 | 11 | 12 | 13 | 14 |
     *   +----+----+----+----+
     * 1 | 21 | 22 | 23 | 24 |
     *   +----+----+----+----+
     * 2 | 31 | 32 | 33 | 34 |
     *   +----+----+----+----+
     * 3 | 41 | 42 | 43 | 44 |
     *   +----+----+----+----+
     * 
     * Print upper half of the square(diagonal) matrix:
     * => 11, 22, 33, 44, 12, 23, 34, 13, 24, 14
     * 
     * Note: VVI Question, because DP m km se km 20 qstn m yhi movement
     *       lagega. (GAP Strategy)
     * 
     *    g0   g1   g2   g3
     *     0    1    2    3 
     *   +----+----+----+----+
     * 0 | 11 | 12 | 13 | 14 |
     *   +----+----+----+----+
     * 1 |    | 22 | 23 | 24 |
     *   +----+----+----+----+
     * 2 |    |    | 33 | 34 |
     *   +----+----+----+----+
     * 3 |    |    |    | 44 |
     *   +----+----+----+----+
     * => Jitne col utna diagonls hai:
     *    g0 = 1 
     *    g1 = 2
     *    g2 = 3
     *    g3 = 4
     * (a) g0 = 0 gap between i & j
     * (b) g1 = 1 gap between i & j
     * (c) g2 = 2 gap between i & j
     * (d) g3 = 3 gap between i & j
    */
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
         * Diagonal Gap:
        */
        for(int g = 0; g < arr[0].length; g++) {
            /**
             * 1. i = 0, j = g => 2D Array [i][j] position 
             * 
             * 2. Rukne ka marker 'j' decide krta hai:
             * => Harr loop m common yhi hai ki 'j' end tk jaata hai.
             *    So, 'j' determines when to stop: arr[0].length
            */
            for(int i = 0, j = g; j < arr[0].length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
