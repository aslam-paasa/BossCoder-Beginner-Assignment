package _16_ArrayOneDimension;

public class _31_PairsInArray {
    public static void main(String[] args) {
        /**
         * [2, 4, 6, 8, 10]
         * => (2,4) (2,6) (2,8) (2,10)
         * => (4,6) (4,8) (4,10)
         * => (6,8) (6,10)
         * => (8,10)
         * 
         * Logic:
         * => Nested Loops:
         * => i=0, j=i+1 ka pair banega
         * => i=1, j=i+1
         * => ....
         * ....
         * ....
         * 
         * TC: O(n^2)
         */

        int numbers[] = { 2, 4, 6, 8, 10 };
        printPairs(numbers);

    }

    public static void printPairs(int[] numbers) {
        int totalPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i]; // 2,4,6,8,10
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ") "); 
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + totalPairs);
    }
}

/**
 * Total Pairs Formula: (AP)
 * => tp = n(n-1)/2
 *       = 5(4)/2
 *       = 10
 * 
 * => 1+2+3+4 => n(n-1)/2
 * */ 