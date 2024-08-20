package _09_ArrayList;

import java.util.ArrayList;

public class _12_PairSum {
    /**
     * Pair Sum-1:
     * Q. Find if any pair in a Sorted ArrayList has a target sum.
     * => list = [1, 2, 3, 4, 5, 6], target = 5
    */

    /**
     * 1. Brute Force: O(n^2)
    */
    public static boolean pairSum1Brute(ArrayList<Integer> list, int target) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = i+1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 2. Two Pointer: O(n)
     * Case-1: (leftPNumb + rightPNumb ==  target)
     *            return true;
     * Case-2: (leftPNumb + rightPNumb < target)
     *            return leftP++;
     * Case-2: (leftPNumb + rightPNumb < target)
     *            return rightP--;
    */
    public static boolean pairSum1TwoPointer(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp) {
            // Case-1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            } 

            // Case-2
            if(list.get(lp) + list.get(rp) < target) {
                lp++;
            }

            // Case-1
            if(list.get(lp) + list.get(rp) > target) {
                rp--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // [1, 2, 3, 4, 5, 6]
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println("Brute Force : " + pairSum1Brute(list, target));
        System.out.println("Optimized Solution : " + pairSum1TwoPointer(list, target));
    }
}
