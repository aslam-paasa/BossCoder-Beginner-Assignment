package _04_Function;

public class _12_BinomialCoefficient {
    public static void main(String[] args) {
        
        /**
         * Binomial Coefficient:
         * => nCr = n! / r!(n-r)!
         * => Convert them in the form of code.
         * 
         * => n = 5, r = 2
         * => 5!/2! * 3!
         * => 120/ (2*6)/12
         * => 10
         * 
         * Logic:
         * => int binCoeff(int n, int r) {
         *       n_fact = factorial(n);     => (a)
         *       r_fact = factorial(r);     => (b)
         *       nmr_fact = factorial(n-r); => (c)
         *    }
         * 
         * => BC = a/(b*c)
         * 
         * Note: Hum ek function se kai saare function call lga skte hai.
         *       Aur is tarah se hm helper function likhte hai.
        */

            System.out.println(binomialCoeff(5, 2));

    }

    public static int factorial(int n) {
        int f = 1;

        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; // factorial of n
    }

    public static int binomialCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nMr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nMr);
        return binCoeff;
    }
}
