package _12_RecursionWithArrayList;

public class _901_Print_Increasing_And_Decreasing {
    /**
     * 0. main() => fn excution ended (15)
     * 
     * Function-1: Decreasing
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
     * => Output: 5, 4, 3, 2, 1
     * => Stack is empty now.
     * 
     * Function-2: Increasing
     * 0. main()
     *    - fn executed
     * 1. fib(5) [1]
     *    - print(5) => print, terminate & go back to main()   [10]
     * 
     * 2. fib(4) [2]
     *    - print(4) => print, terminate & go back to print(5) [9]
     * 
     * 3. fib(3) [3]
     *    - print(3) => print, terminate & go back to print(4) [8]
     * 
     * 4. fib(2) [4]
     *    - print(2) => print, terminate & go back to print(3) [7]
     * 
     * 5. fib(1) [5]
     *    - print(1) => print, terminate & go back to print(2) [6]
     * 
     * O/P: 1, 2, 3, 4, 5
     * Stack is empty now
     * 
     * Final Output: 5 4 3 2 1 1 2 3 4 5
    */
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
}
