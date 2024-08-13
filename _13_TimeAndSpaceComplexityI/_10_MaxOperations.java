package _13_TimeAndSpaceComplexityI;

public class _10_MaxOperations {
    public static void main(String[] args) {
        
        /**
         * Maximum number of operations allowed = <= 10^8 operations.
         * => If we do more than that, we will get 'time limit exceeded'
         * => For safety, consider the safe value = 10^7 operations.
         * 
         * Note: For every problem, constraint is given. So, when you are
         *       designing the algorithm don't start coding directly.
         *       First think what you will do, then start coding.
         * 
         * Example:
         * 1. Constraint: 1 < n < 100 
         *    (a) 10^5 = (10^2)^5 => 10^10 [Time limit exceeded]
         *    (b) 10^3 = (10^2)^3 => 10^6  [Constraint Passed]
         * 
         * 
         *  Program     TC
         * +----------------------+
         * => P1        O(N)
         * => P2        O(log N)
         * => P3        O(2^N)
         * => P4        O(1)
         * => P5        O(N*log N)
         * => P6        O(N^N)
         * => P7        O(N^2) 
         * 
         * Note: Arrange on the basis of efficiency:
         * O(1) -> O(log N) -> O(N) -> O(N*log N) -> O(N^2) -> O(2^N) -> O(N^N)
         * 
         * 
         * */
        
    }
}
