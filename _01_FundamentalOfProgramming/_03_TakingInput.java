package _01_FundamentalOfProgramming;

import java.util.Scanner;

public class _03_TakingInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = scn.nextInt(); // a = 60

        System.out.print("Enter 2nd number: ");
        int b = scn.nextInt(); // b = 40

        int c = a + b; // c = 60 + 40 => 100
        System.out.println("The sum of your numbers: " + c);

        // int - nextInt()
        // float - nextFloat()
        // double - nextDouble()
        // boolean - nextBoolean()
        // String - nextLine(), next()

    }
}
