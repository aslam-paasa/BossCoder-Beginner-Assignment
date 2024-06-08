package _02_ConditionalStatements;

import java.util.Scanner;

/**
 * Q. WAP to print congratulations message if score of a student is greater than 80. 
 *    Also, wish luck to students whose score is less than or equal to 80,
 *    (If-Else Statement only)
 */
public class _12_CongratulatoryMessage {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scn.nextInt();

        if(score > 80) {
            System.out.println("Congratulations!!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}
