package _07_Array_II;

public class _02_2d_Array {
    public static void main(String[] args) {
        //                    R  C
        int[][] arr = new int[3][4];

        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[0][2] = 13;
        arr[0][3] = 14;

        arr[1][0] = 21;
        arr[1][1] = 22;
        arr[1][2] = 23;
        arr[1][3] = 24;

        arr[2][0] = 31;
        arr[2][1] = 32;
        arr[2][2] = 33;
        arr[2][3] = 34;


        /**
         * rows = arr.length;
         * cols = arr[0].length;
         * 
         *     0    1    2    3
         *   +----+----+----+----+
         * 0 |    |    |    |    |
         *   +----+----+----+----+
         * 1 |    |    |    |    |
         *   +----+----+----+----+
         * 2 |    |    |    |    |
         *   +----+----+----+----+
        */

        // Print 2d array:
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
    }
}


/**
 * Memory Map:
 * int[][] arr = new int[3][4];
 * 
 *     0    1    2    3
 *   +----+----+----+----+
 * 0 |    |    |    |    |
 *   +----+----+----+----+
 * 1 |    |    |    |    |
 *   +----+----+----+----+
 * 2 |    |    |    |    |
 *   +----+----+----+----+
 * 
 * => This diagram is an illusion, it is easy to understand.
 * 
 *  +        +                        0   1   2   3 
 *  |        |          +----+ 5k   +---+---+---+---+
 *  |        |        0 | 5k |----> |   |   |   |   |
 *  +--------+          +----+ 6k   +---+---+---+---+
 *  |   4k   |------> 1 | 6k |----> |   |   |   |   |
 *  +--------+          +----+ 7k   +---+---+---+---+
 *                    2 | 7k |----> |   |   |   |   |
 *                      +----+      +---+---+---+---+
 * => 4k address pe ek array of size-3 pda hai.
 * => Aur inn harr ek array k andr size-4 ka array pda hai.
 * => To jb hum bolte hai arr[1][3]. 
 *    (a) 4k ki addr pe teen array address stored hai (rows), usme
 *        se arr[1] pe jao(row-wise).
 *    (b) arr[1] k andr 6k addr stored hai uske arr[3] pe jao (cols-wise).
*/