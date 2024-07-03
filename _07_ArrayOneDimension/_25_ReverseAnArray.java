// https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
package _07_ArrayOneDimension;

public class _25_ReverseAnArray {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};

        display(arr);
        reverse(arr);
        display(arr);

    }

    public static void display(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }


    public static void reverse(int[] arr) {

        // Reverse the array using for-loop iteration 
        // for(int i = arr.length - 1; i >= 0; i--) {
        //     System.out.println(arr[i]);
        // }

        // Reverse the array using 2 pointer approach
        int i = 0;
        int j = arr.length - 1;

        while(i <= j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}

