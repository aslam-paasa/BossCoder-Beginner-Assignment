package _05_Maths_II;

import java.util.Scanner;

public class _07_ReverseNumber {
    public static void main(String[] args) {
        
        /**
         * 1. Piche se aage ki aur print krna h
         * => 12345 -> 54321
         * 
         *    10] 2457
         *    10] 245|7   Quotient=245, Remainder= 7
         *    10] 24|5    Quotient=24,  Remainder= 5
         *    10] 2|4     Quotient=2, Remainder=4
         *    10] 0|2     Quotient=0, Remainder=2 
         * 
         * 2. Humne kl discover kiya tha ki 10 se divide krne pe quotient pe 245 milta h 
         *    aur remainder m 7 milta hai then print.
         * 3. Fir Quotient=24,  Remainder= 5, print
         *    Quotient=2, Remainder=4, print
         *    Quotient=0, Remainder=2, print
         * 4. Jb ye number reduce ho k 0 ho jae tbtk print krte jaana hai
        */

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n != 0) {
            int q = n / 10;
            int r = n % 10;

            System.out.print(r);
            n = q;
        }
    }
}
