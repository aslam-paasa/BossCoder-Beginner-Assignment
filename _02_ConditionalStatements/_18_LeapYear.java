package _02_ConditionalStatements;

import java.util.Scanner;

/** Leap Year:
 *  1. Divisible by 400
 *     Or,
 *  2. Divisible by 4 and NOT divisble by 100
 * 
 * 2020 : Leap Year
 * (a) Divisible by 400 (False) 
 * (b) Divisible by 4 and NOT divisble by 100 (True)
 * 
 * 1900: Not Leap Year
 * (a) Divisible by 400 (False) 
 * (b) Divisible by 4 and NOT divisble by 100 (False) 
*/

public class _18_LeapYear {
    public static boolean isLeapYear(int year) {
        if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        System.out.println(isLeapYear(year));
    }
}
