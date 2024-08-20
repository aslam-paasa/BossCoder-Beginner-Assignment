package _11_RecursionWithArray;

import java.util.ArrayList;


public class _11_RecursiveBinarySearch {

    public static int binarySearch(ArrayList<Integer> list, int target, int start, int end) {
        /**
         * Base Case:
         * 1. start > end
         * 2. arr[mid] == key [key found]
        */

        /**
         * Case-1: key not found [invalid index]
        */
        if(start > end) {
            return -1;
        }


        /**
         * Ek case solve kr do, baaki recursion kr dega
        */
        
        /**
         * Case-2: key found
        */
        int mid = (start+end)/2;
        if(list.get(mid) == target) {
            return mid;
        }

        
        /**
         * Case-1: arr[mid] < key => right me search
        */
        if(list.get(mid) < target) {
            int ans = binarySearch(list, target, mid+1, end);
            return ans;
        } 
        /**
         * Case-2: arr[mid] > key => left me search
        */
        else {
            int ans = binarySearch(list, target, start, mid-1);
            return ans;
        }


    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(70);
        list.add(90);
        list.add(99);

        int target = 9;

        int start = 0;
        int end = list.size()-1;
        int ans = binarySearch(list, target, start, end);

        System.out.println("Answer is : " + ans);
    }
}
