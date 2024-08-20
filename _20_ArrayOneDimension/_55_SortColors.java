package _20_ArrayOneDimension;

public class _55_SortColors {
    public static void main(String[] args) {
    /**
         * Sort Colors => Similar to Sort 0's & 1's
         * Input : [2, 0, 2, 1, 1, 0]
         * Output: [0, 0, 1, 1, 2, 2]
         * 
         * => num[i] should be either 0/1/2.
         * 
         * 3-pointer approach/Dutch National Flag algorithm: (In-place Solution)
         * => Iss approach m dhyn se dkhnge ki hm poori array ko hum in place shuffle
         *    kr rhe honge, aur humein answer mil jaega.
         * => 3 pointer: (a) low, (b) medium, (c) high
         * 
         * => Input: [2, 0, 2, 1, 1, 0]
         *            l              h
         *            m
         * => Going forward:
         *    1. low pointer saare 0's ko pehle le aaega
         *    2. medium pointer saare 1's ko uske baad le aaega
         *    3. high pointer saare 2's ko right side le aaega
         * 
         * => Agar nums[m] == 0, then low & medium ko swap kr do, qki
         *    low unn indexes ko point kr rha hoga jiss index pe humein
         *    0 chaiye.
         * 
         *    if(nums[m] == 0) {
         *       swap(nums[l], nums[m])
         *       l++;
         *       m++;
         *    }
         * 
         * => Similarly, 
         * 
         *    else if(nums[m] == 1) {
         *       m++; // medium ko aage le jao
         *    }
         * 
         * => else {
         *       swap(nums[m], nums[h])
         *       h--;
         *    }
         * 
         * Dry Run:
         * 1. [0, 0, 2, 1, 1, 2]
         *     l           h
         *     m
         * 2. [0, 0, 2, 1, 1, 2]
         *        l        h
         *        m        
         * 3. [0, 0, 2, 1, 1, 2]
         *           l     h
         *           m
         * 4. [0, 0, 1, 1, 2, 2]
         *           l  h
         *           m
         * 5. [0, 0, 1, 1, 2, 2]
         *           l  m
         *              h
         * 6. Ending condition, jb medium high se jyda ho jaegi means medium
         *    saare 1's ko place kr diya to uska saara kaam khtm ho jaega.
         *    [0, 0, 1, 1, 2, 2]
         *           l  h  m
         * 
         * */ 

        int[] nums = {2, 0, 2, 1, 1, 0};

        int low = 0;
        int medium = 0;
        int high = nums.length - 1;

        while(medium <= high) {
            if(nums[medium] == 0) {
                int temp = nums[medium];
                nums[medium] = nums[low];
                nums[low] = temp;

                low++;
                medium++;
            } else if(nums[medium] == 1) {
                medium++;
            } else {
                int temp = nums[medium];
                nums[medium] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
        
        /**
         * Print the Sorted Colors:
        */
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
        
    }
}
