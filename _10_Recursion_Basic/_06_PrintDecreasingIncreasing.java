package _10_Recursion_Basic;

import java.util.Scanner;

public class _06_PrintDecreasingIncreasing {
    /**
     * Q. Pdi(4) = 4, 3, 2, 1, 1, 2, 3, 4
     * 
     * 1. Expectation: Pdi(4) = 4, 3, 2, 1, 1, 2, 3, 4
     * 2, Faith: Pdi(3) = 3, 2, 1, 1, 2, 3
     * 3. EwF: pdi(4) = 4 pdi(3) 4
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasingIncreasing(n);
    }

    /**
     * 1. Expectation: pdi(4) 
     * 2. Faith: pdi(3) = 3, 2, 1, 1, 2, 3
     * 3. EwF: pdi(4) = 4 pdi(3) 4
    */
    public static void printDecreasingIncreasing(int n) {
        
        /**
         * Base Case:
        */
        if(n == 0) {
            return;
        }

        System.out.println(n); // pre area
        printDecreasingIncreasing(n-1); // recursive call
        System.out.println(n); // post area
    }
}

/**                                    Value Printed: Top to Bottom
 *     +        +                                     +        +
 *     |        |                                     |   4    | Line-1
 *     |        |                                     |   3    | Line-1
 *     |        |                                     |   2    | Line-1
 * pdi |  n=0   |=> Base Case: fn wiped & niche girnge|   1    | Line-1
 * pdi |  n=1   | Line-1,2 => Line-3 (wipe out)       |   1    | Line-3
 * pdi |  n=2   | Line-1,2 => Line-3 (wipe out)       |   2    | Line-3
 * pdi |  n=3   | Line-1,2 => Line-3 (wipe out)       |   3    | Line-3
 * pdi |  n=4   | Line-1,2 => Line-3 (wipe out)       |   4    | Line-3
 *main |  n=4   |                                     +--------+
 *     +--------+                                      Console
 *       Stack
 * 
 * Note: Recursive call m:
 * (a) Line-1 tb chlti hai jb wo stack m upar jaati hai.
 *     => Base Case k aur jaate hue.
 * (b) Line-3 tb chlti hai jb wo stack m niche jaati hai.
 *     => Base Case se wapas aate hue.
*/