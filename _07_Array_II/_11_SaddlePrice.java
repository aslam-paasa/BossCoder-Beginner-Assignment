package _07_Array_II;

import java.util.Scanner;

public class _11_SaddlePrice {
    /**
     * Saddle Point:
     *  10   20    5  18
     *   4   19    6  22
     * 330  140  110  44
     *  27    8   18  32
     * 
     * => Ek aisa banda jo apne row m least hai but apne column m max hai,
     *    usko "Saddle Point" bolte hai. 
     * => Example: 110:
     *                 (a) least in row
     *                 (b) max in col
     * 
     * Q. Why two saddle points are not possible?
     * => Even if both saddle points are the same number, it's still not 
     *    possible.
     * => Suppose A and B are both saddle points, and they have the same 
     *    value, say X.
     * => Since A is a saddle point, it's the minimum in its row and 
     *    maximum in its column. But then, B cannot be the minimum in its 
     *    row, because A is also in the same column and has the same value X.
     * => And similarly, A cannot be the maximum in its column, because B 
     *    is also in the same row and has the same value X.
     * => So, even if A and B have the same value, they cannot both be saddle
     *    points.
     * 
     * Example:
     * 
     * 10 20 X
     * 5  X 25
     * 40 50 60
     * 
     * => Here, X cannot be a saddle point in both positions.
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
         * Approach:
         * 
         * Step 1: Iterate over each row of the array.
         * 
         * Step 2: For each row, find the minimum element (potential saddle point).
         *         - Initialize min as the first element of the row.
         *         - Compare each element in the row with min.
         *         - If an element is smaller than min, update min and store its column index.
         * 
         * Step 3: Check if the potential saddle point is the maximum in its column.
         *         - Initialize isSaddle as true.
         *         - Iterate over each element in the column of the potential saddle point.
         *         - If an element is greater than min, update isSaddle to false and break the loop.
         * 
         * Step 4: If isSaddle is true, then the potential saddle point is a true saddle point, so print it and return.
         * 
         * Step 5: If no saddle point is found, print "Invalid input".
         */
        
        // Step 1: Iterate over each row of the array.
        for(int i = 0; i < arr.length; i++) {
            // Step 2: Find min of the row => potential saddle point
            int min = arr[i][0];
            int potSaddleJ = 0;
            for(int j = 1; j < arr[0].length; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                    potSaddleJ = j;
                }
            }

            // Step 3: Confirm if it is maximum in the column => true saddle point
            boolean isSaddle = true;
            for(int k = 0; k < arr.length; k++) {
                if(arr[k][potSaddleJ] > min) {
                    isSaddle =  false;
                    break;
                }
            }

            // Step 4: Print true saddle point and return
            if(isSaddle == true) {
                System.out.println(min);
                return;
            }
        }
        
        // Step 5: Print "Invalid input" if no saddle point is found
        System.out.println("Invalid input");
    }
}