package _16_RecursionWithArrayList;

public class _03_SumOfFirstNnumbers {
    
    /**
     * Approach-1: Parameter way
     * 
     * f(i, sum) {
     *    if(i < 1) {
     *       print ("Sum");
     *       return;
     *    }
     * 
     *    f(i-1, sum+i)
     * }
     * 
     * main() {
     *    int n = 3;
     *    f(n, initialSum = 0)
     * }
     * 
     * 1. f(i=1, s=0)
     *    (a) Base Case: Not satisfied
     *    (b) f(i-1, s+i)
     * 
     * 2. f(i=2, s=0+3)
     *    (a) Base Case: Not satisfied
     *    (b) f(i-1, s+i)
     * 
     * 3. f(i=1, s=3+2)
     *    (a) Base Case: Not satisfied
     *    (b) f(i-1, s+i)
     * 
     * 4. f(i=0, s=5+1)
     *    (a) Base Case: Satisfied
     *        Print(s = 6)             => print: 6
     *        return;
     * 
     * 3. f(i=1, sum+i)
     * 
     * 2. f(i=1, sum+i)
     * 
     * 1. f(i=1, sum+i) 
    */

    /**
     * Approach-2: Functional way
     * => Sometimes we want the function to give me something instead 
     *    of printing. That's when we use functional way.
     * => If n = 3:
     *    (a) 3 + f(2), where f(n) means summation of 1st "n" numbers
     *    (b) 2 + f(1)
     *    (c) 1 + f(0) => f(0) is base case
     * 
     * Logic:
     * f(n) {
     *    if(n == 0) {
     *       return 0;
     *    }
     * 
     *    return n + f(n-1);
     * }
     * 
     * main() {
     *    int n = 3;
     * print(f(n));
     * }
     * 
     * 1. f(3)
     *    (a) Base Case: Not satisfied
     *    (b) return 3 + f(n-1); => Incomplete line will be called then we will return
     * 
     * 2. f(2)
     *    (a) Base Case: Not satisfied
     *    (b) return 2 + f(n-1); => Incomplete line will be called then we will return
     *  
     * 3. f(1)
     *    (a) Base Case: Not satisfied
     *    (b) return 1 + f(n-1); => Incomplete line will be called then we will return
     * 
     * 4. f(0)
     *    (a) Base Case: Satisfied
     *    (b) return 0;
     * 
     * 3. f(1)
     *    (a) return 1 + 0;
     * 
     * 2. f(2)
     *    (a) return 2 + 1;
     *  
     * 1. f(3)
     *    (a) return 3 + 3;
     * 
     * 0. main() {
     *       print(f(n)); => 6
     *    }
     * 
     * Output:
     * => 6
    */

    public static void main(String[] args) {
        int n = 3; // summation: 1+2+3 = 6
    }
}
