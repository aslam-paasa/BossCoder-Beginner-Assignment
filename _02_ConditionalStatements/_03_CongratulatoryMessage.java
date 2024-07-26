package _02_ConditionalStatements;

import java.util.Scanner;

/**
 *    If BBD(Big Billion Day) - buy from Flipkart
 *    Else-If TGIF(The Great Indian Festival) - buy from Amazon
 *    Else-If official website - buy from Official website
 *    Else if store discount 20% - buy from store
 *    Else - do not buy
 * (If-Else-If Ladder Statement)
 * 
 * Q. WAP to take an integral input and print the statement corresponding to the following conditions
 *    1. Divisible by 5 and 8 - print 58
 *    2. Divisible only by 5 - print 5
 *    3. Divisible only by 8 - print 8
 *    4. Divisible by none of these - print "None" 
 *    (If-Else-If Ladder Statement)
 */
public class _03_CongratulatoryMessage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int num = scn.nextInt();

        if(num%5 == 0 && num%8 == 0) {
            System.out.println("58");
        } else if(num%5 == 0) {
            System.out.println("5");
        } else if(num%8 == 0) {
            System.out.println("8");
        } else {
            System.out.println("none!");
        }
    }
}
