package _12_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_GetStairPaths {

    /**
     * 
     * Stair Paths:
     * 
     *  __n
     *    |__n-1
     *       |__3
     *          |__2
     *             |__1
     *                |________0
     * => 0th stair pe hm already khade hai i.e. source, aur stairs badhte
     *    badhte 'n' tk jaa rhi hai.
     * => Humein 'n' tk pahuchni hai i.e. destination.
     * 
     * Q. 'n' stairs tk pahuchne k liye kn kn se steps allowed hai?
     * (a) 1 stair at a time
     * (b) 2 stairs at a time
     *     Find number of ways to reach nth stair?
     * 
     * Explanation:
     * To solve this recursively, we'll think about the problem like this:
     * => If we're at step 'n', we can come from either:
     *   (a) step 'n-1' (by taking 1 step):
     *    => Jaise, hum nth step pe khade hai, to hum n-1 step se ek step 
     *       chadhke wahaan pahuche hai.
     * 
     *   (b) Step 'n-2' (by taking 2 steps):
     *    => Jaise, hum nth step pe khade hai, to hum n-2 step se do step
     *       chadhke wahaan pahuche hai.
     *
     * - So, we'll find all possible ways to reach step 'n-1', 'n-2'.
     * - Then, we'll add the current step to each of those paths.
     * 
     * - Total no of ways to reach 'n':
     *    f(n) = f(n-1) + f(n-2)        [Fibonacci Series]
     * 
    */

    /**
     * Remember this diagram:
     * 
     *                     Destination
     *                         ^
     *                         |
     *       +------+------+------+------+------+
     *     P1|    P2|    P3|    P4|    P5|    P6|
     *       |      |      |      |      |      |
     *       +------+      +      +------+------+
     *           |         |             |
     *           i1        i2            i3
     *           +         +             +
     *           |         |             |
     *           +---------+-------------+
     *                     |
     *                   Source
     * 
     * Kvi v humein source to destination jaana ho:
     * (a) Source se hum jaa skte the:
     *     i. Intermediate(i1)
     *     ii. Intermediate(i2)
     *     iii. Intermediate(i3)
     * (b) Let's say:
     *     i. 2 ways from Intermediate(i1) to destination
     *        => Path-1
     *        => Path-2
     *     ii. 1 way from Intermediate(i2) to destination
     *        => Path-3
     *     iii. 3 ways from Intermediate(i3) to destination
     *        => Path-4
     *        => Path-5
     *        => Path-6
     * => So, Source to Destination jaane k 6 raaste ho jaenge.
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        /**
         * Base Case: Stopping Condition
         * */
        if(n == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(""); // [""] <= size-1
            return baseResult;
        } else if(n < 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            return baseResult; // [] => 0
        }

        /**
         * Recursive Relation:
        */
        ArrayList<String> pathFromNminOne   = getStairPaths(n-1);
        ArrayList<String> pathFromNminTwo   = getStairPaths(n-2);
        ArrayList<String> pathFromNminThree = getStairPaths(n-3);

        ArrayList<String> pathsFromN = new ArrayList<>();
        for(String pathFromNm1: pathFromNminOne) {
            String pathFromN = "1" + pathFromNm1;
            pathsFromN.add(pathFromN);
        }

        for(String pathFromNm2: pathFromNminTwo) {
            String pathFromN = "2" + pathFromNm2;
            pathsFromN.add(pathFromN);
        }

        for(String pathFromNm3: pathFromNminThree) {
            String pathFromN = "3" + pathFromNm3;
            pathsFromN.add(pathFromN);
        }
        return pathsFromN;
    }
}



    /**
     * Let's break down the GetStairPaths problem step by step:
     * 1. We want to find all possible ways to reach the top of a stair with 'n' steps.
     *    We can climb either 1, 2, or 3 steps at a time.
     * 
     * 2. To solve this recursively, we'll think about the problem like this:
     * => If we're at step 'n', we can come from either:
     *   (a) step 'n-1' (by taking 1 step):
     *    => Jaise, hum 5th step pe khade hai, to hum 4th step se ek step 
     *       chadhke wahaan pahuche hai.
     * 
     *   (b) Step 'n-2' (by taking 2 steps):
     *    => Jaise, hum 5th step pe khade hai, to hum 3rd step se do step
     *       chadhke wahaan pahuche hai.
     * 
     *   (c) Step 'n-3' (by taking 3 steps):
     *    => Jaise, hum 5th step pe khade hai, to hum 2nd step se teen 
     *       step chadhke wahaan pahuche hai.
     * 
     * - So, we'll find all possible ways to reach step 'n-1', 'n-2', and 'n-3'.
     * - Then, we'll add the current step to each of those paths.
     * 
     * Here's how the code works:
     * 
     * 1. We call getStairPaths(n-1), getStairPaths(n-2), and getStairPaths(n-3)
     *    to find all possible paths from those steps.
     * 2. We create a new ArrayList, pathsFromN, to store all possible paths from step 'n'.
     * 3. We iterate over each path from step 'n-1' and add '1' to the beginning of each path.
     *    This represents taking 1 step from 'n-1' to 'n'.
     * 4. We do the same for paths from 'n-2' and 'n-3', but add '2' and '3' respectively.
     * 5. Finally, we return the combined list of paths from 'n'.
     * 
     * Remember, recursion works by breaking down the problem into smaller sub-problems
     * until we reach a base case (in this case, when n=0 or n=1).
     * Then, we combine the solutions to the sub-problems to solve the original problem.
     */
