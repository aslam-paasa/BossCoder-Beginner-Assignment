package _07_Array_II;

import java.util.Scanner;

public class _07_SpiralDisplay {
    /**
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
     * => Spiral m chlte hue humein print krna hai.
     *    Step-1: [11], [21], [31], [41] (top to bottom)
     *    Step-2: [42], [43], [44]       (left to right)
     *    Step-3: [34], [24], [14]       (bottom to top)
     *    Step-4: [13], [12]             (right to left)
     *    Step-5: [22], [32]             (top to bottom)
     *    Step-6: [33]                   (left to right)
     *    Step-7: [23]                   (bottom to top)  
     *    Step-8: [22]X                  
     * => 11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23
     * 
     * Note: Wall-by-Wall print krna hai:
     *       (a) S-E-N-W Outer wall
     *       (b) S-E-N-W Inner wall
     * i. South: Niche k taraf jaate hue   [0,0]
     * ii. East: Right k taraf jaate hue   [0, arr.length-1]
     * iii. North: Upar k taraf jaate hue  [arr.length-1, arr[0].length-1]
     * iv. West: Left k taraf jaate hue    [0, arr[0].length-1]
     * => Similar to Exit Point
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        /**
         * Defining Corners of Wall:
        */
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length-1;
        int maxCol = arr[0].length-1;
        int total = n * m;
        int count = 1;
        /**
         * Stop the loop when we violate this condition:
        */
        while(count <= total) {
            /**
             * South Wall: Top to Bottom
             * Q. In each wall, what is constant and what varies?
            */
            for(int i = minRow; i <= maxRow && count <= total; i++) { 
                System.out.println(arr[i][minCol]);
                count++;
            }
            /**
             * Jb South Wall poori ho jae to minCol bdha do:
            */
            minCol++;


            /**
             * East Wall: Left to Right 
             * Q. In each wall, what is constant and what varies?
            */
            for(int j = minCol; j <= maxCol && count <= total; j++) { 
                System.out.println(arr[maxRow][j]);
                count++;
            }
            /**
             * Jb East Wall poori ho jae to maxRow ko ghatao:
            */
            maxRow--; 

            /**
             * North Wall: Bottom to Top
             * Q. In each wall, what is constant and what varies?
            */
            for(int i = maxRow; i >= minRow && count <= total; i--) { 
                System.out.println(arr[i][maxCol]);
                count++;
            }
            /**
             * Jb north wall print ho jae to maxCol ko ghatao
            */
            maxCol--;

            /**
             * West Wall: Right to Top
             * Q. In each wall, what is constant and what varies?
                */
            for(int j = maxCol; j >= minCol && count <= total; j--) { 
                System.out.println(arr[minRow][j]);
                count++;
            }
            /**
             * Jb west wall print ho jae to minRow ko badhao.
             * => Ye sb k wajah se corner 2 baar print nhi honge
             *    aur box v change ho jaega.
            */
            minRow++;
        }
    }
}
