package _07_Array_II;

import java.util.Scanner;

public class _10_SearchInASorted2dArray {
    /**
     * Binary Search in a Sorted 2D Array:
     *    11 12 13 14
     *    21 22 23 24
     *    31 32 33 34
     *    41 42 43 44
     * Q. Find element-43?
     * 
     * => Search from top-right corner: [44]
     *    14 se search kre to:
     *    (a) max to min = chota hai[ignore]
     *    (b) top to bottom = bdaa hai[search top-to-bottom]
     * 
     * 1. Search-21:
     *    (a) 14 se bda hai 21 -> move down
     *    (b) 24 se chota hai 21 -> move leftward 
     *        (i) compare 24 & 21 -> move leftward 
     *        (ii) compare 23 & 21 -> move leftward 
     *        (iii) compare 22 & 21 -> move leftward 
     *        (iv) compare 21 & 21 -> found
     * 
     * 2. Search-40:
     *    (a) 14 se bda hai 40 -> move down
     *    (b) 24 se bda hai 40 -> move down
     *    (c) 34 se bda hai 40 -> move down
     *    (d) 44 se chota hai 40 -> move leftwards
     *        (i) Compare 43 & 44 -> move leftwards
     *        (ii) Compare 42 & 44 -> move leftwards
     *        (iii) Compare 41 & 44 -> move leftwards
     *              No elements left -> -1
     *    
     * */ 

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int x = scn.nextInt();

        int i = 0;
        int j = arr[0].length-1;

        while(i < arr.length && j >= 0) {
            if(x > arr[i][j]) {
                i++;
            } else if(x < arr[i][j]) {
                j--;
            } else {
                System.out.print("Index: " + "[" + i + "]" + "[" + j + "]");
                return;
            }
        }
        System.out.println("Not Found");
    }
}
