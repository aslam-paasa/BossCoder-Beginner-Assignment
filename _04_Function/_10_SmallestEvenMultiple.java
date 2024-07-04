package _04_Function;

import java.util.Scanner;

public class _10_SmallestEvenMultiple {
    /**
     * Smallest Even Multiple:
     * => Input: n = 5
     * => Output: 10
     * => The smallest multiple of both 5 and 2 is 10.
     * 
     * => Input: n = 6
     * => Output: 6
     * => The smallest multiple of both 6 and 2 is 6.
     * Note: A number is multiple of itself.
     * 
     * => https://leetcode.com/problems/smallest-even-multiple/
     * */
    
    public static int smallestEvenMultiple(int n) {
        if(n%2 == 0) {
            return n;
        } else {
            return n*2;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(smallestEvenMultiple(n));
    }
}
