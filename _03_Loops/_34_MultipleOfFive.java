package _03_Loops;

import java.util.Scanner;

// This is a array problem. We have modified it to solve without using array.

public class _34_MultipleOfFive {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number (N): ");
        int N = scn.nextInt();

        System.out.println("Number divisible by 5 upto " + N + " : ");

        for(int i = 1; i <= N; i++) {
            if(i%5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
