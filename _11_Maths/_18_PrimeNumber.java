package _11_Maths;

import java.util.Scanner;

public class _18_PrimeNumber {
    public static void main(String[] args) {
        
        /**
         * 6. Sieve of Eratosthenes:
         * => Ye theorem kaam aati hai jb hm prime no. count krna chahte hai
         *    between 0 to n.
         * => Given, N = X, humein btana hai, total count of primes < N.
         * (a) Suppose N = 21, to hum ek array bna lenge 1 to 21 tk ka.
         * (b) Shuru m saare index ko "true/prime" mark kr denge.
         * (c) Mujhe pta h 1 prime nhi hai aur 21 humein nhi chaiye to usse
         *     hata denge.
         * (d) Humein pta hai ki 2 is the smallest prime number. Aur agar 2 ek
         *     prime number hai to fir 2 k table m jitne v number aaenge wo 
         *     not-prime honge to unn sbko "false'not-prime" mark kr denge.
         * (e) Fir 3 ko dekhnge, agar 3 prime hai to uske saare multiples 
         *     ko not-prime mark kr denge.
         * (f) Fir 4 to already prime hai
         * (g) Fir 5, 7, 11, 13, 17, 19 ki multiples ko "false/not-prime" mark krnge.
         * (h) Ab jo jo "true" bache hai wo sb ka count return kr denge.
         * 
         * Approach:
         * 1. Create a list of numbers from 2 to n.
         * 2. Start with the first number in the list (2).
         * 3. Mark all multiples of 2 as non-prime (since they are divisible by 2).
         * 4. Move to the next number in the list that is not marked as non-prime (3).
         * 5. Mark all multiples of 3 as non-prime (since they are divisible by 3).
         * 6. Repeat this process up to root(n) times.
         * => For example, if n=30, we need to mark non-prime upto sqrt(30), which is
         *    approx 5.5. So, we would mark non-prime numbers upto 5. This is because
         *    composite numbers(non-prime) greater than sqrt(n) must have a factor 
         *    less than or equal to sqrt(n). By marking non-prime upto sqrt(n), we
         *    effectively eliminate all composite numbers greater than sqrt(n) as well.
         * 
         * 
         * Q. Why boolean[] isPrime = new boolean[n + 1]; ?
         * => The reason for the size n + 1 is that we want to include the number n 
         *    itself in the array. Since array indices start at 0, an array of 
         *    size n would only go up to n - 1, and we would miss the number n itself.
         * => By making the array size n + 1, we can include the number n as the last 
         *    element of the array, with index n. This way, we can easily check whether
         *    n is prime or not, just like any other number in the range.
         * 
         * TC: O(n log log n)
         * */

        
        
    }
}
