package _12_RecursionWithArrayList;

public class _894_How_To_Study_Recursion {
    /**
     * Q. Why Recursion?
     * => It helps us in solving bigger complex problems in a simple
     *    way.
     * => You can convert recursion solutions into iteration(loop) and 
     *    vice versa.
     *    ( First solve complex problems using recursion, then convert
     *      it using iteration to get more optimized answer. Because
     *      directly solving into iteration is difficult. That's why we
     *      use recursion. )
     * => Space Complexity is not constant because of recursive calls.
     * => It helps us in breaking down bigger problems into smaller
     *    problems.
     * */ 

    /**
     * Visualizing Recursion: Recrusion Tree
     * main() => done => terminate & main() fn ended
     *   |
     *   V
     * print(1) => done => terminate & go back(5)
     *   |
     *   V
     * print(2) => done => terminate & go back(4)
     *   |
     *   V
     * print(3) => done => terminate & go back(3)
     *   |
     *   V
     * print(4) => done => terminate & go back(2)
     *   |
     *   V
     * print(5) => done => terminate & go back(1)
    */
}
