package _10_Sorting;

public class _02_ElementsGreaterThanK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7 };
        int n = arr.length;
        int[] idx = new int[10]; // assuming max value in arr is less than 10

        // create an attendance array
        for (int i = 0; i < n; i++) {
            idx[arr[i]] = i;
        }

        int q = 2; // query
        int count = n - 1 - idx[q]; // count of elements greater than q

        System.out.println(count + " elements are greater than " + q);
    }
}
