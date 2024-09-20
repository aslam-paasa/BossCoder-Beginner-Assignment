package _18_RecursionWithArrayList;

public class _01_PrintOnetillN {
    /**
     * f(i+1, n) is the recursive function call, but this
     * is not allowed. How can we solve it?
     * => backtracking
     * 
     * Logic:
     * f(i, n) {
     *    if(i < 1) {
     *       return;
     *    }
     * 
     *    f(i-1, n);
     *    print(i);
     * }
     * 
     * Understand, what if I write the "print()" after the recursion call?
     * => Input: n = 3
     * 
     * 1. f(3, 3)
     *    (a) Base Case: Not satisfied (3 < 1)
     *    (b) f(3-1, 3); => print() not executed, fn call goes
     * 
     * 2. f(2, 3)
     *    (a) Base Case: Not satisfied (2 < 1)
     *    (b) f(2-1, 3); => print() not executed, fn call goes
     * 
     * 3. f(1, 3)
     *    (a) Base Case: Not satisfied (1 < 1)
     *    (b) f(1-1, 3); => print() not executed, fn call goes
     * 
     * 4. f(0, 3)
     *    (a) Base Case: Safisfied => return
     * 
     * 3. (a) f(1-1, 3) executed
     *    (b) print() executes     => 1
     *        => fn ended, return back
     * 
     * 2. (a) f(2-1, 3) executed
     *    (b) print(i) executes    => 2
     *        => fn ended, return back
     * 
     * 1. (a) f(3-1, 3) executed
     *    (b) print(i) executes    => 3
     *        => fn ended, return back
     * 
     * Output:
     * => 1
     * => 2
     * => 3
     * 
     * I was able to output in the linearly increasing order, so its
     * not necessary to start from 1 in order to print 1, 2, 3.
     * We can start from the back and we can do the task after the
     * fn call. So, basically, by doing this we made it mandatory
     * unless and until this f(i-1, n) line is over we will never
     * print print(i). So, we made sure the last guy has executed first
     * i.e. print(i).
     * 
     * Q. How did we make sure?
     * => Print(i) will get started once we reach the base case, we opposite
     *    we started.
     * */ 
}
