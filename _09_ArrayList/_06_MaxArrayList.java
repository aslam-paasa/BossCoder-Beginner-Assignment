package _09_ArrayList;

import java.util.ArrayList;

public class _06_MaxArrayList {
    /**
     * list = [2, 5, 9, 3, 6]
     * */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        /**
         * O(n):
        */
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++) {

            // Way-1:
            // if(max < list.get(i)) {
            //     max = list.get(i);
            // }

            // Way-2:
            max = Math.max(max, list.get(i));
        }

        System.out.println("max element: " + max);

    }
}
