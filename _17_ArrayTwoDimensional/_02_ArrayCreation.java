package _17_ArrayTwoDimensional;

public class _02_ArrayCreation {
    public static void main(String[] args) {

        /**
         * Creation of 2D array:
         */
        int[][] arr = new int[3][3];
        int brr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(brr[2][2]);
        System.out.println(brr[0][2]);

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
    }

}
