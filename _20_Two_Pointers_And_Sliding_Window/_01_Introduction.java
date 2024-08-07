package _20_Two_Pointers_And_Sliding_Window;

public class _01_Introduction {
    public static void main(String[] args) {
        /**
         * This is a constructive algorithm where we need to understand
         * the concept and then depending on the problem statement we
         * have to mould the problem statement and solve that problem.
         * 
         * => We generally see 4 type of patterns in this topic:
         *    1. Constant Window:
         *    => Imagine there is an array and this array can have positive
         *       and negative array:
         *       arr[] = [-1, 2, 3, 3, 4, 5, -1]
         *       k = 4
         *    => Our task is to figure out the maximum sum that we can obtain
         *       in by picking up 4 elements consecutively.
         *    => If we pick up these elements consecutively: -1, 2, 3, 3,
         *       the summation we will obtain is 7.
         *    => So, if its a problem of constant window, generally we do is
         *       we take two pointers "l" & "r". And run the loop from "l"
         *       to "r":
         *                 l        r
         *       arr[] = [-1, 2, 3, 3, 4, 5, -1]
         *       l = 0, r = k-1 
         *       sum = 7, for this typical window from idx-0 to 3.
         * 
         *    Q. What is the next window?
         *    => l = 1, r = k 
         *       sum = 8, for this typical window from idx-1 to 4.
         * 
         *    Q. What is the next window?
         *    => l = 2, r = k+1 
         *       sum = 10, for this typical window from idx-2 to 5.
         * 
         *    Algorithm:
         *    => for(int i = l --> r) { }
         *       maxSum;
         *    => while(r < n-1) {
         *          sum = sum - arr[l]
         *          l++;
         *          r++;
         *          sum = sum + arr[r];
         * 
         *          maxSum = max(maxSum, sum);
         *       }
         * 
         * => Depending on the condition we have to run the for-loop and do our
         *    job and after that if it's a constant window we move it. So, have
         *    to decide how to move it.
         * 
         * Note: If will not asked most of the time.
         * */ 

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
        */

        /**
         * 3. No of subarrays where <conditions>
         * => This is very different problem
         * => This type of problem will be solved using the pattern-2.
         *    So, it's very important to understand Longest Subarray or
         *    Substring.
         * => It is very difficult to count the no of subarrays.
         * => In this problem we will understand why it is difficult to
         *    understand when to expand and when to shrink.
        */

        /**
         * 4. Shortest/Minimum Window/Length <condition>
         * => Rare Question
         * => We will take 'l' & 'r' and we are 'r' and this turns out
         *    to be a valid window. I am looking for a minimum size.
         * => Once I got a valid window what I try to do is, I try to
         *    shrink(l) and check is this a valid window or not. And
         *    the shortest shrinked window whichever is valid is stored
         *    as an answer.
        */
    }
}
