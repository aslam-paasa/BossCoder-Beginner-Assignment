package _12_RecursionWithArrayList;

public class _902_Product_Of_N_to_1 {
    /**
     * Factorial of a number:
     * N = 5, ans = 5! = 5 x 4 x 3 x 2 x 1 = 120
     * 
     * Recursive Steps:
     * Step-0: main() = fact(5) => Print 120, and fn execution ended. [10]
     * 
     * Step-1: fact(5) = 5 * fact(4) [1]
     *                 = 5 * 24 => return 120, terminate and go back [9]
     * 
     * Step-2: fact(4) = 4 * fact(3) [2]
     *                 = 4 * 6 => return 24, terminate and go back [8]
     * 
     * Step-3: fact(3) = 3 * fact(2) [3]
     *                 = 3 * 2 => return 6, terminate and go back [7]
     * 
     * Step-4: fact(2) = 2 * fact(1) [4]
     *                 = 2 * 1 => return 2, terminate and go back [6]
     * 
     * Step-5: fact(1) = 1   => return 1, terminate and go back [5]
     * 
     * */ 

    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    public static int fact(int n) {
        if(n <= 1) {
            return 1;
        }

        return n * fact(n-1);
    }
}
