package _21_ArrayTwoDimensional;

public class _04_AccessElementsColumnWise {
    public static void main(String[] args) {
        /**
         * Note:
         * 
         *   'm' - columns
         * +---------------------+
         * | X | X | X | ... | X |
         * +---------------------+
         * | X | X | X | ... | X | 'n' - rows
         * +---------------------+
         * | X | X | X | ... | X |
         * +---------------------+
         * 
         * => Agar mere pass 'n' rows & 'm' columns ka 2D array hai -
         *    (a) 'n' rows => idx should be 0 to n-1
         *    (b) 'm' cols => idx should be 0 to m-1
         * */ 


        /**
         * Q. How to access 2D array col-wise?
         * => int arr[][] = new int[3][3];
         * 
         *    +-----------+
         *    | 1 | 4 | 7 |
         *    +-----------+
         *    | 2 | 5 | 8 |
         *    +-----------+
         *    | 3 | 6 | 9 |
         *    +-----------+
         * 
         * Q. For column wise printing, we replaced 'i' with 'j' & 'j' with 'i'. Why?
         * =>  brr[i][j] = brr[j][i]
         * 
         * => If we replace [i,j] with [j,i] :
         *    (i, j)                 => (j, i)
         *    (0, 0)  (0, 1)  (0, 2) => (0, 0)  (1, 0)  (2, 0)
         *    (1, 0)  (1, 1)  (1, 2) => (0, 1)  (1, 1)  (2, 1)
         *    (2, 0)  (2, 1)  (2, 2) => (0, 2)  (1, 2)  (2, 2)
         * 
        */

        /**
         * Initialization:
        */
        int brr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };


        /**
         * Print col-wise:
        */
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                /**
                 * For column wise printing, we replaced 'i' with 'j' & 'j' with 'i'
                */
                System.out.print(brr[j][i] + " ");
            }
            System.out.println();
        }


    }
}
