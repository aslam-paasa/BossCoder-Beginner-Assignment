package _16_ArrayOneDimension;

import java.util.ArrayList;

public class _51_MaxInArrayList {
    public static void main(String[] args) {
        /**
         * Q. Find the maximum in an ArrayList:
         * => list = 2, 5, 9, 3, 6
         * */ 

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Max Element: " + max);
    }
}
