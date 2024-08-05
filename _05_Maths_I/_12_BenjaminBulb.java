package _05_Maths_I;

import java.util.Scanner;

public class _12_BenjaminBulb {
    /**
     * The Curious Case of Benjamin Bulbs:
     * 1. You are given n number of bulbs. They are all switched off. 
     *    A weird fluctuation in voltage hits the circuit n times. In
     *    the 1st fluctuation all bulbs are toggled, in the 2nd  fluctuation
     *    every 2nd bulb is toggled, in the 3rd fluctuation everu 3rd bulb
     *    is toggled and so on. You've find which bulbs will be switched on
     *    after n fluctuations.
     * 2. Take as input a number n, representing the number of bulbs.
     * 3. Print all the bulbs that will be after the nth fluctuation in 
     *    voltage.
     * 
     * Explanation:
     * => Let's say humaare paas 25 bulbs hai:
     *    1 T       6 TTTT     11 TT       16 TTTTT   21 TTTT
     *    2 TT      7 TT       12 TTTTTT   17 TT      22 TTTT
     *    3 TT      8 TTTT     13 TT       18 TTTTTT  23 TT
     *    4 TTT     9 TTT      14 TTTT     19 TT      24 TTTTTTTT
     *    5 TT      10 TTTT    15 TTTT     20 TTTTTT  25 TTT
     * => Starting m saare bulbs off hai, 25 baar voltage fluctuate kari.
     *    (a) 1st time k voltage change ne saari bulbs ko toggle kr diya 
     *        i.e. multiple of 1
     *    (b) 2nd time k voltage change ne multiple of 2 wali bulb ko toggle
     *        kiya.
     *    (c) 3rd time k voltage change ne multiple of 3 wali bulb ko toggle
     *        kiya.
     *        ....
     *        ....
     *        ....
     *    (d) 25th time k voltage change ne multiple of 25 wali bulb ko toggle
     *        kiya.
     * 
     * Note: 1, 4, 9, 16, 25 => Sirf ye bulb on rahnge. In num k kuch 
     *       khaas hai baaki num se, ye saare ODD baar fluctuate hue hai.
     * 
     * Q. ODD wale itni baar q touch ho rha hai?
     * => 24 (Non-perfect Square)     => 36 (Perfect Square)
     *    1.24   24.1                 1.36      36.1
     *    2.12   12.2                 2.18      18.2
     *    3.8     8.3                 3.12      12.3
     *    4.6     6.4                 4.9        9.4
     *                                      6.6
     * 
     * => Every "non-perfect square" have "even" number of factors.
     * => And every "perfect square" have "odd" number of factors.
     * 
     * So, print all perfect squares.
    */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /**
         * Printing Perfect Square:
        */
        for(int i = 1; i * i <= n; i++) {
            System.out.println(i * i); 
        }

        /**
         * Solution-2
         * return (int)Math.sqrt(n);
        */
    }
}
