package _27_NumberSystemAndBitManipulation;

public class _06_DecimalBaseAddition {
    public static void main(String[] args) {
        
        /**
         * Q. Agar humaara base-10 hota to hm kaise addition krte?
         * => n1 = [257]base-10,  n2 = [62]base-10
         * 
         * => Carr  1
         * => Sum = 257
         *        +  62
         *        --------
         *          319       (i) 7+2 = 9
         *                    (ii) 6+5 = 11
         *                    Note: 11 humaare decimal number m exist nhi krta, isliye hm 11 ko split kr lenge
         *                          => 11 = 10 + 1
         *                                = Ye 10 convert ho k 1 bn jaega aur aage wali digit m chla jaega
         *                                = Aur ye spare 1 yhi reh jaega
         *                    Note: a b, where a.10^1 + b.10^0 
         *                    => means 'a' already 'b' ki 10 times hai, isliye carry as 1 receive hoga.
         * 
         * Q. But hm carry aage forward kaise krnge?
         * 
         * Iteration-1:
         * => 1. sum = 7+2+0 (initially carry is 0) => 9
         *    2. digit ko likhna hai aur carry update krna hai
         *       (a) digit m har baar modulus 10 le lo => digit = 9%10 = 9
         *       => Iss ye hoga ki koi v number 10 se jyda hoga to wo humaare range k andr aa jaega, aur uska spare mil jaega
         *       (b) carry = 9/10 = 0
         * 
         * Iteration-2:
         * => 1. Sum = 5+6+0 = 11
         *    2. Digit = 11%10 = 1
         *    3. Carry = 11/10 = 1
         * 
         * Iteration-3:
         * => 1. Sum = 2+0+1 = 3
         *    2. Digit = 3%10 = 3
         *    3. Carry = 3/10 = 0
         *                        
         * Q. List of variables we need?
         * 1. n1 = 257
         * 2. n2 = 62
         * 3. digit1 
         * 4. digit2
         * 5. carry = 0
         * 6. sum = digit1 + digit2 + carry
         * 7. digit & carry updation: 
         *    (a) UpdatedDig
         * 8. UpdatedDig*Mult: After every iteration hum 10 se multiply krte jaenge
         * 
         * => Input: 10
         *           257
         *           62
        */

        int b = 10;
        int n1 = 257;
        int n2 = 62;

        int ans = 0, mult = 1, carry = 0;

        while(n1>0 || n2>0 || carry>0) {
            int d1 = n1%10;
            n1=n1/10;

            int d2 = n2%10;
            n2=n2/10;

            int sum = d1+d2+carry;
            int dig = sum%10;
            carry=sum/10;

            ans = ans+dig*mult;
            mult = mult*10;

        }
        System.out.println(ans);
    }
}
