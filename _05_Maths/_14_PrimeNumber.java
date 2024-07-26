package _05_Maths;

public class _14_PrimeNumber {

    /**
     * 2. Half Number(n):
     * => Check divisibility with numbers from 2 to n/2
     * => If no divisor found, the number is prime.
     * => Time complexity: O(n/2) -> O(n)
     * 
     * Explanation:
     * => 2 to x-1 - Ek baar v divide naa ho to prime means agar 2 to x-1
     *    k bich m kisi se v divide ho to wahi ruk jao aur aage divide mt kro.
     * => Note: 0 & 1 is not prime.
     * 
     * => Agar hum 50 ko divide kr k dekhe to notice krnge wo apne half number
     *    k baad direct khud se divide hota h.
     *   (a) 1/50
     *   (b) 2/50
     *   (c) 5/50
     *   (d) 10/50
     *   (e) 25/50 => Half Number
     *   (f) 50/50
     *   
     * => Agar hum 6 ko divide kr k dekhe to iss v same chij notice kr paenge:
     *   (a) 1/6
     *   (b) 2/6
     *   (c) 3/6
     *   (d) 6/6
     *   
     * Note: To humein (2 to x-1) tk jaane ki jarurat nhi h, (2 to x/2) hi enough h:
     *   (a) Divide 10 -> [2, 5]
     *   (b) Divide 16 -> [2, 8]
     * 
     * => TC: O(n/2) => O(n)
     * 
     * Note: Good of handling single test case.
     */

    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
