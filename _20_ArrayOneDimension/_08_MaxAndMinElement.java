package _20_ArrayOneDimension;

import java.util.Scanner;

public class _08_MaxAndMinElement {
    public static void main(String[] args) {

        /**
         * Q. Write a program to perform the following:
         * 1. Take an integral input N from user
         * 2. Take N integral input from user
         * 3. Find the minimum and maximum out of the integers
         */

        // 1. Take an integral input N from user
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of your collection: ");
        int n = scn.nextInt(); // 5


        // 2. Create an integral array of size 'n'
        int[] arr = new int[n]; // [__, __, __, __, __]

        // 3. Take 'N' integral input from user
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt(); // arr[0]=67, arr[1]=20, arr[2]=87, arr[3]=13, arr[4]=44   
        }

        // 4. Find the minimum and maximum out of the integers
        int min = arr[0]; // 67
        int max = arr[0]; // 67

        for(int i=1; i<n; i++) {
            if(arr[i] < min) {
                min = arr[i]; // update minimum
            }

            if(arr[i] > max) {
                max = arr[i]; // update maximum
            }
        }

        // 5. Print the result
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    // TC: O(n) + O(n) => O(2n) => O(n)
}
