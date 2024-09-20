package _12_RecursionWithArrayList;

import java.util.Arrays;

public class _915_Bubble_Sort {
    public static void main(String[] args) {
        triangle(4, 0);

        int[] arr = {4, 3, 2, 1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void triangle(int row, int col) {
        if(row == 0) {
            return;
        }

        if(col < row) {
            System.out.print("* ");
            triangle(row, col+1);
        } else {
            System.out.println();
            triangle(row-1, 0);
        }
    }

    /**
     * Instead of printing, I just need to swap:
    */
    public static void bubble(int[] arr, int row, int col) {
        if(row == 0) {
            return;
        }
 
        if(col < row) {
            if(arr[col] > arr[col + 1]) {
                // swap
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubble(arr, row, col+1);
        } else {
            bubble(arr, row-1, 0);
        }
    }
}
