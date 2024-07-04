package _04_Function;

import java.util.Scanner;

/**
 * Q. Write a function to find sum of all even numbers from 1 to N.
 * => Solve using Arithmetic Progression.
 * 
 * => Sum = n/2(a+l), where n = no.of elements, a = 1st term, l = last term
 *      |
 *      V
 *  Odd Case & Even Case
 * 
 * (a) Even Case:
 *  => n = 6 => 2+4+6 i.e. 6/2 = 3 => n= N/2
 *  => Sum = (N/2)/2(2 + N) , where n= N/2, N = last term
 *  => Sum = N(N+2)/4
 *         = 6*8/4
 *         = 12
 * 
 * (b) Odd Case:
 *  => n = 7 => 2+4+6 i.e. 6/2 = 3 (even no) + 1 odd => N-1
 *  => Sum = (N-1/2)/2(2 + N - 1) , where n= N/2, N = last term
 *  => Sum = (N-1)(N+1)/4
 *         = (n^2-1)/2
 *         = 6*8/4
 *         = 12
 *         
 */

public class _09_EvenSum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n%2 == 0) {
            System.out.println(n*(n+2)/4);
        } else {
            System.out.println((n*n-1)/4);
        }
    }
}

/**Arithmetic Progression:
 * => An arithmetic progression is a sequence of numbers where the difference between
 *    consecutive numbers is always the same. Think of it like walking up stairs: each
 *    step you take is the same height as the previous one.
 * 
 * => For example, 
 *    2, 4, 6, 8, 10, ...
 * => Here, each number is 2 more than the previous one. So, the common difference is 2.
 *    This is an AP with a common difference of 2.
 * 
 * Q. When to use AP in DSA Problem?
 * 1. Predicting Future Values/Finding the next number in sequence:
 * 
 * => If you notice that a problem involves increasing or decreasing constant amount, you
 *    might be dealing with an AP. For instance, if you're given the first few numbers and
 *    you need to find the next one, recognizing the AP pattern helps you solve it quickly.
 * 
 * => Example-1: 
 *    If the sequence is 2, 5, 8, 11, you notice that each number is 3 more than the previous 
 *    one. This is an AP with a common difference of 3.
 * => Usage: To find the next number, you simply add the common difference to the last number.
 *     -> NEXT NUMBER = LAST NUMBER + COMMON DIFFERENCE
 *     -> NEXT NUMBER = 11 + 3
 * 
 * => Example-2:
 *    If you have 5, 10, 15 and you're asked for the next number, you recoginze it as an AP
 *    with a common difference of 5. The next number is 20.
 * 
 * 2. Finding missing number:
 * => Sometimes, you might encounter a problem where some numbers in the AP are missing, and
 *    you need to find them.
 * 
 * => Example-1: Given 7, 10, _, 16, 19. The common difference appears to be 3(since 10 - 7 = 3)
 * => Usage: Identify the position of the missing number and calculate it using the common difference.
 *    (a) Position of missing number: 3rd (1-based index).
 *    (b) Calculate the value at the 3rd position using the first number and common difference.
 *        MISSING NUMBER = FIRST NUMBER + (POSITION - 1) X COMMON DIFFERENCE
 *                       = 7 + (3 - 1) * 3
 *                       = 7 + 6
 *                       = 13
 * 
 * => Example:
 *    Given 3, _, 9, and knowing it's an AP, you can figure out the missing number. Here, the 
 *    common difference is (9-3)/2 = 3. So, the missing number is 6.
 * 
 * 3. Summing up numbers:
 * => If a problem involves summing up a series of numbers that form an AP, you can use a 
 *    simple formula instead of adding them one by one.
 * 
 * => Example-1: To find the sum of first 5 numbers in AP: 2, 4, 6, 8, 10, you can use the
 *    formula:
 *              Sum = Number of terms/2 * (First term + Last term)
 *                  = n/2 * (a + l)
 *                  = 5/2 * (2 + 10)
 *                  = 5 * 6
 *                  = 30
 * 
 *             Sum = n/2 * (2a + (n-1) * d), where n = no. of terms, a = first term, d = common difference
 *                 = 5/2 * (2*2 + (5-1) * 2)
 *                 = 30
 * 
 * 4. Checking if the sequence is AP or not/Check Common Difference:
 * => Calculate the difference between consecutive terms and check if they are same or not.
 *    (a) Differences: 6-3 = 3, 9-6 = 3, 12-9 = 3
 *    (b) If all the differences are same then it's an AP.
 * 
 * => Formula: CD = Difference between any two terms / Number of terms between them
 * 
 * => Example: Subtract the first number from the second number.
 *             => Sequence: 2, 6, 10
 *             => Difference: 6-2 = 4 or 10-6 = 4
 *             => The common difference is 4.
 * 
 * 5. Algorithm Optimization/Find the nth term of the AP::
 * => Optimizing loops or calculations that involve sequences with a constant step.
 * 
 * => Example: You need to generate the first 10 terms of an AP starting with 2 and
 *    a common difference of 4.
 * => Usage: Instead of recalculating each term, use the formula for the nth term of an AP.
 * 
 *               Formula: Nth term = a + (n-1) * d
 *                        Nth term = First number+(Position−1)×Difference
 * 
 * => Example: The 10th term of the sequence starting with 2 and common difference 4:
 *               For n = 10, a = 2, d = 4
 *               => 10th term = 2 + (10-1) * 4
 *                            = 38
 * 
 *                      
 * 
 * Q. Why AP is important?
 * => Recognizing and using the concept of AP in problems helps you solve them more efficiently.
 *    Instead of doing repeatitive calculations, you can use simple formulas and pattern to get
 *    the answer quickly. This saves time and makes your solution more elegant.
 * 
 * Q. What type of questions we can solve using Arithmetic Progression?
 * 1. Arrays:
 *    => Finding the missing numbers in a sorted array.
 *    => Checking if a series of numbers forms an AP.
 *    => Summing elements of an array that follow an AP.
 * 
 * 2. Mathematical Problems:
 *    => Predicting future numbers in series.
 *    => Summing sequences efficiently.
 * 
 * 3. Algorithm Optimization:
 *    => Simplifying loops that deal with numbers increasing or decreasing steadily.
*/