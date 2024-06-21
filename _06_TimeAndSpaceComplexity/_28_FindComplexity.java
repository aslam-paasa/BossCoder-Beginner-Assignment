package _06_TimeAndSpaceComplexity;

import java.util.Scanner;

public class _28_FindComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m];

        for(int i = 0; i < n; i = i * 2) { // Starting from 0, then 1, 3, 7...
            for(int j = 0; j < m; j = j * 2) { // Starting from 0, then 1, 3, 7...
                mat[i][j] = i + j;
                mat[i][j] = 1 - mat[i][j];
            }
        }


        /**
         * TC: O(logN * logM)
         * SC: O(n*m)
         * */ 
    }
}
