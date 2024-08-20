package _20_ArrayOneDimension;

import java.util.Scanner;

public class _03_TakingInputArray {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner scn = new Scanner(System.in);
        // int phy = scn.nextInt();

        marks[0] = scn.nextInt(); // Phy
        marks[1] = scn.nextInt(); // Chem
        marks[2] = scn.nextInt(); // Math

        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Math : " + marks[2]);

        /**
         * Update maths marks:
         * => We can use these things in array like:
         *    (a) Addition
         *    (b) Percentage
         *    etc...
         * */ 
        marks[2] = marks[2] + 1;
        System.out.println("Updated Math Marks : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");
    }
}
