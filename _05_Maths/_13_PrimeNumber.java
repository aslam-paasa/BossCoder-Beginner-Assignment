package _05_Maths;

public class _13_PrimeNumber {
    public static void main(String[] args) {
        /**
         * 1. Naive Approach:
         * => Check divisibility with all numbers from 1 to n-1
         * => Prime numbers have exactly two factors, 1 and itself.
         * => for-loop(int i = 2 to n-1)
         * => TC: O(n)
         * */ 
        
            System.out.println(isPrime(13));
        }
    
        
        public static boolean isPrime(int n) {   
            for(int i = 2; i < n-1; i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
    }
    