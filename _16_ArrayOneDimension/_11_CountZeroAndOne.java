package _16_ArrayOneDimension;

public class _11_CountZeroAndOne {
    public static void main(String[] args) {
        /**
         * Q. Count 0's and 1's in an Array
         * => [0, 0, 1, 0, 1, 1, 1, 0, 0]
         * => Humein btana hai kitni zero's and one's hai
         */

        int arr[] = { 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1 };

        int numZero = 0;
        int numOne = 0;

        for (int i = 0; i < arr.length; i++) {
            // if zero found, increment numZero
            if (arr[i] == 0) {
                numZero++;
            }

            // if one found, increment numOne
            if (arr[i] == 1) {
                numOne++;
            }
        }

        System.out.println("Number of zeroes : " + numZero);
        System.out.println("Number of ones : " + numOne);
    }
}
