package _12_RecursionWithArrayList;

import java.util.ArrayList;

public class _911_Linear_Search {
    /**
     *        0  1  2  3   4
     * arr = [3, 2, 1, 18, 9], target = 18
     * 
     * => (arr, target, 0)
     *            |
     *            V
     *       if(arr[0] == target) {
     *          return true;
     *       } 
     * 
     *       (arr, target, i+1);
     * */ 

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 4, 5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexFromLast(arr, 4, arr.length-1));
        
        findAllIndex(arr, 4, 0, list);
        System.out.println(list);
    }

    public static boolean find(int[] arr, int target, int index) {
        if(index == arr.length - 1) {
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if(index == arr.length - 1) {
            return -1;
        }

        if(arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index+1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static int findIndexFromLast(int[] arr, int target, int index) {
        if(index == -1) {
            return -1;
        }

        if(arr[index] == target) {
            return index;
        } else {
            return findIndexFromLast(arr, target, index-1);
        }
    }

    public static void findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {    

        if(index == arr.length) {
            return;
        }

        if(arr[index] == target) {
            list.add(index);
        } 

        findAllIndex(arr, target, index+1, list);

    }
    
}
