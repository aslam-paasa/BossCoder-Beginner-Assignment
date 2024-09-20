package _12_RecursionWithArrayList;

public class _913_Rotated_BinarySearch {
    /**
     *           0  1  2  3  4  5  6  7
     * Q. arr = [5, 6, 7, 8, 9, 1, 2, 3]   target = 7
     *           s        m           e
     * 
     * Case-1: if arr[s] <= arr[m]
     *            if(key >= arr[s] & arr[m])
     *               e = m - 1;
     *         else s = m + 1;
     * 
     * Case-2: if key >= arr[m] & <= arr[e]
     *            s = m - 1;
     * 
     * Case-3: else e = m - 1;
     * */ 

     public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 8, 0, arr.length-1 ));
     }

     public static int search(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if(arr[m] == target) {
            return m;
        }

        if(arr[s] <= arr[m]) {
            if(target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if(target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        } else {
            return search(arr, target, m+1, e);
        }
     }
}
