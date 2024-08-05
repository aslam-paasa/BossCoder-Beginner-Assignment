package _15_ArrayOneDimension;

import java.util.Scanner;

public class _38_UniqueElement {
    public static void main(String[] args) {
        
        /**
         * Q. Find unique element:
         * => [1, 2, 4, 2, 1, 3, 6, 5, 5, 6, 4]
         * => Every element occurs twice except one element.
         * 
         * Q. Kya koi tarika h mere paas jo same element ko cancel out kr deta ho?
         * => XOR Operator
         * => 1 ^ 1 = 0
         * => 2 ^ 2 = 0
         * => 2 ^ 2 ^ 3 = 3
         * => 2 ^ 2 ^ 1 ^ 1 ^ 3 = 3
        */

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter the size of the array: " + n);

        /**
         * Taking Input:
         */
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int uniqueElement = findUnique(arr);
        System.out.println("Unique Element is : " + uniqueElement);
    }

    public static int findUnique(int[] arr){
        int ans = 0;

        for(int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
