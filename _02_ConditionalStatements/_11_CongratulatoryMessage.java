package _02_ConditionalStatements;

/**
 * Q. WAP to print congratulations message if score of a student is greater than 80. (If-Statement only)
 */
import java.util.Scanner;

public class _11_CongratulatoryMessage {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scn.nextInt();

        /**
         * if(boolen condition) {
         *       body to be execute
         * }
         * */ 

        if(score > 80) {
            System.out.println("Congratulations!!");
        } 
    }
}
