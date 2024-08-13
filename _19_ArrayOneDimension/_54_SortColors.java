package _18_ArrayOneDimension;

public class _54_SortColors {
    public static void main(String[] args) {
        /**
         * Sort Colors => Similar to Sort 0's & 1's
         * Input : [2, 0, 2, 1, 1, 0]
         * Output: [0, 0, 1, 1, 2, 2]
         * 
         * => num[i] should be either 0/1/2.
         * 
         * 1. Sort: increasing/decreasing order (in-built)
         *    TC: O(n logn)
         *    SC: O(n)
         * 2. Count Method: 0, 1, 2
         *    (a) Sort
         *    => Traverse and count 0 : 2 (1)
         *    => Traverse and count 1 : 2 (2)
         *    => Traverse and count 2 : 2 (3)
         *    => Store the count
         *    (b) Spread
         *    => Now we will modify the array:
         *       [0, 0, 1, 1, 2, 2]
         * 
         * TC: O(n+n) => O(2n) => O(n) 
         *     (a) O(n) => Traversing and counting
         *     (b) O(n) => 3 loops are traversing till same 'n'.
         * SC: O(1)
         * 
         * Note: This solution is problematic, because humein in-place sort krna hai
         *       Hum avi zeroes, ones, twos , inn teeno variable m store krwa rhe hai
         *       Aur fir store krwane k baad override kr rhe hai.
         *       In-place means hum elements ko kahi aur store nhi kr rhe hai, apne hi 
         *       original array m swap kr rhe hai.
         * 
         * 3. 3-pointer approach: (In-place Solution)
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

        /**
         * Traverse & Count Method:
        */
        int zeroes = 0;
        int ones = 0;
        int twos = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroes++;
            } else if(nums[i] == 1) {
                ones++;
            } else {
                twos++;
            }
        }

        /**
         * Traverse again & Spread:
        */
        int i = 0;

        for (int j = 0; j < zeroes; j++) {
            nums[i++] = 0;
        }
        for (int j = 0; j < ones; j++) {
            nums[i++] = 1;
        }
        for (int j = 0; j < twos; j++) {
            nums[i++] = 2;
        }

        // Print the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
