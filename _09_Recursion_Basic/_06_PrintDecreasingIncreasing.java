package _09_Recursion_Basic;

import java.util.Scanner;

public class _06_PrintDecreasingIncreasing {
    /**
     * Q. Pdi(4) = 4, 3, 2, 1, 1, 2, 3, 4
     * 
     * 1. Expectation: Pdi(4) = 4, 3, 2, 1, 1, 2,, 3, 4
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
