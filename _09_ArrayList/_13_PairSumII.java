package _09_ArrayList;

public class _13_PairSumII {
    /**
     * Pair Sum-2:
     * Q. Find if any pair in a Sorted & Rotated ArrayList has a target sum.
     * => list = [11, 15, 6, 8, 9, 10],   target=16
     * 
     * => Iska original rotation ka pivot point "10" hai. Iska original
     *    list tha => [6, 8, 9, 10, 11, 15]
     *                <-----------><------>
     * => Iss tarah se humaara arraylist sorted and rotated hai.
     * */ 

    /**
     * 1. Brute Force: O(n^2) <= Same Code as Pair Sum-I
    */

    /**
     * 2. Optmized Approach: Two Pointer O(n)
     * Step-1: Find out breaking point
     * => Sbse pehle hum "pivot point" find out krnge. Pivot Point wo
     *    point hota hai jaha se mera array rotate hua hai, means jaha
     *    se mera sorted array break ho jaata hai. Because sorted array
     *    m humesa list(i) < list(i+1) se.
     * => Breaking Point: 11 < 15 | 6 < 8 < 9 < 10
     *                       [Breaking]
     * => 15 k aage bda number hona chaiye tha but chota number hai.
     *
    */
}
