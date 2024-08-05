package _05_Maths;

import java.util.Scanner;

public class _30_IsANumberPrime {
    public static void main(String[] args) {

        // 'n' number milnge 't' number of times, aur humein 't' number of times prime/not prime btana h
        // Sample Input :
        // 5 -> 5 is the 't' no. of input and below are the inputs
        // 13
        // 2
        // 3
        // 4
        // 5

        // Sample Output :
        // prime
        // prime
        // prime
        // not prime
        // prime

        Scanner scn = new Scanner(System.in);
        // User se 't' number milega
        int t = scn.nextInt();

        for(int i = 1; i <= t; i++) {
            int x = scn.nextInt();

            boolean isPrime = true;
            int div = 2;
            while(div * div <= x) {
                int r = x % div;

                if(r == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }
            if (isPrime) {
                System.out.println(x + " is a prime number");
            } else {
                System.out.println(x + " is not a prime number");
            }
        }
    }
}
