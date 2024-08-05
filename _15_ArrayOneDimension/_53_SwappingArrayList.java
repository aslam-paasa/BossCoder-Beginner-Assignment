package _15_ArrayOneDimension;

import java.util.ArrayList;
import java.util.Collections;

public class _53_SwappingArrayList {
    public static void main(String[] args) {
        /**
         * Sorting an ArrayList:
         * => Collections.sort()
         * */ 

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list); // ascending
        System.out.println(list);

        /**
         * descending:
         * => reverseOrder() function is comparator jo logic define krte h
         *    ki kis tarike se sorting honi chaiye. Ye comparators sirf
         *    list k upar apply nhi hote, hm objects k upar v apply kr skte
         *    hai.
         * => "ABCD" "abcd" - Inke bich mujhe sort krna hai to mujhe kaise
         *    pta chlega ki kn si string bdi honi wali hai 
        */
        Collections.sort(list, Collections.reverseOrder());
    }
}
