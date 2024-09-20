package _10_Recursion_Basic;

import java.util.Scanner;

public class _11_PrintZigZag {
    /**
     * Understanding Multiple Recursion Calls Flow:
     * => Recursive calls 2 hisso m bat jaata hai:
     *    1st call: Stack m upar jaate hue
     *    2nd call: Stack se wapas aate hue
     * 
     * Q. Predict output for n == 2?
     * 
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
     * 
     * => Avi tk jitne question humne kiye unme 1 call thi, to jb ek 
     *    call hoti hai to humaari code 2 region m batt jaata hai, 
     *    call se pehle wala aur call k baad wala. Call k pehle wala
     *    base case k taraf jaate hue chlta hai aur call k baad wala
     *    base case se wapas aate hue.
     * 
     * Purpose of this question:
     * => To understand the flow of the question.
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
        System.out.println("Function " + n + " start ");
        // Line-2: Left Call
        pzz(n-1);
        // Line-3: In-area
        System.out.println("Function " + n + " bich m ");
        // Line-4: Right Call
        pzz(n-1);
        // Line-5: Post-area
        System.out.println("Function " + n + " khatm ");
    }
}

/**
 * Line-By-Line Flow: (Practice this)
 * 2: 2-start (start)      2-bich m ------+                          2-khtm (finish)
 *    |(1)                       ^        |(9)                       ^
 *    V       (3)            (5) | (8)    V       (11)          (13) | (15)
 * 1: 1-start ---> 1-bich m ---> 1-khtml  1-start ---> 1-bich m ---> 1-khtml
 *    |(2)         |(4)          |(7)     |(10)        |(12)         |(14)
 *    V            V             V        V            V             V
 * 0: X            X             X        X            X             X
 * 
 * Output: 
 * 1. 2-start
 * 2. 1-start
 * 3. 1-bich m
 * 4. 1-khtm
 * 5. 2-bich m
 * 6. 1-start
 * 7. 1-bich m
 * 8. 1-khtm
 * 9. 2-khtm
 * */ 
