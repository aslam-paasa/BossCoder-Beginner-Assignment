package _11_Maths;

import java.util.Scanner;

public class _03_DigitsOfANumber {
    public static void main(String[] args) {
        
        /**
         * Q. Find digits of a number, one-by-one?
         * Note: Har baar 10 se division nhi hota h aur ye question yhi btata hai
         * 
         * => Iska easy question hota ki reverse the digits (Homework)
         * 
         * => Avi qstn ye h ki ek number mila h aur wo saare number alag alag line m print krna h
         * => Har baar loop '++' krke nhi chlta, ye sawal btane k liye h
         * => Ek number diya h uske saare digits alag alag line m likhni h
         * => Input: 87654
         * => Output: 8
         *            7
         *            6
         *            5
         *            4
         * 
         * Observation: 248739 agar isko 100 se divide kre to 2487|39, aise split ho jaata h
         * => Quotient : 2487 and remainder : 39
         * => Similarly, 
         *               234|7    10
         *               23|47    100
         *               2|347    1000
         * 
         * Approach of Print Reverse Digits : 
         * => 10| 2347     Remainder 
         *    10| 234|7    7
         *    10| 23|4     4
         *    10| 2|3      3
         *    10| 0|2      2
         * => Jo pichla qustn kiya h hmne agr uske remainder print kr denge to digits in reverse print ho jaega
         * 
         * Note: 10 se divide krte h to aise katega
         *    234|7    [10]
         *    23|47    [100]
         *    2|347    [1000]
         * => Ye wali trick use krnge
         * 
         * Note: 23475 h to hm 10,000 se divide krnge
         * => Ab 3475 ko divide krnge lekin iss baar 1000 se krnge
         * => 10000] 2|3475    Remainder - 3475, Quotient - 2 -> print Quotient(2)
         * => 1000] 3|475      Remainder - 475, Quotient - 3 -> print Quotient(3)
         * => 100] 4|75        Remainder - 75,  Quotient - 4 -> print Quotient(4)
         * => 10] 7|5          Remainder - 5,   Quotient - 7 -> print Quotient(7)
         * => 1] 0|5           Remainder - 0,   Quotient - 5 -> print Quotient(5)
         * Note : Agar ye logic smjhe to aage Rotate ka qstn isi concept pe based h
         * 
         * Q. Initial m 10,000 divisor kaise milega?
         * => 10| 23475       1
         *    10| 2347-5      10
         *    10| 234-7       100
         *    10| 23-4        1000
         *      | 2|3         10000
         * => 0 tk jaane ki jarurt nhi h, jaise hi humara quotient less than 10 ho jae tbtk divisor bnana hai.
         * 
         * Note: Ab 10,000 mil gya to fir quotient lo print kr do aur divisor ko chota kr do -
         *    10000] 2|3475    Remainder - 3475,Quotient - 2 -> print Quotient(2)
         *    1000] 3|475      Remainder - 475, Quotient - 3 -> print Quotient(3)
         *    100] 4|75        Remainder - 75,  Quotient - 4 -> print Quotient(4)
         *    10] 7|5          Remainder - 5,   Quotient - 7 -> print Quotient(7)
         *    1] 0|5           Remainder - 0,   Quotient - 5 -> print Quotient(5)
        */

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * 1. Jb tk number 10 se bda h to number ko chota krte rho.
         * 2. Aur divisor ko 10 guna krte rho
         * 3. But divisor to mil gya lekin humaara number 'n' chota ho 
         *    chuka hai (original number)
         * 4. To hum number ko ek alag variable 'temp' m daalnge aur uss 
         *    temp number ko pareshan krnge (temporary number)
        */

        int div = 1;
        int temp = n;
        while(temp >= 10) {
            temp = temp / 10;
            div *= 10;
            System.out.println(temp + " " + div);
        }

        while(div >= 1) {
            int q = n / div;    // Quotient
            int r = n % div;    // Remainder

            System.out.println(q); // print quotient
            n = r;    // Remainder ko ab original number bna do
            div = div / 10; // div ko chota krte jao jbtk wo less than equal to 1 na ho jae
        }

    }
}
