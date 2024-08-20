package _22_Strings;

import java.util.Scanner;

public class _51_Character_Array {
    public static void main(String[] args) {
        /**
         * 1. Create array of characters.
         * 2. Full Name => Mohammad Aslam
         * 3. Print the character of array with space?
         * => Answer m sirf Mohammad aa rha hai, Aslam nhi aa rha.
         * => Because scn.nextLine() humaare value tbtk read krta hai jbtk " " 
         *    ya new line naa aa jae.
         * 
         *   
         * */ 

        Scanner scn = new Scanner(System.in);
        char[] name = new char[100];

        System.out.println("Enter your name:");
        String inputName = scn.nextLine();

        /**
         * Copy the input string to the char array:
        */
        for (int i = 0; i < inputName.length(); i++) {
            name[i] = inputName.charAt(i);
        }

        System.out.println();


        /**
         * Print the character array:
        */
        System.out.println("Character array: ");
        for (int i = 0; i < inputName.length(); i++) {
            System.out.println(name[i]);
        }
    }
}
