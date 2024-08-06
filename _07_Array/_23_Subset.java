package _07_Array;

import java.util.Scanner;

public class _23_Subset {
    /**
     * Difference between subarray and subset?
     * => a b c
     * 
     * 1. Subarray:  A continuous part of array
     * => n*(n+1)/2 => 4(4+1)/2 => 20/2 => 10
     *    a
     *    a b       b
     *    a b c     b c    c
     *    a b c d   b c d  c d   d
     *    [  4  ]   [ 3 ] [ 2 ] [1]=> 10
     * 
     * 2. Subset:
     * => 2^n = 16, where n is n.length
     * => Check the repetition:
     *    X X X X      a X X X      
     *    X X X d      a X X d      
     *    X X c X      a X c X      
     *    X X c d      a X c d      
     *    X b X X      a b X X      
     *    X b X d      a b X d      
     *    X b c X      a b c X      
     *    X b c d      a b c d      
     * 
     * => 'a' k paas 2 choice hai, wo aaega ya nhi.
     * => 'b' k paas 2 choice hai, wo aaega ya nhi.
     * => 'c' k paas 2 choice hai, wo aaega ya nhi.
     * => 'd' k paas 2 choice hai, wo aaega ya nhi.
     *    Total 16 choices hai.
     * 
     * => Humein ye print krna hai.
     * 
     * For example, 1 coin k 2 sides hote hai, toss krne pe 2 outcome
     * m se koi ek aata hai: Head or Tail.
     * 
     * Note: Humne numbers ki binary nikaalna sikha hai aur uske help
     *       se hum solve kr skte hai. For example, abc:
     * 
     *  No   Binary
     *  0 -> 0 0 0   =>   X X X
     *  1 -> 0 0 1   =>   X X c
     *  2 -> 0 1 0   =>   X b X
     *  3 -> 0 1 1   =>   X b c
     *  4 -> 1 0 0   =>   a X X
     *  5 -> 1 0 1   =>   a X c
     *  6 -> 1 1 0   =>   a b X
     *  7 -> 1 1 1   =>   a b c
     * 
     * Step-1:
     * => Bit Manipulation formula of 2^n(Exponent): (1 << 3)
     * => Jitni badi humaari array k length hai utna bdi 2 ki power 
     *    nikaal lenge: (1 << a.length) => (1 << 3)
     *    => 2^3 => 8 output
     * => So, loop 2^7 tk chlega (arr.length - 1), 0 to 7 tk ka binary
     *    nikaal lenge. Jaha Jaha 0 aaega wo digit print nhi hoga
     *    baaki print hoga.
     * 
     * Input: 3
     *        10 20 30
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        /**
         * Step-1: 2^n, where n is the length of the array
         * => Bracket is mandatory
        */
        int limit = (1 << n);
        System.out.println(limit); 

        /**
         * Step-2: Print all possible outcomes:
        */
        for(int i = 0; i < limit; i++) {
            int decimal = i;

            /**
             * binary of the decimal and if rem is 0, don't print,
             * otherwise print element
             * */
            String str = "";
            /**
             * Outer Loop: 0 to 7
             * Inner Loop: 0 to 2
            */
            for(int j = 0; j < arr.length; j++) {
                /**
                 * Converting decimal into binary:
                */
                int rem = decimal % 2;
                decimal = decimal / 2;

                if(rem == 0) {
                    str = "-\t" + str;
                } else {
                    str = arr[arr.length - 1 - j] + "\t" + str;                
                }
            }
            System.out.println(str);
        }
    }
}


/**
 * Understand main logic:
 * 
 * No    Binary
 *       a0  b1  c2
 *  0 -> 0   0   0   =>   X X X
 *  1 -> 0   0   1   =>   X X c
 *  2 -> 0   1   0   =>   X b X
 *  3 -> 0   1   1   =>   X b c 
 *  4 -> 1   0   0   =>   a X X
 *  5 -> 1   0   1   =>   a X c
 *  6 -> 1   1   0   =>   a b X
 *  7 -> 1   1   1   =>   a b c
 * 
 * 
 *    2 | 3
 *    2 | 1 -> 1
 *      | 0 -> 1
 *         
 *         a0  b1  c2
 * => 3 -> 0   1   1   
 * =>      X   b   c 
 * 
 * (a) Jb first division hota hai to humein c2 milta hai i.e. 1.
 * (b) Jb 2nd division hota hai to humein b1 milta hai i.e. 1.
 * (c) Jb 3rd division hota hai to humein a0 milta hai i.e. 0.
 * Note: Arrays left-to-right likhe jaate hai, aur binary number
 *       right-to-left padhe jaate hai.
 * 
 *            --------->
 *    Index:  0    1   2
 * => Array:  10,  20, 30
 * 
 * => Binary: 9,   5,  5
 *    Place   100  10  1
 *            <---------
 * 
 *    2 | 3
 *    2 | 1 -> 1 -> 1st place => c2
 *    2 | 0 -> 1 -> 2nd place => b1
 *      | 0 -> 0 -> 4th place => a0
 * 
 * Binary Number: ..., 128, 64, 32, 16, 8, 4, 2, 1 [Places]
 * => [Binary] 3 -> 0   1   1  
 *    [Place ]   -> 4   2   1 
 *                  a0  b1  c2
 * 
 * for(int j = 0; j < arr.length; j++) {}
 * => So, 'j = 0' first index k baare m baat nhi kr rha hai, wo last
 *    index m baare m baat kr rha hai.
 * => We will write:
 *    arr[arr.length-1-j]
 *    arr[3-1-0]
 *    arr[2]
 * => So, when j=0, it is indicating arr[2]. 
 * 
 * a0 b1 c2
 * 0  1  1 
 * X  b  c 
 * 
 * => Now the last issue is:
 *    2 | 3
 *    2 | 1 -> 1 -> 1st place => c2 
 *    2 | 0 -> 1 -> 2nd place => b1
 *      | 0 -> 0 -> 4th place => X
 * => It will print:  c2 b1 X, but humein X b1 c2 print krna tha.
 * 
 * Solution: Pehle answer jama krnge String m, uske baad usse print
 *           krnge:
 * 
 *  if(rem == 0) {
 *     str = "-\t" + str;
 *  } else {
 *     str = arr[arr.length - 1 - j] + "\t" + str;                
 *  }
*/