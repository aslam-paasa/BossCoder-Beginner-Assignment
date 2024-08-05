package _18_Strings;

import java.util.Scanner;

public class _02_TakingStringInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        /**
         * 1. next() agle space tak read karta hai
         * 2. nextLine() agle enter tak read karta hai
         * */ 
        String str01 = scn.next();
        String str02 = scn.nextLine();

        /**
         * Input: hello worldhello
         * Output: hello worldhello
         * 1. hello: read by str01
         * 2. worldhello: read by str02
        */
        System.out.println(str01 + " " + str02);
        
        
        /**
         * Input: hello world
         * Output: hello world
        */
        String str03 = scn.nextLine();
        System.out.println(str03); // Hello World


        /**
         * Input: Hello World
         * Output: Hello
        */
        String str04 = scn.next();
        System.out.println(str04);
        
    }
}
