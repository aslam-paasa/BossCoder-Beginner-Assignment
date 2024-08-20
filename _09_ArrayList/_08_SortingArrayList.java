package _09_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class _08_SortingArrayList {
    /**
     * Sorting in ArrayList:
     * (a) Bubble Sort
     * (b) Selection Sort
     * (c) Insertion Sort
     * (d) Merge Sort
     * (e) Quick Sort
     * (f) Count Sort
     * => We can implement these sorting directly in arraylist.
     * => But we will use one optimized in-built function: Collections.sort()
     * => This Collections.sort() will sort in ascending order.
     * 
     * Note: Collections.sort() is most optmized in-built sorting fn
     *       Jbtk humein coding contest m in-built sorting naa pucha
     *       jae, hm iss in-built sorting ko use kr skte hai.
     * */ 

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        /**
         * 1. Print Original ArrayList:
        */
        System.out.println("Original ArrayList:   " + list);

        /**
         * 2. Print Ascending ArrayList:
        */
        Collections.sort(list);
        System.out.println("Ascending ArrayList:  " + list);

        /**
         * 3. Print Descending ArrayList:
         * => Collections.reverseOrder() is a comparator.
         * => Comparators are functions in java jo logic define krte
         *    hai ki kiss tarah se sorting honi chaiye. Means agar
         *    humaare paas list hai to wo ascending order se sorting
         *    honi chaiye wo to by-default hai but descending order
         *    wala logic iss comparator fn k andr likha hota hai.
         * Note: Ye comparators sirf list k upar apply ni hote, inhein
         *       hum objects k upar v apply kr skte hai.
        */
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending ArrayList: " + list);
    }
}
