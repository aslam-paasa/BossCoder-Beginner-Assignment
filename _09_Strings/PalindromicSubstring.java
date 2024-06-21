package _09_Strings;

import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        /**
         * Palindrome: If we read it from front or back, sounds similar like Nitin, Gag etc.
         * String: abcc
         * => Print all the substrings :
         * =>         a    b    c    c
         * => idx:    01   12   23   34
         * =>         ab   bc   cc
         * => idx:    02   13   24
         * =>         abc  bcc
         * = idx:     03   24
         * =>         abcc
         * => idx:    04
         * 
         * Note: 
         * => Generate all substring one-by-one.
         * => Check if a substring is palindrome or not
         * => print it.
        */

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
    }
}
