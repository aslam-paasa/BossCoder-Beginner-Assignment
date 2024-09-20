package _12_RecursionWithArrayList;

public class _900_Print_1_till_N {
    /**
     * Instead of print 5, 4, 3, 2, 1. What if want to print 1, 2, 3, 4, 5?
     * => When we are emptying the stack then only print.
     *    (First do recursion call, then while emptying the stack, print)
     * 
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
     * When the fn call finished executing then print your number.
     * O/P: 1, 2, 3, 4, 5
    */
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n) {
        if(n == 0) {
            return;
        }

        fun(n-1);
        System.out.println(n);
    }
}
