package _11_RecursionWithArray;

import java.util.ArrayList;

public class _10_CheckIsArraySorted {
    /**
     * Is Array Sorted?
     * => Recursively check agar aage wala apne piche wale se bda hai
     *    tb true, else false return kr denge.
     * => Agar array khtm ho gya to array sorted hai.
     * */ 

    public static boolean checkSorted(ArrayList<Integer> list, int i) {
        /**
         * Base Case:
         * */
        if(i == list.size()-1) {
            return true;
        }

        /**
         * Ek case solve krna hai:
        */
        if(list.get(i+1) < list.get(i)) {
            return false;
        }
        /**
         * Baaki recursion sambhal lega:
        */
        return checkSorted(list, i+1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(60);

        int i = 0;

        boolean isSorted = checkSorted(list, i);
        
        if(isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
