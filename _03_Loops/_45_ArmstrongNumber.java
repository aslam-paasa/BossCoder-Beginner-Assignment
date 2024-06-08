package _03_Loops;

import java.util.Scanner;

public class _45_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scn.nextInt();

        // An Armstrong number is one whose sum of digits raised to
        // the power three equals the number itself.
        // => 371 = 3^3 + 7^3 + 1^3 = 371

        int temp = num, ans = 0;

        while(temp != 0) {
            int lastDigit = temp % 10;
            ans += lastDigit * lastDigit * lastDigit;
            temp /= 10;
        }
        
        if(ans == num) {
            System.out.println(num + " is Armstrong Number");
        } else {
            System.out.println(num + " is not Armstrong Number");
        }
    }
    
}
