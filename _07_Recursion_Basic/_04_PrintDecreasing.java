package _07_Recursion_Basic;

import java.util.Scanner;

public class _04_PrintDecreasing {
    /**
     * We will learn:
     * (a) How to think High Level
     * (b) How to think Low Level
     * 
     * Note:
     * (a) High Level m 3 chije sochna hoti hai:
     *     1.
     *     2. 
     *     3.
     * (b) Low Level m 2 chije sochni hoti hai:
     *     1.
     *     2. 
     * => Recursion k concept m hum ye 5 chije krnge.
     *  */ 

    /**
     * Recursion is a function calling itself.
     * Example: Factorial
    */

    /**
     * Humein ek fn likhna hai printDecreasing(n), jisme hum 'n' pass
     * kre to wo 'n to 1' tk jaega. To humein 'n to 1' tk ki counting
     * print krni hai:
     * => printDecreasing(n) = n, n-1, n-2, ..., 3, 2, 1
     */
    
    /** 
     * Q. printDecreasing(5)
     * 
     * High Level Thinking:
     * 1. Faith
     * => Maan lo ye fn already apna kaam krna jaanta hai (abstraction)
     *    but 'n' k liye nhi but 'n' se chote k liye. So, have "faith".
     *    printDecreasing(4) = 4, 3, 2, 1
     * 
     * 2. Expectation:
     * => Humari expection ye hai ki hm printDecreasing(5) pass krne to
     *    ye 5, 4, 3, 2, 1 print kr dega.
     * => Actually expectation means the question.
     * 
     * 3. Meet Expectation via Faith:
     * => Means printDecreasing(5) ko printDecreasing(4) k terms m express
     *    kre.
     * => To kya hum aisa likh skte hai ki phle printDecreasing(5), 5 print
     *    krega uske baad printDecreasing(4) ko jo krna hoga wo krega.
     *    printDecreasing(5) = 5.printDecreasing(4)
     * 
     * Low Level Thinking:
     * => Ab stack trace banega.
     * => Let's say GEC m n=5 hai:
     *    => LEC: pd(5) => n = 5
     *                     (a) print 5
     *                     (b) pd(5-1 = 4)
     *    => LEC: pd(4) => n = 4
     *                     (a) print 4
     *                     (b) pd(4-1 = 3)
     *    => LEC: pd(3) => n = 3
     *                     (a) print 3
     *                     (b) pd(3-1 = 2)
     *    => LEC: pd(2) => n = 2
     *                     (a) print 2
     *                     (b) pd(2-1 = 1)
     *    => LEC: pd(1) => n = 2
     *                     (a) print 1
     *                     (b) pd(1-1 = 0)
     *    => LEC: pd(0) => return 0 (wapas laut jao - erase)
     * 
     * => 5, 4, 3, 2, 1
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n);
    }

    /**
     * 1. Expectation => pd(5) = n, n-1, n-2, ..., 5, 4, 3, 2, 1
     * 2. Faith       => pd(4) = n-1, n-2, n-3, ..., 4, 3, 2, 1
     * 3. Meet Expectation via Faith => pd(5) = n.pd(n-1)
    */
    public static void printDecreasing(int n) {
        /**
         * Base Case:
        */
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
