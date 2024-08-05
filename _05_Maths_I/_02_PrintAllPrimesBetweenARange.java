package _05_Maths_I;

import java.util.Scanner;

public class _02_PrintAllPrimesBetweenARange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int n = low; n <= high; n++) {
            // Step-1: isPrime = true
            boolean isPrime = true;

            // Step-2: Logic
            int div = 2;
            while(div*div <= n) {
                int rem = n % div;

                // Step-3: isPrime = false
                if(rem == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }

            // Step-4: isPrime = true => print
            if(isPrime == true) {
                System.out.println(n);
            }
        }
    }
}
