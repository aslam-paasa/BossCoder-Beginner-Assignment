package _09_ArrayList;

import java.util.ArrayList;

public class _09_MultiDimensionalArrayList {
    /**
     * Create a 2D ArrayList:
     * list1: [1, 2, 3, 4, 5]   (table-1)
     * list2: [2, 4, 6, 8, 10]  (table-2)
     * list3: [3, 6, 9, 12, 15] (table-3)
     * 
     * => ArrayList<ArrayList<>>
     * => This is an ArrayList of ArrayList. 
     * */ 

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        /**
         * Create ArrayList:
        */
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        /**
         * Add this list inside the mainList:
        */
        mainList.add(list1);
        mainList.add(list2); 

        /**          
         * Mere Java ArrayList k andr 2 references store honge stack
         * main jo heap m stored durse list ko point kr rha hoga.
         *           +-------+-------+
         * mainList: | list1 | list2 |
         *           +-------+-------+
         *               |       |
         *               V       V
         *           +------+ +------+
         *           | 1, 2 | | 3, 4 |
         *           +------+ +------+
         * => Inhein print krne k liye ek nested loop likhna hoga.
        */

        /**
         * Main List:
        */
        for(int i = 0; i < mainList.size(); i++) {
            /**
             * Current List:
             * => Poori list uth k aati hai, qki mainList k "ith" index
             *    pe ek list stored hai, aur uss list ko humne currList
             *    m laa kar store kr diya hai.
             * => Fir uss currList pr hm loop chalaenge.
            */
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }    
        // System.out.println(mainList); // 2D array
    }

    
}
