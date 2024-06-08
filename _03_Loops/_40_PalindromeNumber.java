package _03_Loops;

import java.util.Scanner;

public class _40_PalindromeNumber {
    public static void main(String[] args) {
      // Last Dgit + Reverse + Compare
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      int reverse = 0, temp = n;
      while(temp != 0) {
        int lastDigit = temp%10;
        reverse = reverse * 10 + lastDigit;
        temp /= 10;
      }

      if(reverse == n) {
        System.out.println("Palindrome");
      } else {
        System.out.println("Not Palindrome");
      }
    }
}

// Note: If number is less than zero, return false.

 