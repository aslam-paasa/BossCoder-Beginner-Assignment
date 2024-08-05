package _05_Maths_II;

import java.util.Scanner;

public class _17_PrimeNumber {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        /**
         * 4. Square Root Optimization(n): [2 to root n] 
         * => Time complexity: O(sqrt(n))
         * => Humein x/2 tk jaane ki v jarurat nhi h square root tk enough h.
         * 
         * Example: Factorization of 36 : 
         *    1 X 36 = 36            36 X 1 = 36 
         *    2 X 18 = 36            18 X 2 = 36
         *    3 X 12 = 36            12 X 3 = 36
         *    4 X 9  = 36            9 X 4  = 36
         *                6 X 6 = 36 
         * Note : n = p*q then p&q cannot be greater then root n.
         * 
         * Note: Agar hm unique factors ki baat kre to uske square root tk hi 
         *       milte h uske baad saare mirror image hai.
         * 
         * 
         * => 35 k liye kare to humein root 6 i.e. 36 k beyond jaane ki jarurat nhi h
         *    Actually humein root 6 tk jaane ki v jarurat nhi h.
         * => Root of 35 :
         *    (a) 2 X
         *    (b) 3 X
         *    (c) 4 X
         *    (d) 5 -> 5.xxx (25) -> 5 se divide ho gya 35 so not a prime
         *    (e) 6 -> 36 (bigger than 35)
         * 
         * =>  Root fo 49 :
         *     (a) 2 X
         *     (b) 3 X
         *     (c) 4 X
         *     (d) 5 X
         *     (e) 6 X
         *     (f) 7 -> 49 is not a Prime

         * =>  Root of 53 :
         *     (a) 2 X
         *     (b) 3 X
         *     (c) 4 X
         *     (d) 5 X
         *     (e) 6 X
         *     (f) 7 X -> Apne half k root tk kisi se divide nhi hua to "prime"
        */

        /**
         * Q. How to write this logic?
         * => Humein ek divisor banana padega to [2 se root x] tk jaega
         * => Agar divide ho gya to not prime aur nhi hua to prime
         * 
         * Q. Root n kaise likhe? 
         * => (div * div <= x) -> 'x' ko check kr rhe h ki prime h ya nhi.
         * 
         *    (a) int div = 2;
         *    (b) while(div * div <= x) {
         *           (c) int remainder = x % div;
         *               => har baar maine nikaala remainder jisme 'x' ko
         *                  divide krna hai 'div' se 
         *           (d) if(remainder == 0) {
         *                  isprime = false;
         *               }
         *               => remainder '0' aaya to prime nhi h, wrna prime h
         *           (e) div++; // 2,3,4,5,6,7
         *               => Aur har baar dividor ko badhaate rho
         *        }
         *    (f) if(isprime == true) {
         *            print smthng...
         *        } else {
         *            print smthng...
         *        }
         *        => Hum number ko prime maan k chalte hai, agar wo divide ho 
         *           gya to prime nhi rha. Aur agar bich m kisi se v divide ho 
         *           gya aur loop ko bich m hi rokna h to use "break".
         *        => "break" jiss loop k andr hota h uss loop ko maar deta hai 
         *           bich m.
         * 
         * Advantage:
         * => Square Root approach is much faster for large numbers.
         * => For numbers between 10^6 and 10^12, the square root 
         *    approach is usually faster.
         * 
         * Disadvantage:
         * => Requires calculating the square root, which can be slow for very 
         *    large numbers.
         * => Not as simple to implement as trial division
         * 
        */

        boolean isprime = true;
        int div = 2;
        while(div * div <= x) {
            int remainder = x % div;

            if(remainder == 0) {
                isprime = false;
                break;
            }
            div++;
        }
        if(isprime == true) {
            System.out.println(x + " is prime");
        } else {
            System.out.println(x + " is not prime");
        }
    }
}
