package _12_RecursionWithArrayList;

public class _914_Pattern {
    /**
     * We will learn:
     * 1. Converting iterative problem to recursive
     *    fn(row, col)
     *     |
     *     V
     *    fn(4, 0)
     *     |
     *     V
     *    fn(4, 1)
     *     |
     *     V
     *    fn(4, 2)
     *     |
     *     V
     *    fn(4, 3)
     *     |
     *     V
     *    new line
     *     |
     *     V
     *    fn(3, 0) 
     * 
     * Note: Isn't this concept similar to bubble sort.
     * 
     * 2. Converting recursive problem to iterative 
     * */ 

    public static void main(String[] args) {
        triangle(4, 0);
        triangle2(4, 0);
    }

    public static void triangle(int row, int col) {
        if(row == 0) {
            return;
        }

        if(col < row) {
            System.out.print("* ");
            triangle(row, col+1);
        } else {
            System.out.println();
            triangle(row-1, 0);
        }
    }

    public static void triangle2(int row, int col) {
        if(row == 0) {
            return;
        }

        if(col < row) {
            triangle2(row, col+1);
            System.out.print("* ");
        } else {
            triangle2(row-1, 0);
            System.out.println();
        }
    }
}
