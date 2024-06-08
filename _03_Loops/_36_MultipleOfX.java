package _03_Loops;

import java.util.Scanner;

// Q. How to print all the multiples of 'x' instead of all the multiples of 5.

public class _36_MultipleOfX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number (num): ");
        int num = scn.nextInt();

        System.out.println("Multiple of which number you want to print: ");
        int x = scn.nextInt();

        System.out.println("Number divisible by " + x + " upto " + num + " : ");
        for (int i = x; i <= num; i += x) {
            System.out.print(i + " ");
        }
    }
}
