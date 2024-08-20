// package _11_RecursionWithArray;

// import java.util.ArrayList;

// public class _12_CoinChange {
//     /**
//      * You have to tell the minimum number of elements required to
//      * reach target sum.
//      * => [1, 2, 3]
//      * */ 

//     public static int solve(ArrayList<Integer> list, int target) {
//         /**
//          * Base Case:
//         */
//         if(target == 0) {
//             return 0;
//         }

//         if(target < 0) {
//             return Integer.MAX_VALUE;
//         }
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         list.add(1);
//         list.add(2);

//         int target = 5;

//         int ans = solve(list, target);
//         System.out.println("Answer is: " + ans);
//     }
// }
