package _12_RecursionWithArrayList;

public class _892_NumbersExample {
    /**
     * Q. How this fn calls works in languages?
     * => All the function call that happens in a programming language,
     *    they go to the stack memory.
     * => 1. main() fn is called.
     *       while the fn is not finished executing, it will remain in
     *       stack. That means fn call is till going on.
     *    2. print1() fn will run, until then main() fn will rest in
     *       stack memory. So, print1(1) will also go in the stack memory.
     *    3. print2() fn will get called, until then print1() will rest in
     *       the stack. So, print2(2) will also go in the stack memory.
     *    4. print3() fn will get called, until then print2() will rest in
     *       the stack. So, print3(3) will also go in the stack memory.
     *    5. print4() fn will get called, until then print3() will rest in
     *       the stack. So, print4(4) will also go in the stack memory.
     *    6. print5() fn will go to the stack memory, print the num 5.
     * 
     *    Fn Call:                       Output:
     *    +           +
     *    |           |
     *    +-----------+
     *    | print5(5) |                   1
     *    +-----------+
     *    | print4(4) |                   2
     *    +-----------+
     *    | print3(3) |                   3
     *    +-----------+
     *    | print2(2) |                   4
     *    +-----------+
     *    | print1(1) |                   5
     *    +-----------+
     *    |   main()  |
     *    +-----------+
     * 
     * When a function finishes execution, it is removed from the stack
     * and the flow of program is restored to where this fn was called
     * i.e. main().
     * 
     * For example, when your mom say to bring groceries, so while I am
     * getting groceries, I am at the work, so I am actually in the fn
     * call. When I reach home, I hand over the groceries to mom i.e. main()
     * and my job is done, so I am removed out of the stack and my flow,
     * that I am passing the groceries to another fn which is my mom().
     * Same thing happen above.
     * 
     * This is how function call works.
     *    
     *    
    */
    public static void main(String[] args) {
        /**
         * WAP that takes in a number and print it.
         * Print first 5 numbers: 1 2 3 4 5
        */
        print1(1);
    }

    public static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    public static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    public static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    public static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    public static void print5(int n) {
        System.out.println(n);
    }
}


/**
 * Q. Can you see that I am making repeatitions?
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