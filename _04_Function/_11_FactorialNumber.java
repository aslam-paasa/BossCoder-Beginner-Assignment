package _04_Function;

public class _11_FactorialNumber {
    public static void main(String[] args) {
        /**
         * Factorial Number:
         * => n! = 5
         * => 5 * 4 * 3 * 2 * 1
        */

        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        int f = 1;

        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; // factorial of n
    }
}
