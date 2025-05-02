package _10_Recursion_Basic;

public class _02_PMI {
/**
 * Recursion:
 * - Recursion is technique used in computer science to solve big problems
 *   by breaking them into smaller, similar problems. The process in 
 *   which a fn calls itself directly or indirectly is called recursion
 *   and the corresponding fn is called recursive fn.
 * - Using a recursive algorithm, certain problems can be solved quite
 *   easily.
*/ 

/**
 * What is a Recursive Algorithm?
 * - A recursive algorithm is an algorithm that uses recursion to solve
 *   a problem.
 * - Recursive algorithms typically has two parts:
 *   a. Base Case: Which is a condition that stops the recursion.
 *   b. Recursive Case: Which is a call to the fn itself with a smaller
 *      version of the problem.
*/

/**
 * Type of Recursion:
 * - There are several different recursion types and terms. These include:
 *   a. Direct Recursion: This is typified by the factorial implementation
 *      where the methods call itself.
 *   b. Indirect Recursion: This happens where on method, say Method A
 *      calls another Method B, which then calls Method A. This involves
 *      two or more methods that eventually create a circular call
 *      sequence.
 *   c. Head Recursion: The recursive call is made at the beginning of
 *      the method.
 *   d. Tail Recursion: The recursive call is the last statement.
*/

/**
 * When to use Recursion?
 * - Recursion is a powerful technique that can be used to solve a wide
 *   variety of problems. However, it is important to use recursion
 *   carefully, as it can lead to stack overflows if not used properly.
 * - Recursion should be used when:
 *   a. The problem can be broken down into smaller subproblem that can
 *      be solved recursively.
 *   b. The base case is easy to identify.
 *   c. The recursive calls are tail recursive.
*/

/**
 * Applications of Recursion Algorithms:
 * 1. Tree and Graph: DFS & BFS
 * 2. Dynamic Programming: Solving optimization problems by breaking
 *    them into smaller subproblems.
 * 3. Divide-And-Conquer: Solving problem by dividing them into smaller
 *    parts, solving each part recursively, and combining the results.
 * 4. Backtracking: Exploring all possible solutions to a problem by
 *    recursively trying different options
 * 5. Combinatorics: Counting or generating all possible combinations 
 *    or permutations of a set.
*/

}
