package _11_Maths;

public class _01_GCD {
    public static void main(String[] args) {
        
        /**
         * Q. Given an array of integers. Find the GCD of min and max elements?
         * => GCD/HCF -> Greatest Common Divisor
         * 
         * Q. How to find GCD of a number?
         * (1) GCD(24, 30)
         *  => 24 = 1, 2, 3, 4, 6, 8, 12, 24
         *  => 30 = 1, 2, 3, 5, 6, 10, 15, 30
         *  => Common Divisor: 1, 2, 3, 6
         *  => Greater Common Divisor: 6
         * 
         * Note: We have to prove formula in interview.
         * 
         * (2) GCD(5, 20)
         *  => 5  = 1, 5
         *  => 20 = 1, 2, 4, 5, 10, 20
         *  => Common Divisor: 1, 5
         *  => Greatest Common Divisor: 5
         * 
         * (3) GCD(10, 10)
         *  => 10 = 1, 2, 5, 10
         *  => 10 = 1, 2, 5, 10
         *  => Greatest Common Divisor = 10
         *  => So, based on this example, can we say: 
         *     Formula-1: GCD(a, a) = a 
         * 
         * (4) GCD(10, 0)
         *  => 10 = 1, 2, 5, 10
         *  => 0  = 1 
         *  Note: x/0 => means 0 cannot divide anything, but everybody can divide 0 (0/1=>0, 0/2=>0, ...)
         *  => GCD = 1, 2, 3, 4, 5, 6, ...... infinity (means 0 is divided by everybody, but 0 cannot divide anybody)
         *  => GCD = 10
         *  => So, based on the example, we can say:
         *     Formula-2: GCD(a, 0) = a
         * // 25:25
         * */ 
    }
}
