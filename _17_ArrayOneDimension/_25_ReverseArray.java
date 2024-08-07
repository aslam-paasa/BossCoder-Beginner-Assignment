package _17_ArrayOneDimension;

public class _25_ReverseArray {
    public static void main(String[] args) {
        
        /** Reverse the array using Two Pointer Approach:
         * 
         * [2,4,6,8,10] => [10,8,6,4,2]
         *  s       e
         * 
         * TC: O(n)
         * SC: O(1)
         * 
         * Logic:
         * => startIdx & lastIdx nikaali aur swap kr do
         * => startIdx++
         *    lastIdx--
         */

        int numbers[] = {2,4,6,8,10};  
        
        reverse(numbers);

        /**
         * Print reverse array
        */
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }

    public static void reverse(int numbers[]) {
        int first = 0; 
        int last = numbers.length - 1;

        while(first <= last) {
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
}
