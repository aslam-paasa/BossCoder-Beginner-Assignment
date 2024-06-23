package _11_Maths;

import java.util.Scanner;

public class _06_RotateNumber {
    public static void main(String[] args) {
        
        // 1) Pehle basics se krnge
        // 2) Fir special case krnge

        // 23457 ko +1 se rotate kr do to 7 aage aa jaata then 2,3,4, 5
        //    23457
        // +1 72345
        // +2 57234
        // Pehli rotationse 7 aage aa gya tha and 2nd rotation se last 2 aage aa gya tha
        // Jitni baar rotate krna h utna piche ki digit ko aage laenge
        // Agar 2 se rotate krne h to 100 se divide kijiye
        // Agar 3 se rotate krna h to 1000 se divide kijiye

        // 975432 ko +2 se rotate krna h
        // Humein ek number chaiye 100 aur ek number chaiye 10,000
        // 100 dene se hm 9754|32 ko alag kr denge, Quotient-9754, Remainder-32
        // Q) 32 aur 9754 ko kaise intact karau ki 329754 bane?
        // Wo banane k liye 32 k niche four 0 chaiye - 320000 means 9754(Quotient) ki digit jitni h remainder k piche utne zero lagani hai
        // then add kr denge

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // 975432
        int k = scn.nextInt(); // +2 => 100

        // number/count of digits
        // 975432 [+2] se rotate krna h, no of digit humein mil gyi '6'
        // Ab 975432 se humara jo divisor hai wo hona chaiye 100 wo 9754|32 ko alag kr dega
        // Aur multiply m humne decide kiya tha wo hna chaiye 10,000
        int nod = 0;
        int temp = n;
        while(temp != 0) {
            temp = temp / 10;
            nod++;
        }

        // divisor and multiplier
        int div = 1;
        int mult = 1;
        for(int i = 1; i <= nod; i++) {
            if(i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }

        // divisor and multiplier banne k baad humein chaiye quotient & remainder
        int q = n / div;
        int r = n % div;
        int ans = r * mult + q;
        System.out.println(ans);
    }
}
