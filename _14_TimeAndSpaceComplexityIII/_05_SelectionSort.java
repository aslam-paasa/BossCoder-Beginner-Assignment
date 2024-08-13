package _14_TimeAndSpaceComplexityIII;

// TC: O(n^2)
public class _05_SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        System.out.println("List of numbers swapped: ");
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Print the sorted array
        System.out.println("After selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        System.out.println("Before selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(arr);
    }
}

/**
 * Note: Humaare paas Merge Sort & Quick Sort hai isliye Bubble Sort
 *       and Selection Sort ko hum kvi use nhi krnge. No real-life use.
*/