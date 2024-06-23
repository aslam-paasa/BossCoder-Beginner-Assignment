package _11_Maths;

import java.util.Scanner;

public class _02_CountDigits {
    public static void main(String[] args) {
        
        // Har baar loop '++' krke nhi chlta, ye sawal btane k liye h
        // Ek number diya h uske saare digits alag alag line m likhni h
        // For example, 87654
        // 8
        // 7
        // 6
        // 5
        // 4
         

        // Iss question m ye btana h kitni digits hai isme '65784383' i.e. '8'
        // Constraints : 1 <= n < 10^9 means integer datatype use krna h 
        // 453827 -> 6 digits
        // Iske liye binary arithmetic krnge bachpan m jo pdhe the, 2 se divide krnge aur remainder aate rehta tha
        // But iss case m hm 10 se divide krnge
        // 10 | 453827                                          Counter(digit)
        // 10 | 45282  -> 7 remainder (last digit nikaal diye)  1
        // 10 | 4528   -> 2 remainder (last digit nikaal diye)  2
        // 10 | 452    -> 8 remainder (last digit nikaal diye)  3
        // 10 | 45     -> 2 remainder (last digit nikaal diye)  4
        // 10 | 4      -> 5 remainder (last digit nikaal diye)  5
        //    | 0      -> 4 remainder (last digit nikaal diye)  6
        // Tbtk divide krte rho jbtk quotient 0 naa ho jae aur counter badhaate rho

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // 'n' ko tbtk divide krte rhnge jbtk 'n = 0' naa ho jae
        // aur har baar digit/counter badhaate rho
        int counter = 0;
        while(n != 0) {
            int quotient = n / 10;
            int remainder = n % 10;

            // 'n' ko quotient k equal kr do
            n = quotient;

            counter++;
        }
        System.out.println(counter);
    }
}
