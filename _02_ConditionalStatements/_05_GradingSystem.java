package _02_ConditionalStatements;

import java.util.Scanner;

public class _05_GradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int grade = scn.nextInt();

        switch (grade) {
            case 10:
                System.out.println("Outstanding");
                break;
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
                System.out.println("Good");
                break;
            case 7:
                System.out.println("Average");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }
}
