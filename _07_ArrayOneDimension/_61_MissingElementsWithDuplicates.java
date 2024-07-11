package _07_ArrayOneDimension;

public class _61_MissingElementsWithDuplicates {
    public static void main(String[] args) {
        /**
         * Approach-2: Sorting + Swapping Method
         * => Size of array = N
         * => arr[i] = [1 to N]
         * 
         * Input: [1, 3, 5, 3, 4]
         * => Agar hum array k harr element ko apne position pe pahucha du
         *    to mera kaam ho jaega.
         * => [1, 2, 5, 3, 4] => Aisa array hota to hm bolte ki isme kuch v
         *                       missing nhi hai.
         * => Agar hm kuch aisa sort kr de ki jaha pe jo index hai waha pe
         *    wo item hona chaiye. 
         *    [1, 3, 3, 4, 5]
         *     1  2  3  4  5
         * => One element is mismatching with index-2 i.e. 3. So, 2 is a missing
         *    element.
         * 
         * (a) if(index == arr[i]) 
         * => [1, 3, 5, 3, 4] 
         *     1  2  3  4  5  =>  ++
         *     i
         * 
         * (b) if(index != arr[i])
         * => [1, 5, 3, 3, 4] => [Swap position] 
         *        i
         * 
         * (c) if(index != arr[i])
         * => [1, 4, 3, 3, 5] => 
         *        i
         * 
         * (d) if(index != arr[i])
         * => [1, 3, 3, 4, 5] => [Swap]
         *        i
         * */ 

        int[] arr = {1, 3, 5, 3, 4};
        int n = arr.length-1;

        /**
         * Sorting + Swapping Method:
         * -> Handling index-0 issue: arr[i] - 1
         */
        int i = 0;
        while (i < n) {
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) { 
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            } else {
                ++i;
            }
        }

        /**
         * Print the missing element
         */
        for(i = 0; i < n; i++) {
            if(arr[i] != i+1) {
                System.out.print(i+1 + " ");
            }
        }
    }
}
/**
 * Dry Run :
 * 1. i = 0, index = arr[i] - 1 = 1 - 1 = 0
 *    => arr[i] != arr[index] (1 != 1), so swap arr[i] and arr[index]
 *    => arr becomes [1, 3, 5, 3, 4] (no change)
 *    => i remains 0
 * 
 * 2. i = 0, index = arr[i] - 1 = 1 - 1 = 0
 *    => arr[i] == arr[index] (1 == 1), so increment i to 1
 *    => arr remains [1, 3, 5, 3, 4]
 *    => i becomes 1
 * 
 * 3. i = 1, index = arr[i] - 1 = 3 - 1 = 2
 *    => arr[i] != arr[index] (3 != 5), so swap arr[i] and arr[index]
 *    => arr becomes [1, 5, 3, 3, 4]
 *    => i remains 1
 * 
 * 4. i = 1, index = arr[i] - 1 = 5 - 1 = 4
 *    => arr[i] != arr[index] (5 != 4), so swap arr[i] and arr[index]
 *    => arr becomes [1, 4, 3, 3, 5]
 *    => i remains 1
 * 
 * 5. i = 1, index = arr[i] - 1 = 4 - 1 = 3
 *    => arr[i] != arr[index] (4 != 3), so swap arr[i] and arr[index]
 *    => arr becomes [1, 3, 3, 4, 5]
 *    => i becomes 2 (incremented)
 * 
 * 6. i = 2, index = arr[i] - 1 = 3 - 1 = 2
 *    => arr[i] == arr[index] (3 == 3), so increment i to 3
 *    => arr remains [1, 3, 3, 4, 5]
 *    => i becomes 3
 * 
 * 7. i = 3, index = arr[i] - 1 = 4 - 1 = 3
 *    => arr[i] == arr[index] (4 == 4), so increment i to 4 
 *    => arr remains [1, 3, 3, 4, 5]
 *    => i becomes 4
 * 
 * 8. i = 4, index = arr[i] - 1 = 5 - 1 = 4
 *    => arr[i] == arr[index] (5 == 5), so increment i to 5
 *    => arr remains [1, 3, 3, 4, 5]
 *    => i becomes 5 (out of bounds)
 * 
 * => The loop exits, and the final array is [1, 3, 3, 4, 5].
 * => The missing element 2 has been found and placed at its correct index!
*/