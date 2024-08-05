package _16_ArrayOneDimension;

public class _58_FindDuplicate {
    public static void main(String[] args) {
        /**
         * Approach-2: Negative Marking Method
         * => N+1 = [1, 3, 4, 2, 2] = 5
         * => N = 4
         * 
         * nums[i] belongs to [1 to 4]
         * => Elements ko as an index store kr skte hai.
         * => Agar mai ek index pe ek se jyda baar visit kr jau to wo duplicate hai.
         * 
         * nums[i] => index
         * => Iterate every index and mark as visited.
         * => If we iterate again at visited index, then return duplicate.
         * 
         * [1, 3, 4, 2, 2]
         * 1. nums[nums[i]] => nums[1] => position => visited(mark as negative )
         *    [1, -3, 4, 2, 2]
         * 
         * 2. nums[nums[i]] => nums[-3] => abs(-3) => 3
         *    Ab mai bolunga nums[3] location pe chl jao aur visited mark kr do. 
         *    [1, -3, 4, -2, 2]
         * 
         * 3. nums[nums[i]] => nums[4]
         *    [1, -3, 4, -2, -2]
         * 
         * 4. nums[nums[i]] => nums[2] 
         *    [1, -3, -4, -2, -2]
         * 
         * 5. nums[nums[i]] => nums[2] => already visited(-4) => return 
         * 
         * TC: O(n)
         * SC: O(1)
         * Note: But hm array ko modify kr rhe hai.
         * */
        
        int[] nums = {1, 3, 4, 2, 2};
        int ans = -1;

        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]); // Make negative element to positive index

            /**
             * already visited
            */
            if(nums[index] < 0) {
                ans = index;
                System.out.println(ans);
                // return index;
                // break;
            } 
            /**
             * mark as visited v
             * */ 
            else {
                nums[index] *= -1; // mark as visited
            }
        }
    }
}
