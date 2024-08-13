package _07_Array_II;

import java.util.Scanner;

public class _09_RingRotate {
    /**
     *     0    1    2    3    4    5    6   7
     *   +----+----+----+----+----+----+----+----+
     * 0 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 |
     *   +----+----+----+----+----+----+----+----+
     * 1 | 21 | 22 | 23 | 24 | 25 | 26 | 27 | 28 |
     *   +----+----+----+----+----+----+----+----+
     * 2 | 31 | 32 | 33 | 34 | 35 | 36 | 37 | 38 |
     *   +----+----+----+----+----+----+----+----+
     * 3 | 41 | 42 | 43 | 44 | 45 | 46 | 47 | 48 |
     *   +----+----+----+----+----+----+----+----+
     * 4 | 51 | 52 | 53 | 54 | 55 | 56 | 57 | 58 |
     *   +----+----+----+----+----+----+----+----+
     * 5 | 61 | 62 | 63 | 64 | 65 | 66 | 67 | 68 |
     *   +----+----+----+----+----+----+----+----+ 6X8
     * 
     * Ring-1:
     *     0    1    2    3    4    5    6    7
     *   +----+----+----+----+----+----+----+----+
     * 0 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 |
     *   +----+----+----+----+----+----+----+----+
     * 1 | 21 |                             | 28 |
     *   +----+                             +----+
     * 2 | 31 |                             | 38 |
     *   +----+                             +----+
     * 3 | 41 |                             | 48 |
     *   +----+                             +----+
     * 4 | 51 |                             | 58 |
     *   +----+----+----+----+----+----+----+----+
     * 5 | 61 | 62 | 63 | 64 | 65 | 66 | 67 | 68 |
     *   +----+----+----+----+----+----+----+----+ 6X8
     * 
     * Ring-2
     *     0    1    2    3    4    5    6    7
     *   +----+----+----+----+----+----+----+----+
     * 0 |                                       |
     *   +    +----+----+----+----+----+----+    +
     * 1 |    | 22 | 23 | 24 | 25 | 26 | 27 |    |
     *   +    +----+----+----+----+----+----+    +
     * 2 |    | 32 |                   | 37 |    |
     *   +    +----+                   +----+    +
     * 3 |    | 42 |                   | 47 |    |
     *   +    +----+----+----+----+----+----+    +
     * 4 |    | 52 | 53 | 54 | 55 | 56 | 57 |    |
     *   +    +----+----+----+----+----+----+    +
     * 5 |                                       |
     *   +----+----+----+----+----+----+----+----+ 6X8
     * 
     * Ring-3
     *     0    1    2    3    4    5    6
     *   +----+----+----+----+----+----+----+----+
     * 0 |                                       |
     *   +                                       +
     * 1 |                                       |
     *   +         +----+----+----+              +
     * 2 |         | 33 | 34 | 35 |              |
     *   +         +----+----+----+              +
     * 3 |         | 43 | 44 | 45 |              |
     *   +         +----+----+----+              +
     * 4 |                                       |
     *   +                                       +
     * 5 |                                       |
     *   +----+----+----+----+----+----+----+----+ 6X8
     * 
     * => Spiral Rotate Elements by 'K':
     *    (a) S = 3(Inner most ring)
     *        R = 2
     * 
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] twodarr = new int[n][m];
        for(int i = 0; i < twodarr.length; i++) {
            for(int j = 0; j < twodarr[0].length; j++) {
                twodarr[i][j] = scn.nextInt();
            }
        }

        /**
         * Select which shell/ring to rotate
        */
        int s = scn.nextInt();
        /**
         * Rotate the shell/ring by 'k'
        */
        int r = scn.nextInt();



        /**
         * Step-1: Fill elements in 1d array with selected shell/ring (spiral display)
         * Step-2: rotate the 1-d array by 'r'
         * Step-3: Fill the shell/ring back 2d array from the rotated 1d array
         * */
        int[] onedarr = getOneDFromShell(twodarr, s);

        rotate(onedarr, r);

        fillTwodShellFromOneDArr(onedarr, twodarr, s);

