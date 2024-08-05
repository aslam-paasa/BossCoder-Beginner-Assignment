package _11_TimeAndSpaceComplexityI;

public class _05_logarithm {
    public static void main(String[] args) {
        /**
         * Q. How will you find?
         * (a) 2 * x = 20 
         *  => x = 20/2
         * 
         * (b) 2^x = 16 and 2^x = 1024
         *  => 2*2*...(no. of times = 4) = 16
         *  => 2*2*...(no. of times = 10) = 1024
         *  => This is what log is.
         * 
         *  => For example, log2 16 means how many no. of 2's we need to multiply to make 16. => 4
         *  => For example, log3 81 => how many no. of 3's we need to multiply to make 81. => 4
         *  => For example, log7 343 => how many no. of 7's we need to multiply to make 343. => 3
         *  => For example, log2 512 => how many no. of 2's we need to multiply to make 512 => 9
         * 
         * (1) loga a^b = b
         *  => Here we can asking how many no. of a's we need to multiply to get 'a^b' => 'b' times.
         *  => How many times we need to multiply 2 so that we will get 2^4? => 4 times.
         * 
         * Note: Exactly there is no way to reduce it, but there are 4 formual's of logarithm that
         *       we can use to reduce it to smaller things.
         * Note: Read the formula
         */ 

        int n = 256;

        /**
         * 1. T(n) = n
        */
        for(int i = 0; i < n; i++) {
            // do some work k
        }

        /**
         * 2. T(n) = n
        */
        for(int i = n; i >= 1; i--) {
            // do some work k
        }

        /**
         * 3. T(n) = log n
         * => Decrementing by half in each iteration.
        */
        for(int i = n; i >= 1; i = i/2) {
            // do some work
        }
        
        /**
         * 4. T(n) = log n
         * => Decrementing by half in each iteration.
        */
        for(int i = 1; i <= n; i = i*2) {
            // do some work
        }
    }
}
