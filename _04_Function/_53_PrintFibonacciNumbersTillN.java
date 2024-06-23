package _04_Function;

import java.util.Scanner;

public class _53_PrintFibonacciNumbersTillN {
    public static void main(String[] args) {
        
        // 0 -> 1st fibonacci
        // 1 -> 2nd fibonacci
        // Pichle do the sum i.e. 0+1 = 1 -> 3rd fibonacci
        // Pichle do the sum i.e. 1+1 = 2 -> 4th fibonacci
        // Pichle do the sum i.e. 1+2 = 3 -> 5th fibonacci
        // Pichle do the sum i.e. 2+3 = 5 -> 6th fibonacci
        // etc...
        
        // int a = 0; // 1st fibonacci
        // int b = 1; // 2nd fibonacci

        // ab jitne fibonacci krne h utni baar loop chlaenge i.e. 'n' times
        // for(int i = 0; i <= n; i++) {
            // int c = a + b; // 3rd fibonacci
            // ab humein 11 fibonacci print krne h
            // System.out.println(a); // 1st fibonacci print ho gya
            // ab main chahta hu 'a' 'b' m aa jae aur 'b' 'c' m aa jae
            // a = b;
            // b = c;
            // loop upar gya to 'c' fir niche sarak gya 
            // fir 'a' print hua aur 'a' uth k 'b' k paas aur 'b' uth k 'c' k paas
            // aur ye loop chlta rhega jbtk 11 fibonacci na mil jae
        // }

        Scanner scn = new Scanner(System.in);
        // kitne fibonacci print krne h
        int n = scn.nextInt();

        int a = 0; // 1st fibonacci
        int b = 1; // 2nd fibonacci

        for(int i = 1; i < n; i++){
            
            int c = a + b;  //3rd fibonacci

            System.out.println(a); // print 1st fibonacci

            // Swap value of b to a, c to b and 
            // print value of a again in next loop
            a = b;
            b = c;  
        }
    }
}
