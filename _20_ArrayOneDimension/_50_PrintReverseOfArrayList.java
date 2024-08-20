package _20_ArrayOneDimension;

import java.util.ArrayList;

public class _50_PrintReverseOfArrayList {
    public static void main(String[] args) {
        /**
         * Prnt Reverse of an ArrayList:
         * => list = 1, 2, 3, 4, 5
         * */ 

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        /**
         * Reverse Print: O(n)
        */
        for(int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
