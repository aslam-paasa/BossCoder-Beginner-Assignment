package _09_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_RemovePrime {
    /**
     * Remove k liye loop kvi sidha nhi chalaate.
     * => Let's say humein saare odd numbers remove krne hai arraylist
     *    se, but there is a catch. Humein loop ulta chalana hoga.
     *    [10, 12, 15, 17, 18, 19, 21, 22]
     *     0   1   2   3   4   5   6   7 
     * => Humaara loop-0 pe hai, wo even no hai,
     *    then loop-1 pe hai, wo even hai,
     *    then loop-2 pe hai, wo odd hai [remove]
     * => But jaise hi idx-2 k element ko remove kiya to right side
     *    k elements idhr swap ho gye:
     *    [10, 12, 17, 18, 19, 21, 22]
     *     0   1   2   3   4   5   6
     * => Aur humne idx-2 ki element pehle hi remove kr diya aur aage
     *    badh gya, aur humara element-17 kvi check hi nhi hua. That's
     *    why humesa loop ulta chalana. 
    */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(15);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(21);
        list.add(22);

        /**
         * Way-1: Remove Prime logic using ArrayList:
        */
        // for(int i = 0; i < list.size(); i++) {
        //     int val = list.get(i);
        //     if(val % 2 == 1) {
        //         list.remove(i);
        //         i--; // soln 
        //     }
        // }
        // System.out.println(list.size() + " -> " + list); 

        /**
         * Way-2: Remove Prime logic using ArrayList(loop utla chla lo)
        */
        for(int i = list.size() - 1; i >= 0; i--) {
            int value = list.get(i);
            if(value % 2 == 1) {
                list.remove(i);
            }
        }
        System.out.println(list.size() + " -> " + list); 
    }
}
