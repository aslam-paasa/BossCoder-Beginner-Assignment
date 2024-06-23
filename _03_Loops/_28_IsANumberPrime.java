package _03_Loops;

import java.util.Scanner;

public class _28_IsANumberPrime {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        // Prime number wo hote h jo 1 ki table aur khud ki table m aate h

        // Worst Approach :
        // 7 ko 1 se divide kr k dekhnge, aur jb koi chij divide ho jaati h to remainder 0 aati h
        // To fir hm dekhnge 7 % 1 = 0 h ki nhi, agar h to divide ho gya
        // Fir hum ek digit aage jaenge 7 % 2 != 0
        // 7 % 3 != 0
        // 7 % 4 != 0
        // 7 % 5 != 0
        // 7 % 6 != 0
        // 7 % 7 = 0
        // To total 1 se le k 7 tk wo 2 baar divide hua, to prime number wahi hote h jo 1 se leke uss number tk 2 baar divide hote h

        // Dusre tarike se v bol skte h
        // 1 se aur khud se har number to nhi hoga to isse behtar 1 ko chor de aur 2 se le k 6 tk har number divide kr k dekh le
        // Agar koi v number divide nhi kr paega to wo prime h 
        // (2 to x-1) - Ek baar v divide naa ho to prime
        // Agar 2 to x-1 k bich m kisi se v divide ho to wahi ruk jao aur aage divide mt kro

        //  Agar hum 50 ko divide kr k dekhe to notice krnge wo apne half number k baad direct khud se divide hota h
        //  1/50
        //  2/50
        //  5/50
        //  10/50
        //  25/50
        //  50/50
        // Agar hum 6 ko divide kr k dekhe to iss v same chij notice kr paenge 
        // 1/6
        // 2/6
        // 3/6
        // 6/6
        // To humein (2 to x-1) tk jaane ki jarurat nhi h, (2 to x/2) hi enough h
        // Divide 10 -> [2, 5]
        // Divide 16 -> [2, 8]

        // Best approach : [2 to root n]
        // Humein x/2 tk jaane ki v jarurat nhi h square root tk enough h
        // Factorization of 36 : 
        // 1 X 36 = 36            36 X 1 = 36           
        // 2 X 18 = 36            18 X 2 = 36
        // 3 X 12 = 36            12 X 3 = 36
        // 4 X 9  = 36            9 X 4  = 36
        //             6 X 6 = 36 
        // Agar hm unique factors ki baat kre to uske square root tk hi milte h uske baad saare mirror image hai
        
        // Factorization of 16 :
        // 1 X 64 = 16            64 X 1 = 16
        // 2 X 32 = 32            32 X 2 = 32
        // 4 X 16 = 64            16 X 4 = 32
        //             8 X 8 = 64

        // Note : n = p*q then p&q cannot be greater then root n.

        // 35 k liye kare to humein root 6 i.e. 36 k beyond jaane ki jarurat nhi h
        // Actually humein root 6 tk jaane ki v jarurat nhi h
        // Root of 35 :
        // 2 X
        // 3 X
        // 4 X
        // 5 -> 5.xxx (25) -> 5 se divide ho gya 35 so not a prime
        // 6 -> 36 (bigger than 35)

        // Root fo 49 :
        // 2 X
        // 3 X
        // 4 X
        // 5 X
        // 6 X
        // 7 -> 49 is not a Prime

        // Rootof 53
        // 2 X
        // 3 X
        // 4 X
        // 5 X
        // 6 X
        // 7 X -> Apne half k root tk kisi se divide nhi hua to "prime"

        // Approach :
        // Humein ek divisor banana padega to [2 se root x] tk jaega
        // Agar divide ho gya to not prime aur nhi hua to prime
        // Note : Root n kaise likhe : (div * div <= x) -> 'x' ko check kr rhe h ki prime h ya nhi
        // int div = 2;
        // while(div * div <= x) {
            // har baar maine nikaala remainder jisme 'x' ko divide krna hai 'div' se 
            // remainder '0' aaya to prime nhi h, wrna prime h
            // int remainder = x % div;
            // aur har baar dividor ko badhaate rho
            // Agar : if(remainder == 0) {
            // isprime = false;
            // }
            // div++; // 2,3,4,5,6,7
        // }

        // if(isprime == true) {
        //
        // } else {
        //    
        // }

        // Agar 53 check krnge to div = 2,3,4,5,6,7 tk jaega because while(7 * 7 <= 53)
        // Uske baad div++ krnge to while(8*8 > 53) to condition fulfill nhi hoga



        // Saccha hone k liye saare sach bolne padte h, aur jhuta hone k liye sirf ek jhut kaafi hai
        // prime hone k liye ek se v divide nhi hona chaiye, non-prime hone k liye ek baar divide hona kaafi hai
        // Hum number ko prime maan k chlte hai, agar wo divide ho gya to prime nhi rha
        // agar bich m kisi se v divide ho gya aur loop ko bich m hi rokna h to use "break"
        // "break" jiss loop k andr hota h uss loop ko maar deta hai bich m
        boolean isprime = true;
        int div = 2;
        while(div * div <= x) {
            int remainder = x % div;

            if(remainder == 0) {
                isprime = false;
                break;
            }
            div++;
        }
        if(isprime == true) {
            System.out.println(x + " is prime");
        } else {
            System.out.println(x + " is not prime");
        }
    }
}
