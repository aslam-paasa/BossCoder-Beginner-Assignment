package _11_Maths;

import java.util.Scanner;

public class _02_CreateNumberUsingDigits {
    public static void main(String[] args) {
        
        /**
         * Create number using digits:
         * => 1 = 1
         * => 1, 2 = 12
         * => 1, 2, 3 = 123
         * => 1, 2, 3, 4 = 1234
         * 
         * Formula:
         * => num = num*10 + digit;
         * 
         * 1. Num = 1 => 1
         * 2. Num*10 = 10 + 2 => 12
         * 3. Num*10 = 120 + 3 => 123
         * 4. Num*10 = 1230 + 4 => 1234
         * 
         * => int num = 0;
         * => Ab agar user ne '1' enter kiya means humein 1 ko use kr k number bnana hai
         * => num = 1 => 0*10 + 1 = 1
         * => num = 5 => 1*10 + 5 = 15
         * => num = 7 => 15*10 + 7 = 157
         * 
        */

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of digits: ");
        int numberOfDigits = scn.nextInt();

        int num = createNumberUsingDigits(numberOfDigits, scn);
        System.out.println("The created number is: " + num + "\n");
    }

    public static int createNumberUsingDigits(int numberOfDigits, Scanner scn) {
        int num = 0;

        for(int i = 0; i < numberOfDigits; i++) {
            System.out.print("Enter Digit: ");
            int digit = scn.nextInt();
            num = num * 10 + digit;
            System.out.println("Numbers created so far: " + num + "\n");
        }
        return num;
    }
}
