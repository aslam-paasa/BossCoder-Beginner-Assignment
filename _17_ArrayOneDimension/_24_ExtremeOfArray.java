package _17_ArrayOneDimension;

public class _24_ExtremeOfArray {
    public static void main(String[] args) {
        /**
         * Pointers:
         * [10, 20, 30, 40, 50, 60, 70, 80]
         *   0   1   2   3   4   5   6   7 
         * 
         * => [10, 80, 20, 70, 30, 60, 40, 50]
         * 
         * Note: With the help of Pointer concept we will reverse the number.
         * */ 

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int size = arr.length;

        int start = 0;
        int end = size - 1;

        while(start <= end) {
            if(start == end) {
                System.out.print(arr[start] + " ");
            } else {
                System.out.print(arr[start] + " ");
                System.out.print(arr[end] + " ");
            }
            start++;
            end--;
        }
    }
}
