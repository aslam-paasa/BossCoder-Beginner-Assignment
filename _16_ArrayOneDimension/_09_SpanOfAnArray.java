package _16_ArrayOneDimension;

import java.util.Scanner;

public class _09_SpanOfAnArray {

    /**
     * Linear Search - Span of an array:
     * => Input: 6 15 30 40 4 11 9
     * 
     * => Sabse pehle 6 diya hai, matlab utna bada array banana hai.
     * => Fir 6 numbers diye hain, un sabhi ko array mein daalna hai.
     * => Fir uss array mein jo sabse bada aur sabse chhota value hai, unka difference print karna hai.
     * 
     * 1. Size of the array input lena i.e. 6
     * 2. Ab hum array declare kar sakte hain (size: 6)
     * 3. Ab humein array mein elements daalne hain
     * 4. 15, 30, 40, 4, 11, 9
     * 5. Sabse pehla element ko minimum aur maximum assume kiya
     * 6. Loop chalaya 1 se last tak
     *     - Agar element min se chhota hai, to min ko update kiya
     *     - Agar element max se bada hai, to max ko update kiya
     * 7. Span nikala aur print kiya
     * 
     * Note: Span: Max - Min
     * 
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Input: Size of the array i.e. 6

        int[] arr = new int[n]; // Declaring an array of size n

        // Taking input of elements into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Initializing min and max with the first element of the array
        int min = arr[0];
        int max = arr[0];

        // Looping through the array to find min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Finding the span and printing it
        int span = max - min;
        System.out.println(span);
    }
}
