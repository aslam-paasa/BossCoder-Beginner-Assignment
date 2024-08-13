package _10_Recursion_Basic;

public class _03_Recursion_PMI_Relationship {

    /**
     * Recursion:
     * => Function calling itself.
     * 
     * Q. How can we do this?
     * => PrintDecreasing(4) = 4, 3, 2, 1
     * => We can related recursion with Algebra:
     * 
     *    f(x) = x^2           public static int f(int x) {
     *                            return x * x;
     *                         }
     * 
     * => f(3) = 3^2           public static int f(int x) {
     *         = 9                return 3 * 3;
     *                         }
     * Maths function & Java Function represent the same function.
     * 
     * Note: Another thing we will see in Algebra, Principal of 
     *       Mathematical Induction, because Recursion is based on the
     *       concept of PMI.
     * */ 

    /**
     * Principle of Mathematical Induction(PMI): 
     * (1) Base Case:
     *  => Imagine you have a tiny LEGO castle with just one piece (the 
     *     foundation). You can easily prove that it's a castle (even if
     *     it's tiny!).
     * 
     * (2) Recursive Step:
     *  => Now, assume you have a slightly bigger castle, built using the
     *     same steps as before. You can prove that it's a castle by:
     *     (a) Using the fact that the smaller castle (the one you assumed)
     *         is a castle (this is like the recursive call).
     *     (b) Adding one more piece to the smaller castle, using the same
     *         steps as before (this is like the inductive step).
     * 
     * (3) Inductive Step:
     *  => By combining the base case and the recursive step, you can prove 
     *     that any castle built using these steps is indeed a castle!
     * 
     * (4) Termination:
     *  => When you've built the entire castle, you stop adding pieces. 
     *     This is like the termination condition, where you know you're 
     *     done.
     * 
     * By using recursion to build the castle, one piece at a time, 
     * you've proved the Principle of Mathematical Induction!. In other
     * words,
     * (a) The base case is like the foundation of the castle.
     * (b) The recursive step is like adding one more piece to the castle,
     *     using the same steps as before.
     * (c) The inductive step is like proving that the bigger castle is still
     *     a castle.
     * (d) Termination is like knowing when to stop adding pieces.
     * => Recursion helps us prove the PMI by breaking down the problem into 
     *    smaller, manageable pieces, and then combining them to prove the 
     *    overall statement!
     *
    */

    /**
     * f(x) = x^2
     * f(x) = x! = x.f(x-1)
    */

}
