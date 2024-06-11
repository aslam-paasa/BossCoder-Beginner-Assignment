package _04_Function;

import java.util.Scanner;

public class _49_AverageOfThreeNumbers {
    
    public static int average(int x, int y, int z) {
        System.out.println("Your 1st number is " + x);
        System.out.println("Your 2nd number is " + y);
        System.out.println("Your 3rd number is " + z);
        System.out.println("Average of three numbers are ");
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int x = scn.nextInt();
        System.out.println("Enter 2nd number: ");
        int y = scn.nextInt();
        System.out.println("Enter 3rd number: ");
        int z = scn.nextInt();

        System.out.println(average(10, 20, 30));
    }
}
