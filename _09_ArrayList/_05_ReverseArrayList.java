package _09_ArrayList;

import java.util.ArrayList;

public class _05_ReverseArrayList {
    /**
     * list = [1, 2, 3, 4, 5]
     * */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Reverse Print - O(n)
        for(int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
