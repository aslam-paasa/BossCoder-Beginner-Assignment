package _12_RecursionWithArrayList;

public class _910_Sorting_With_Recursion {
    /**
     * Q. We are given an array, we have to find whether that array is
     *    sorted or not using recursion.
     *    arr = [1, 2, 4, 8, 9, 12]
     *           |
     *           V
     *    Check if this ele is smaller than next ele.
     *    arr[i] < arr[i+1]
     * 
     * */ 

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8 ,9};
        System.out.println(sorted(arr, 0));
    }

    public static boolean sorted(int[] arr, int index) {
        // base condition
        if(index == arr.length - 1) {
           return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index+1);
    }
}
