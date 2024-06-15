package _07_ArrayOneDimension;

import java.util.ArrayList;
import java.util.List;

public class _05_DynamicArray {
    public static void main(String[] args) {

        /**
         * Dynamic Array:
         * => The only difference between Static Array & Dynamic Array:
         * We don't need to declare the size of array initially.
         * => Size is not fixed.
         * 
         * Nomenclature:
         * => C++ => Vector
         * => Java => ArrayList/List
         * => Python => List
         */

        /**
         * List<WrapperClass> <name> = new ArrayList<WrapperClass>();
         */

        List<Integer> arr = new ArrayList<Integer>();


        /**
         * Adding elements at the back of array
         */

        arr.add(2); // [2]
        arr.add(4); // [2, 4]
        arr.add(-1); // [2, 4, -1]
        System.out.println(arr);


        /**
         * Retrieve List:
         * => List cannot be retrieve using arr[idx].
         * => List can be retrieved using arr.get(idx)
         */
        System.out.println(arr.get(1));


        /**
         * Update List:
         * => arr.set(<idx>, <val>)
         */
        arr.set(1, 100);

        System.out.println(arr);
    }
}
