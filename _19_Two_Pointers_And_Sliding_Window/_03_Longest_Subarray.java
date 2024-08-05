package _19_Two_Pointers_And_Sliding_Window;

public class _03_Longest_Subarray {
            /**
         * Longest Subarray/Substring where <condition>: (Depending if it's an array or string problem)
         * => Most common problem that we will see across this topic online or in interview.
         * 
         * Q. Longest subarray with "sum <= k"
         * => Subarray: Any consecutive porition of an array.
         * => arr = [2, 5, 1, 7, 10], k = 14
         * 
         * Note: In this question, typically there are 3 formats we have to follow:
         * (a) Brute Force: Generate all the subarray and check with the condition.
         *     Generate means stand at one element and generate all the possible subarray
         *     possible with that array:
         *     (i) Generate all possible subarray starting with 2:
         *         2
         *         2, 5
         *         2, 5, 1
         *         2, 5, 1, 7
         *         2, 5, 1, 7, 10
         *     (iI) Generate all possible subarray starting with 5:
         *         5
         *         5, 1
         *         5, 1, 7
         *         5, 1, 7, 10
         *         etc...
         * 
         *     => Algorithm:
         *        maxLength = 0;
         *        for(i = o ---> n-1)
         *           sum = 0;
         *           for(j = 1 ---> n-1)
         *             sum = sum + arr[j];
         *             if(sum <= k) => my condition
         *                maxLength = max(maxLength, j-1+1); 
         *             }
         *           }
         *         }
         *         print(maxLength);
         * 
         * (b) Better Solution:
         *  => We are lookin for sum <= k
         *     => 2+5+1+7 = 15, so no need to add 10,
         * 
         * Algorithm:
         *        maxLength = 0;
         *        for(i = o ---> n-1)
         *           sum = 0;
         *           for(j = 1 ---> n-1)
         *             sum = sum + arr[j];
         *             if(sum <= k) => my condition
         *                maxLength = max(maxLength, j-1+1); 
         *             }
         *             => Condition: If 2+5+1+7 = 15, so no need to add 10,
         *             else if(sum > k) {
         *                break;
         *             }
         *           }
         *         }
         *         print(maxLength);
         * 
         * TC: O(n^2)
         * SC: O(1)
         * 
         * (c) Optimal Solution:
         *  => We will take a sliding window of size '1'. 
         *  => The window will always have two pointers: 'l' & 'r' where left
         *     signifies the left most portion of the window and right signifies
         *     the right most portion of the window.
         *  => So, if i am talking about '1' window size, we are talking about
         *     'l' & 'r' and since this particular problem is saying sum, if are
         *     talking about sum, the initially sum = 0.
         * => After this, there are 2 concepts of window:
         *    (a) Expand: Happens for variable at the right edge of the window
         *    (b) Shrinking: Left edge of the window
         *           l
         * => arr = [2, 5, 1, 7, 10]
         *           r
         * 
         * => sum = 0 -> 2  <= k=14
         * => maxLength = 1
         * 
         *           l
         * => arr = [2, 5, 1, 7, 10]
         *              r
         * => sum = 0 -> 2 -> 7  <= k=14
         * => maxLength = 2
         * 
         * 
         *           l
         * => arr = [2, 5, 1, 7, 10]
         *                 r
         * => sum = 0 -> 2 -> 7 -> 8  <= k=14
         * => maxLength = 3
         * 
         * 
         *           l
         * => arr = [2, 5, 1, 7, 10]
         *                    r
         * => sum = 0 -> 2 -> 7 -> 8 -> 15    > k=14 (false condition)
         * => maxLength = 3
         * Note: Whenever the condition is false, try to shrink and come
         *       inside the condition because other windows violating the
         *       condition. As the window moving in the expanding direction
         *       we try to take out element from the left till we get the
         *       condition to be valid again. So, shrink and take out '2'.
         * 
         *           X  l
         * => arr = [2, 5, 1, 7, 10]
         *                    r
         * 
         * => sum = 5 + 1 + 7  <= k=13
         * => maxLength = 3 (already 3 so no need to update)
         * 
         * Algorithm:
         * l=0, r=0, sum=0, maxLength=0
         * 
         * while(r < n) {
         *    sum = sum + arr[r];
         *    while(sum > k) {
         *       sum = sum - arr[l];
         *       l = l+1;
         *    }
         * 
         *    if(sum <= k) {
         *       maxLength = max(maxLength, r-l+1); <- store 'l'&'r' if we are asked to print subarray
         *    }
         *    r = r+1;
         * }
         * print(maxLength);
         * 
         * TC: 
         * => Why it's O(n)?
         * => The critical point is that both r and l together move at 
         *    most n steps each. Even though they might move independently
         *    and at different times, the total number of moves they make 
         *    collectively is at most 2n.
         * => We might think there are 2 while loops so TC is O(n^2),
         *    but if we look closely we can see:
         *    (a) 'r' is moving from 0 to n => O(n)
         *    (b) 'l' is moving 'n' elements at worst case, but we will
         *        not do it always.
         * 
         * 
         *    => TC: O(n + n) => O(2n)
         *    => SC: O(1)
         * 
         * 
         * (d) Optimized:
         * Algorithm:
         * l=0, r=0, sum=0, maxLength=0
         * 
         * while(r < n) {
         *    sum = sum + arr[r];
         *    => Instead of shrinking all together, just check for one.
         *       If it is greater just move it by one, keep it to the
         *       max length, increase and check for the next length
         *    if(sum > k) {
         *       sum = sum - arr[l];
         *       l = l+1;
         *    }
         * 
         *    if(sum <= k) {
         *       maxLength = max(maxLength, r-l+1); <- store 'l'&'r' if we are asked to print subarray
         *    }
         *    r = r+1;
         * }
         * print(maxLength); 
         * 
         * TC: O(n)
         * 
         * 
        */

    // Brute force approach
    public static int longestSubarrayWithSumBF(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum <= k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    // Optimized approach
    public static int longestSubarrayWithSumOptimized(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        int sum = 0;
        int left = 0;

        // Add the current element to the sum
        for (int right = 0; right < n; right++) {
            sum += arr[right];

            // Shrink the window from the left if the sum exceeds k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Update the maximum length if the current sum is less than or equal to k
            if (sum <= k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }

    // Most Optimized approach
    public static int longestSubarrayWithSumMostOptimized(int[] arr, int k) {
        int l = 0, r = 0, sum = 0, maxLength = 0;

        while (r < arr.length) {
            sum += arr[r];

            // Instead of shrinking all together, just check for one.
            // If the sum is greater, move the left pointer to the right.
            if (sum > k) {
                sum -= arr[l];
                l++;
            }

            // Update the maximum length if the current sum is less than or equal to k.
            if (sum <= k) {
                maxLength = Math.max(maxLength, r - l + 1);
            }

            r++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};
        int k = 14;
        
        System.out.println("Brute Force: " + longestSubarrayWithSumBF(arr, k));
        System.out.println("Optimized: " + longestSubarrayWithSumOptimized(arr, k));
        System.out.println("Most Optimized: " + longestSubarrayWithSumMostOptimized(arr, k));
    }
}
