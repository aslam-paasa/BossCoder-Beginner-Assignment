package Recursion;

import java.util.Scanner;

public class _01_Recursion_Introduction {
    public static void main(String[] args) {
        /**
         * Recursion:
         * => When a function calls itself directly or indirectly is called 
         *    Recursion.
         * => Jb ek bigger problem ka solution depend krta ho choti and same
         *    type ki problem par, wo recursion hai.
         * 
         * Bigger Problem:  2^5
         * Smaller Problem: 2 * 2^4
         * Smaller Problem: 2 * 2^3
         * Smaller Problem: 2 * 2^2
         * Smaller Problem: 2 * 2^1
         * Smaller Problem: 2 * 2^0
         * => Bigger Problem = 2 * Smaller Problem
         * => Badi problem depend hai choti problem pe.
         * 
         * Example: Factorial
         * => Bigger Problem  = 5!
         * => Smaller Problem = 5 * 4!
         * => Bigger Problem = 5 * Smaller Problem
         * 
         * Example: Reverse Counting from n to 1
         * => Bigger Problem  = print 5 to 1
         * => Smaller Problem = print(5) + f(4)
         * => Smaller Problem = print(4) + f(3)
         * => Smaller Problem = print(3) + f(2)
         * => Smaller Problem = print(2) + f(1)
         * => Smaller Problem = print(1) + f(0)
         * => Bigger Problem = print(bigger problem) + f(Smaller Problem)
         * 
         * Example: pow n
         * => Bigger Problem = 2^n
         * => Bigger Problem = 2 * 2^n-1
         * => Bigger Problem = 2 * Smaller Problem
         * 
         * 3 components of recursion:
         * (a) Base Condition:
         *     => Ye btana hai humaare code ko ki rukna kb hai.
         * (b) Recursive relation: 
         *     => f(n) = n * f(n-1)
         *     => Bigger Problem = print(bigger problem) + f(Smaller Problem)
         * (c) Processing: Optional
         *     => Kvi Kvi humein recursion m calculation v krna pad jaata hai
         * */ 

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scn.nextInt();

        int ans = factorial(n);
        System.out.println("Answer is: " + ans);
    }

    public static int factorial(int n) {
        /**
         * n! = n * (n-1)!
         * */ 

        System.out.println("Function is called for n: " + n);

        /**
         * 1. Base Case: Logic of Rukna kb hai
        */
        if(n == 1) {
            return 1;
        }
        
        /**
         * 2. Recursive Relation: Badi problem depend krti hai choti problem par
        */
        int chotiProblemAns = factorial(n-1);
        int badiProblemAns = n * chotiProblemAns;
        return badiProblemAns;
    }
}
