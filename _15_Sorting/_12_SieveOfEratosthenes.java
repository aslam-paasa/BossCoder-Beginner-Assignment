package _15_Sorting;

import java.util.Scanner;

public class _12_SieveOfEratosthenes {
    /**
     * Sieve Of Eratosthenes: O(n log log n) or O(n log*n)
     * => The Sieve of Eratosthenes is one of the most effiecient way
     *    to find all primes smaller than 'n' when 'n' is smaller
     *    than 10 million.
     */ 
    
    /** Old Way: Square Root Optimization
     * => n = 2500 => root n = 50 
     * => O(n * root n) => Pehle ye time complexity lagti thi humein.
     * */ 

    /**
     * New Way: Sieve of Eratosthenes
     * => n = 2500      [2^18 = 2560]
     * => log n = 18    [2^4  = 16  ]
     * => log log n = 4
     * 
     * TC: O(n log log n)
     *     O(2500 * 4)
     * 
     * Note: O(2500 * 50) & O(2500 * 4) => Very huge difference
    */

    /**
     * Sieve of Eratosthenes:
     * => Humein ek number 'n' given hogi. Humein 'n' tk k sabhi elements
     *    prints karne hai jo prime hai. 
     * => Ye question hai "Print Prime till N", aur humein iss question ko 
     *    solve krna hai using Sieve of Eratosthenes Algorithm. 
     * => To abhi hum Sieve of Eratosthenes Algorithm ki working deknge aur
     *    print prime till N tk krnge.
     * 
     * Step-1: 
     * => Agar humein n=30 given hai to humein ek "boolean array" bnana hai
     *    of size-"n+1" i.e. 30+1 = 31. [0 to 30 => 31 elements]
     * 
     * => Sabse pehle iss "n+1" size k array m sb jagha par false pada hai
     *    means ye kisi v digit se divide nhi hota means ye sb prime hai.
     * arr = [F, F, F, F, F, F, F, F, F, F, F , F , F , F,  F,  F,  F,  F,  F,  F,  F,  F , F,  F,  F,  F,  F,  F,  F,  F,  F ]
     *        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30
     * 
     * => Ab humein sabhi non-prime numbers k aage true lagaan hai, but how?
     *    Pehle inn sb m wo no. dekho jo 2 se divisible hai, unke aage true 
     *    lga do, fir jo 3 se divisible hai then 5 se divisible hai and so on...
     * => Aise humein "root n" tk jo v divisor valid(false) hai unse divide 
     *    krnge. 
     * => 3 k baad 5 se isliye qki 4 to pehle hi false ho chuka hai, bass
     *    unhi numbers se divide krna hoga jo true dikhega.
     * 
     * => Pehle sb false the, ab waha true kardi jaha element-2 k multiples
     *    ho(Agar 2 avi v false hai to hi):
     * arr = [F, F, F, F, T, F, T, F, T, F, T , F , T , F,  T,  F,  T,  F,  T,  F,  T,  F , T,  F,  T,  F,  T,  F,  T,  F,  T ]
     *        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30
     * 
     * => Ab waha true kr do jaha v elements 3 se divide ho jae:
     *    (Agar 3 avi v false h to)
     * arr = [F, F, F, F, T, F, T, F, T, T, T , F , T , F,  T,  T,  T,  F,  T,  F,  T,  T , T,  F,  T,  F,  T,  T,  T,  F,  T ]
     *        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30
     * 
     * => Ab waha true kr do jaha v elements 5 se divide ho jae:
     *    (Agar 5 avi v false h to)
     * arr = [F, F, F, F, T, F, T, F, T, T, T , F , T , F,  T,  T,  T,  F,  T,  F,  T,  T , T,  F,  T,  T,  T,  T,  T,  F,  T ]
     *        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30
     *  
     * => Ab waha true kr do jaha v elements 7 se divide ho jae:
     *    (Agar 7 avi v false h to)
     * arr = [F, F, F, F, T, F, T, F, T, T, T , F , T , F,  T,  T,  T,  F,  T,  F,  T,  T , T,  F,  T,  T,  T,  T,  T,  F,  T ]
     *        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30
     * 
     * Note: Ab jo v bach jae wo prime.
     * 
     * Note: We can use these concepts in:
     *   (a) Factorization
     *   (b) Prime Factorization
     */
    
