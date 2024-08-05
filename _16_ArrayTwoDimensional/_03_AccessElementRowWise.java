package _16_ArrayTwoDimensional;

public class _03_AccessElementRowWise {
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
         * Q. How to access 2D array row-wise?
         * => int arr[][] = new int[3][3];
         * 
         *    +-----------+
         *    | 1 | 2 | 3 |
         *    +-----------+
         *    | 4 | 5 | 6 |
         *    +-----------+
         *    | 7 | 8 | 9 |
         *    +-----------+ 
         * 
         * 1. 0th rows ko print kr rhe hai
         *    => 0th row k  liye we have printed:
         *       (a) 0th col - (0,0)
         *       (b) 1st col - (0,1)
         *       (c) 2nd col - (0,2)
         *    Note: Jb 0th row khtm hui to
         * 2. 1st row ko print kr rhe hai
         *    => 0th row k  liye we have printed:
         *       (a) 0th col - (1,0)
         *       (b) 1st col - (1,1)
         *       (c) 2nd col - (1,2)
         *   Note: Jb 1st row khtm hui to
         * 3. 2nd row ko print kr rhe hai:
         *    => 0th row k  liye we have printed:
         *       (a) 0th col - (2,0)
         *       (b) 1st col - (2,1)
         *       (c) 2nd col - (2,2)
         * 
         * => 2-loops ka use kr k hum isse access kr paenge.
         * => Same as patterns.
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
         * Print row-wise:
        */
        for(int i = 0; i < 3; i++) {
            /**
             * for every row, we need to print value in each column
             * */ 
            for(int j = 0; j < 3; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
