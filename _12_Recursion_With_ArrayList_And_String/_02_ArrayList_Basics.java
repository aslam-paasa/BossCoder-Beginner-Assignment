package _12_Recursion_With_ArrayList_And_String;

import java.util.ArrayList;

public class _02_ArrayList_Basics {
    /**
     * ArrayList: Dynamic Array grows with time.
     * */ 
    public static void main(String[] args) {
        /**
         * 1. ArrayList Declaration:
        */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        /**
         * 2. Print ArrayList & Check Length of ArrayList:
        */
        System.out.println(list + " : " + list.size());

        /**
         * 3.1. Print elements of ArrayList:
        */
        for(int val: list) {
            System.out.println(val);
        }

        /**
         * 3.2. Print elements of ArrayList:
        */
        for(int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            System.out.println(val);
        }

        /**
         * 4.Replace Value at particular idx: 
        */
        list.set(2, 300);
        System.out.println(list + " : " + list.size());

        /**
         * 5. Insert value at particular idx:
         *    (RHS values are moved by 1 place)
        */
        list.add(2, 500);
        System.out.println(list + " : " + list.size());
    }
}
