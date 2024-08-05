package _05_Maths_II;

import java.util.Scanner;

public class _31_PrintAllPrimeTillN {
    public static void main(String[] args) {
        
        // Prime Prime between low to high numbers

        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int n = low; n < high; n++) {
            boolean isPrime = true;
            int div = 2;
            while(div * div <= n) {
                int rem = n % div;

                if(rem == 0) {
                    isPrime = false;
                    break;
                }

                div++;
            }

            if(isPrime == true) { 
                System.out.println(n);
            }
        }
    }
}
