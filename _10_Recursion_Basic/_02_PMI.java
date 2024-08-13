package _10_Recursion_Basic;

public class _02_PMI {
/**
 * Q. What is PMI?
 * => PMI is like a game where we want to prove that a statement is true
 *    for all positive integers(1, 2, 3, ...)
 * 
 * The Game:
 * => Let's say we want to prove that teh statement "F(n) = n" is true
 *    for all positive integers.
 * 
 * Step-1: Base Case:
 * => We start by proving it's true for the smallest positive integer, 
 *    which is 1:
 * 
 *    F(1) = 1 (this is like the foundation of our game)
 * 
 * Step-2: Inductive Step: 
 * => Now, we assume it's true for some number k:
 * 
 *    F(k) = k (this is like the previous level of our game)
 * 
 * Step-3: Step 3: Prove it for k+1: 
 * => We need to prove it's true for the next number, which is k+1:
 * 
 *    F(k+1) = F(k) + 1 (using the previous level)
 *           = k + 1 (because F(k) = k)
 * 
 * Ta-da!: We proved it's true for k+1!
 * 
 * 
 * The Magic: 
 * => Now, we can use the same steps to prove it's true for k+2, k+3, 
 *    and so on...
 * 
 * Conclusion: 
 * => Since we proved the base case and the inductive step, we can 
 *    conclude that F(n) = n is true for all positive integers!
 * */ 
}
