package _07_Array_I;

import java.util.Scanner;

public class _19_RotateArray {

    /**
     * Rotate the array using the concept of reverse:
     * a b c d e f g
     *       | Rotate by 3
     *       V
     * e f g a b c d
     * 
     * Trick: Using reverse we can achieve rotate
     * 
     * Step-1: "abcd" & "efg" dono ko alag alag reverse kr de:
     *         
     *          a b c d       e f g
     *             |            |
     *             V            V
     *          d c b a       g f e
     * 
     * Step-2: Reverse whole array
     *  
     *          d c b a g f e
     *                |
     *                V
     *          e f g a b c d 
    */



    /**
     * 1. Rotate Elements by 'k' positions Logic:
    */
    public static void rotate(int[] a, int k) {
        /**
         * (a) Reduce rotations if larger than array.length
         * (b) Convert negative rotations to positive
        */
        k = k % a.length;

        if (k < 0) {
            k += a.length;
        }

        /**
         * Main Logic:
         * Step-1: Reverse the first part of the array
         * Step-2: Reverse the second part of the array
         * Step-3: Reverse the entire array
        */
        reverse(a, 0, a.length - k - 1);
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - 1);
    }

    /**
     * 2. Reverse Elements Logic:
     * => left & right means kaha se kaha tk reverse krna hai.
     * => a b c d e
     *    l       h
     * => e       a [swapped]
    */
    public static void reverse(int[] a, int left, int right) {
        while (left <= right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }

    /**
     * Print Rotated Elements:
    */
    public static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotate(a, k);
        display(a);
    }
}

/**
 * Output:
 * => 5
 * => 1
 *    2
 *    3
 *    4
 *    5
 * => 2
*/
// Output :
// 5
// 1
// 2
// 3
// 4
// 5
// 2