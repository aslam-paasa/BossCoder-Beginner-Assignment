package _17_ArrayOneDimension;

public class Rain_Water_Trapping_Concept {
    public static void main(String[] args) {
        /**
         * Q. Given an array of N non-negative integers arr[] representing an elevation
         *    map where the width of each bar is 1, compute how much water it is able to 
         *    trap after raining.
         * => Input: arr[] = {3, 0, 2, 0, 4}
         * => Output: 7
         * => Explanation: 
         *    |
         *    |             +--+
         *    |             |  |
         *    | +--+        +--+
         *    | |  |        |  |
         *    | +--+  +--+  +--+
         *    | |  |  |  |  |  |
         *    | +--+  +--+  +--+
         *    | |  |  |  |  |  |
         *    +--------------------------->
         *       3   0  2  0  4
         * => We can trap "3 units" of water between 3 and 2,
         * => "1 unit" on top of bar 2 and "3 unit" between 2 and 4.
         * 
         * => Elevation Map: Consider them as building/blocks.
         * => To humaare paas kuch blocks rkhe hue hai where the width of each block is '1'
         * => Agar baarish hoti hai to hm yha pe kitna paani store kr paenge:
         * 
         *    |
         *    |               +--+
         *    |               |  |
         *    | +--+          +--+
         *    | |  | 3  4   5 |  |
         *    | +--+   +--+   +--+
         *    | |  | 2 |  | 6 |  |
         *    | +--+   +--+   +--+
         *    | |  | 1 |  | 7 |  |
         *    +--------------------------->
         * => Total water stored = 7 blocks of water/units
         * 
         * Note: 
         * => Paani store krne ki condition ye h ki left max height boundary & right max height 
         *    boundary, dono ki height greater than 0 ho.
         *    (a) Max height of left block 
         *    (b) Max height of right block
         * => Meri left boundary ki height '3' hai aur right boundary ki size '4' hai aur
         *    bich ki boundary ki size 0, 2, 0 hai. But humaari max water ek baar m 3 unit
         *    fill ho rhi hai qki max block height matter nhi krta, 2nd highest block
         *    jaha tk hogi paani wahi tk fill hoga aur uske baad overflow hone lagega. 
         * => Min(max height of left block, max height of right block) => Max height water can be stored
         *    Min(3, 4) => 3
         * => Total water at this point between left block & right block:
         *    Min(3, 4) - arr[i]
         *    (a) 3-0 = 3unit
         *    (b) 3-2 = 1unit
         *    (c) 3-0 = 3unit
         *      Total = 7unit
         * 
         * Example-2:
         * => Input: arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}
         * => Output: 6
         * 
         * 
         * Case-1:
         * 1. Max height of left block = 1
         * 2. Max height of right block = 2
         * 3. Min(1, 2) = 1.
         * 4. Min(1, 2) - arr[i] = 1 - 0 => 1 units
         * 
         * Note: Ab left se bda right m sirf 3 hai.
         * 
         * Case-2:
         * 1. Max height of left block = 1
         * 2. Max height of right block = 3
         * 3. Min(1, 3) = 1.
         * 4. Min(1, 3) - arr[i] 
         *    => 1 - 1 => 0 units
         * 
         * Case-3:
         * 1. Max height of left block = 2
         * 2. Max height of right block = 3
         * 3. Min(2, 3) = 2.
         * 4. Min(2, 3) - arr[i] 
         *    => 2 - 1 => 1 units
         *    => 2 - 0 => 2 units
         *    => 2 - 1 => 1 units
         *        Total = 4 units
         * 
         *        +-----------------------------------------------+
         * arr =  | 0 | 1 | 0 | 2 | 1 | 0 | 1 | 3 | 2 | 1 | 2 | 1 |
         *        +-----------------------------------------------+
         * max =  0 -> 1 -> 2 -> 3
         *        +-----------------------------------------------+
         * lMax = | 0 | 1 | 1 | 2 | 2 | 2 | 2 | 3 | 3 | 3 | 3 | 3 |
         *        +-----------------------------------------------+
         * => Humne ekhi baar sbka max nikaala aur array m store kra diya.
         * 
         * TC: O(n) + O(n) + O(n) = O(3n) => O(n)
         * */ 

        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;
        System.out.println(findTotalWater(arr, n));

        
    }

    public static int findTotalWater(int[] arr, int n) {
        
        /**
         * 1. Max on left boundary:
        */
        int[] lmax = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++) {
            max = Integer.max(max, arr[i]);
            lmax[i] = max;

        }

        /**
         * 2. Max on right boundary:
         * */ 
        int[] rmax = new int[n];
        max = 0;
        for(int i = n-1; i >= 0; i--) {
            max = Integer.max(max, arr[i]);
            rmax[i] = max;
        }

        /**
         * 3. Min of left & right boundary
         * 4. Min of left & right boundary - arr[i]
        */
        int totalWater = 0;
        for(int i = 0; i < n; i++) {
            int lb = lmax[i]; // step-1
            int rb = rmax[i]; // step-2

            int min = Integer.min(lb, rb); // step-3
            int currentWater = min - arr[i]; // step-4
            totalWater = totalWater + currentWater; // Adding to the final answer
        }
        return totalWater;
    }
}
