package _07_Array;

import java.util.Scanner;

public class _16_DifferenceOfTwoArrays {

    /**
     * Difference of two arrays :
     * => n2 = [9 5 2 3 6]
     * => n1 = [ 9 1 7 8]
     * 
     * Explanation:
     * => Isme btaya gya h ki "n2" array bda hai (badi value h) and 
     *    "n1" value small hai. Humein n2 m se n1 minus krna h aur jo 
     *    answer aaega wo n2 jitna bda hoga.
     *    
     * 1. 6-8 = -2 
     * => Positive hota to thk tha lekin negative h to usme 10 add kr do, 
     *    aur 10 add krne k liye apne bagal wale pe -1 carry chadha do.
     *    Kyuki aage wale se jb 1 kam hota h tb humein 10 value milta hai
     *                   -1
     *    n2 =  [9  5  2  3  6]
     *    n1 = - [  9  1  7  8]
     *    diff =[            8] (16-8 = 8)
     * 
     * 
     * 2. First we have to settle carry => 3 - 1 = 2
     *    Subtract 2 - 7 => -5
     *    Bagal wale pe carry chadha denge to humein 10 milega fir hum
     *    wapas se subtract krnge:
     *    
     *                -1 -1
     *    n2 =  [9  5  2  3  6]
     *    n1 = - [  9  1  7  8]
     *    diff =[         5  8] (12 - 7 = 5)
     * 
     * 
     * 3. First we have to settle carry => 2 - 1 = 1
     *    Subtract 1 - 1 => 0
     *    Bagal wale pe carry 0 chadha denge kyuki after subtraction
     *    value is positive
     * 
     *              0 -1 -1
     *    n2 =  [9  5  2  3  6]
     *    n1 = - [  9  1  7  8]
     *    diff =[      0  5  8]
     * 
     * 
     * 4. First we have to settle carry => 5 - 0 = 5
     *    Subtract 5 - 9 => -4
     *    Bagal wale pe carry -1 chadha denge kyuki after subtraction
     *    value is negative.
     * 
     *             -1  0 -1 -1
     *    n2   =   [9  5  2  3  6]
     *    n1   = - [   9  1  7  8]
     *    diff =   [   6  0  5  8] (15 - 9 = 6)
     * 
     * 5. First we have to settle the carry => 9 - 1 = 8
     *    Digits khtm ho gyi to end ho jaega:
     * 
     *             -1  0 -1 -1
     *    n2   =   [9  5  2  3  6]
     *    n1   = - [   9  1  7  8]
     *    diff =   [8  6  0  5  8]
     * 
     * Note: Issue:
     *    9 9 9 9 9
     *    9 9 8 5 4 
     *   +---------+
     *    0 0 1 4 5
     * => Staring k 2 zero print nhi krna hai
     * => So, ek aur logic likhna hoga starting k zero skip krwane k
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /**
         * Array-1:
        */
        int n1 = scn.nextInt();
        int[] one = new int[n1];
        
        for(int i = 0; i < n1; i++) {
            one[i] = scn.nextInt();
        }

        /**
         * Array-2:
        */
        int n2 = scn.nextInt();
        int[] two = new int[n2];
        for(int i = 0; i < n2; i++) {
            two[i] = scn.nextInt();
        }

        /**
         * Apni answer bdi array ko represent krta h, isliye length n2
         * array jitna bda hoga
        */
        int[] diff = new int[n2];

        /**
         * 1. Index for Array-1
         * 2. Index for Array-2
         * 3. Index for Array-3
         * 4. Carry
        */
        int i = n1 - 1;
        int j = n2 - 1;
        int k = n2 - 1; 
        int c = 0;

        /**
         * 1. Calculate difference until the result array is filled:
        */
        while(k >= 0) {

            /**
             * 2. Start with the current digit of the second array and 
             *    add carry
            */
            int d = two[j] + c;

            /**
             * 3. Subtract the digit from the first array if available.
             *    But ye tabhi tak krna hai jbtk "n1" greater than 0 ho.
            */
            if(i >= 0) {
                d = d - one[i];
            }

            /**
             * 4. Handle negative result by adding 10 and setting carry
             *    to -1
            */
            if(d < 0) {
                d += 10;
                c = -1;
            } 
            /**
             * 5. Set carry to 0 if the result is positive
            */
            else {
                c = 0;
            }

            /**
             * 6. Store the result digit
            */
            diff[k] = d;

            /**
             * 7. Move to the next digits in both arrays and the result 
             *    array
            */
            i--;
            j--;
            k--;
        }

        /**
         * 8. Logic to skip intial zeroes:
         * => But agar saare zero honge to code fatt skta h isliye
         *    if index != 0 then break
         * */ 

        int idx = 0;
        for(idx = 0; idx < diff.length; idx++) {
            if(diff[idx] != 0) {
                break;
            }
        }

        /**
         * 9. Print the difference array starting from the non-zero index 
        */
        for(int p = idx; p < diff.length; p++) {
            System.out.print(diff[p] + " ");
        }
    }
}

/**
 * Input:
 * 1. 4
 * 2. 9 1 7 8  => 9954 (smaller)
 * 3. 5
 * 4. 9 5 2 3 6 => 99999 (bigger)
*/

