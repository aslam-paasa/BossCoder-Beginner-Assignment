package _07_ArrayOneDimension;

import java.util.Scanner;

public class _20_SumOfTwoArrays {
    /*
    Humein isme 2 arrays diye gye hai : 
    1st array : [5] -> [3,0,1,7,5]
    2nd array : [4] ->  [9,9,9,9,]
    Ek new array banana h aur Inn dono array ka sum kr k btana hai 

    1  1  1  1     <- Carry Forward
    [3, 1, 7, 5, 2]
    +  [9, 9, 9, 9]
    [4, 1, 7, 5, 1]
    */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input for the first array
        int n1 = scn.nextInt(); // Number of elements in the first array
        int[] one = new int[n1]; // Declaring the first array
        // Taking input for the first array
        for (int i = 0; i < one.length; i++) {
            one[i] = scn.nextInt();
        }

        // Input for the second array
        int n2 = scn.nextInt(); // Number of elements in the second array
        int[] two = new int[n2]; // Declaring the second array
        // Taking input for the second array
        for (int i = 0; i < two.length; i++) {
            two[i] = scn.nextInt();
        }

        // Sum of first & second array
        // Note: Sum of arrays can be larger than both arrays
        // Determine the size of the sum array based on the larger of the two input arrays
        int[] sum = new int[n1 > n2 ? n1 : n2];

        int i = one.length - 1; // Index for the first array
        int j = two.length - 1; // Index for the second array
        int k = sum.length - 1; // Index for the sum array
        int c = 0; // Carry forward (initially 0)

        // Perform addition from the rightmost digit to the leftmost digit
        while (k >= 0) {
            int d = c; // Initialize the digit with the carry

            // Add the corresponding digits from the two arrays, and carry if applicable
            if (i >= 0) {
                d += one[i];
            }
            if (j >= 0) {
                d += two[j];
            }

            // Update the carry and the current digit
            c = d / 10; // Calculate the carry
            d = d % 10; // Calculate the current digit

            // Store the current digit in the sum array
            sum[k] = d;

            // Move to the next digits in the arrays and the sum array
            i--;
            j--;
            k--;
        }

        // Agar carry greater than zero h to phle carry print kro, fir sum of array ko print kro
        if(c > 0) {
            System.out.println(c); 
        }

        // Print the sum array
        for (int l = 0; l < sum.length; l++) {
            System.out.print(sum[l] + " ");
        }
    }
}
