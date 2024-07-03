package _07_ArrayOneDimension;

public class _32_MaxSubarraySum {
    public static void main(String[] args) {
        /**
         * Max Subarray Sum using Brute Force:
         * [1, -2, 6, -1, 3]
         * 
         * => (1) (1,-2) (1,-2,6) (1,-2,6,-1) (1,-2,6,-1,3)
         *     1    -1      5         4            7
         *                                    (Max Subarray)
         * TC: O(n^3)
         * 
         * */ 

        int numbers[] = {1,-2,6,-1,3};
        printSubarrays(numbers);
    }

    public static void printSubarrays(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currentSum = 0;
                for(int k=start; k<=end; k++) {
                    // subarray sum
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }
}
