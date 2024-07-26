package _02_ConditionalStatements;

import java.util.Scanner;

public class _09_CheckPositiveNumber {
    public static boolean isPositive(int n) {
        if(n > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(isPositive(n));
        
    }
}
