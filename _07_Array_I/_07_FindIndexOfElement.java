package _07_Array_I;

public class _07_FindIndexOfElement {
    public static void main(String[] args) {

        /**
         * Q. Find the index of element in a given array?
         * => [2,4,6,8,10,12,14,16], key=10
         * => TC: O(n)
         */

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found!");
        } else {
            System.out.println("Key is at index " + index);
        }

    }

    public static int linearSearch(int numbers[], int key) {

        /**
         * Linear Search Logic:
        */
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
