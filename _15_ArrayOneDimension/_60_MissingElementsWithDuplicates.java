package _15_ArrayOneDimension;

public class _60_MissingElementsWithDuplicates {
    public static void main(String[] args) {
        /**
         * Missing Elements from an array with duplicates:
         * => Size of array = N
         * => Elements = [1, N]
         * 
         * Note: 
         * => Jaha par v elements arr[i] => [1 to N] tk hoti h waha kuch
         *    intuition bnti hai.
         * => Pichle kuch questions se hm dekh rhe h ki elements ko hm
         *    index k tarah treat kr skte hai using Negative Marking Method.
         * 
         * Input: [1, 3, 4, 5]
         * Output: 2
         * 
         * Constraints: Yha pe 1 to N tk k elements hone chaiye the, but
         *              yha pe kuch elements missing honge aur unn missing
         *              elements ko humein find krna hai.
         * 
         * TC: O(n)
         * SC: O(1)
         * 
         * arr: [1, 3, 5, 3, 4]
         * idx:  1           n
         * 
         * 1. nums[nums[i]] => nums[1] => position => visited(mark as negative )
         * arr: [-1, 3, 5, 3, 4]
         * 
         * 2. nums[nums[i]] => nums[3] => position => visited(mark as negative )
         * arr: [-1,  3, -5, 3, 4]
         * 
         * 3. nums[nums[i]] => nums[5]
         * arr: [-1,  3, -5, 3, -4]
         * 
         * 4. nums[nums[i]] => nums[3] (already visited => means 3 is double => move next) 
         * arr: [-1,  3, -5, 3, -4]
         * 
         * 5. nums[nums[i]] => nums[4] => position => visited(mark as negative)
         * arr: [-1,  3, -5, -3, -4] 
         * 
         * Note: Index-2 pe element-3 hai wo visit nhi hue hai. To jitne v positive
         *       element h jo visit nhi hue hai wo missing hai. Aur wo index missing
         *       hai/element missing hai.
         * 
         * */ 

        int[] arr = {1, 3, 5, 3, 4};

        /**
         * Function call:
        */
        findMissing(arr);

    }

    public static void  findMissing(int[] arr) {
        /**
         * Visited Method:
         * -> Handling negative element
         * -> Handling index-0 issue because humaare index-1 se shuru hona chaiye
         * */
        for(int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if(arr[index - 1] > 0) {
                arr[index - 1] *= -1;
            }
        } 

        // for(int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " "); // -1 3 -5 -3 -4 
        // }

        /**
         * All positive indexes are missing:
         * => 'i+1' => bcoz array index-0 se shuru ho rhe h lekin element '1' se
         *    isliye we are using 'i+1'.
         * */
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                System.out.println(i+1);
            }
        }
    }
}
