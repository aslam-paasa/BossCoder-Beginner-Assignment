package Recursion;

public class _03_Factorial {
    public static void main(String[] args) {
        int n = 5;

        int ans = factorial(n);
        System.out.println("Factorial of 5 is : " + ans);
    }

    private static int factorial(int n) {
        /**
         * Base Case:
        */
        if(n == 1) {
            return 1;
        }

        /**
         * Recursive Relation:
        */
        int ans = n * factorial(n - 1);
        return ans;
    }
}
