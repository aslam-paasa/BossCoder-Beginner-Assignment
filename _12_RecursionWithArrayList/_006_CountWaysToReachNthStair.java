package _12_RecursionWithArrayList;

public class _006_CountWaysToReachNthStair {
    /**
     * GFG:
     * */ 

    public static int countWays(int n) {
        /**
         * Base Case:
        */
        if(n == 1 || n == 2) {
            return n;
        }

        /**
         * Recursive Call: 
         * */
        int reCall1 = countWays(n - 1);
        int reCall2 = countWays(n - 2);

        int smallCal = reCall1 + reCall2;

        return smallCal;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(countWays(n));
    }
}
