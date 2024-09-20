package _23_ArrayOneDimension;

import java.util.ArrayList;

public class _52_SwapTwoNumbers {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        
        /**
         * idx1 pe jaa k idx2 ki value store krana hai
         * Fir idx2 pe temp k value store krana hai
        */
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, list.get(temp));
    }
    public static void main(String[] args) {
        /**
         * Swap 2 numbers:
         * => list = 2, 5, 9, 3, 6
         * => index : idx1 = 1, idx2 = 3
         * => Output: 2, 3, 9, 5, 6
         * */ 

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int idx1 = 1, idx2 = 3;

        System.out.println("List before swapping:");
        System.out.println(list);

        System.out.println();

        System.out.println("List after swapping:");
        swap(list, idx1, idx2);
        System.out.println(list);

    }
}
