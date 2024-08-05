package _16_ArrayOneDimension;

import java.util.ArrayList;

public class _47_TripletSum {
    public static void main(String[] args) {
        /**
         * Triplet Sum:
         * => Mere paas ek array hai, uss array k andr kuch values padi
         *    hui hai:
         *    arr[] = {10, 20, 30, 40, 50};
         * 
         * => Sum = 80, but values should be 3.
         * 
         * Note: Humein 2 number k pairs find krne the to humne 2 loops use kiya
         *       Similarly, humein 3 number ka sum chaiye to 3 loops use krnge.
         * 
         * => (x, y, z) = 80
         * => 3 loops: [i], [i+1], [i+2]
         */

        int[] arr = { 10, 20, 30, 40, 60, 70 };
        int sum = 80;

        ArrayList<Integer> triplets = new ArrayList<>();

        /**
         * Print all pairs:
         * Outer loop will traverse for each element:
         */
        for (int i = 0; i < arr.length; i++) {
            int elementOne = arr[i];
            /**
             * for every element, will traverse on aage wale element
             */
            for (int j = i + 1; j < arr.length; j++) {
                int elementTwo = arr[j];

                for(int k = i+2; k < arr.length; k++) {
                    int elementThree = arr[k];

                    if(elementOne + elementTwo + elementThree == sum) {
                        triplets.add(elementOne);
                        triplets.add(elementTwo);
                        triplets.add(elementThree);
                    }
                }
            }
        }
        System.out.println("Triplets with sum " + sum + ":");
        for (int i = 0; i < triplets.size(); i += 3) {
            System.out.println(triplets.get(i) + "," + triplets.get(i+1) + "," + triplets.get(i+2));
        }
    }
}