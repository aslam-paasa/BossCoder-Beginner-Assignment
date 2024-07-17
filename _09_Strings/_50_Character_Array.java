package _09_Strings;

import java.util.Scanner;

public class _50_Character_Array {
    public static void main(String[] args) {
        /**
         * int arr[10];
         * => Iss statement se memory k andr 10 block le liye jaenge.
         * => Aur unn 10 blocks m integer type ka data aa skta hai.
         * 
         * char ch[10];
         * => Iss statement se memory k andr 10 block le liye jaenge.
         * => Lekin unn 10 blocks m ek single character type ka data aaega.
         * 
         * Note: int x = 'a';
         * Q. 'a' character ka mtlb kya hoga hai?
         * => 'a' character ASCII se mapped hota hai jo ek number hota hai.
         * => To basically hm number kr skte hai jo convert ho k character bnta hai.
         * => 1 byte => -128 to 127
         * 
         * 
         * Q. Kya character-array ek data type hai?
         * => Array ek data structure hai jo multiple elements ko store krne k
         *    kaam aata hai.
         * => Integer, Character etc data type hai.
         * => Array ek data structure h jisme Character data type store krnge.
         */

        Scanner scn = new Scanner(System.in);
        
        char[] name = new char[100];

        System.out.println("Enter your name:");
        String inputName = scn.nextLine();

        // Copy the input string to the char array
        for (int i = 0; i < inputName.length(); i++) {
            name[i] = inputName.charAt(i);
        }

        System.out.println();

        // Print the character array
        System.out.println("Character array: ");
        for (int i = 0; i < inputName.length(); i++) {
            System.out.println("index:" + i + " value: " + name[i]);
        }
    }
}
