package _07_ArrayOneDimension;

public class _06_ConceptOfPermutation {
    public static void main(String[] args) {
        
        /**
         * Concept of Permutation:
         * => Think of an array as a row of boxes, each containing a number 
         *    or item. By using permutations, we can rearrange these boxes 
         *    in different ways to solve various problems.
         * 
         * 1. Sorting and Rearranging Arrays:
         * => Problem: Arrange items in a specific order.
         * => Example: Think of organizing books on a shelf. Permutations help you find all 
         *             possible ways to arrange those books in different orders. Sorting a 
         *             list of numbers from smallest to largest is finding one specific 
         *             permutation.
         * 
         * => Problem: Given an array, find all the possible ways to rearrange its elements.
         * => Example: You have [1,2,3]. Using Permutations, you can rearrange it to get 
         *             [1,2,3], [2,1,3], [2,3,1], [3,1,2] and [3,2,1].
         * 
         * 
         * 
         * 2. Finding the next permutation:
         * => Problem: Given an array, find the next permutation in lexographical order like
         *             dictionary order.
         * => Example: For an array [1,2,3], the next permutation is [1,3,2]. This is like
         *             figuring out the next number after 123 in counting.
         * 
         * 
         * 
         * 3. Checking for Permutations:
         * => Problem: Determine if one set of items is a rearrangement of another set.
         * => Example: You have two strings, "ABC" and "CAB." Using permutations, you can check 
         *             if "CAB" is just a rearrangement of "ABC." This is useful for verifying 
         *             if two lists or strings contain the same elements in any order.
         * 
         * => Problem: Given two arrays, check if one is a permutation of the other.
         * => Example: For arrays [1,2,3] and [3,2,1], you can use permutations to see that they 
         *             contain the same elements in a different order, so one is a permutation
         *             of the other.
         * 
         * 
         * 
         * 4. Generating Subsets/Possible Combinations:
         * => Problem: Create all possible combinations of items.
         * => Example: Imagine you have a set of Lego bricks in different colors, and you want to 
         *             build different structures. Permutations help you figure out all the 
         *             possible ways to combine and arrange those bricks.
         * 
         * => Problem: Given an array, generate all possible subsets (combinations of elements).
         * => Example: For the array [1,2,3], the subsets are [], [1], [2], [3], [1,2], [1,3],
         *             [2,3] and [1,2,3]. Here, permutations help in finding all ways to select
         *             elements.
         * 
         * 
         * 
         * 5. Solving Puzzle Like Problem:
         * => Problem: Find a solution to a puzzle where the order of elements matters.
         * => Example: Consider a jigsaw puzzle where you need to place pieces in the correct 
         *             order to complete the picture. Using permutations, you can try different 
         *             arrangements of the pieces until you find the one that fits.
         * 
         * => Problem: Arrange elements in a specific order to meet certain conditions.
         * => Example: For a puzzle where you need to arrange numbers such that no two
         *             adjacent numbers are the same, permutations help you try all 
         *             possible arrangements until you find one that works.
         * 
         * 
         * 
         * 6. Finding Permutations that meet specific conditions:
         * => Problem: Find permutations of an array that satisfy given conditions.
         * => Example: If you need to find all permutations of [1,2,3,4] where the 
         *             first element is 1, permutations can help you generate and 
         *             check all possible orders.
         * 
         * 
         * 
         * 5. Solving Word Problems
         * => Problem: Find all possible rearrangements of letters in a word.
         * => Example: If you have the word "CAT," permutations help you find all possible 
         *             rearrangements like "ACT," "TAC," "ATC," etc. This can be useful in 
         *             games like Scrabble or in creating anagrams.
         * 
         * 
         * 
         * 7. Permutation based Sorting:
         * => Problem: Sort an array using a permutation-based approach.
         * => Example: If you need to sort an array [3, 1, 2] to get [1, 2, 3], 
         *             understanding permutations can help in developing or understanding 
         *             sorting algorithms that rearrange elements in the correct order.
         * 
         * 8. Pathfinding Problems
         * => Problem: Find all possible paths in a maze.
         * => Example: Imagine a maze where you need to find all possible ways to reach the 
         *             exit from the entrance. Permutations help you explore different paths 
         *             and figure out which ones lead to the exit.
         * 
         * => Problem: Find the best route to visit multiple locations.
         * => Example: Think of a delivery driver who needs to deliver packages to several 
         *             houses. Permutations help the driver figure out all possible routes 
         *             and find the shortest one, saving time and fuel.
         * 
         * => Problem: Find the best path that visits all elements in an array.
         * => Example: If you have an array representing cities [A, B, C] and need to find 
         *             the shortest route that visits each city once, permutations help in 
         *             generating and evaluating all possible routes.
         * 
         * 
         * 
         * 9. Arranging Objects
         * => Problem: Given an array of objects, arrange them in a specific order.
         * => Example: If you have an array of books [Book1, Book2, Book3] and need to 
         *             arrange them in all possible orders on a shelf, permutations help 
         *             you find all the different arrangements.
         * 
         * 
         * 
         * 10. Optimization Problems
         * => Problem: Find the optimal way to arrange elements to minimize or maximize a value.
         * => Example: If you have an array representing tasks with different durations and need 
         *             to minimize the total time taken, permutations help in exploring different
         *             task orders to find the best one.
         * */ 
    }
}
