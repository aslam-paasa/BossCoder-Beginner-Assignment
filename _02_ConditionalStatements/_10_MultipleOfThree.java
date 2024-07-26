package _02_ConditionalStatements;

import java.util.Scanner;

public class _10_MultipleOfThree {
    public static boolean isMultipleOfThree(int n) {
        if(n%3 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(isMultipleOfThree(n));
    }
}
