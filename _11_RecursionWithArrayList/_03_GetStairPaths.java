package _11_RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_GetStairPaths {
    /**
     * Stair Paths:
     * 
     *  __5
     *    |__4
     *       |__3
     *          |__2
     *             |__1
     *                |________0
     * 
     * Q. Either we can take:
     *    (a) 1 Step
     *    (b) 2 Step
     *    (3) 3 Step, at a time.
     *    How many ways we have to reach stair-5?
     * => 16 ways:
     *    (a) 0-0 : x
     *    (b) 0-1 : 11, 2
     *    (c) 0-2 : 11, 12, 21, 3
     *    (d) 0-4 : 13, 112, 22, 1111, 121, 211, 31
     *    (e) 0-5 : ???
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
        ArrayList<String> pathFromNminOne   = getStairPaths(n-1);
        ArrayList<String> pathFromNminTwo   = getStairPaths(n-2);
        ArrayList<String> pathFromNminThree = getStairPaths(n-3);

        ArrayList<String> pathsFromN = new ArrayList<>();
        for(String pathFromNmin1: pathFromNminOne) {
            // String pathFromN = 1 + pathFromNm1;
        }
        return null;
    }
}
