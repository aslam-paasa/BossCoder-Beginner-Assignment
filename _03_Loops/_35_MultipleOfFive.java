package _03_Loops;

import java.util.Scanner;

public class _35_MultipleOfFive {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number (N): ");
        int N = scn.nextInt();

        // Improved Logic :
        // => Instead of going one by one and checking, just start 'i' from '5'
        // and on each updation just keep on increasing it by '5'.

        System.out.println("Number divisible by 5 upto " + N + " : ");
        for (int i = 5; i <= N; i += 5) {
            System.out.print(i + " ");
        }
    }
}
