package _15_Sorting;

public class _09_FrequencyOfElements {
    public static void main(String[] args) {
        /**
         * Count Sort: (Non-Comparison Based Sorting) -> Find Frequency of Elements?
         * => Comparing the elements without asking which one is greater than which, we
         *    want to sort the array.
         * => [5,2,1,7,4,2,5,5,4,1,1,2,2]
         * => We have seen the concept of attendance array, index array. Now we will see
         *    frequency array.
         * 
         * Note: All of these concepts are hashmaps. Once we learn HashMap, we will not
         *       use any names like attendance array, index array or frequency array.
         * 
         * => In index array, we store the index of the array. Similarly, in frequency
         *    array we will store how many times that particular element is present.
         * 
         * +-------------------------------+
         * | 0 | 3 | 4 | 0 | 2 | 3 | 0 | 1 |
         * +-------------------------------+
         * 0 1 2 3 4 5 6 7
         * 
         * Print: 1,1,1,2,2,2,2,4,4,3,3,3,3,3,7
         * => This is Count Sort
         */

        int[] arr = { 5, 2, 1, 7, 4, 2, 5, 5, 4, 1, 1, 2, 2 };
        int max = getMax(arr);
        int[] frequency = new int[max + 1];

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }

        // Print sorted array
        for (int i = 0; i < frequency.length; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
