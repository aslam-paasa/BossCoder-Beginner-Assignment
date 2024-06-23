package _02_ConditionalStatements;

import java.util.Scanner;

public class _23_Check3kNumber {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        // Code here (else-if ladder)
        if(marks % 3 == 0) {
            System.out.println("3K");
        } else if(marks % 3 == 1) {
                System.out.println("3K+1");
        } else {
                System.out.println("3K+2");
        }
    }
}
