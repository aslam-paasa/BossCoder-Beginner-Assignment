package _07_Array_I;

public class _34_ChocolateCartonDistribution {
    /**
     * Q. You are given an array of n integers representing the number
     *    of chocolates in n packets. There are m students(m <= n) and
     *    these packets should be distributed among these m students, 
     *    so that each student gets one packet and the difference between
     *    the highest no. of chocolates given to a student and the lowest
     *    no. of chocolates given to another student should be minimum.
     *    Print the minimum difference obtained.
     * */ 

    /**
     * Concept of Sliding Window:
     *                 +----------------------------------------+
     * Input: arr[n] = | 12 | 56  | 1 | 9 | 10 | 8 | 15 | 2 | 3 |
     *                 +----------------------------------------+
     *                   0    1     2   3   4    5   6    7   8
     * => In are chocolates in these 'n=9' pockets of chocolates.
     * => There are 'm=3' students. Humein inn 3 students k ye chocolates
     *    k packets divide krna hai. But condition ye hai ki: 
     *    (a) Each student will get one packet
     *        s1 = x;
     *        s2 = y;
     *        s3 = z;
     *    (b) Difference between the highest numbers of chocolates given 
     *        to student and the lowest numbers of chocolates given to another
     *        student should be minimum.
     *        s1 = 9, s2 = 15
     *        Diff = 6
     * 
     *        s1 = 1, s2 = 2, s3 = 3 [righ way]
     *        Diff = 2
     * 
     * Approach: Sliding Window
     * 1. Arrays.sort();
     *    [1, 2, 3, 8, 9, 10, 12, 15, 56]
     * 2. 3 log uthaenge jinme distribute krna hai:
     *    s1     s2     s3
     *     1      2      3 => Diff = [s3-s1] = 2
     *     2      3      8 => Diff = [s3-s1] = 6
     *     3      8      9 => Diff = [s3-s1] = 6
     *     8      9     10 => Diff = [s3-s1] = 2
     *     9     10     12 => Diff = [s3-s1] = 3
     *     10    12     15 => Diff = [s3-s1] = 5
     *     12    15     56 => Diff = [s3-s1] = 44
     *     return 2;
     * 
     *    minDiff = Integer.MAX_INFINITY;
     *    start = 0;
     *    end = m - 1;
     * 
     *    while(true) {
     *       diff = arr[end] - arr[start]
     *       if(diff < minDiff) {
     *          minDiff = diff;
     *       }   
     *       start++;
     *       end--;
     *    }
     *    return minDiff;
    */
}
