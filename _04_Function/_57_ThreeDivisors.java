package _04_Function;

import java.util.Scanner;

public class _57_ThreeDivisors {

    /**
     * Three Divisors:
     * => Input: n = 2
     * => Output: false
     * => 2 has only two divisors: 1 and 2.
     * 
     * => Input: n = 4
     * => Output: true
     * => 4 has three divisors: 1, 2 and 4.
     * 
     * Note: https://leetcode.com/problems/three-divisors/description/
    */

    public static boolean isThree(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(isThree(n));
    }
}
