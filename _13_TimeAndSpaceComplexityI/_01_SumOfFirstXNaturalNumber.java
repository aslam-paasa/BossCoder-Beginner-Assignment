package _13_TimeAndSpaceComplexityI;

public class _01_SumOfFirstXNaturalNumber {

    /**Case-1: 
     * Machine-A:
     *         => Processor: Octa Core
     *         => SSD: 128 GB
     *         => RAM: 32 GB
     * 
     * Machine-B:
     *         => Processor: Quad Core
     *         => SSD: 32 GB
     *         => RAM: 8 GB
     * Conclusion: Runtime of a program depends on System Configuration.
     * 
     * 
     * Case-2: 2 different programs, same machine
     *         (a) 100 operations
     *         (b) 10^6 operations
     * Conclusion: Runtime of a program depends on the Algorithm.
     * 
     * Note: Time Complexity depends only on the algorithm of the program.
     * 
     * Constraints are used to find out what is the limit the numbers can have.
     * => 1 <= N <= 10^9
     * */ 
    public static void main(String[] args) {

        int n = 5;
        System.out.println(naturalNumber(n)); 
    }

    // TC: O(1)
    public static int naturalNumbers(int n) {
        /**
         * N = 1(1 iteration)
         *  (a) Best Case: Each N corresponds to 1 iteration
         *  (b) Worst Case: Each N corresponds to 1 iteration
         * => TC: O(1)
        */

        return (n*(n+1)/2);
    }

    public static int naturalNumber(int n) {
        /**
         * N = 100 -> 100 iteration
         *  (a) Best Case: N = 1(1 iteration)
         *  (b) Worst Case: N = 10^9(10^9 iteration)
         * 
         * Note: Big Oh = Worst Case Time Complexity
         * => TC: O(N)
        */

        int sm = 0;
        for(int i = 1; i <= n; i++) {
            sm = sm + i; // sm = 0+1+2+3+4+5
        }
        return(sm);
    }

}