        display(twodarr);
    }



    /**
     * 1.Fill elements in 1d array with selected shell/ring (spiral display)
     * => If 2d arr is 8X10, then this is how we select the shells:
     * 
     *    minRow,minCol <--------------------> minRow,maxCol
     *                  +                    +
     *                  |                    |
     *                  |                    |
     *                  +                    +
     *    maxRow, minCol<--------------------> maxRow,maxCol
     * 
     *    minRow - 0    1    2    3 (shell + 1)
     *    minCol - 0    1    2    3 (shell - 1)
     *    maxRow - 7    6    5    4 (row - shell)
     *    maxCol - 9    8    7    6 (col - shell)
    */
    public static int[] getOneDFromShell(int[][] twodarr, int s) {
        int rows = twodarr.length;
        int cols = twodarr[0].length;

        int minRow = s - 1;
        int minCol = s - 1;
        int maxRow = rows - s;
        int maxCol = cols - s;

        int topLeftWallCount = maxRow - minRow + 1;
        int topRightWallCount = maxCol - minCol + 1;
        /**
         * Corner element double baar count ho jaa rhe
         * That's why we use "-4" to remove double count.
        */
        int sizeOfWall = 2* topLeftWallCount + 2 * topRightWallCount - 4;

        int[] oned = new int[sizeOfWall];
        int idx = 0;

        // left wall | row increases from minRow to maxRow, col stays at minCol
        for(int i = minRow, j = minCol; i <= maxRow; i++) {
            oned[idx] = twodarr[i][j];
            idx++;
        }
        minCol++;

        // bottom wall | row stays at maxRow, col increases from minCol to maxCol
        for(int i = maxRow, j = minCol; j <= maxCol; j++) {
            oned[idx] = twodarr[i][j];
            idx++;
        }
        maxRow--;

        // right wall | row decreases from maxRow to minRow, col stays at maxCol:
        for(int i = maxRow, j = maxCol; i >= minRow; i--) {
            oned[idx] = twodarr[i][j];
            idx++;
        }
        maxCol--;

        // top wall | row stays at minRow, col decreases at maxCol to minCol
        for(int i = minRow, j = maxCol; j >= minCol; j--) {
            oned[idx] = twodarr[i][j];
            idx++;
        }
        minRow++;

        return oned;
    }

    /**
     * 3. Fill the shell/ring back 2d array from the rotated 1d array
    */
    public static void fillTwodShellFromOneDArr(int[] onedarr, int[][] twodarr, int s) {
        int rows = twodarr.length;
        int cols = twodarr[0].length;

        int minRow = s - 1;
        int minCol = s - 1;
        int maxRow = rows - s;
        int maxCol = cols - s;

        int idx = 0;

        // left wall | row increases from minRow to maxRow, col stays at minCol
        for(int i = minRow, j = minCol; i <= maxRow; i++) {
            twodarr[i][j] = onedarr[idx];
            idx++;
        }
        minCol++;

        // bottom wall | row stays at maxRow, col increases from minCol to maxCol
        for(int i = maxRow, j = minCol; j <= maxCol; j++) {
            twodarr[i][j] = onedarr[idx];
            idx++;
        }
        maxRow--;

        // right wall | row decreases from maxRow to minRow, col stays at maxCol:
        for(int i = maxRow, j = maxCol; i >= minRow; i--) {
            twodarr[i][j] = onedarr[idx];
            idx++;
        }
        maxCol--;

        // top wall | row stays at minRow, col decreases at maxCol to minCol
        for(int i = minRow, j = maxCol; j >= minCol; j--) {
            twodarr[i][j] = onedarr[idx];
            idx++;
        }
        minRow++;
    }


    /**
     * 2. Rotate the 1-d array (spiral rotate)
    */
    public static void rotate(int[] onedarr, int r) {
        r = r % onedarr.length;
        if(r < 0) {
            r += onedarr.length;
        }

        /**
         * a b c d e f g | h i
         * a b c d e f g <==> g f e d c b a
        */
        reverse(onedarr, 0, onedarr.length-r-1); // first half
        /** 
         * h i <==> i h
        */
        reverse(onedarr, onedarr.length-r, onedarr.length-1); // second half
        /**
         * g f e d c b a i h <==> h i a b c d e f g
        */
        reverse(onedarr, 0, onedarr.length-1); // full
    }

    /**
     * 2.1 Reverse the elements of an array
    */
    public static void reverse(int[] onedarr, int left, int right) {
        while(left < right) {
            int temp = onedarr[left];
            onedarr[left] = onedarr[right];
            onedarr[right] = temp;

            left++;
            right--;
        }
    }

    public static void display(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
