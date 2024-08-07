package _17_ArrayOneDimension;

import java.util.ArrayList;

public class _45_PairSum {
    public static void main(String[] args) {
        /**
         * Q. Find a pair that upon addition gives value equal to sum?
         * => Input: {1, 3, 5, 7, 2, 4, 6}
         * => Sum = 9
         * */ 

        int[] arr = {10, 20, 40, 60, 70};
        int sum = 80;

        ArrayList<Integer> pairs = new ArrayList<>();

        /**
         * Print all pairs:
         * Outer loop will traverse for each element:
         * */ 
        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            /**
             * for every element, will traverse on aage wale element
            */
            for(int j = i+1; j < arr.length; j++){
                if(element + arr[j] == sum) {
                    pairs.add(element);
                    pairs.add(arr[j]);
                }
            }
        }

        /**
         * Print the pairs:
        */
        for(int i = 0; i < pairs.size(); i+=2) {
            System.out.println("Pair Found : " + pairs.get(i) + "," + pairs.get(i+1));
        }
    }
}