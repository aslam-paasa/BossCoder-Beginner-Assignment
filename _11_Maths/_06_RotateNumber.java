package _11_Maths;

import java.util.Scanner;

public class _06_RotateNumber {
    public static void main(String[] args) {
        
        // 1) Start with the basics
        // 2) Then handle special cases

        // Example: Rotate 23457 by +1
        // Rotated: 72345
        // Rotated again by +2: 57234
        // For the first rotation, the last digit 7 moves to the front.
        // For the second rotation, the last two digits 57 move to the front.
        // To rotate by 2 positions, we can divide by 100 and rearrange.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to rotate:");
        int n = scn.nextInt(); // Example input: 975432
        System.out.println("Enter the number of rotations:");
        int k = scn.nextInt(); // Example rotations: +2

        // Determine the number of digits in the number
        int nod = 0; // Number of digits
        int temp = n;
        while(temp != 0) {
            temp = temp / 10;
            nod++;
        }

        // Handle the case where k is greater than the number of digits
        k = k % nod;
        if (k < 0) {
            k = k + nod; // Handle negative rotations
        }

        // Determine the divisor and multiplier for the rotation
        int div = 1;
        int mult = 1;
        for(int i = 1; i <= nod; i++) {
            if(i <= k) {
                div = div * 10; // Divisor to split the number
            } else {
                mult = mult * 10; // Multiplier to recombine the number
            }
        }

        // Split the number using the divisor
        int q = n / div; // Quotient part
        int r = n % div; // Remainder part

        // Combine the remainder and quotient parts to form the rotated number
        int ans = r * mult + q; 
        System.out.println("Rotated number: " + ans);
    }
}
