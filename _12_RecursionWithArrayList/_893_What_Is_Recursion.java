package _12_RecursionWithArrayList;

public class _893_What_Is_Recursion {
    /**
     * Q. Can you see in the prev example I am making repeatitions?
     * => I am creating all of these fncs, they have the same body.
     *    (a) Taking a number
     *    (b) Printing a number
     *    (c) Calling another function
     * 
     * => Print 1 lakh numbers. Will you copy paste this fn 1 lakh times?
     * => All of these fns have same body and doing the same thing, then
     *    why are you creating these fns again and again? A simple solution
     *    is call the fn itself.
    */

    /**
     * Whatever the parameter is, fn is calling that.
     * So, we have to write a generalize answer:
     * print(n+1);
     * => Every time input will increment by 1, and with that incremented
     *    value, a new fn will get called.
     * 
     * Note: We have to write where this fn call will stop:
     *    if( n == 5 ) {
     *       return;
     *    }
    */

    /**
     * We can say: Recursion is when a fn call itself.
    */
    public static void main(String[] args) {
        print(1);
    }

    /**
     * Fn body here changes
    */
    public static void print(int n) {

        /**
         * Base Condition: Stopping point of fn call
         * => Condition where our recursion will stop making new calls
         *    (Simple if-condition)
         * => No Base Condition: Function calls will keep happening,
         *    stack will be filled again and again. Memory of computer
         *    will executed the limit - "StackOverflow Error".
        */
        if( n == 5 ) {
            System.out.println(5);
            return;
        }

        System.out.println(n);

        /**
         * Recursion Call:
         * If you are calling a function again and again, you can treat
         * it as a separate call in the stack, and every fn take memory
         * in stack separately.
         * => This is tail recursion
        */
        print(n + 1);
    }
}
