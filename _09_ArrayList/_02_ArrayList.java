package _09_ArrayList;

import java.util.ArrayList;

public class _02_ArrayList {
    public static void main(String[] args) {

        /**
         * 1. ArrayList declaration & definition:
        */
        ArrayList<Integer> list  = new ArrayList<>();
        System.out.println("1. Empty Size: " + list.size() + " -> " + list); // 0 -> []

        /**
         * 2. add() is used to add an element in the ArrayList
         * 3. size() is used to measure the length.
        */
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("2. Added Values are: " + list.size() + " -> " + list); // 3 -> [10, 20, 30]

        /**
         * 4. set() is used to change value, doesn't add new value.
        */
        list.set(1, 200);
        System.out.println("3. Replace Value: " + list.size() + " -> " + list); // 3 -> [10, 200, 30]

        /**
         * 5. add(1, 2) => adds a new value, diff from set
         * => Basically it is inserting element-2 and index-1
         *    and pushed the elements from idx-2 to n to the right.
        */
        list.add(1, 2000);
        System.out.println("4. Insert Value in between: " + list.size() + " -> " + list); // 4 -> [10, 2000, 200, 30]

        /**
         * 6. get() is used to get value:
        */
        int val = list.get(1);
        System.out.println("5. Get Particular Element: " + val); // 2000 (list[1] will not work)
        System.out.println("6. Get All Value: " + list.size() + " -> " + list); // 4 -> [10, 2000, 200, 3]

        /**
         * 7. remove() is used to delete the element at particular index
        */
        list.remove(1);
        System.out.println("7. Remove Value: " + list.size() + " -> " + list); // 3 -> [10, 200, 30]

        /**
         * 8. Print ArrayList:
        */
        System.out.println("8. Print all values: ");
        for(int i = 0; i < list.size(); i++) {
            int value01 = list.get(i);
            System.out.println(value01);
        }

        // for(int value02: list) {
        //     System.out.println(value02);
        // }
    }
}
