package _17_ArrayOneDimension;

public class _07_FindLargestNumber {
    public static void main(String[] args) {

        /**
         * Q. Find the largest number in a given array
         * => [1,2,6,3,5]
         * 
         * Logic:
         * 1. Ek largest naam ka variable bna lenge, jiske andr -Infinity store krnge
         * 2. Har baar largest k saath apne index ko compare krnge
         *    aur agar index value bda hai to largest ko update kr denge
         * 
         * Note:
         * => -Infinity = Integer.MIN_VALUE
         * => +Infinity = Integer.MAX_VALUE
         */

        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("Largest value is : " + getLargest(numbers));
    }

    /**
     * Q. How to return largest & smallest together?
     */
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }

}
