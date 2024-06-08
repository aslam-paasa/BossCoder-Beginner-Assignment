package _04_Function;

/**
 * In online platform, we do not need to write the main function, we just need to complete the logic
 * by completing the driver function. In backend, main function is already written and is hidden from
 * the candidate. No input, no output required.*/ 

import java.util.Scanner;

public class _02_AddTwoNumbers {

    public static int add(int x, int y) {
        System.out.println("Your 1st number is " + x);
        System.out.println("Your 2nd number is " + y);
        System.out.println("Add your numbers...");
        return x + y;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        int sum = add(x, y);
        System.out.println(sum);
    }
}
