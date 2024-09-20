package _12_RecursionWithArrayList;

public class _899_Print_N_till_1 {
    /**
     * N = 5 => Print = 5 4 3 2 1
     * 
     * 0. main() => fn excution ended (15)
     * 
     * 1. fn(5) => terminate & go back(14)
     *    - print(5) [1]
     *    - fn(4)    [2]
     * 
     * 2. fn(4) => terminate & go back(13)
     *    - print(4) [3]
     *    - fn(3)    [4]
     * 
     * 3. fn(3) => terminate & go back(12)
     *    - print(3) [5]
     *    - fn(2)    [6]
     * 
     * 4. fn(2) => terminate & go back(11)
     *    - print(2) [7]
     *    - fn(1)    [8]
     * 
     * 5. fn(1) => terminate & go back(10) 
     *    - print(1) [9]
     * 
     * Output: 5 4 3 2 1
     * 
     * Note: Basically when we are filling the stack then we are printing.
     *       (First print then do fn call)
    */

    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n) {
        if( n == 0 ) {
            return;
        }

        System.out.println(n);
        fun(n-1);
    }
}
