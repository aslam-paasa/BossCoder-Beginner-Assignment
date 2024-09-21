package _12_Recursion_With_ArrayList_And_String;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_GetStairsPath {
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
     * 
     * Note: i1 + i2 + i3 => Total possible ways 
     * => [Same as fibonacci => f(n-1) + f(n-2) + f(n-3)]
     * => Only difference is base case.
     * 
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<String> totalPossibleSteps = getStairPaths(n);
        System.out.println(totalPossibleSteps);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        /**
         * Base Case:
         * => Blank String ki ek subsequence hoti hai => ""
         * => [] is wrong, so we have added [""] inside arraylist
         *    (a) []   : 0
         *    (b) [""] : 2^0 => 1
        */
        if(n == 0) {
            ArrayList<String> blankResult = new ArrayList<>();
            blankResult.add(""); // [""] <= size-1 (don't do anything at stair-0)
            return blankResult;
        } else if(n < 0) {
            ArrayList<String> blankResult = new ArrayList<>();
            return blankResult; // [] => 0 (negative stair not possible)
        }

        /**
         * Recursive Relation:
         * 1. Path from n - 1 stair
         * 2. Path from n - 2 stair
         * 3. Path from n - 3 stair
        */
        ArrayList<String> oneStep   = getStairPaths(n-1);
        ArrayList<String> twoStep   = getStairPaths(n-2);
        ArrayList<String> threeStep = getStairPaths(n-3);


        ArrayList<String> expectedStep = new ArrayList<>();

        // Means for each String in the ArrayList paths from n - 1
        for(String oneStepTillN: oneStep) {
            String faithStep = "1" + oneStepTillN;
            expectedStep.add(faithStep);
        }

        // Means for each String in the ArrayList paths from n - 2
        for(String twoStepTillN: twoStep) {
            String faithStep = "2" + twoStepTillN;
            expectedStep.add(faithStep);
        }

        // Means for each String in the ArrayList paths from n - 3
        for(String threeStepTillN: threeStep) {
            String faithStep = "3" + threeStepTillN;
            expectedStep.add(faithStep);
        }

        return expectedStep;
    }
}


/** 
 * Source to Destination Diagram:
 * 
 * 0 -1 -2-1 -2-3 -2 -3 -4
 * +--+--+ +--+--+ +--+--+  
 *(1) 1   (2) 0  (3) -1
 *    +-------+-------+     
 *            |
 *        (1) 2       (2) 1       (3) 0             (1) 1  (2) 0  (3)-1        (1) 0  (2) -1  (3) -2
 *            +-----------+-----------+    +-----------+-----------+             +-----------+-----------+   
 *                         |                           |                           |
 *                         |                           |                           |
 *                     (1) 3                       (2) 2                       (3) 1 
 *                         +---------------------------+---------------------------+
 *                                                     |
 *                                                     4
 * Note: 
 * 1. 0, -1, -2 wale steps special cases hai.
 * 2. Dono hi base case hai:
 *    a. 0 is +ve base case    [0th floor pe hi khade rhe to aa skte hai]
 *    b. -ve is -ve base case  [Jump not possible]
 * 
 * => Jo v raaste '0' m end hue hai wo saare correct raasta hai
 *    4 times (n-1) lga tb jaa k rasta '0' pe end hua i.e. '1111'
 *    2 times (n-1) then (n-2) pe raste '0' pe end hua i.e. '112'
 *    .......
 *    .......
 * => Jo '-ve' pe end hue hai wo sb result nhi bnaenge.
 * 
 * Note: Draw this in notebook.
 * 1. 3-recursive calls hai
 * 2. Activity post calls pe ho rhi hai
*/

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