    /** 
     * Multiplication Table:
     * a. 0&1 are non-prime.
     * b. 2 --> 2 ki table chalegi 2X2=4 se 
     * c. 3 --> 3 ki table chalegi 3X3=9 se
     * d. 4 --> X (already 2 ki table m aa chuka h to 4 true hai)
     * e. 5 --> 5 ki table chalegi 5X5=25 se
     * e. 6 --> 6 already 2 ki table m aa chuka hai
     * f. 7 --> 7 to rootn se jyda ho jaega to ab 6 se aage koi division
     *          nhi ho skta.
     * 
     * Note: Humne array ki size 31 isliye rkha hai qki (0 to 30) tk
     *       "30 elements" hote hai.
     * For example, n=30 => 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Index starting from 0, so if we select 30 element, our index
         * should be 31 (one extra because of 0th index):
        */
        boolean[] arr = new boolean[n+1];

        /**
         * O(log log n):
         * => It will iterate from 2 to rootn.
        */
        for(int i = 2; i * i < arr.length; i++) {
            if(arr[i] == false) {
                /**
                 * arr[i] == false h to uss elements ko chor k uske
                 * multiples true set honge.
                 * */ 
                for(int j = i; i*j < arr.length; j++) {
                    arr[i*j] = true;
                }
            }
        }

        /**
         * O(n)
        */
        for(int i = 2; i < arr.length; i++) {
            if(arr[i] == false) {
                System.out.println(i);
            }
        }
    }
}


/**
 * Dry Run:
 * 1. Array banega "n+1" size ki qki "0 to n+1" elements hote hai aur
 *    0ton tk humein prime btana hai.
 * 2. Divisor(i) honge:
 *    (a) 2 se rootn tk
 *    (b) 2 se roo30 tk
 *    (c) 2 se 5 tk 
 *   => Bass do aise divisor honge jo khud prime honge i.e. 2, 3, 5
 * 3. 0&1 se divisor shuru nhi hota hai qki 0 and 1 non-prime hai. 
 *    And prime numbers have 2 factors (1 & itself) : 2 unique factors
 * 
*/

/** Let's do a dry run of the given iterations:
 * 
 * Iteration 1:
 * => i = 2
 * => arr[2] = false
 * => Inner loop:
 *    j = 2, i*j = 4, arr[4] = true
 *    j = 3, i*j = 6, arr[6] = true
 *    j = 4, i*j = 8, arr[8] = true
 *    ...
 * => arr becomes: [F, F, F, F, T, F, T, T, F, T, ...]

 * Iteration 2:
 * => i = 3
 * => arr[3] = false
 * => Inner loop:
 *    j = 3, i*j = 9, arr[9] = true
 *    j = 4, i*j = 12, arr[12] = true
 *    j = 5, i*j = 15, arr[15] = true
 *    ...
 * => arr becomes: [F, F, F, F, T, F, T, T, T, T, ...]

 * Iteration 3:
 * => i = 4
 * => arr[4] = true (already marked in Iteration 1)
 * => Skip inner loop

 * Iteration 4:
 * => i = 5
 * => arr[5] = false
 * => Inner loop:
 *    j = 5, i*j = 25, arr[25] = true
 *    j = 6, i*j = 30, arr[30] = true
 * => arr becomes: [F, F, F, F, T, F, T, T, T, T, ..., T, T]

 * Printing prime numbers:
 * i = 2, arr[2] = false, print 2
 * i = 3, arr[3] = false, print 3
 * i = 5, arr[5] = false, print 5
 * i = 7, arr[7] = false, print 7
 * i = 11, arr[11] = false, print 11
 * i = 13, arr[13] = false, print 13
 * i = 17, arr[17] = false, print 17
 * i = 19, arr[19] = false, print 19
 * i = 23, arr[23] = false, print 23
 * i = 29, arr[29] = false, print 29
*/ 