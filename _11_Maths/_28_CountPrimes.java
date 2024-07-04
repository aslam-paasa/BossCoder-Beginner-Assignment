package _11_Maths;

public class _28_CountPrimes {
    public static void main(String[] args) {
        /**
         * 2. Sqrt Root(n): Still Time limit exceeding
         * => Better Approach to write IsPrime():
         * => Write better than O(n) : isPrime => O(root n)
         * => TC: Outer Loop(n) + Inner Loop(root n) => O(n root n)
         * 
         * Q. Humaari loop i=2 to i<n tk chlta hai.
         *    Kya hum iss loop ko kam kr skte hai?
         * => Let us consider 'n' is not prime. To 2 to n-1 k bich m atleast
         *    one factor hoga, tabhi to usme greater than 2 factor hoga.
         * => Prime bolta hai 2 factor hone chaiye: [n = a * b]
         * 
         * => Agar mai bolu 
         *    (1) a > root(n)
         *    (2) b > root(n)
         * Q. To mai ye bol skta hu ki (ab > n)? 
         * => No! 
         * 
         * => Agar 'a' & 'b' two factors hai and 'n' non-prime hai, aur 'a'
         *    v root(n) se bda hai aur 'b' v root(n) se bda hai, to 'ab' dono
         *    root(n) se bde honge, but aisa possible nhi hai.
         * => That means upar wali statement galat hai.
         * Note: Jb v hum prime number find kr rhe ho to atleast one of the 
         *       factor must be smaller than root(n).
         * => If we can't find any factor less than root(n), then N is prime;
         * => To apne logic ko "i=2 to n" tk chalane k jagha root(n) tk chalenge. 
         *    for(int i = 2 to root(n))
         * */ 

        int n = 27;
        System.out.println(countPrimes(n));

    }

    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        int sqrtN = (int) Math.sqrt(n);
        for(int i = 2; i < sqrtN; i++) {
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
