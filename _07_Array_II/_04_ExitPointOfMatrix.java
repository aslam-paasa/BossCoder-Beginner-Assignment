package _07_Array_II;

import java.util.Scanner;

public class _04_ExitPointOfMatrix {
    /**
     * Codeforce Question:
     *    0  0  1  0
     *    1  0  0  0
     *    0  0  0  0
     *    1  0  1  0
     * 
     * 
     * => Initially wo enter krta hai [0,0] se right direction ki aur.
     *    Humein btana hai wo exit kn si spot se lega?
     *    1. Jb '0' aaega to sidhe chlte rhnge.
     *    2. Jb '1' aaega to right-90 degree turn lenge.
     * 
     * Direction: Clockwise
     *             N = 3
     *               |
     *               |
     *               |
     *  W = 2 -------+-------- E = 0
     *               |
     *               |
     *               |
     *             S = 1
     * */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] arr = new int[row][col];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int i = 0;
        int j = 0;
        int dir = 0; // 0 is east, 1 is south, 2 is west, 3 is north
        while(true) {
            /**
             * Find direction per iteration:
            */
            dir = (dir + arr[i][j]) % 4;

            /**
             * 1. Moving East:
            */
            if(dir == 0) {
                j++;
                if(j == arr[0].length) {
                    j--;
                    break;
                }
            } 
            /**
             * 2. Moving South:
            */
            else if(dir == 1) {
                i++;
                if(i == arr.length) {
                    i--;
                    break;
                }
            } 
            
            /**
             * 3. Moving West:
            */
            else if(dir == 2) {
                j--;
                if(j == -1) {
                    j++;
                    break;
                }
            } 
            /**
             * 4. Moving North:
            */
            else {
                i--;
                if(i == -1) {
                    i++;
                    break;
                }
            }
        }

        System.out.println(i + ", " + j);
    }
}
