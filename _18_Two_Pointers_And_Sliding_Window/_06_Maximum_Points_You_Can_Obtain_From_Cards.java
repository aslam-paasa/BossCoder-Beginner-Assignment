package _18_Two_Pointers_And_Sliding_Window;

public class _06_Maximum_Points_You_Can_Obtain_From_Cards {
    /**
     * Maximum Points you can obtain from Cards:
     * => arr = [6, 2, 3, 4, 7, 2, 1, 7, 1]
     * => k = 4
     * 
     * => You will be given an array which contain the point of 'n' different
     *    cards. For example, the first card at idx-1 will give a point 6,
     *    2nd card at idx-2 will give you a point-2 and the last card will
     *    give you a point-1.
     * => We are given an integer 'k' which signifies there is a task given to 
     *    us and we have to pick up 'k' cards from these lot of 'n' cards.
     * => But there is a condition: 
     *    We can either pick up from the front or back, we cannot go into the
     *    middle and pickup something.
     * Trick:
     * (a) Pick from front
     * (b) Pick from back
     * (c) Pick from front+back consecutively
     * 
     * 1. Front(6+2+3) + Back(1) =  12
     * 2. Front(6+2+3+4) = 15
     * 3. Back(2+1+7+1) = 11
     * 4. Front(6+2) + Back(7+1) = 16 (max)
     * 
     * Approach:
     * => leftSum = 0, rightSum = 0;
     * => sum = leftSum + rightSum
     * 
     * (a) leftSum = 15, rightSum = 0
     *     sum = (6+2+3+4) = 15
     * (b) leftSum = 11(just removed the last element), rightSum = 1 (add element)
     *     sum = (6+2+3)+(1) = 12
     * (c) leftSum = 8(just removed the last element), rightSum = 8 (add element)
     *     sum = (6+2)+(7+1) = 16 => max points
     * (d) leftSum = 6(just removed the last element), rightSum = 9 (add element)
     *     sum = (6)+(1+7+1) = 15
     * (c) leftSum = 0(just removed the last element), rightSum = 11 (add element)
     *     sum = (2+1+7+1) = 11
     * 
     * Algorithm:
     * func(nums[], k) {
     *    => window size 'k'
     *    lSum = 0;
     *    rSum = 0;
     *    maxSum = 0;
     *    for(int i = 0 --> k-1){
     *       => This will provide the sum of first 'k' elements
     *       lSum = lSum + nums[i];
     *       maxSum = lSum;
     * 
     *       rightIdx = n-1; <= bcoz the first element that will pick up is at n-1;
     *       for(i = k-1;  i>=0; i--){
     *          => shrink and remove element at 'k-1th index'
     *          lSum = lSum - nums[i];
     *          
     *          => expand will add element from the end of array
     *          rSum = rSum + nums[rightIdx];
     *          rightIdx--;
     * 
     *          maxSum  = max(maxSum, lSum + rSum);
     *       }
     *    return mSum;
     *    }
     * }
     * 
     * TC: O(2 * k) 
     * SC: O(1)
     * */ 
}
