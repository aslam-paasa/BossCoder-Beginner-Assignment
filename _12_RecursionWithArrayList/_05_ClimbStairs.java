package _12_RecursionWithArrayList;

import java.util.Scanner;

public class _05_ClimbStairs {
    /**
     *  __n(Destination)
     *    |__n-1
     *       |__3
     *          |__2
     *             |__1
     *                |________0(Source)
     * 
     * Steps allowed?
     * 1. One stair at a time
     * 2. Two stair at a time
     * Find number of ways to reach nth stair? Source se Destination tk
     * pahuchne k kitne ways exist krte hai?
     * 
     * => Hum 'n' stair pe kaise pahuche? Either "n-1" stair se or "n-2"
     *    stair se. Qki ek baar m 1 stair chadh skte hai ya 2 stair chadh
     *    skte hai 'n' k pahuchne k liye.
     * => Total number of ways to reach nth stair:
     *    fn(n) = f(n-1) + f(n-2)     [Similar to fibonacci series]
     * */ 

    /**
     * 3rd stair pe pahuchne k kitne tarike hai?
     *       |__3
     *          |__2
     *             |__1
     *                |________0(Source)
     * (a) 1,1,1 (3 jump)
     * (b) 1,2   (2 jump)
     * (c) 2,1   (2 jump)
     * => Total 3 ways to reach 3rd stair.
    */

    /**
     * Check at every stairs, total number of ways:
     * f(n) = f(n-1) + f(n-2)  
     * f(5) = f(4)   + f(3)     => 5+3 => 8 => Total no of ways
     * f(4) = f(3)   + f(2)     => 3+2 => 5
     * f(3) = f(2)   + f(1)     => 2+1 => 3
     * f(2) = f(1)   + f(0)     => 1+1 => 2 [Base Case]
     * 
    */

    public static int climbStairs(int n) {
        /**
         * 1. Base Case:    [Stopping Condition]
         * => 0th stair pe pahuchne k ek tarika hai, mai phle se 0 pe 
         *    khada hu aur jump kr k wapas 0 pe aa gya to 1 way hua.
         * => 1st stair pahuchne k 1 tarika hai.
         * */
        if(n == 0 || n == 1) {
            return 1;
        }

        int ans = climbStairs(n-1) + climbStairs(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = scn.nextInt();

        int ans = climbStairs(n);
        System.out.println("Total number of ways to reach nth stair is: " + climbStairs(n));
    }
}

/**
 * Note: Time Limit Exceeded => Slow Code
 * => O(2^n)
*/