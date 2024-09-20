package _16_Sorting;

import java.util.Scanner;

public class _04_Print_Maze_Paths_With_Jumps {
    /**
     * 1. Single Step Allowed:
     *    a. h1 -> one step horizontal
     *    b. v1 -> one step vertical
     * 2. Multiple Step Allowed:
     *    a. h2 -> two step horizontal
     *    b. v2 -> two step vertical
     * 3. Diagonal Step Allowed:
     *    a. d1
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();

        printMazePaths(1, 1, row, col, "");

    }

    private static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        
        
    }
}
