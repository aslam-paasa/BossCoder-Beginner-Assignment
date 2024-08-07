package _07_Array_II;

import java.util.Scanner;

public class _05_MatrixMultiplication {
    /**
     *                      [0, 1, 0, 1]
     * [1,  0, 10]          [0, 0, 1, 1]
     * [10, 1,  0] 2X3      [1, 1, 0, 0] 3X4
     * 
     *              Mulitply: 2X4
     *              RowXCol : 2X4
     * (a) R1 * C1 = 1*0 + 0*0 + 10*1 = 10
     * (b) R1 * C2 = 1*1 + 0*0 + 10*1 = 11
     * (c) R1 * C3 = 1*0 + 0*1 + 10*0 = 0
     * (d) R1 * C3 = 1*1 + 0*1 + 10*0 = 1
     * => [10, 11, 0, 1]
     * 
     * (a) R2 * C1 = 10*0 + 1*0 + 0*1 = 0
     * (b) R2 * C2 = 10*1 + 1*0 + 0*1 = 10
     * (c) R2 * C3 = 10*0 + 1*1 + 0*0 = 1
     * (d) R2 * C4 = 10*1 + 1*1 + 0*0 = 11
     * 
     * Output:
     * => [10, 11, 0,  1]
     *    [ 0, 10, 1, 11] 2X4
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /**
         * Matrix-1:
        */
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] one = new int[n1][m1];
        for(int i = 0; i < one.length; i++) {
            for(int j = 0; j < one[0].length; j++) {
                one[i][j] = scn.nextInt();
            }
        }

        /**
         * Matrix-2:
        */
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] two = new int[n2][m2];
        for(int i = 0; i < two.length; i++) {
            for(int j = 0; j < two[0].length; j++) {
                two[i][j] = scn.nextInt();
            }
        }

        /**
         * Check matrix-1[cols] == matrix-2[row]?
        */
        if(m1 != n2) {
            System.out.println("Invalid Input");
            return;
        }

        /**
         * Main Logic:
        */
        int[][] product = new int[n1][m2];
        /**
         * Visiting all spots of "i" & "j":
        */
        for(int i = 0; i < product.length; i++) {
            for(int j = 0; j < product[0].length; j++) {
                
                /**
                 * Multiplication logic:
                */
                int value = 0;
                for(int k = 0; k < m1; k++) {
                    /**
                     * It will only add [i][j], not [k]:
                     * => int[][] product = new int[n1][m2];
                    */
                    value += one[i][k] * two[k][j];
                }

                product[i][j] = value;
            }
        }

        /**
         * Print the multiplication matrix:
        */
        for(int i = 0; i < product.length; i++) {
            for(int j = 0; j < product[0].length; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
