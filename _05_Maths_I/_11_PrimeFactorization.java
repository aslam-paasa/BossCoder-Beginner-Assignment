package _05_Maths_I;

import java.util.Scanner;

public class _11_PrimeFactorization {
    /**
     * 720                               450
     *  
     *   | 720                             | 450
     * 2 | 360                           2 | 225
     * 2 | 180                           3 | 75
     * 2 | 90                            3 | 25
     * 2 | 45                            5 | 5
     * 3 | 15                            5 | 1
     * 3 | 5
     * 5 | 1 
     * 
     * Prime Factors = 2.2.2.2.3.3.5    Prime Factors = 2.3.3.5.5
     * 
     * Note: 
     * => Jbtk remainder = 0 aate rhega tbtk katenge, jaha remainder
     *    0 aana bnd ho jaega to uske agle number se divide krne lgnge.
     * => Example, 450 k liye 22 k beyond jaane ki jarurt nhi hai, iske
     *    baad unique factor nhi milega. Jitne v unique factors hai iske
     *    root tk hi milenge (21^2 = 441)
     * => For example,
     *    1. 1 x 36           31 x 1
     *    2. 2 x 18           18 x 2
     *    3. 3 x 12           12 x 3
     *    4. 4 x 9             9 x 4
     * 
     * Special Case:
     * => Maximum cases ye handle kr leta hai but ek special case
     *    hai jo ye handle nhi kr paata i.e. 46 => 2^7. Yha pe
     *    code dhokha de deta hai
     * 
     *       2  | 46
     * 2/3/4/5..| 23
     * 
     * => Kvi rem=1 aaya hi nhi
     * 
     * 
     * */ 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Square Root Optimization:
        */
        for(int f = 2; f * f <= n; f++) {
            /**
             * Ek no se tbtk kaatnege jbtk rem 0 aata rhega, fir no
             * badha denge:
             * */
            while(n % f == 0) {
                System.out.print(f + " ");
                n = n / f;
            }
        }

        /** 
         * Special Case, 46 k case m last m poora katega nhi, 23 bach jaega
         * means n > 1 hai to wo 23 print krna hota hai
        */
        if(n > 1) {
            System.out.println(n);
        }
    }
}
