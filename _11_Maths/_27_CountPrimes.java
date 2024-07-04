package _11_Maths;

public class _27_CountPrimes {
    public static void main(String[] args) {
        /**
         * => Input: n = 10
         * => Output: 4
         * => Explanation: There are 4 prime numbers less than 10,
         *                 they are 2, 3, 5, 7.
         * 
         * => Input: n = 0
         * => Output: 0
         * 
         * 1. Naive Approach: Time Limit Exceed 
         * => 2 loops -> Outer loops(countPrimes)+ Inner loop(IsPrime)
         * => TC: O(n^2)
         * 
         * => for(int i = 2; i < n; i++) {
         *       if(isPrime(i)) {
         *          count++;
         *       }
         *    }
         *    return count;
         * 
         * Note: 0 & 1 is not prime.
         * */ 

        int n = 27;
        System.out.println(countPrimes(n));

    }

    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int n) {

        int count = 0;
        for(int i = 2; i < n; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
