package _09_ArrayList;

import java.util.ArrayList;

public class _07_SwapTwoNum {
    /**
     * list = [2, 5, 9, 3, 6]
     * index: idx1=1, idx2=3
     * */

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        // idx1 pe jaa k uss value ko set krana h jo avi mere list k andr idx2 pe hai
        // idx2 ki value copy ho jaegi idx2 m andr
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
