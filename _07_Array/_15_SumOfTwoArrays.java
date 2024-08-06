package _07_Array;

import java.util.Scanner;

public class _15_SumOfTwoArrays {
    /**
     * Humein isme 2 arrays diye gye hai : 
     * => Array-1 : [5] -> [3,0,1,7,5]
     * => Array-2 : [4] ->  [9,9,9,9,]
     * Ek new array banana h aur inn dono array ka sum kr k btana hai.
     *
     *    1  1  1  1     <- Carry Forward
     *   [3, 1, 7, 5, 2]
     * +    [9, 9, 9, 9]
     *   [4, 1, 7, 5, 1]
    */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /**
         * Array-1:
        */
        int n1 = scn.nextInt();
        int[] one = new int[n1];
    
        for (int i = 0; i < one.length; i++) {
            one[i] = scn.nextInt();
        }

        /**
         * Array-2:
        */
        int n2 = scn.nextInt();
        int[] two = new int[n2];

        for (int i = 0; i < two.length; i++) {
            two[i] = scn.nextInt();
        }

        /**
         * Sum Array = Array-1 + Array-2
         * 1. Size of Sum Arrays can be larger than both arrays.
         *    For example, 
         *        9 9 9
         *     +      1
         *      1 0 0 0
         *    But still hum bade wale array jitna size ka array bnaenge.
         * 2. Determine the size of the sum array based on the larger of
         *    the two input arrays
         *    => n1 > n2 ? n1 : n2
         *    => if n2 is greater than n1 then n2, otherwise n1
         * */
        int[] sum = new int[n1 > n2 ? n1 : n2];

        /**
         * Index for the Array-1:
         * Index for the Array-2:
         * Index for the Sum Array:
        */
        int i = one.length - 1;
        int j = two.length - 1;
        int k = sum.length - 1;

        /**
         * Carry forward (initially 0):
        */
        int c = 0;

        
        /**
         * Perform addition from the rightmost digit to the leftmost digit:
         * (Jbtk k > 0 hai tbtk kaam chlega)
        */
        while (k > 0) {
            /**
             * Initialize the digit with the carry:
            */
            int d = c; 

            /**
             * Add the corresponding digits from the two arrays, and carry 
             * if applicable*/ 
            if (i >= 0) {
                d += one[i];
            }
            if (j >= 0) {
                d += two[j];
            }

            /**
             * 1. Update the carry and the current digit:
             *    (a) Calculate the carry
             *    (b) Calculate the current digit
             * 2. Store the current digit in the sum array
            */
            c = d / 10;
            d = d % 10;
            sum[k] = d;

            /**
             * Move to the next digits in the arrays and the sum array:
            */
            i--;
            j--;
            k--;
        }

        /**
         * Agar carry greater than zero h to phle carry print kro, fir 
         * sum of array ko print kro*/ 
        if(c > 0) {
            System.out.println(c); 
        }

        /**
         * Print the sum array:
        */
        for (int l = 0; l < sum.length; l++) {
            System.out.print(sum[l] + " ");
        }
    }
}
