package _02_ConditionalStatements;

import java.util.Scanner;

public class _06_DrivingEligibilityCheck {
    public static boolean check(int age) {
        // if(age >= 18) {
        //     return true;
        // } else {
        //     return false;
        // }

        return (age >= 18);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println(check(age));
        
    }
}
