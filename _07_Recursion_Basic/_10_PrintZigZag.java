package _07_Recursion_Basic;

import java.util.Scanner;

public class _10_PrintZigZag {
    /**
     * Input1: 1
     * Output: 111
     * 
     * Input2: 2
     * Output: 211121112
     * 
     * Input3: 3
     * Output: 321112111232111211123
     * 
     * Note:
     * (a)   111
     * (b) 2 111 2 111 2
     * (c) 3 211121112 3 211121112 3
     * */ 

    /**
     * 1. Expectation: Pzz(3) = 3 211121112 3 211121112 3
     * 2. Faith: Pzz(2) = 2 111 2 111 2
     * 3. EwF: Pzz(3) = 3.Pzz(2).3.Pzz(2).3
    */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
    }

    /**
     * 1. Expectation: Pzz(3) = 3 211121112 3 211121112 3
     * 2. Faith      : Pzz(2) = 2 111 2 111 2
     * 3. EwF        : 3 Pzz(2) 3 Pzz(2) 3
    */
    public static void pzz(int n) {
        if(n == 0) {
            return;
        }
        // Line-1: pre-area
        System.out.println(n + " pre ");
        // Line-2: Left Call
        pzz(n-1);
        // Line-3: In-area
        System.out.println(n + " in ");
        // Line-4: Right Call
        pzz(n-1);
        // Line-5: Post-area
        System.out.println(n + " post ");
    }
}


/**
 * Recursive Tree Diagram:
 *  
 *                   pzz(3)
 *                 /   |   \
 *               3     3     3
 *              / \       / \
 *         pzz(2) pzz(2) pzz(2)
 *          /   |   \      /   |   \
 *        2     2     2    2     2     2
 *       / \  / \   / \  / \  / \  / \
 *    pzz(1) pzz(1) pzz(1) pzz(1) pzz(1) pzz(1)
 *    / | \   / | \   / | \   / | \   / | \   / | \
 *  1   1   1   1   1   1   1   1   1   1   1   1   1
 * / \ / \ / \ / \ / \ / \ / \ / \ / \ / \ / \ / \ / \
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 
 * Note: Ek se jyda recursive call hai to Euler Tree banega.
 *
*/

/**
 * Dry Run with Output:
 * 
 * 1. Initial Call: pzz(3)
 *    (a) Line-1 => Print: 3 
 *    (b) Line-2 => Call pzz(2) 
 * 
 * 2. Next Call: pzz(2)
 *    (a) Line-1 => Print: 2
 *    (b) Line-2 => Call pzz(1)
 * 
 * 3. Next Call: pzz(1)
 *    (a) Line-1 => Print: 1
 *    (b) Line-2 => Call pzz(0) => Base Case: Return and move to next line
 *    (c) Line-3 => Print: 1
 *    (d) Line-4 => Call pzz(0) => Base Case: Return and move to next line
 *    (e) Line-5 => Print: 1
 * 
 * 4. Back to pzz(2)
 *    (a) Line-3 => Print: 2
 *    (b) Line-4 => Call pzz(1)
 * 
 * 5. Next Call: pzz(1)
 *    (a) Line-1 => Print: 1
 *    (b) Line-2 => Call pzz(0) => Base Case: Return and move to next line
 *    (c) Line-3 => Print: 1
 *    (d) Line-4 => Call pzz(0) => Base Case: Return and move to next line
 *    (e) Line-5 => Print: 1
 * 
 * 6. Back to pzz(2)
 *    (a) Line-5 => Print: 2
 * 
 * 7. Back to pzz(3)
 *    (a) Line-3 => Print: 3
 *    (b) Line-4 => Call pzz(2)
 * 
 * 8. Next Call: pzz(2)
 *    (a) Line-1 => Print: 2
 *    (b) Line-2 => Call pzz(1)
 * 
 * 9. Next Call: pzz(1)
 *    (a) Line-1 => Print: 1
 *    (b) Line-2 => Call pzz(0) => Base Case: Return and move to next line
 *    (c) Line-3 => Print: 1
 *    (d) Line-4 => Call pzz(0) => Base Case: Return and move to next line
 *    (e) Line-5 => Print: 1
 * 
 * 10. Back to pzz(2)
 *     (a) Line-3 => Print: 2
 *     (b) Line-4 => Call pzz(1)
 * 
 * 11. Next Call: pzz(1)
 *     (a) Line-1 => Print: 1
 *     (b) Line-2 => Call pzz(0) => Base Case: Return and move to next line
 *     (c) Line-3 => Print: 1
 *     (d) Line-4 => Call pzz(0) => Base Case: Return and move to next line
 *     (e) Line-5 => Print: 1
 * 
 * 12. Back to pzz(2)
 *     (a) Line-5 => Print: 2
 * 
 * 13. Back to pzz(3)
 *     (a) Line-5 => Print: 3
 * 
 * Final Output: 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
 */

/**
 * Line-1: syso(3)         => 3
 * Line-2: pzz(2)
 *    Line-2: pzz(1)
 *       Line-2: pzz(0)
 * Line-3: syso(2)         => 2
 *    Line-3: syso(1)      => 1
 *       Line-3: syso(1)   => 1
 * Line-4: pzz(2)
 *    Line-4: pzz(1)
 *       Line-4: pzz(0)
 * Line-5: syso(2)         => 2
 *    Line-5: syso(1)      => 1
 *       Line-5: syso(1)   => 1
*/