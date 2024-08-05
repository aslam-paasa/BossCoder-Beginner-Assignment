package _16_ArrayOneDimension;

public class _23_ShuffleTheArray {

    /**
     * [2,5,1,3,4,7] => [x1x2....xn | y1y2...yn] => [x1y1 x2y2 .... xnyn]
     *               => Divide the array in the middle
     *               => Send one element from x and one element from y.
     *               => Then again take one element from x and one element from y
     *               => This is we have to do this the end, then we will get our desired array.
     * [2,5,1, | 3,4,7] => [2,3,5,4,1,7]
     *    x        y            z
     *    0       n/2
     * 
     * => Take 2 variable: 
     *    (a) first variable starts from 0.
     *    (b) second variable starts from n/2. 
     * 
     * */ 
    public static void main(String[] args) {
        int[] input = {10,11,12,13,14,15};
        int n = input.length;
        int i = 0, j = n/2, idx = 0;

        // store answer here:
        int[] ans = new int[n];

        while(j < n) {
            ans[idx++] = input[i++];
            ans[idx++] = input[j++];
        }
        
        // Print the array as integers
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
