package _16_ArrayOneDimension;

public class _35_MaxSubarraySum {
    
    /**
     * MaxSubarray Sum using Kadane's algorithm:
     * => [-2, -3, 4, -1, -2, 1, 5, -3]
     * 
     * Basic Logic:
     * 1. +ve + +ve = +ve
     * 2. +ve + -ve = +ve (where +ve is greater)
     * 3. +ve + -ve = -ve (where -ve is greater) => Not favourable
     * => Note: Final negative value lene se accha hai aap 0 le lo.
     * 
     * => Kadane's algorithm kehta hai ki hm ek ek kr k single loop chalae
     *    jae, aur currentSum & maxSum nikaalte jae.
     * => But humne jo logic upar discuss kiya wo kehta hai ki agar currentSum
     *    m agar chije negative ho gyi to currentSum ko 0 kr do. 
     * => CurrentSum m elements ko tbtk add krte jaenge jbtk final output
     *    humara positive rehta hai, jiss point pe final output humaara
     *    negative ho gya to waha pe hm uss currentSum ko 0 bna denge.
     * 
     * => arr:  [-2, -3, 4, -1, -2, 1, 5, -3]
     * => CS : 0  0   0  4   3   1  2  7   4
     * => MS :Inf 0   0  4   4   4  4  7   7   
     * 
     * MaxSubarraySum = 7 => [4,-1,-2,1,5,-3]
     * 
     * Note: Aisa case jaha pe saare numbers -ve hnge waha ye 0 dega
     *       Uske liye humein special case likhna padega:
     *       => [-1,-2,-3,-4]
     *       => Ek loop lga k check kr lenge agar saare negative h to
     *       => Fir isne se smallest negative print kr denge
     * 
     * TC: O(n)
    */

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(numbers);
    }

    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if(currentSum < 0) {
                currentSum = 0;
            }

            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Our max subarray sum : " + maxSum);
    }
}
