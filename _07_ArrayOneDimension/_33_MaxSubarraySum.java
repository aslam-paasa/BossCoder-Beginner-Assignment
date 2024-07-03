package _07_ArrayOneDimension;

public class _33_MaxSubarraySum {
    public static void main(String[] args) {
        /**
         * Max Subarray Sum using Prefix Sum:
         * [1, -2, 6, -1, 3]
         * => Agar index-0 hai to yha index-0 tk ka saara sum store kr lenge i.e.1
         * => 1st index m index-0to1 tk ka saara sum store kr lenge i.e. (1 + -2 = -1)
         * => 2nd index: (1 + -2 + 6 = 5)
         * => 3rd index: (1 + -2 + 6 + -1 = 4)
         * => 4th index: (1 + -2 + 6 + -1 + 3 = 7)
         * 
         * => Prefix Sum means current index jaha pe hum hai waha se le k idx-0 tk ka
         * sum kr
         * k, current index m store kr dena is Prefix Sum.
         * 
         * Q. Ye Prefix Sum humaari help kaise krega?
         * => Maan lijiye humein ek sum nikaalna hai ek subarray ka (idx-1 to 3)
         * => [-2, 6, -1]
         * => Ek to iska sum ek loop lga k nikaale (start=1 to end=3)
         * => Prefix[end] - Prefix[start-1] formula :
         * 4 - 1
         * 3
         * 
         * 
         * Formula:
         * => Prefix[end] - Prefix[start-1]
         * 
         * => Prefix Array:
         * prefix[i-1] + arr[i]
         * prevSum + currentIndex
         * 
         * TC: O(n^2)
         */

        int numbers[] = { 1, -2, 6, -1, 3 };
        printSubarrays(numbers);
    }

    public static void printSubarrays(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        /**
         * Calculate Prefix Array
        */
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1]  + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currentSum = 0;
                
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }
}

