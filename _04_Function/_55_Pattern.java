package _04_Function;

import java.util.Scanner;

public class _55_Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int n = scn.nextInt();

        System.out.println();
        
        System.out.println("Here is your pattern: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }
}
