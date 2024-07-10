package _07_ArrayOneDimension;

import java.util.ArrayList;

public class _44_PairSum {
    public static void main(String[] args) {
        /**
         * Q. Find a pair that upon addition gives value equal to sum?
         * => Input: {1, 3, 5, 7, 2, 4, 6}
         * => Sum = 9
         * */ 

        /**
         * Brute Force:
         * => Mere paas ek wallet hai jisme total 5 note hai, humein ye
         *    btana hai ki unn saare note m se koi 50 ka note h ya nhi.
         * => Saare k saare note ko wallet se bahar rkh liye aur ek ek kr
         *    k check krne lge. Similalry, sbko bahar rkh lenge:
         * => (1,3) (3,5) (5,7) (7,2) (2,4) (4,6)
         *    (1,5) (3,7) (5,2) (7,4) (2,6)
         *    (1,7) (3,2) (5,4) (7,6)
         *    (1,2) (3,4) (5,6)
         *    (1,4) (3,6)
         *    (1,6)
         * => Humne saare k saare pairs nikaal liye, aur ab har pair pe jaa
         *    k unka sum dekhnge.
         * 
         * Approach:
         * 1. Outer Loop: 
         * => Har element k liye hum aage wale poore element pe loop chalaate hai:
         *    [i]    [ i+1 ]
         *    [1] => [3,5,7] => (1,3) (1,5) (1,7)
         *    [3] => [5,7]   => (3,5) (3,7)
         *    [5] => [7]     => (5,7)
         *    [7]
         * */ 

        int[] arr = {10, 20, 40, 60, 70};
        int sum = 80;

        /**
         * Print all pairs:
         * Outer loop will traverse for each element:
         * */ 
        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            /**
             * for every element, will traverse on aage wale element
            */
            for(int j = i+1; j < arr.length; j++){
                if(element + arr[j] == sum) {
                    System.out.println("Pair Found : " + element + "," + arr[j]);
                }
            }
        }
        
    }
}
