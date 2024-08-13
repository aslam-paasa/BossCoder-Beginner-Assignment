package _18_ArrayOneDimension;

/**
 * Running Sum of one dimension array
 * => TC: O(n)
*/

public class _19_SumOfArray {
    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        int n = input.length;
        int[] runningSum = new int[n];

        int sum = 0;  

        for(int i = 0; i < n; i++) {
            sum += input[i];
            runningSum[i] = sum; // Store the running sum at each index
        }
        
        // Print the running sum
        for(int i = 0; i < runningSum.length; i++) {
            System.out.print(runningSum[i] + " ");
        }
    }
}
