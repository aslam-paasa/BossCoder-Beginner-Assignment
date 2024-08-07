package _12_TimeAndSpaceComplexityI;

public class _06_LogarithmicAnalysis {
    public static void main(String[] args) {

        /**
         * Operation: log N-iterations
         * => N = 1 -> 2 -> 4 -> 8 -> 16 -> 32 -> 64 -> 128 -> 256 -> 512 -> 1024
         * => If we keep this in a loop, it will be log N times.
         * 
         * Note: Log is opposite of power.
         * (a) In log, value decreases by half everytime.
         * (b) In power, value increases by double everytime.
         */

        /** O(log n):
         * => An algorithm is said to be logarithm time complexity when it reduces
         *    the size of the input data in each step.
         * => This means, that the number of operations is not same as the input size.
         * => The number of operations gets reduced as the input size increases.
         * => The algorithms with logarithmic time complexity are found in Binary
         *    Trees or Binary Search Functions.
         *               |
         *               V
         *       (a) This involves the search of a given value in an array by splitting the
         *           array into two and starting the search in one split.
         *       (b) This ensures that the operation is not done on every element of the data
         */

        /** 
         * Binary Search: Discard half elements at each iteration
         * => Value = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
         *              0   1   2   3   4   5   6   7   8    9
         *             low                                  high
         * => x=70, low = 0, high = 9
         * 
         * 1. Agar humein mid nikaalna hai:
         *    => mid = (low + high) / 2;
         *    => mid = (0 + 9) / 2;
         *           = 4.5 => 4(base)
         *    => 50 < 70
         *    => arr[mid] < 70
         *    => To ab hum low ko kar denge "mid+1" 
         * 
         * => Value = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
         *              0   1   2   3   4   5   6   7   8    9
         *                                 low             high
         * 2. => low = 5, high = 9
         *    => mid = (5 + 9) / 2
         *           = 14 / 2
         *           = 7
         *    => arr[mid] = 80
         *    => 70 < 80
         *    => 70 < arr[mid]
         *    => To ab hum high ko kar denge "mid-1"
         * 
         * => Value = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
         *              0   1   2   3   4   5   6   7   8    9
         *                                 low high
         * 
         * 3. => low = 5, high = 6
         *    => mid = (low + high) / 2
         *           = (5 + 6) / 2
         *           = 5
         *    => arr[mid] = 60
         *    => 60 < 70
         *    => So, we need to increase low, ab low ko kardo "mid+1".
         * 
         * => Value = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
         *              0   1   2   3   4   5   6   7   8    9
         *                                     low
         *                                     high
         * 
         * 4. => low = 6, high = 6
         *    => mid = (low + high) / 2
         *           = (6 + 6) / 2
         *           = 6
         *    => arr[mid] = 70
         *    => 70 == 70
         *    => So, we need to increase low, ab low ko kardo "mid+1".
         * 
         * Note: 4 Equations.
         * */ 

    }
}
