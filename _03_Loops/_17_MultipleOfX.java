package _03_Loops;

import java.util.Scanner;

public class _17_MultipleOfX {
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
