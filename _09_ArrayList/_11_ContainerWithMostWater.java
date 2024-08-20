package _09_ArrayList;

import java.util.ArrayList;

public class _11_ContainerWithMostWater {
    /**
     * Container with most water:
     * => For given n lines on x-axis, use 2 lines to form a container
     *    such that it holds maximum water.
     * => height = [1,8,6,2,5,4,8,3,7]
     * 
     * 8th      |                   |       
     *          +-------------------+-------+ [Maximum water = height x width = 7x7 = 49]
     * 7th      |                   |       |
     * 6th      |   |               |       |
     * 5th      |   |       |       |       |
     * 4th      |   |       |   |   |       |
     * 3rd      |   |       |   |   |   |   |
     * 2nd      |   |   |   |   |   |   |   |
     * 1st  |   |   |   |   |   |   |   |   |
     *   +-------------------------------------+
     *      1   8   6   2   5   4   8   3   7
     *         i=1                         i=8
     *     <--------------------------------->
     *       width = 7 (i2 - i1 => 8 - 1 => 7)
     * */ 

    /**
     * 1. Brute Force Method: O(n^2)
     * => Analyze all possible pairs
     * => for(int i = 0; i < height.size(); i++) {
     *       for(int j = i+1; j < height.size(); j++) {
     *       }
     *    }
     * 
     *      (6)
     *       |    
     *       |    |(4)
     *       |    | |
     *       |    | |
     *       | |  | |
     *     | | |  | |
     *   +------------+
     * idx 1 2 3  4  5
     * Water = height x Width
     *       =  4     x (idx 5-2 = 3)
     *       =  4     X  3
     *       = 12 units
     * 
     * Note: Har ek possible container jo 2 lines ko mil kr banta hai
     *       unn sb k liye paani nikaal le, aur jisne v max water ko
     *       save kr liye apne andr wo humaara most water storing 
     *      container hoga.
     * 
     * => maxWater;
     * => for(int i = 0; i < height.size(); i++) {
     *       for(int j = i+1; j < height.size(); j++) {
     *          height = Math.min(Line1, Line2)
     *          width  = (j - i);
     *          water = height * width; [compare this with maxWater]
     *       }
     *    }
    */

    public static int storeWaterBrute(ArrayList<Integer> height) {
        int maxWater = 0;

        // Water Line-1
        for(int i = 0; i < height.size(); i++) {
            // Water Line-2
            for(int j = i+1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = (j-i);
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    /**
     * Better Solution: Two Pointer Approach O(n) 
     * => currWater = ht * water
     *    (a) ht = Math.min(leftPointer, rightPointer)
     *    (b) width = rightPointer - leftPointer
     * => compare currWater with maxWater
     * 
     * => while(leftPointer < rightPointer) 
     * =>    currWater = ht * water
     *       (a) ht = Math.min(leftPointer, rightPointer)
     *       (b) width = rightPointer - leftPointer
     * =>    if(leftPointerHt < rightPointerHt)
     *          leftPointer++;
     * =>    else (rightPointerHt >= leftPointerHt)
     *          rightPointer--; 
     *       
    */
    public static int storeWaterTwoPointer(ArrayList<Integer> height) {
        int maxWater = 0;
        int start = 0;
        int end = height.size()-1;

        while(start < end) {
            // calculate water area
            int ht = Math.min(height.get(start), height.get(end));
            int width = end - start;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // update pointer
            if(height.get(start) < height.get(end)) {
                start++;
            } else {
                end--;
            }
        }
        return maxWater;
    }



    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Brute Solution: " + storeWaterBrute(height));
        System.out.println("Better Solution: " + storeWaterBrute(height));
    }

}
