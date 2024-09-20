package _23_ArrayOneDimension;

import java.util.Scanner;

public class _06_FindElementOfAnArray {
    public static void main(String[] args) {

        /**
         * Linear Search - Find Element Of An Array:
         * => Isme humein pehle size of an array diya h i.e. 6
         * => Fir diya gya h 5 elements i.e. 15, 30, 40, 4, 11, 9
         * => Fir ek number diya gya hai i.e. 40, aur humein btana h wo number iss array m exist krta hai ya nhi
         * => Aur agar exist krta hai to kaha exist krta hai (index no)
         * => Aur agar exist nhi krta h to print -1.
         * 
         * Input: 6 
         *     => 15 30 40 4 11 9 40
        */

        Scanner scn = new Scanner(System.in);
        /**
         * Size of an array
        */
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn .nextInt();
        }

        /**
         * Find the element
        */
        int data = scn.nextInt();

        int foundAt = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == data) {
                foundAt = i;
                break;
            }
        }
        System.out.println("Found At Index No : " + foundAt);
    }
}
